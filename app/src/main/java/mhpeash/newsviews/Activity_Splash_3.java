package mhpeash.newsviews;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.r0adkll.slidr.Slidr;
import com.r0adkll.slidr.model.SlidrInterface;

public class Activity_Splash_3 extends AppCompatActivity {

    private SlidrInterface slidr;
    private static int SPLASH_TIME_OUT=6000;
            public static final String Initial_Count ="splash_Count";
        public static final String Initial_play= "count";
        private TextView info2,info3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_3);
        slidr = Slidr.attach(this);
        info2=findViewById(R.id.info2);
        info3=findViewById(R.id.info3);

        SharedPreferences sp = getSharedPreferences(Initial_Count , Context.MODE_PRIVATE);
        sp.edit().putInt(Initial_play,1).commit();

        info3.setVisibility(View.GONE);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                info2.setVisibility(View.GONE);
                info3.setVisibility(View.VISIBLE);
            }
        }, 3000);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(Activity_Splash_3.this, Activity_Splash_Final.class);
                startActivity(i);
                finish();
            }
        }, SPLASH_TIME_OUT);

//

//
////========= Code to get saved/ retrieve data ==============
//


    }
}
