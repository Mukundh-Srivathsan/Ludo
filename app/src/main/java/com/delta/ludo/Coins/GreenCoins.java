package com.delta.ludo.Coins;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

import com.delta.ludo.Circle;

public class GreenCoins extends View {

    Paint border = new Paint();
    Paint house = new Paint();

    Paint white = new Paint();


    Circle coin1, coin2, coin3, coin4;

    public GreenCoins(Context context) {
        super(context);

        init(null);
    }

    public GreenCoins(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        init(attrs);
    }

    public GreenCoins(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        init(attrs);
    }

    public GreenCoins(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);

        init(attrs);
    }

    private void init(@Nullable AttributeSet attrs) {

        white.setColor(Color.WHITE);

        border.setStyle(Paint.Style.STROKE);
        border.setColor(Color.BLACK);
        border.setStrokeWidth(5);

        house.setARGB(255, 6, 161, 74);
        house.setStrokeWidth(5);
        house.setStyle(Paint.Style.FILL_AND_STROKE);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        coin1 = new Circle(725, getHeight() / 2 - 175);
        coin2 = new Circle(825, getHeight() / 2 - 175);
        coin3 = new Circle(725, getHeight() / 2 - 275);
        coin4 = new Circle(825, getHeight() / 2 - 275);

        canvas.drawCircle(coin1.getCx(), coin1.getCy(), 25, house);
        canvas.drawCircle(coin1.getCx(), coin1.getCy(), 3, white);

        canvas.drawCircle(coin2.getCx(), coin2.getCy(), 25, house);
        canvas.drawCircle(coin2.getCx(), coin2.getCy(), 3, white);

        canvas.drawCircle(coin3.getCx(), coin3.getCy(), 25, house);
        canvas.drawCircle(coin3.getCx(), coin3.getCy(), 3, white);

        canvas.drawCircle(coin4.getCx(), coin4.getCy(), 25, house);
        canvas.drawCircle(coin4.getCx(), coin4.getCy(), 3, white);
    }
}
