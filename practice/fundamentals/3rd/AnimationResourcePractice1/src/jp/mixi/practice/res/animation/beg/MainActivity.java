
package jp.mixi.practice.res.animation.beg;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        ImageView sato = (ImageView)findViewById(R.id.sato);
        Animation unko = AnimationUtils.loadAnimation(this, R.anim.unko);
        sato.startAnimation(unko);
        
        ImageView atsushi = (ImageView)findViewById(R.id.atsushi);
        Animation yokomark = AnimationUtils.loadAnimation(this, R.anim.yokomark);
        atsushi.startAnimation(yokomark);
        
        ImageView nifuramu = (ImageView)findViewById(R.id.nifuramu);
        Animation analplay = AnimationUtils.loadAnimation(this, R.anim.analplay);
        nifuramu.startAnimation(analplay);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

}
