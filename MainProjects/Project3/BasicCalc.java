// This program is a basic calculator made in Java for more information please refer to the README.md included in the Project3 folder

//Main class where the print statements are triggered 
public class BasicCalc{
	public static void main(String[] args){
		BasicCalc myCalc = new BasicCalc();
		System.out.println(myCalc.add(34, 78));
		System.out.println(myCalc.sub(190, 180));
		System.out.println(myCalc.div(100, 10));
		System.out.println(myCalc.multi(10, 90));
		System.out.println(myCalc.modulo(100, 99));
	}
// Empty constructor that we use to create our myCalc variable.
	public BasicCalc(){
		
	}
// Addition method. Usage: myCalc.add(34,78) 
	public double add(double a, double b){
		double result = a + b;
		return result;

}
// Subtraction method. Usage: myCalc.sub(190, 180)
	public double sub(double a, double b){
		double result = a - b;
		return result;
	}
// Division method. Usage: myCalc.div(100, 10)
	public double div(double a, double b){
		double result = a / b;
		return result;

	}
// Multiplication method. Usage myCalc.multi(10, 90)
	public double multi(double a, double b){
		double result = a * b;
		return result;
	}
// Modulo method. Usage myCalc.modulo(100, 99)
	public double modulo(double a, double b){
		double result = a % b;
		return result;
	}	
}

