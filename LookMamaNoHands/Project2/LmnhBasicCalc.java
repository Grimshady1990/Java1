public class LmnhBasicCalc{
	public LmnhBasicCalc(){
	
	}
	public double add(double a, double b){
		double result = a + b;
		return result;	
	}
	public double sub(double a, double b){
		double result = a - b;
		return result;	
	}
	public double div(double a, double b){
		double result = a / b;
		return result;
	}
	public double multi(double a, double b){
		double result = a * b;
		return result;	
	}
	public double mod(double a, double b){
		double result = a % b;
		return result;
	}
	public static void main(String[] args){
		LmnhBasicCalc myCalc = new LmnhBasicCalc();
		System.out.println(myCalc.add(10, 10));
		System.out.println(myCalc.sub(10, 1));
		System.out.println(myCalc.div(100, 10));
		System.out.println(myCalc.multi(10, 10));
		System.out.println(myCalc.mod(100, 90));	
	}
}
