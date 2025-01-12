public class LmnhSwitch{
	public static void main(String[] args){
		int number = 4;
		String message = "";
		switch(number){
			case 1:
			message = "One More Time!";
			break;
			case 2:
			message = "It takes tooo babay!";
			break;
			case 3:
			message = "Three, is the magic number!";
			break;
			case 4:
			message = "I do it four yoou!";
			break;
			default:
			message = "Error! Please choose a number from 1-4";



		}
		System.out.println(message);
	}

}
