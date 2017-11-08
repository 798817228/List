package com.example.student.mynew;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        hand=new Handler();

         view=(MyView) findViewById(R.id.myview);
        view.setOnTouchListener(new View.OnTouchListener() {
            int sx,sy;
            float cx,cy;
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch(event.getAction())
                {
                    case MotionEvent.ACTION_DOWN:

                        sx=(int) event.getX();
                        sy=(int) event.getY();

                    case MotionEvent.ACTION_MOVE:

                        cx=event.getX();
                        cy=event.getY();
                                view.mymove(cx-sx,cy-sy);
                        break;
                }
                return true;
            }
        });
        hand.postDelayed(run,100);
    }

    Handler hand;
    MyView view;


    Runnable run=new Runnable() {
        @Override
        public void run() {
            view.invalidate();
            hand.postDelayed(run,100);
        }
    };
}
