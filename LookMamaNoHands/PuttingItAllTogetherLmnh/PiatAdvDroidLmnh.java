import java.util.ArrayList;

public class PiatAdvDroidLmnh{
    int batteryLife = 100;
    String name;
    ArrayList<String> todoList;
    public PiatAdvDroidLmnh(String droidName){
        name = droidName;
    }
    public String toString(){
        return "Hello I am " + name + " how can I help you today?";
    }
    public void energyReport(){
        System.out.println("Energy Report: " + name + " has " + batteryLife + "% battery life remaining");
    }
    public boolean taskEnergySml(){
        if (batteryLife < 10){
            System.out.println("System Failure! " + name + " has " + batteryLife + "% battery life remaining. The minimum to complete this task is 10%");
            return false;
       }
       else {
           batteryLife -= 10;
           return true;
       }
    }
    public boolean taskEnergyMed(){
        if (batteryLife < 20){
            System.out.println("System Failure! " + name + " has " + batteryLife + "% battery life remaining. The minimum to complete this task is 20%");
            return false;
        }
        else {
            batteryLife -= 20;
            return true;
        }
        }
    public boolean taskEnergyLrg(){
        if (batteryLife < 30){
            System.out.println("System Failure! " + name + " has " + batteryLife + "% battery life remaining. The minimum to complete this task is 30%");
            return false;
        }
        else {
            batteryLife -= 30;
            return true;
        }
    }
    public void performTask(String task){
        if (!taskEnergyMed()){
            return;
        }
        else {
            System.out.println("Task Confirmed: " + name + " will now perform the task: " + task);
            System.out.println(task + " Complete! " + name + " used 20% battery power, and now has " + batteryLife + "% battery life remaining.");
        }
    }
    public void energyTransfer(PiatAdvDroidLmnh otherPiatAdvDroidLmnh, int energyAmount){
        int freeSpace = 100 - otherPiatAdvDroidLmnh.batteryLife;
        if (freeSpace < energyAmount){
            System.out.println("Transfer Failed! " + otherPiatAdvDroidLmnh.name + " does not have enough free battery space. The maximum that can be transfered is " + freeSpace + "%.");
        }
        else if (batteryLife < energyAmount) {
            System.out.println("Transfer Failed! " + this.name + " does not have enough battery power. The maximum that can be sent is " + this.batteryLife + "%.");
        }
        else {
            this.batteryLife -= energyAmount;
            otherPiatAdvDroidLmnh.batteryLife += energyAmount;
            System.out.println("Transfer Successful! " + this.name + " has transfered " + energyAmount + "% battery power to " + otherPiatAdvDroidLmnh.name + ". " + this.name + " now has " + this.batteryLife + " and " + otherPiatAdvDroidLmnh.name + " now has " + otherPiatAdvDroidLmnh.batteryLife + "%.");
        }
    }
    public void loanCalc(int loanLength, int loanAmount, int intrestRate, int downPayment){
        if (!taskEnergyLrg()){
            return;
        }
        else if (loanAmount <= 0 || intrestRate <= 0){
            System.out.println("Loan Failed! Please enter a valid loan.");
        }
        else {
        int remainingBalance = loanAmount - downPayment;
        int months = loanLength * 12;
        int monthlyBalance = remainingBalance / months;
        int intrest = (monthlyBalance * intrestRate) / 100;
        int monthlyPayments = monthlyBalance + intrest;
        System.out.println("Loan Accepted! You will recieve your loan of $" + remainingBalance + " within 2-3 working days. You will be charged $" + monthlyPayments + " every 21nd of the month for the next " + months + " months.");
        System.out.println("Task Complete: " + name + " used 30% battery power and has " + batteryLife + "% remaining.");
        }
    }
    public void randomInspire(int number){
        if (!taskEnergyMed()){
            return;
        }
        else{
            switch(number){
                case 1:
                    System.out.println("Dream Big, Start Small, Act Now!");
                    break;
                case 2:
                    System.out.println("Success is a journey, not a destination.");
                    break;
                case 3:
                    System.out.println("Believe you can, and you're halfway there.");
                    break;
                case 4:
                    System.out.println("Turn setbacks into combacks.");
                    break;
                case 5:
                    System.out.println("Your only limit is your mind.");
                    break;
                default:
                    System.out.println("ERROR: Please choose a number between 1-5.");
            }
        System.out.println("Task Complete: " + name + " used 20% battery power and has " + batteryLife + "% remaining.");  
        }
    }

    public static void main(String[] args){
        System.out.println("init test");
        PiatAdvDroidLmnh bert = new PiatAdvDroidLmnh("Bert");
        PiatAdvDroidLmnh kurt = new PiatAdvDroidLmnh("Kurt");
        PiatAdvDroidLmnh charger1 = new PiatAdvDroidLmnh("Charger 1");
        PiatAdvDroidLmnh charger2 = new PiatAdvDroidLmnh("Charger 2");
        System.out.println(bert);
        bert.energyReport();
        bert.performTask("Cleaning");
        System.out.println(kurt);
        kurt.energyTransfer(bert, 30);
        kurt.energyTransfer(bert, 20);
        bert.performTask("Cleaning");
        bert.performTask("Cleaning");
        bert.performTask("Cleaning");
        bert.performTask("Cleaning");
        bert.performTask("Cleaning");
        bert.performTask("Cleaning");
        kurt.energyTransfer(bert, 100);
        System.out.println(charger1);
        charger1.energyTransfer(bert, 100);
        bert.loanCalc(5, 10000, 10, 2000);
        bert.loanCalc(5, 10000, 0, 2000);
        bert.loanCalc(5, 0, 10, 2000);
        charger2.energyTransfer(bert, 90);
        bert.randomInspire(5);
        bert.randomInspire(6);
    }
}
