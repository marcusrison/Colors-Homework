package com.example.cs301colorshw;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

/**
 * MainActivity
 *
 * creates the layout of the main activity xml
 * @author Marcus Rison
 * @date 10 February 2022
 */
public class MainActivity extends AppCompatActivity {

    /**
     * onCreate
     *
     * creates objects to react to to each other based on if an event has happened
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DrawClass drawingCanvas = new DrawClass(this);
        drawingCanvas = findViewById(R.id.drawingcanvas);
        CanvasController canvasController = new CanvasController(drawingCanvas);
        RedController redController = new RedController(drawingCanvas);
        BlueController blueController = new BlueController(drawingCanvas);
        GreenController greenController = new GreenController(drawingCanvas);

        TextView tvOfDrawing = (TextView) findViewById(R.id.text_of_object);
        //tvOfDrawing.setText(R.id.objectTouched); //Fix this

        SeekBar redSeekBar = (SeekBar) findViewById(R.id.red_seekbar);
        redSeekBar.setOnSeekBarChangeListener(redController);
        SeekBar blueSeekBar = (SeekBar) findViewById(R.id.blue_seekbar);
        blueSeekBar.setOnSeekBarChangeListener(blueController);
        SeekBar greenSeekBar = (SeekBar) findViewById(R.id.green_seekbar);
        greenSeekBar.setOnSeekBarChangeListener(greenController);

        drawingCanvas.setOnTouchListener(canvasController);
    }
}

/**
 * External Citation
 *  Date: 8 February 2022
 *  Problem: Couldn't get my DrawClass object to work in the MainActivity
 *
 *  Resource: Trystan Wong
 *  Solution: Had to use com.example.cs301colorshw.DrawClass in the xml instead of SurfaceView
 */
