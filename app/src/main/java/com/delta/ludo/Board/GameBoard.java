package com.delta.ludo.Board;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

import org.jetbrains.annotations.NotNull;

public class GameBoard extends View {

    private static final String TAG = "GameView";


    Paint border = new Paint();
    Paint house = new Paint();

    Paint white = new Paint();

    public GameBoard(Context context) {
        super(context);

        init(null);
    }

    public GameBoard(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        init(attrs);
    }

    public GameBoard(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        init(attrs);
    }

    public GameBoard(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);

        init(attrs);
    }

    private void init(@Nullable AttributeSet attrs) {

        white.setColor(Color.WHITE);

        border.setStyle(Paint.Style.STROKE);
        border.setColor(Color.BLACK);
    }

    @Override
    protected void onDraw(Canvas canvas) {

        super.onDraw(canvas);

        canvas.drawRect(475, getHeight() / 2 - 75, 625, getHeight() / 2 + 75, border);

        draw_red_house(canvas);
        draw_yellow_house(canvas);
        draw_green_house(canvas);
        draw_blue_house(canvas);

    }

    private void draw_red_house(@NotNull Canvas canvas) {

        house.setARGB(255, 233, 28, 37);

        canvas.drawRect(125 + 50, getHeight() / 2 - 75, 6 * 50 + 175, getHeight() / 2 - (7 * 50 + 25), house);
        canvas.drawRect(125 + 50, getHeight() / 2 - 75, 6 * 50 + 175, getHeight() / 2 - (7 * 50 + 25), border);

        canvas.drawRect(150 + 75, getHeight() / 2 - 125, 6 * 50 + 125, getHeight() / 2 - (7 * 50 - 25), white);
        canvas.drawRect(150 + 75, getHeight() / 2 - 125, 6 * 50 + 125, getHeight() / 2 - (7 * 50 - 25), border);

        house.setStrokeWidth(5);
        house.setStyle(Paint.Style.STROKE);

        canvas.drawCircle(275, getHeight() / 2 - 175, 30, house);
        canvas.drawCircle(375, getHeight() / 2 - 175, 30, house);

        canvas.drawCircle(275, getHeight() / 2 - 275, 30, house);
        canvas.drawCircle(375, getHeight() / 2 - 275, 30, house);

        canvas.drawCircle(275, getHeight() / 2 - 175, 33, border);
        canvas.drawCircle(375, getHeight() / 2 - 175, 33, border);

        canvas.drawCircle(275, getHeight() / 2 - 275, 33, border);
        canvas.drawCircle(375, getHeight() / 2 - 275, 33, border);

        house.setStyle(Paint.Style.FILL);

        for (int i = 1; i < 7; i++) {

            if (i == 2)
                canvas.drawRect(125 + (i * 50), getHeight() / 2 - 75, i * 50 + 175, getHeight() / 2 - 25, house);

            canvas.drawRect(125 + (i * 50), getHeight() / 2 - 75, i * 50 + 175, getHeight() / 2 - 25, border);

            if (i != 1) {
                canvas.drawRect(125 + (i * 50), getHeight() / 2 - 25, i * 50 + 175, getHeight() / 2 + 25, house);
            }
            canvas.drawRect(125 + (i * 50), getHeight() / 2 - 25, i * 50 + 175, getHeight() / 2 + 25, border);

            canvas.drawRect(125 + (i * 50), getHeight() / 2 + 25, i * 50 + 175, getHeight() / 2 + 75, border);
        }

        Point point1_draw = new Point(6 * 50 + 175, getHeight() / 2 - 75);
        Point point2_draw = new Point(6 * 50 + 250, getHeight() / 2);
        Point point3_draw = new Point(6 * 50 + 175, getHeight() / 2 + 75);

        Path triangle = new Path();
        triangle.moveTo(point1_draw.x, point1_draw.y);
        triangle.lineTo(point2_draw.x, point2_draw.y);
        triangle.lineTo(point3_draw.x, point3_draw.y);
        triangle.lineTo(point1_draw.x, point1_draw.y);
        triangle.close();

        canvas.drawPath(triangle, house);
        canvas.drawPath(triangle, border);
    }

    private void draw_yellow_house(@NotNull Canvas canvas) {

        house.setARGB(255, 253, 223, 26);

        canvas.drawRect(575 + 50, getHeight() / 2 + 75, 575 + (7 * 50), getHeight() / 2 + (7 * 50 + 25), house);
        canvas.drawRect(575 + 50, getHeight() / 2 + 75, 575 + (7 * 50), getHeight() / 2 + (7 * 50 + 25), border);

        canvas.drawRect(625 + 50, getHeight() / 2 + 125, 525 + (7 * 50), getHeight() / 2 + (7 * 50 - 25), white);
        canvas.drawRect(625 + 50, getHeight() / 2 + 125, 525 + (7 * 50), getHeight() / 2 + (7 * 50 - 25), border);

        house.setStrokeWidth(5);
        house.setStyle(Paint.Style.STROKE);

        canvas.drawCircle(725, getHeight() / 2 + 175, 30, house);
        canvas.drawCircle(825, getHeight() / 2 + 175, 30, house);

        canvas.drawCircle(725, getHeight() / 2 + 275, 30, house);
        canvas.drawCircle(825, getHeight() / 2 + 275, 30, house);

        canvas.drawCircle(725, getHeight() / 2 + 175, 33, border);
        canvas.drawCircle(825, getHeight() / 2 + 175, 33, border);

        canvas.drawCircle(725, getHeight() / 2 + 275, 33, border);
        canvas.drawCircle(825, getHeight() / 2 + 275, 33, border);

        house.setStyle(Paint.Style.FILL);

        for (int i = 1; i < 7; i++) {

            canvas.drawRect(575 + (i * 50), getHeight() / 2 - 75, i * 50 + 625, getHeight() / 2 - 25, border);

            if (i != 6) {
                canvas.drawRect(575 + (i * 50), getHeight() / 2 - 25, i * 50 + 625, getHeight() / 2 + 25, house);
            }
            canvas.drawRect(575 + (i * 50), getHeight() / 2 - 25, i * 50 + 625, getHeight() / 2 + 25, border);

            if (i == 5)
                canvas.drawRect(575 + (i * 50), getHeight() / 2 + 25, i * 50 + 625, getHeight() / 2 + 75, house);

            canvas.drawRect(575 + (i * 50), getHeight() / 2 + 25, i * 50 + 625, getHeight() / 2 + 75, border);
        }

        Point point1_draw = new Point(575 + 50, getHeight() / 2 - 75);
        Point point2_draw = new Point(6 * 50 + 250, getHeight() / 2);
        Point point3_draw = new Point(575 + 50, getHeight() / 2 + 75);

        Path triangle = new Path();
        triangle.moveTo(point1_draw.x, point1_draw.y);
        triangle.lineTo(point2_draw.x, point2_draw.y);
        triangle.lineTo(point3_draw.x, point3_draw.y);
        triangle.lineTo(point1_draw.x, point1_draw.y);
        triangle.close();

        canvas.drawPath(triangle, house);
        canvas.drawPath(triangle, border);
    }

    private void draw_green_house(@NotNull Canvas canvas) {

        house.setARGB(255, 6, 161, 74);

        canvas.drawRect(575 + 50, getHeight() / 2 - 75, 575 + (7 * 50), getHeight() / 2 - (7 * 50 + 25), house);
        canvas.drawRect(575 + 50, getHeight() / 2 - 75, 575 + (7 * 50), getHeight() / 2 - (7 * 50 + 25), border);

        canvas.drawRect(625 + 50, getHeight() / 2 - 125, 525 + (7 * 50), getHeight() / 2 - (7 * 50 - 25), white);
        canvas.drawRect(625 + 50, getHeight() / 2 - 125, 525 + (7 * 50), getHeight() / 2 - (7 * 50 - 25), border);

        house.setStrokeWidth(5);
        house.setStyle(Paint.Style.STROKE);

        canvas.drawCircle(725, getHeight() / 2 - 175, 30, house);
        canvas.drawCircle(825, getHeight() / 2 - 175, 30, house);

        canvas.drawCircle(725, getHeight() / 2 - 275, 30, house);
        canvas.drawCircle(825, getHeight() / 2 - 275, 30, house);

        canvas.drawCircle(725, getHeight() / 2 - 175, 33, border);
        canvas.drawCircle(825, getHeight() / 2 - 175, 33, border);

        canvas.drawCircle(725, getHeight() / 2 - 275, 33, border);
        canvas.drawCircle(825, getHeight() / 2 - 275, 33, border);

        house.setStyle(Paint.Style.FILL);

        for (int i = 1; i < 7; i++) {

            canvas.drawRect(6 * 50 + 175, getHeight() / 2 - (i * 50 + 25), 6 * 50 + 225, getHeight() / 2 - (i * 50 + 75), border);

            if (i != 6) {
                canvas.drawRect(6 * 50 + 225, getHeight() / 2 - (i * 50 + 25), 6 * 50 + 275, getHeight() / 2 - (i * 50 + 75), house);
            }
            canvas.drawRect(6 * 50 + 225, getHeight() / 2 - (i * 50 + 25), 6 * 50 + 275, getHeight() / 2 - (i * 50 + 75), border);

            if (i == 5)
                canvas.drawRect(6 * 50 + 275, getHeight() / 2 - (i * 50 + 25), 6 * 50 + 325, getHeight() / 2 - (i * 50 + 75), house);

            canvas.drawRect(6 * 50 + 275, getHeight() / 2 - (i * 50 + 25), 6 * 50 + 325, getHeight() / 2 - (i * 50 + 75), border);

        }

        Point point1_draw = new Point(6 * 50 + 175, getHeight() / 2 - 75);
        Point point2_draw = new Point(6 * 50 + 250, getHeight() / 2);
        Point point3_draw = new Point(575 + 50, getHeight() / 2 - 75);

        Path triangle = new Path();
        triangle.moveTo(point1_draw.x, point1_draw.y);
        triangle.lineTo(point2_draw.x, point2_draw.y);
        triangle.lineTo(point3_draw.x, point3_draw.y);
        triangle.lineTo(point1_draw.x, point1_draw.y);
        triangle.close();

        canvas.drawPath(triangle, house);
        canvas.drawPath(triangle, border);
    }

    private void draw_blue_house(@NotNull Canvas canvas) {

        house.setARGB(255, 37, 157, 225);

        canvas.drawRect(125 + 50, getHeight() / 2 + 75, 6 * 50 + 175, getHeight() / 2 + (7 * 50 + 25), house);
        canvas.drawRect(125 + 50, getHeight() / 2 + 75, 6 * 50 + 175, getHeight() / 2 + (7 * 50 + 25), border);

        canvas.drawRect(150 + 75, getHeight() / 2 + 125, 6 * 50 + 125, getHeight() / 2 + (7 * 50 - 25), white);
        canvas.drawRect(150 + 75, getHeight() / 2 + 125, 6 * 50 + 125, getHeight() / 2 + (7 * 50 - 25), border);

        house.setStrokeWidth(5);
        house.setStyle(Paint.Style.STROKE);

        canvas.drawCircle(275, getHeight() / 2 + 175, 30, house);
        canvas.drawCircle(375, getHeight() / 2 + 175, 30, house);

        canvas.drawCircle(275, getHeight() / 2 + 275, 30, house);
        canvas.drawCircle(375, getHeight() / 2 + 275, 30, house);

        canvas.drawCircle(275, getHeight() / 2 + 175, 33, border);
        canvas.drawCircle(375, getHeight() / 2 + 175, 33, border);

        canvas.drawCircle(275, getHeight() / 2 + 275, 33, border);
        canvas.drawCircle(375, getHeight() / 2 + 275, 33, border);

        house.setStyle(Paint.Style.FILL);

        for (int i = 1; i < 7; i++) {

            if (i == 5)
                canvas.drawRect(6 * 50 + 175, getHeight() / 2 + (i * 50 + 25), 6 * 50 + 225, getHeight() / 2 + (i * 50 + 75), house);

            canvas.drawRect(6 * 50 + 175, getHeight() / 2 + (i * 50 + 25), 6 * 50 + 225, getHeight() / 2 + (i * 50 + 75), border);

            if (i != 6) {
                canvas.drawRect(6 * 50 + 225, getHeight() / 2 + (i * 50 + 25), 6 * 50 + 275, getHeight() / 2 + (i * 50 + 75), house);
            }
            canvas.drawRect(6 * 50 + 225, getHeight() / 2 + (i * 50 + 25), 6 * 50 + 275, getHeight() / 2 + (i * 50 + 75), border);


            canvas.drawRect(6 * 50 + 275, getHeight() / 2 + (i * 50 + 25), 6 * 50 + 325, getHeight() / 2 + (i * 50 + 75), border);

        }

        Point point1_draw = new Point(6 * 50 + 175, getHeight() / 2 + 75);
        Point point2_draw = new Point(6 * 50 + 250, getHeight() / 2);
        Point point3_draw = new Point(575 + 50, getHeight() / 2 + 75);

        Path triangle = new Path();
        triangle.moveTo(point1_draw.x, point1_draw.y);
        triangle.lineTo(point2_draw.x, point2_draw.y);
        triangle.lineTo(point3_draw.x, point3_draw.y);
        triangle.lineTo(point1_draw.x, point1_draw.y);
        triangle.close();

        canvas.drawPath(triangle, house);
        canvas.drawPath(triangle, border);
    }
}
