package converterGUI;

/**
 * 
 * @author Andrew
 *
 */

public class Converter {
	private double input;

//Constructor: Sets a default value for the class attribute.
	public Converter() {
		this.input = Double.NaN;
	}
	
//Constructor: Overload allowing for user input to change the value of the class attribute.
	public Converter(double input) {
		this.input = input;
	}
	
	
/*SET METHODS*/
	
//Method: Allow separate input to change the current value of the class attribute.
	public void setInput(double input) {
		this.input = input;
	}

	
/*GET METHODS*/
	
//Method: Retrieve the current value of the attribute and send it to the caller.
	public double getInput() {
		return this.input;
	}
	
	
	
//Method: Process the conversion calculation.
	public double convert() {
		return input;
	}
}
