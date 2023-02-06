//Denny To
//CSCI 1301
//Program 5
//ToDennyProgramFive
public class ToDennyCar {
	
	private int yearModel; 
	private String make;
	private int speed;
	
	/**
	 * ToDennyCar constructor
	 * initializes the above fields
	 */
	public ToDennyCar (int y, String m) {
		yearModel = y;
	 	make = m;
		speed = 0;
	}
	
	public void setYearModel(int y) {
		yearModel = y;			  
	}										  
	public void setMake(String m) {		  
		make = m;						  
	}										  
	public void setSpeed(int speed) {		  
		speed = 0;					  
	}
	
	/**
	 * The getYearModel method accesses
	 * setYearModel and returns the yearModel.
	 * @return The value of the yearModel.
	 */
	public int getYearModel() {
		return yearModel;
	}
	/**
	 * The getMake method accesses
	 * setMake and returns the make.
	 * @return The value of the make.
	 */
	public String getMake() {
		return make;
	}
	/**
	 * The getSpeed method displays the 
	 * current speed and returns the speed.
	 * @return The value of the carSpeed.
	 */
	public int getSpeed() {
		System.out.println("  current speed: " + speed);
		return speed;
	}

	/**
	 * The accelerate method displays to the user
	 * that the car is accelerating and then 
	 * updates the car's speed by plus 5.
	 * @return The value of the carSpeed field.
	 */
	public int accelerate() {
		System.out.println("The " + yearModel + " " + make + " accelerates. ");
		return speed += 5;
	}

	/**
	 * The brake method displays to the user
	 * that the car is braking and then
	 * updates the car's speed by minus 5.
	 * @return The value of the carSpeed field.
	 */
	public int brake() {
		System.out.println("The " + yearModel + " " + make + " brakes. ");
		return speed -= 5;
	}
	
}
