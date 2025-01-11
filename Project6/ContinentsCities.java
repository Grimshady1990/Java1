public class CitiesAndContinents{
	public static void main(String[] args){
		int number = 5; // this number varible is how we will select which case to print
		String message = ""; // this empty string is the variable we will use to print each case
		switch (number){ // Declaring switch with the parameter "number"
			case 1:
				message = "London United Kingdom";
		      		break; // we use a break to stop the switch from continuing after it has been triggered
			case 2:
				message = "Douglas Isle of Man";
				break;
			case 3:
				message = "NYC USA"; // here you can see us using the message variable that will be filled with the case we choose
				break;
			case 4:
				message = "Tokyo Japan";
				break;
			case 5:
				message = "Bejing China";
				break;
			case 6:
				message = "Belfast Ireland";

			default: // default is the message that will be printed if we fail to trigger any of the cases
				message = "Error! Please select a number from 1-6.";


	}
		System.out.println(message); // printing the "message" variable means we will print the case that gets triggered.
	}


}
