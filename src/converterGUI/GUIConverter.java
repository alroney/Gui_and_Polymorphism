package converterGUI;

/**
 * @author Andrew
 * Date: 06/16/2022
 * Description: This program will demonstrate the usage of Graphical User Interfaces and Polymorphism. We will be programming a conversion calculator.
 * 		Try/Catch will be implemented to prevent error when entering an incorrect value which is to then display NaN.
 */


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUIConverter extends JFrame{

	public static void main(String[] args) {
		new GUIConverter();//Create and run the GUI.
		
	}
	
	public GUIConverter() {
		/*FRAME CREATION*/
			JFrame frame = new JFrame("Converter");
				frame.setLayout(new FlowLayout());//Maintain organization.
				frame.setSize(400,200);//Default size of the frame.
				frame.setLocationRelativeTo(null);//Position the frame to center of screen.
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Close and stop program upon hitting the 'X' on the window.
			
		/*BUTTON CREATION*/
			JButton distanceConverter = new JButton("Distance Converter");//Create a button and have text inside saying Distance Converter.
			JButton tempConverter = new JButton("Temperature Converter");//Create a button and have text inside saying Temperature Converter.
			JButton exit = new JButton("Exit");//Create a button and have text inside saying Exit.
				frame.add(distanceConverter);
				frame.add(tempConverter);
				frame.add(exit);
			
		/*ACTION LISTENERS*/
			/*Distance Converter Listener*/
			distanceConverter.addActionListener(new ActionListener() {//Distance button action listener.
				public void actionPerformed(ActionEvent ae) {
					DistanceConverter distanceConverter = new DistanceConverter();//Create a new instance of Distance Converter.
					
					try {//Attempt the correct way.
						double distance = Double.parseDouble(JOptionPane.showInputDialog("Please enter Distance in Miles"));//Show the input dialog and box with user input option.
						distanceConverter.setInput(distance);
						JOptionPane.showMessageDialog(rootPane, "Converted Distance is: "+ distanceConverter.convert() +" KM");//Run the input through convert() from the Distance Converter class.
					}
					
					catch (NumberFormatException nfe) {//If it fails throw an exception regarding the Number format.
						JOptionPane.showMessageDialog(rootPane, "Converted Distance is: "+ distanceConverter.convert());
					}
				}
				
			});	
				
			/*Temperature Converter Listener*/
			tempConverter.addActionListener(new ActionListener() {//Temperature Button action listener.
				public void actionPerformed(ActionEvent ae) {
					TemperatureConverter tempConverter = new TemperatureConverter();//Create a new instance of Temperature Converter.
					
					try {//Attempt the correct way.
						double temp = Double.parseDouble(JOptionPane.showInputDialog("Please enter Temperature in Fahrenheit"));//Show the input dialog and box with user input option.
						tempConverter.setInput(temp);
						JOptionPane.showMessageDialog(rootPane, "Converted Temperature is: "+ tempConverter.convert() +"\u00B0 C");//Run the input through convert() from Temperature Converter class. \u00B0 displays the degrees symbol.
					} 
					
					catch(NumberFormatException nfe) {//If it fails throw an exception regarding the Number format.
						JOptionPane.showMessageDialog(rootPane, "Converted Temperatire is: "+ tempConverter.convert());
					}
				}
			});
			
			
			/*Exit Listener*/
			exit.addActionListener(new ActionListener() {//Exit button listener.
				public void actionPerformed(ActionEvent ae) {
					frame.dispose();//Close the GUI
					System.exit(0);//Stop the program on the system.
				}
			});
			
		frame.setVisible(true);//Show the window/frame
	}

}
