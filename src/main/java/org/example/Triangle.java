package org.example;

import javafx.scene.control.Alert;

public class Triangle
{
    public static boolean isExist(double side1, double side2, double side3)
    {
        try {
            if ((side1+side2)<=side3 || (side1+side3)<=side2 || (side2+side3)<=side1)
                throw new Exception();
        }
        catch (Exception exception) {
            return false;
        }
        return true;
    }
}