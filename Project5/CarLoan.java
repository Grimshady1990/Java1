// Public Class
public class CarLoan{
// Public Method
// The first if statement tells the program to print a error message if the loanLength OR(||) intrestRate are below or equal to zero
	public void loanCheck(int loanLength, int carLoan, int intrestRate, int downPayment){
		if (loanLength <= 0 || intrestRate <= 0){
			System.out.println("Error! you must enter a valid car loan.");
		} //This else if statement prints a message offering full payment if downPayment is equal to or greater than the carLoan.
			else if (carLoan <= downPayment){
				System.out.println("Would you like to pay for the car in full?");
			}
		else {// if both the above conditions are not triggered then we passthrough this else statment which calculates the total monthly payments inccluding intrest.
		int remainingBalance = carLoan - downPayment;// The downPayment is removed from the balance
		int months = loanLength * 12; // by multiplying the years by 12 we can calculate the total amount of months 
		int monthlyBalance = remainingBalance / months; // with the total amount of months we can calculate the monthlyBalance by dividing it by months
		int intrest = (monthlyBalance * intrestRate) / 100; // Multiplying the MonthlyBalance by the intrestRate (%) and then divide by 100 gives us the total intrest for each month
		int monthlyPayments = monthlyBalance + intrest; // When we add the monthlyBalance to the intrest we get the final total for the monthly repayments. and we can continue with the print statement
		System.out.println("Your loan has been approved at $" + monthlyPayments + " per month for " + months + " months.");
		}
	}	


// Main Method
	public static void main(String[] args){
		System.out.println("init test");
		CarLoan loan1 = new CarLoan();
		CarLoan loan2 = new CarLoan();
		CarLoan loan3 = new CarLoan();
		loan1.loanCheck(0, 10000, 10, 1000);// the way we fill in the infomation is as follows loan1.loanCheck(loanLength, carLoan, intrestRate, downPayment);
		loan2.loanCheck(5, 10000, 10, 1000);
		loan3.loanCheck(5, 10000, 10, 10000);
	}
}
