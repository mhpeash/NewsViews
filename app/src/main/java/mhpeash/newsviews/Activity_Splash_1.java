package mhpeash.newsviews;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.r0adkll.slidr.model.SlidrInterface;

public class Activity_Splash_1 extends AppCompatActivity {
    private SlidrInterface slidr;

    private static int SPLASH_TIME_OUT = 6000;
    public static final String Initial_play = "count";
    public static final String Initial_Count = "splash_Count";
    private TextView intro1,intro2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_1);
        intro1=findViewById(R.id.intro1);
        intro2=findViewById(R.id.intro2);
        SharedPreferences sp = getSharedPreferences(Initial_Count, Context.MODE_PRIVATE);
        int sc = sp.getInt(Initial_play, 0);
        if (sc > 0) {
            Intent i = new Intent(Activity_Splash_1.this, Activity_Splash_Final.class);
            startActivity(i);
        } else {

            intro2.setVisibility(View.GONE);
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    intro1.setVisibility(View.GONE);
                    intro2.setVisibility(View.VISIBLE);
                }
            }, 3000);




            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent i = new Intent(Activity_Splash_1.this, Activity_Splash_2.class);
                    startActivity(i);
                    finish();
                }
            }, SPLASH_TIME_OUT);
        }
    }
}