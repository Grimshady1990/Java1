// Public Class
public class CarLoan{
// Public Method
	public void loanCheck(int loanLength, int carLoan, int intrestRate, int downPayment){
		if (loanLength <= 0 || intrestRate <= 0){
			System.out.println("Error! you must enter a valid car loan.");
		}
			else if (carLoan <= downPayment){
				System.out.println("Would you like to pay for the car in full?");
			}
		else {
		int remainingBalance = carLoan - downPayment;
		int months = loanLength * 12;
		int monthlyBalance = remainingBalance / months;
		int intrest = (monthlyBalance * intrestRate) / 100;
		int monthlyPayments = monthlyBalance + intrest;
		System.out.println("Your loan has been approved at $" + monthlyPayments + " per month for " + months + "months");
		}
	}	


// Main Method
	public static void main(String[] args){
		System.out.println("init test");
		CarLoan loan1 = new CarLoan();
		CarLoan loan2 = new CarLoan();
		CarLoan loan3 = new CarLoan();
		loan1.loanCheck(0, 10000, 10, 1000);
		loan2.loanCheck(5, 10000, 10, 1000);
		loan3.loanCheck(5, 10000, 10, 10000);
	}
}
