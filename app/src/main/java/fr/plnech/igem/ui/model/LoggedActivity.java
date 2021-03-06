/*
=======================================================================
BactMan Adventures | Scientific popularisation through mini-games
Copyright (C) 2015 IONIS iGEM Team
Distributed under the GNU GPLv3 License.
(See file LICENSE.txt or copy at https://www.gnu.org/licenses/gpl.txt)
=======================================================================
*/

package fr.plnech.igem.ui.model;

import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.util.Log;
import android.view.KeyEvent;
import com.crashlytics.android.Crashlytics;
import com.crashlytics.android.answers.Answers;
import com.crashlytics.android.answers.ContentViewEvent;
import fr.plnech.igem.ui.HomeActivity;
import fr.plnech.igem.utils.Foreground;
import io.fabric.sdk.android.Fabric;
import org.jraf.android.util.activitylifecyclecallbackscompat.app.LifecycleDispatchActivity;

import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

public abstract class LoggedActivity extends LifecycleDispatchActivity implements Foreground.Listener {
    private static final String TAG = "LoggedActivity";
    private static final String KEY_ACTIVITY = "Activity";
    private static final String KEY_TIMEZONE = "Timezone";
    private static final String KEY_LANG = "Language";

    private boolean continueMusic = true;
    private boolean isChangingConfiguration;
    private Foreground.Binding listenerBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Foreground.init(getApplication());
        checkInitFabric(this);
        Crashlytics.setString(KEY_ACTIVITY, this.getClass().getSimpleName());
        listenerBinding = Foreground.get(getApplication()).addListener(this);
        setContentView(getLayoutResId());
        registerBroadcastReceiver();
        logView();
        isChangingConfiguration = true;
    }

    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    @Override
    public boolean isChangingConfigurations() {
        if (android.os.Build.VERSION.SDK_INT >= 11) {
            return super.isChangingConfigurations();
        } else {
            return isChangingConfiguration;
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (!shouldContinueMusic()) {
            MusicManager.pause();
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        MusicManager.start(this, MusicManager.MUSIC_MENU);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        // not strictly necessary as Foreground only holds a weak reference
        // to the listener to defensively prevent leaks, but its always better
        // to be explicit and WR's play monkey with the Garbage Collector
        listenerBinding.unbind();
    }

    @Override
    public boolean onKeyDown(int keyCode, @NonNull KeyEvent event) {
//      We pause music in several cases:
//      - when the button pressed is menu, and when back is pressed on HomeActivity
        final boolean isNotHomeActivity = this.getClass().getSimpleName().equals("HomeActivity");
        switch (keyCode) {
            case KeyEvent.KEYCODE_BACK:
                if (isNotHomeActivity) {
                    setContinueMusic(true);
                }
                break;
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override
    public void onBecameForeground() {
        MusicManager.start(getThis(), MusicManager.MUSIC_MENU);
    }

    @Override
    public void onBecameBackground() {
        MusicManager.pause();
    }

    @Override
    public boolean onKeyUp(int keyCode, @NonNull KeyEvent event) {
//      We pause music in several cases:
//      - when the button pressed is menu, and when back is pressed on HomeActivity
        switch (keyCode) {
            case KeyEvent.KEYCODE_MENU:
            case KeyEvent.KEYCODE_HOME:
                MusicManager.pause();
                break;
        }
        return super.onKeyUp(keyCode, event);
    }

    private void logView() {
        final Resources resources = getResources();
        final String contentName = resources.getString(getTitleResId());
        final String contentType = getContentType();
        final String contentId = resources.getResourceName(getLayoutResId()).replace("fr.plnech.igem:layout/", "");
        logView(contentName, contentType, contentId, this);
    }

    public static void logView(String contentName, String contentType, String contentId, Context c) {
        checkInitFabric(c);

        Calendar cal = Calendar.getInstance();
        TimeZone tz = cal.getTimeZone();
        String language = Locale.getDefault().getDisplayName();

        Answers.getInstance().logContentView(new ContentViewEvent()
                .putContentType(contentType)
                .putContentName(contentName)
                .putCustomAttribute(KEY_TIMEZONE, tz.getID())
                .putCustomAttribute(KEY_LANG, language)
                .putContentId(contentId));
        Log.d(TAG, "logView - " + contentType + ": " + contentName + "(" + contentId + ")");
    }

    private static void checkInitFabric(Context c) {
        if (!Fabric.isInitialized()) HomeActivity.initFabric(c);
    }

    private void registerBroadcastReceiver() {
        final IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(Intent.ACTION_SCREEN_ON);
        intentFilter.addAction(Intent.ACTION_SCREEN_OFF);

        BroadcastReceiver screenOnOffReceiver = new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {
                if (intent.getAction().equals(Intent.ACTION_SCREEN_OFF)) {
                    MusicManager.pause();
                }
            }
        };

        getApplicationContext().registerReceiver(screenOnOffReceiver, intentFilter);
    }

    private boolean shouldContinueMusic() {
        return continueMusic;
    }

    private void setContinueMusic(boolean val) {
        continueMusic = val;
    }

    protected abstract String getContentType();

    protected abstract int getTitleResId();

    protected abstract int getLayoutResId();

    private LoggedActivity getThis() {
        return this;
    }
}
