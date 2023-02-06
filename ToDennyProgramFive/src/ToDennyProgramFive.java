//Denny To
//CSCI 1301
//Program 5
//ToDennyProgramFive
public class ToDennyProgramFive {

	//using the ToDennyCar.java file
	
	public static void main(String[] args) {
		
		//creates new object using parameters
		ToDennyCar carDriving = new ToDennyCar(2019, "Tesla Model X");
		
		//for loop calls
		//accelerate method and
		//displays speed five times
		for(int i = 0; i < 5; ++i) {
			carDriving.accelerate();
			carDriving.getSpeed();
		}
		
		//for loop calls
		//brake method and
		//displays speed five times
		for(int i = 0; i < 5; ++i) {
			carDriving.brake();
			carDriving.getSpeed();
		}

	}
	
}
