package shurinovlev.custom_view;

/**
 * Created by 1 on 17.03.2018.
 */

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.MotionEvent;
import android.view.View;

public class MyCustom extends View {
    int j=0;
    private Paint mPaint = new Paint();

    float btn_x;
    float btn_y;
    //цвета
    int btn1;
    int btn2;
    int bulb;
    int bulb0;
    int bulb1;
    int bulb2;
    int bulb3;

    public MyCustom(Context context) {
        super(context);
        mPaint.setStrokeWidth(3);
        btn1= Color.BLACK;
        btn2= Color.BLACK;
        bulb0 = Color.rgb(238,255,0);
        bulb1 = Color.rgb(193, 204, 39);
        bulb2 = Color.rgb(166, 173, 68);
        bulb3 = Color.rgb(207,214,114);
    }
    // Класс для создания точки
    class Pt {
        float x, y;

        Pt(float _x, float _y) {
            x = _x;
            y = _y;
        }
    }
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = canvas.getWidth();
        int height = canvas.getHeight();
        btn_x=canvas.getWidth();
        btn_y=canvas.getHeight();
        // стиль Заливка
        mPaint.setStyle(Paint.Style.FILL);
        // закрашиваем холст белым цветом
        mPaint.setColor(Color.WHITE);
        canvas.drawPaint(mPaint);
        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
            mPaint.setColor(Color.BLACK);//недоделал
        }
        else {
            mPaint.setColor(Color.BLACK);
            mPaint.setStyle(Paint.Style.STROKE);

            Path path = new Path();

            Pt[] mPath = {new Pt(width * 1 / 6, height * 7 / 16), new Pt(width * 1 / 6, height * 3 / 16), new Pt(width * 5 / 12, height * 3 / 16), new Pt(width * 5 / 12, height * 13 / 32), new Pt(width * 2 / 3, height * 13 / 32), new Pt(width * 2 / 3, height * 13 / 16), new Pt(width * 1 / 6, height * 13 / 16), new Pt(width * 1 / 6, height * 1 / 2)};

            // переходим в первую точку рисования
            path.moveTo(mPath[0].x, mPath[0].y);
            // рисуем отрезки по заданным точкам
            for (int i = 1; i < mPath.length; i++) {
                path.lineTo(mPath[i].x, mPath[i].y);
            }
            // выводим результат
            canvas.drawPath(path, mPaint);
            //удаляем лишнии линиии
            mPaint.setColor(Color.WHITE);
            canvas.drawLine(width * 11 / 24, height * 13 / 16, width * 9 / 24, height * 13 / 16, mPaint);
            canvas.drawLine(width * 5 / 12, height * 13 / 32, width * 13 / 24, height * 13 / 32, mPaint);
            canvas.drawLine(width * 1 / 6, height * 1 / 2, width * 1 / 6, height * 7 / 16, mPaint);
            canvas.drawLine(width*10/24,height*3/16,width*10/24,height*12/32,mPaint);
            mPaint.setColor(Color.BLACK);
            //стрелка
            if (j==0) {
                canvas.drawLine(width * 9 / 24, height * 3 / 16, width * 10 / 24, height * 3 / 16, mPaint);
                canvas.drawLine(width * 10 / 24 , height * 3 / 16, width * 10 / 24 , height * 12 / 32, mPaint);
                canvas.drawLine(width * 19 / 48 , height * 11 / 32, width * 10 / 24 , height * 12 / 32, mPaint);
                canvas.drawLine(width * 21 / 48 , height * 11 / 32, width * 10 / 24 , height * 12 / 32, mPaint);
            }
            if (j==1) {
                canvas.drawLine(width * 9 / 24, height * 3 / 16, width * 10 / 24 + width * 1 / 24, height * 3 / 16, mPaint);
                canvas.drawLine(width * 10 / 24 + width * 1 / 24, height * 3 / 16, width * 10 / 24 + width *  1 / 24, height * 12 / 32, mPaint);
                canvas.drawLine(width * 19 / 48 + width * 1 / 24, height * 11 / 32, width * 10 / 24 + width *  1 / 24, height * 12 / 32, mPaint);
                canvas.drawLine(width * 21 / 48 + width * 1 / 24, height * 11 / 32, width * 10 / 24 + width *  1 / 24, height * 12 / 32, mPaint);
            }
            if (j==2) {
                canvas.drawLine(width * 9 / 24, height * 3 / 16, width * 10 / 24 + width * 2 / 24, height * 3 / 16, mPaint);
                canvas.drawLine(width * 10 / 24 + width * 2 / 24, height * 3 / 16, width * 10 / 24 + width *  2 / 24, height * 12 / 32, mPaint);
                canvas.drawLine(width * 19 / 48 + width * 2 / 24, height * 11 / 32, width * 10 / 24 + width *  2 / 24, height * 12 / 32, mPaint);
                canvas.drawLine(width * 21 / 48 + width * 2 / 24, height * 11 / 32, width * 10 / 24 + width *  2 / 24, height * 12 / 32, mPaint);
            }
            if (j==3) {
                canvas.drawLine(width * 9 / 24, height * 3 / 16, width * 10 / 24 + width * 3 / 24, height * 3 / 16, mPaint);
                canvas.drawLine(width * 10 / 24 + width * 3 / 24, height * 3 / 16, width * 10 / 24 + width *  3 / 24, height * 12 / 32, mPaint);
                canvas.drawLine(width * 19 / 48 + width * 3 / 24, height * 11 / 32, width * 10 / 24 + width *  3 / 24, height * 12 / 32, mPaint);
                canvas.drawLine(width * 21 / 48 + width * 3 / 24, height * 11 / 32, width * 10 / 24 + width *  3 / 24, height * 12 / 32, mPaint);
            }
            //источник питания
            canvas.drawLine(width * 3 / 24, height * 7 / 16, width * 5 / 24, height * 7 / 16, mPaint);
            canvas.drawLine(width * 7 / 48, height * 1 / 2, width * 9 / 48, height * 1 / 2, mPaint);
            //резистор и лампа
            canvas.drawRect(width * 5 / 12, height * 6 / 16, width * 13 / 24, height * 7 / 16, mPaint);
            mPaint.setAntiAlias(true);
            canvas.drawCircle(width * 10 / 24, height * 13 / 16, width * 1 / 24, mPaint);
            mPaint.setAntiAlias(false);
            //рисуем крест
            canvas.rotate(-45, width * 10 / 24, height * 13 / 16);
            canvas.drawLine(width * 11 / 24, height * 13 / 16, width * 9 / 24, height * 13 / 16, mPaint);
            canvas.rotate(90, width * 10 / 24, height * 13 / 16);
            canvas.drawLine(width * 11 / 24, height * 13 / 16, width * 9 / 24, height * 13 / 16, mPaint);
            canvas.rotate(-45, width * 10 / 24, height * 13 / 16);
            //рисуем лампочку
            if(j==0){bulb= bulb0;}
            if(j==1){bulb= bulb1;}
            if(j==2){bulb= bulb2;}
            if(j==3){bulb= bulb3;}
            mPaint.setColor(bulb);
            mPaint.setStyle(Paint.Style.FILL);
            canvas.drawOval(width * 38 / 48, height * 5 / 16, width * 42 / 48, height * 17 / 32, mPaint);
            //рисуем патрон
            mPaint.setColor(Color.GRAY);
            canvas.drawRect(width * 39 / 48, height * 33 / 64, width * 41 / 48, height * 19 / 32, mPaint);
            //рисуем кнопки
            mPaint.setStyle(Paint.Style.STROKE);
            //кнопка +
            mPaint.setColor(btn1);
            canvas.drawRect(btn_x*1/24,btn_y*1/4,btn_x*3/24,btn_y*3/8,mPaint);
            canvas.drawLine(btn_x*1/12,btn_y*9/32,btn_x*1/12,btn_y*11/32,mPaint);
            canvas.drawLine(btn_x*3/48,btn_y*5/16,btn_x*5/48,btn_y*5/16,mPaint);
            //кнопка -
            mPaint.setColor(btn2);
            canvas.drawRect(btn_x*1/24,btn_y*9/16,btn_x*3/24,btn_y*11/16,mPaint);
            canvas.drawLine(btn_x*3/48,btn_y*10/16,btn_x*5/48,btn_y*10/16,mPaint);
        }
    }
    public boolean onTouchEvent(MotionEvent event) {
        // координаты касания
        float x = event.getX();
        float y = event.getY();
        float w = getWidth();
        float h = getHeight();
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                //кнопка +
                if ( (w*1/24<=x && x<=w*3/24)&&(h*1/4<=y && y<=h*3/8) ) {
                    btn1=Color.RED;
                    if (j>0) {j--;}
                    invalidate();
                }
                //кнопка -
                if ( (w*1/24<=x && x<=w*3/24)&&(h*9/16<=y && y<=h*11/16) ) {
                    btn2=Color.RED;
                    if (j<3) {j++;}
                    invalidate();
                }
                break;
            case MotionEvent.ACTION_UP:
                //кнопка +
                if ( (w*1/24<=x && x<=w*3/24)&&(h*1/4<=y && y<=h*3/8) ) {
                    btn1=Color.BLACK;
                    invalidate();
                }
                //кнопка -
                if ( (w*1/24<=x && x<=w*3/24)&&(h*9/16<=y && y<=h*11/16) ) {
                    btn2=Color.BLACK;
                    invalidate();
                }
        }
        return true;
    }
}

