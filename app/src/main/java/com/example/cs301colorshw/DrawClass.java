package com.example.cs301colorshw;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.SurfaceView;

/**
 * DrawClass
 *
 * Draws all the objects in the surface view
 * @author Marcus Rison
 * @date 10 February 2022
 */
public class DrawClass extends SurfaceView {

    private Paint bodyPaint;
    private Paint leftEyePaint;
    private Paint rightEyePaint;
    private Paint leftPupilPaint;
    private Paint rightPupilPaint;
    private int backgroundPaint;

    private CanvasController controller;
    private CanvasModel canvasModel;


    public DrawClass(Context context) {
        super(context);
        initialize();
    }

    public DrawClass(Context context, AttributeSet attrs) {
        super(context, attrs);
        initialize();
    }

    public CanvasModel getCanvasModel() { return canvasModel; }

    private void initialize() {
        this.bodyPaint = new Paint();
        this.bodyPaint.setColor(Color.WHITE);
        this.bodyPaint.setStyle(Paint.Style.FILL);

        this.leftEyePaint = new Paint();
        this.leftEyePaint.setColor(Color.RED);
        this.leftEyePaint.setStyle(Paint.Style.FILL);

        this.rightEyePaint = new Paint();
        this.rightEyePaint.setColor(Color.GREEN);
        this.rightEyePaint.setStyle(Paint.Style.FILL);

        this.leftPupilPaint = new Paint();
        this.leftPupilPaint.setColor(Color.MAGENTA);
        this.leftPupilPaint.setStyle(Paint.Style.FILL);

        this.rightPupilPaint = new Paint();
        this.rightPupilPaint.setColor(Color.BLACK);
        this.rightPupilPaint.setStyle(Paint.Style.FILL);

        this.backgroundPaint = Color.BLUE;

        setWillNotDraw(false);

        this.setBackgroundColor(backgroundPaint);


    }

    @Override
    public void onDraw(Canvas canvas) {
        canvas.drawRect(600.0f, 000.0f, 1300.0f, 700.0f, this.bodyPaint); //The body
        canvas.drawCircle(800.0f, 200.0f, 150.0f, this.leftEyePaint); //The left eye
        canvas.drawCircle(800.0f, 200.0f, 75.0f, this.leftPupilPaint); //The left pupil
        canvas.drawCircle(1100.0f, 200.0f, 150.0f, this.rightEyePaint); //The right eye
        canvas.drawCircle(1100.0f, 200.0f, 75.0f, this.rightPupilPaint); //The right pupil
    }

}

/**
 * External Citation
 *  Date: 7 February 2022
 *  Problem : Needed a class to draw the objects
 *
 *  Resource: Example code from class
 *  Solution: I used the DrawClass from the example in class as a template to begin with
 *
 */