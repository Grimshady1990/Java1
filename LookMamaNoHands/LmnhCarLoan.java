public class CarLoan{
	public void loanChecker(int loanLength, int loanAmount, int intrestRate, int downPayment){
		if (loanAmount <= 0 || intrestRate <= 0){
			System.out.println("Error please enter a valid loan.");
		}	
		else if (loanAmount <= downPayment){
			System.out.println("Your down payment is more than your loan request, would you like to pay for the car in full?");
		}
		else {
			int remainingBalance = loanAmount - downPayment;
			int months = loanLength * 12;
			int monthlyBalance = remainingBalance / months;
			int intrest = (monthlyBalance * intrestRate) / 100;
			int monthlyPayments = monthlyBalance + intrest;
			System.out.println("Your loan has been approved your monthly repayments will be $" + monthlyPayments + " Per month, over the course of " + months + " months.");
		}
	
	}
	public static void main(String[] args){
		CarLoan loan1 = new CarLoan();
		CarLoan loan2 = new CarLoan();
		CarLoan loan3 = new CarLoan();
		loan1.loanChecker(5, 10000, 10, 9000);
		loan2.loanChecker(2, 1000, 0, 190);
		loan3.loanChecker(2, 10000, 5, 20000);	
	}
}


