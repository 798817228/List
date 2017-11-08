package com.example.student.mynew;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;

/**
 * TODO: document your custom view class.
 */
public class MyView extends View {


    public MyView(Context context) {
        super(context);
        init(null, 0);
    }

    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(attrs, 0);
    }

    public MyView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(attrs, defStyle);
    }

    private void init(AttributeSet attrs, int defStyle) {
        img=BitmapFactory.decodeResource(getResources(),R.drawable.b);

        img=BitmapFactory.decodeResource(getResources(),R.drawable.b);
    }

    public void mymove(float dx,float dy)
    {
        sx=(int) dx;
        sy=(int) dy;
    }

    Bitmap img;

    int sx=0;
    int sy=0;


    int y;
    int x;

    private void invalidateTextPaintAndMeasurements() {
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.drawColor(Color.YELLOW);
        canvas.drawBitmap(img,0,y,null);
        canvas.drawBitmap(img,100+sx,100+sy,null);

        y=y+5;
        x=x+5;

    }



}
