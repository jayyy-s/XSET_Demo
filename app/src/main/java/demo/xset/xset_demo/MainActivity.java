package demo.xset.xset_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private static int SPLASH_SCREEN = 3000;

    Animation splashAnimation;
    ImageView splashImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);


        splashAnimation = AnimationUtils.loadAnimation(this, R.anim.splash_animation);

        splashImage = findViewById(R.id.xsetSplashImageView);

        splashImage.setAnimation(splashAnimation);

        new Handler().postDelayed(new Runnable() {
           @Override
           public void run() {
               Intent intent = new Intent(MainActivity.this, TabbedMenuActivity.class);
               startActivity(intent);
               finish();
           }
        }, SPLASH_SCREEN);

    }
}