import java.util.Arrays;
import java.util.ArrayList;

public class PiatAdvDroid{
    int batteryLife = 100;
    String name;
    ArrayList<String> todoList;
// toString that prints a message when a new Droid is created    
    public String toString(){
        return "Hello I am " + name + "! How can I help you today?";
    }
// Constructor method to call new Droids and holds a string to call them by name
    public PiatAdvDroid(String droidName){
        name = droidName;
        todoList = new ArrayList<>();
    }
    // task energy that is taken from performing task.
    public boolean taskEnergySmall(){
        if (batteryLife < 10){
            System.out.println("Power Failure! " + name + " does not have enough power to perform task. Please charge battery minimum 10%.");
            return false;
            
    }   else{
        batteryLife -= 10;
        return true;
            }
    }
    public boolean taskEnergyMed(){
        if (batteryLife < 20){
            System.out.println("Power Failure! " + name + " does not have enough power to perform task. Please charge battery minimum 20%.");
            return false;
        } else{
        batteryLife -= 20;
        System.out.println("This task used 20% battery. " + name + "'s battery is now at " + batteryLife + "%.");
        return true;
        }
    }
    public boolean taskEnergyLrg(){
        if (batteryLife < 30){
            System.out.println("Power Failure! " + name + " does not have enough power to perform task. Please charge battery minimum 30%.");
            return false;
       } else{
        batteryLife -= 30;
                return true;
       }
    }
    
    
    // mehtod that allows us to preform a task taking a string as the task and calls taskEnergySmall
    public void performTask(String task){
        System.out.println("Objective Confirmed! " + name + " will now perform the task: " + task);
        if (!taskEnergyMed()){
            return;
        }
           }
// Method to Transfer energy from one droid to another
    public void energyTransfer(PiatAdvDroid otherDroid, int energyAmount){
        int batteryLeft = 100 - otherDroid.batteryLife;
            if (this.batteryLife < energyAmount){
                System.out.println("Transfer Failed! " + this.name + " does not have enough energy to make the transfer. The maximum that " + this.name + " can transfer is " + this.batteryLife + "%.");
            }
            else if(batteryLeft < energyAmount){
                System.out.println("Transfer Failed! " + otherDroid.name + " does not have enough battery space free. The maximum that can be transfered is " + batteryLeft + "%.");
            }
            else {
                this.batteryLife -= energyAmount;
                otherDroid.batteryLife += energyAmount;
                System.out.println("Transfer Successful! " + this.name + " has transfered " + energyAmount + "% energy to " + otherDroid.name + ". " + this.name + " now has " + this.batteryLife + "% battery, and " + otherDroid.name + " now has " + otherDroid.batteryLife + "% battery.");
            }
    }
// Method that preforms addition
    public void add(double a, double b){
        if (!taskEnergySmall()){
            return;
        }
        double result = a + b;
        System.out.println("Math problem complete! " + a + " plus " + b + " equals: " + result);
        System.out.println("This task used 10% battery. " + name + "'s battery is now at " + batteryLife + "%.");

    }
// Method that preforms subtraction
    public void sub(double a, double b){
        if (!taskEnergySmall()){
            return;
        }

        double result = a - b;
        System.out.println("Math problem complete! " + a + " subtracted by " + b + " equals: " + result);
        System.out.println("This task used 10% battery. " + name + "'s battery is now at " + batteryLife + "%.");

    }
    // Method that performs division.
    public void div(double a, double b){
        if (!taskEnergySmall()){
            return;
        }

        double result = a / b;
        System.out.println("Math problem complete! " + a + " divided by " + b + " equals: " + result);
        System.out.println("This task used 10% battery. " + name + "'s battery is now at " + batteryLife + "%.");

    }
    // Method that performs multipication
    public void multi(double a, double b){
        if (!taskEnergySmall()){
            return;
        }

        double result = a * b;
        System.out.println("Math problem complete! " + a + " multiplied by " + b + " equals: " + result);
        System.out.println("This task used 10% battery. " + name + "'s battery is now at " + batteryLife + "%.");

    }
    // Method that finds the remainder of two numbers
    public void mod(double a, double b){
        if (!taskEnergySmall()){
            return;
        }

        double result = a % b;
        System.out.println("Math problem complete! The remainder " + a + " and " + b + " is: " + result);
        System.out.println("This task used 10% battery. " + name + "'s battery is now at " + batteryLife + "%.");

    }
    // Switch that prints a inspirational quote when a number between 1 and 5 is selected
    public void randomInspire(int number){
        if (!taskEnergyLrg()){
            return;
        }
        switch(number){
            case 1:
            System.out.println("Dream big. Start small. Act now.");
            break;
        case 2:
            System.out.println("Success is a journey, not a destination.");
            break;
        case 3:
            System.out.println("Believe you can, and you're halfway there.");
            break;
        case 4:
            System.out.println("Turn setbacks into comebacks.");
            break;
        case 5:
            System.out.println("Your only limit is your mind.");
            break;
        default:
            System.out.println("Please choose a number between 1 and 5 :)");
            break;
        }
        System.out.println("This task used 30% battery. " + name + "'s battery is now at " + batteryLife + "%.");
    }
   // This Method calculates monthly loan repayments and allows down payments and intrest rates 
    public void loanCalc(int loanLength, int loanAmount, int intrestRate, int downPayment){
        if (!taskEnergyLrg()){
            return;
        }
        else if (loanAmount <= 0 || intrestRate <= 0){
            System.out.println("Please enter a valid loan!");
        }
        else{
            int remainingBalance = loanAmount - downPayment;
            int months = loanLength * 12;
            int monthlyBalance = remainingBalance / months;
            int intrest = (monthlyBalance * intrestRate) / 100;
            int monthlyPayments = monthlyBalance + intrest;
            System.out.println("Your loan has been successfully processed! You will now be charged $" + monthlyPayments + " per month over the next " + months + " months.");
        }
        System.out.println("This task used 30% battery. " + name + "'s battery is now at " + batteryLife + "%.");
    }
    public void todoList(String action, String task){
        switch (action.toLowerCase()){
            case "add":
                addTask(task);
                break;
            case "remove":
                removeTask(task);
                break;
            case "view":
                viewTasks();
                break;
            default:
                System.out.println("Invalid Action! Please use 'add', 'remove', or 'view'");
        }
    }
        // Method to add a task
    public void addTask(String task) {
        if (!taskEnergySmall()){
            return;
        }
        todoList.add(task);
        System.out.println("Task added to " + name + "'s list: " + task);
        System.out.println("This task used 10% battery. " + name + "'s battery is now at " + batteryLife + "%.");

    }

