package com.example.cs301colorshw;

import android.view.MotionEvent;
import android.view.View;
import android.widget.SeekBar;

/**
 * CanvasController
 *
 * This class will act as the controller for touch events and seekbar changes
 * @author Marcus Rison
 * @date 10 February 2022
 */
public class CanvasController implements SeekBar.OnSeekBarChangeListener, View.OnTouchListener {

    private DrawClass drawClass; //Instance variable of the DrawClass class
    private CanvasModel model; // Instance variable of the CanvasModel class

    /**
     * CanvasController ctor
     *
     * The constructor for this class
     * @param initDrawClass needs a DrawClass object to get a reference to the DrawClass class
     */
    public CanvasController(DrawClass initDrawClass) {
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

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
        //Do nothing
    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
        //Do nothing
    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        float newX = motionEvent.getX();
        float newY = motionEvent.getY();

        // If the user touches the body
        if ((newX > 600.0f) && (newX < 650.0f)) {
            if ((newY > 0.0f) && (newY < 700.0f)) {
                model.isBody = true;
                return true;
            }
        }

        if ((newX > 1250.0f) && (newX < 1300.0f)) {
            if ((newY > 0.0f) && (newY < 700.0f)) {
                model.isBody = true;
                return true;
            }
        }

        if ((newX > 600.0f) && (newX < 1300.0f)) {
            if ((newY > 0.0f) && (newY < 50.0f)) {
                model.isBody = true;
                return true;
            }
        }

        if ((newX > 600.0f) && (newX < 1300.0f)) {
            if ((newY > 350.0f) && (newY < 700.0f)) {
                model.isBody = true;
                return true;
            }
        }

        if (model.isBody) {
           model.nameOfObject = "Body";
        }

        // If the user touches the left eye
        if ((newX > 650.0f) && (newX < 725.0f)) {
            if ((newY > 50.0f) && (newY < 125.0f)) {
                model.isLeftEye = true;
                return true;
            }
        }

        if ((newX > 875.0f) && (newX < 950.0f)) {
            if ((newY > 50.0f) && (newY < 125.0f)) {
                model.isLeftEye = true;
                return true;
            }
        }

        if ((newX > 875.0) && (newX < 950.0f)) {
            if ((newY > 275.0f) && (newY < 350.0f)) {
                model.isLeftEye = true;
                return true;
            }
        }

        if ((newX > 650.0f) && (newX < 725.0f)) {
            if ((newY > 275.0f) && (newY < 350.0f)) {
                model.isLeftEye = true;
                return true;
            }
        }

        if (model.isLeftEye) {
            model.nameOfObject = "Left Eye";
        }

        // If the user touches the left pupil
        if ((newX > 725.0f) && (newX < 875.0f)) {
            if ((newY > 125.0f) && (newY < 275.0f)) {
                model.isLeftPupil = true;
                return true;
            }
        }

        if (model.isLeftPupil) {
            model.nameOfObject = "Left Pupil";
        }

        // If the user touches the right pupil
        if ((newX > 1025.0f) && (newX < 1175.0f)) {
            if ((newY > 125.0f) && (newY < 275.0f)) {
                model.isRightPupil = true;
                return true;
            }
        }

        // If the user touches the right eye
        if ((newX > 950.0f) && (newX < 1175.0f)) {
            if ((newY > 50.0f) && (newY < 125.0f)) {
                model.isRightEye = true;
                return true;
            }
        }

        if ((newX > 1175.0f) && (newX < 1300.0f)) {
            if ((newY > 50.0f) && (newY < 125.0f)) {
                model.isRightEye = true;
                return true;
            }
        }

        if ((newX > 950.0f) && (newX < 1175.0f)) {
            if ((newY > 275.0f) && (newY < 350.0f)) {
                model.isRightEye = true;
                return true;
            }
        }

        if ((newX > 1175.0f) && (newX < 1300.0f)) {
            if ((newY > 275.0f) && (newY < 350.0f)) {
                model.isRightEye = true;
                return true;
            }
        }

        if (model.isRightEye) {
            model.nameOfObject = "Right Eye";
        }

        // If the background is touched
        if ((newX > 0.0f) && (newX < 600.0f)) {
            if ((newY > 0.0f) && (newY < 700.0f)) {
                model.isBackground = true;
                return true;
            }
        }

        if (newX > 1300.0f) {
            if ((newY > 0.0f) && (newY < 700.0f)) {
                model.isBackground = true;
                return true;
            }
        }

        if (model.isBackground) {
            model.nameOfObject = "Background";
        }

        return false;
    }
}
