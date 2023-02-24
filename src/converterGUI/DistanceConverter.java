package converterGUI;

import java.text.DecimalFormat;

/**
 * 
 * @author Andrew
 * Description: The DistanceConverter class will take a distance in Miles and then convert the value in to Kilometers.
 */

//Subclass of Converter
public class DistanceConverter extends Converter {
	
//Constructor: Go through the distance class with the default value of input from the superclass, Converter.
	public DistanceConverter() {
		super();
	}

//Constructor: Go through the distance class with an external input value and pass it to the superclass, Converter.
	public DistanceConverter(double input) {
		super(input);
	}
	
//Method: Convert the input value into kilometers from miles and then return it in a formatted way.
	@Override
	public double convert() {
		DecimalFormat df = new DecimalFormat("#.##");//For cleaner output
		
		double miles = getInput();//Set miles to the input value for easier use.
		double km = 0;
		
		if(Double.isNaN(miles)) {
			km = Double.NaN;
		}
		else {
			km = miles * 1.609;
			km = Double.valueOf(df.format(km));
		}
		return km;
	}
}
