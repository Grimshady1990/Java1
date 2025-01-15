import java.util.Arrays;
import java.util.ArrayList;

public class PiatAdvDroid{
    int batteryLife = 100;
    String name;
// toString that prints a message when a new Droid is created    
    public String toString(){
        return "Hello I am " + name + "! How can I help you today?\n";
    }
// Constructor method to call new Droids and holds a string to call them by name
    public PiatAdvDroid(String droidName){
        name = droidName;
    }
    // task energy that is taken from performing task.
    public void taskEnergySmall(){
        batteryLife -= 10;
    }
// mehtod that allows us to preform a task taking a string as the task and calls taskEnergySmall
    public void performTask(String task){
        System.out.println("Objective Confirmed! " + name + " will now perform the task: " + task);
        taskEnergySmall();
        System.out.println(task + " Complete! " + name + "'s battery is now at " + batteryLife + "%.");
    }
// Method to Transfer energy from one droid to another
    public void energyTransfer(PiatAdvDroid otherDroid, int energyAmount){
        int batteryLeft = 100 % otherDroid.batteryLife;
            if (this.batteryLife < energyAmount){
                System.out.println("Transfer Failed! " + this.name + " does not have enough energy to make the transfer. The maximum that can be transfered is " + this.batteryLife + "%.");
            }
            else if(batteryLeft < energyAmount){
                System.out.println("Transfer Failed! " + otherDroid.name + " does not have enough battery space free. the maximum that can be transfered is " + batteryLeft + "%."); 
            }
            else {
                this.batteryLife -= energyAmount;
                otherDroid.batteryLife += energyAmount;
                System.out.println("Transfer Successful! " + this.name + " has transfered " + energyAmount + "% energy to " + otherDroid.name + ". " + this.name + " now has " + this.batteryLife + "% battery, and " + otherDroid.name + " now has " + otherDroid.batteryLife + "% battery.");
            }
    }
// Method that preforms addition
    public void add(double a, double b){
        double result = a + b;
        System.out.println("Math problem complete! " + a + " plus " + b + " equals: " + result);
    }
// Method that preforms subtraction
    public void sub(double a, double b){
        double result = a - b;
        System.out.println("Math problem complete! " + a + " subtracted by " + b + " equals: " + result);
    }
    // Method that performs division.
    public void div(double a, double b){
        double result = a / b;
        System.out.println("Math problem complete! " + a + " divided by " + b + " equals: " + result);

    }
    // Method that performs multipication
    public void multi(double a, double b){
        double result = a * b;
        System.out.println("Math problem complete! " + a + " multiplied by " + b + " equals: " + result);
    }
    // Method that finds the remainder of two numbers
    public void mod(double a, double b){
        double result = a % b;
        System.out.println("Math problem complete! The remainder " + a + " and " + b + " is: " + result);
    }
    // Main method that calls all other methods
    public static void main(String[] args){
        System.out.println("init test");
        PiatAdvDroid neo = new PiatAdvDroid("Neo");
        PiatAdvDroid xeon = new PiatAdvDroid("Xeon");
        System.out.print(xeon);
        System.out.print(neo);
        neo.performTask("Cleaning");
        xeon.energyTransfer(neo, 30);
        xeon.energyTransfer(neo, 120);
        xeon.energyTransfer(neo, 10);
        neo.add(5, 5);
        neo.sub(20, 10);
        neo.div(100, 10);
        neo.multi(5, 2);
        neo.mod(100, 90);
    }
}
