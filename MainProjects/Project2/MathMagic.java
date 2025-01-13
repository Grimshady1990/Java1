/*1. Create an int variable called myNumber.
    Set it equal to any integer other than 0.
 
  2. We will refer to myNumber as the original number from now on 
  - it might be helpful to document this.
    Write a comment in the program that documents this.

  3. Create an int variable called stepOne.
    Set it equal to the original number (myNumber) multiplied by itself.
    
  4. Create an int variable called stepTwo.
    Set it equal to the previous result (stepOne) plus the original number (myNumber).

  5. Create an int variable called stepThree.
    Set it equal to the previous result (stepTwo) divided by the original number.

  6. Create an int variable called stepFour. Set it equal to the previous result (stepThree) plus 17.

  7. Create an int variable called stepFive. Set it equal to the previous result (stepFour) minus the original number.

  8. Create an int variable called stepSix.
     Set it equal to the previous result (stepFive) divided by 6.

  9. Print out the value of the last step.
     Then, save and run your code!
     What number is printed to the console?

  10.  Now, go back to your code and change myNumber to any other integer. Run your program again.

Is the output the same?

It’s math magic! */

public class MathMagic{
	public static void main(String[] args){
		int myNumber = 102;
		int stepOne = myNumber * myNumber;
		int stepTwo = stepOne + myNumber;
		int stepThree = stepTwo / myNumber;
		int stepFour = stepThree + 17;
		int stepFive = stepFour - myNumber;
		System.out.println(stepFive);

		// Here we will achieve the same results using compound operators

		int magicNumber = 0;
		magicNumber += myNumber * myNumber;
		magicNumber += myNumber;
		magicNumber /= myNumber;
		magicNumber += 17;
		magicNumber -= myNumber;
		System.out.println(magicNumber);
		
}	
}
