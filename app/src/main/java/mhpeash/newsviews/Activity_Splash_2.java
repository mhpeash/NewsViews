package mhpeash.newsviews;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.r0adkll.slidr.Slidr;
import com.r0adkll.slidr.model.SlidrInterface;

public class Activity_Splash_2 extends AppCompatActivity {

    private SlidrInterface slidr;
    private static int SPLASH_TIME_OUT=4000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_2);
        slidr = Slidr.attach(this);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(Activity_Splash_2.this, Activity_Splash_3.class);
                startActivity(i);
                finish();
            }
        }, SPLASH_TIME_OUT);
    }
//    public void lockSlide(View v) {
//        slidr.lock();
//    }
//
//    public void unlockSlide(View v) {
//        slidr.unlock();
//    }
}
