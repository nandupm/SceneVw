package com.nandu.sceneform.render;

import android.content.Context;
import android.os.Build;
import android.widget.Toast;

/*import androidx.annotation.RequiresApi;

import com.google.ar.sceneform.math.Vector3;
import com.google.ar.sceneform.rendering.Color;
import com.google.ar.sceneform.rendering.MaterialFactory;
import com.google.ar.sceneform.rendering.Renderable;
import com.google.ar.sceneform.rendering.ShapeFactory;*/

public class ShapeRenderHelper {

    public void makeToast(Context context){
        Toast.makeText(context, "testing...", Toast.LENGTH_SHORT).show();
    }

    /*private final Context context;
    private boolean shadow = false;

    public ShapeRenderHelper(Context context){
        this.context = context;
    }

    public ShapeRenderHelper(Context context,boolean shadow){
        this.context = context;
        this.shadow = shadow;
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    public void renderLine(Color color,float length,ShapeRenderConsume consume){
        MaterialFactory.makeOpaqueWithColor(context,color).thenAccept(material -> {
            Renderable renderable = ShapeFactory.makeCube(
                    new Vector3(0.002f,0.002f,length),
                    Vector3.zero(),
                    material
            );
            renderable.setShadowCaster(shadow);
            renderable.setShadowReceiver(shadow);
            consume.onRender(renderable);
        });
    }*/
}
