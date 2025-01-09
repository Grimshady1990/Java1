public class BasicCalc{
	public static void main(String[] args){
		BasicCalc myCalc = new BasicCalc();
		System.out.println(myCalc.add(34, 78));
		System.out.println(myCalc.sub(190, 180));
		System.out.println(myCalc.div(100, 10));
		System.out.println(myCalc.multi(10, 90));
		System.out.println(myCalc.modulo(100, 99));
	}
	public BasicCalc(){
		
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
	public double modulo(double a, double b){
		double result = a % b;
		return result;
	}	
}