    // Method to remove a task
    public void removeTask(String task) {
        if (!taskEnergySmall()){
            return;
        }
        else if (todoList.remove(task)) {
            System.out.println("Task removed from " + name + "'s list: " + task);
            System.out.println("This task used 10% battery. " + name + "'s battery is now at " + batteryLife + "%.");

        } else {
            System.out.println("Task not found in " + name + "'s list: " + task);
        }
    }

    // Method to view tasks
    public void viewTasks() {
        if (!taskEnergySmall()){
            return;
        }
        else if (todoList.isEmpty()) {
            System.out.println(name + "'s to-do list is empty.");
        } else {
            System.out.println(name + "'s Tasks:");
            for (String task : todoList) {
                System.out.println("- " + task);
            }
            System.out.println("This task used 10% battery. " + name + "'s battery is now at " + batteryLife + "%.");

        }
    }
    public void energyReport(){
        System.out.println("Energy Report: " + name + " currently has " + batteryLife + "% battery remaining.");
    }

    // Main method that calls all other methods
    public static void main(String[] args){
        PiatAdvDroid neo = new PiatAdvDroid("Neo");
        PiatAdvDroid xeon = new PiatAdvDroid("Xeon");
        PiatAdvDroid charger1 = new PiatAdvDroid("Charger1");
        PiatAdvDroid charger2 = new PiatAdvDroid("Charger2");
        PiatAdvDroid charger3 = new PiatAdvDroid("Charger3");
        PiatAdvDroid charger4 = new PiatAdvDroid("Charger4");
        System.out.println(neo);
        neo.performTask("Cleaning");
        charger1.energyTransfer(neo, 30);
        charger1.energyTransfer(neo, 120);
        charger1.energyTransfer(neo, 20);
        neo.add(5, 5);
        neo.sub(20, 10);
        neo.div(100, 10);
        neo.multi(2, 5);
        neo.mod(100, 90);
        neo.randomInspire(1);
        charger1.energyTransfer(neo, 80);
        neo.randomInspire(2);
        neo.randomInspire(3);
        neo.randomInspire(4);
        charger2.energyTransfer(neo,90);
        neo.randomInspire(5);
        neo.randomInspire(6);
        neo.loanCalc(5, 10000, 10, 2000);
        charger3.energyTransfer(neo, 90);
        neo.todoList("add", "Go to the tech store");
        neo.todoList("add", "Wake up Xeon");
        neo.todoList("view", "");
        neo.todoList("remove", "Go to the tech store");
        neo.todoList("view", "");
        System.out.println(xeon);
        xeon.energyReport();
    }
}
