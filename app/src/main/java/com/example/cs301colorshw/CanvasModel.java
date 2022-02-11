package com.example.cs301colorshw;


/**
 * CanvasModel
 *
 * Serves as the model for data to be stored in
 * @author Marcus Rison
 * @date 10 February 2022
 */
public class CanvasModel {

    public int rgbValue; //The value of the color

    public String nameOfObject; //name of the object that is pressed

    public boolean isLeftEye; //determines whether the object pressed is the left eye

    public boolean isRightEye; //determines whether the object pressed is the right eye

    public boolean isLeftPupil; //determines whether the object pressed is the left pupil

    public boolean isRightPupil; //determines whether the object pressed is the right pupil

    public boolean isBody; //determines whether the object pressed is the body

    public boolean isBackground; //determines whether the object pressed is the background

    public int x; //the x-value of the object

    public int y; //the y-value of the object

    public int radius; //the radius of a circle

}
