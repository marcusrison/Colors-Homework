package com.example.cs301colorshw;

import android.widget.SeekBar;


/**
 * GreenController
 *
 * controller for the green seekbar
 * @author Marcus Rison
 * @date 10 February 2022
 */
public class GreenController implements SeekBar.OnSeekBarChangeListener{
    private DrawClass drawClass; //Instance variable of the DrawClass class
    private CanvasModel model; // Instance variable of the CanvasModel class


    /**
     * GreenController ctor
     *
     * @param initDrawClass needs a DrawClass object to get a reference to the DrawClass class
     */
    public GreenController(DrawClass initDrawClass) {
        this.drawClass = initDrawClass;
        model = drawClass.getCanvasModel();
    }


    /**
     * onProgressChanged
     *
     * @param seekBar the seekbar
     * @param i the value of the seekbar
     * @param b if the seekbar was changed
     */
    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
        model.rgbValue = i;
        drawClass.invalidate();
    }


    /**
     * onStartTrackingTouch
     *
     * Does nothing
     * @param seekBar the seekbar
     */
    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
        //Do nothing
    }


    /**
     * onStopTrackingTouch
     *
     * Does nothing
     * @param seekBar the seekbar
     */
    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
        //Do nothing
    }
}
