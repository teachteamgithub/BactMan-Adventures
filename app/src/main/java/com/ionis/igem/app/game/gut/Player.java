package com.ionis.igem.app.game.gut;

import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.Fixture;
import com.ionis.igem.app.game.model.PhysicalWorldObject;
import com.ionis.igem.app.ui.GameActivity;
import org.andengine.extension.physics.box2d.PhysicsWorld;
import org.andengine.opengl.texture.region.ITiledTextureRegion;
import org.andengine.opengl.vbo.VertexBufferObjectManager;

/**
 * Created by PLNech on 31/08/2015.
 */
public class Player extends PhysicalWorldObject {
    public static float SCALE_DEFAULT = 0.3f;

    public Player(float pX, float pY, float pAngle, ITiledTextureRegion pTiledTextureRegion, GameActivity activity) {
        super(pX, pY, pAngle, SCALE_DEFAULT, true, pTiledTextureRegion, activity.getVBOM(), activity.getPhysicsWorld());
    }

    @Override
    protected BodyDef.BodyType getBodyType() {
        return BodyDef.BodyType.KinematicBody;
    }

    public static boolean isOne(Fixture x1) {
            return x1.getBody().getUserData() instanceof Player;
    }
}
