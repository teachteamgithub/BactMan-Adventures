package com.ionis.igem.app.utils;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;

class ThreadUtils {
    private static void runOnUiThread(Runnable runnable) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            Handler mainHandler = new Handler(Looper.getMainLooper());
            mainHandler.post(runnable);
        } else {
            runnable.run();
        }
    }

    public static void toastOnUiThread(final Context context, final String message, final int length) {
        ThreadUtils.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                Toast.makeText(context, message, length).show();
            }
        });
    }
}
