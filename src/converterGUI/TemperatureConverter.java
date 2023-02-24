package converterGUI;

import java.text.DecimalFormat;

/**
 * 
 * @author Andrew
 * Description: The TemperatureConverter class will take a Fahrenheit temperature and then convert it to a Celsius temperature.
 */

//Supclass of Converter
public class TemperatureConverter extends Converter {
	
//Constructor: Go through the temperature class with the default value of input from the superclass, Converter.
	public TemperatureConverter() {
		super();
	}

//Constructor: Go through the temperature class with an external input value and pass it to the superclass, Converter.
	public TemperatureConverter(double input) {
		super(input);
	}
	
	
//Method: Convert the input value from fahrenheit into celsius, then return it in a formatted way.
	@Override
	public double convert() {
		DecimalFormat df = new DecimalFormat("#.##");
		
		double celsius = 0;
		double fahrenheit = getInput();
		
		if(Double.isNaN(fahrenheit)) {
			celsius = Double.NaN;
		}
		else {
			celsius = ((fahrenheit - 32) * 5) / 9;
			celsius = Double.valueOf(df.format(celsius));
		}
		return celsius;
	}
}
