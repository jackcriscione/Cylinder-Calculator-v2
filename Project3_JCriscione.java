//Jack Criscione - Project 3 - CISS 110 - September 13th, 2022
import javax.swing.*;

import static java.lang.Math.pow;

public class Project3_JCriscione {

    public static void main(String[] args) {

        //defined variables
        int diameter, height;
        double radius;
        double circumference, areaOfCircle, cylVolume;
        String name;
        final double PI = 3.1415926;

        //user input
        String input;
        name = JOptionPane.showInputDialog("Enter your name and select OK."); //input for name

        JOptionPane.showMessageDialog(null, "Hello, " + name + ". You have two more values to provide.", "Greetings!", JOptionPane.INFORMATION_MESSAGE);

        input = JOptionPane.showInputDialog("Enter the integer diameter of a cylinder. "); //prompt
        diameter = Integer.parseInt(input); //gives value for diameter

        input = JOptionPane.showInputDialog("Enter the integer height of the cylinder. "); //prompt
        height = Integer.parseInt(input); //gives value for height

        //calculations
        radius = (diameter / 2.0); //calculates radius
        circumference = (PI * diameter * 1.0); //calculates circumference
        areaOfCircle = (PI * pow(radius, 2) * 1.0); //calculates area of a circle
        cylVolume = (areaOfCircle * height * 1.0); //calculates volume of cylinder

        //output of data
        String output = "The radius is " + radius + ".\n" +
                "The diameter is " + diameter + ".\n" +
                "The height is " + height + ".\n" +
                "The circumference is " + circumference + ".\n" +
                "The area of the base is " + areaOfCircle + ".\n" +
                "The volume of the cylinder is " + cylVolume + ".\n";

        JOptionPane.showMessageDialog(null, output , "Results", JOptionPane.INFORMATION_MESSAGE);

        //end of code
    }
}
