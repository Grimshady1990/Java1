import java.util.ArrayList;

public class PiatAdvDroidLmnh{
    int batteryLife = 100;
    String name;
    ArrayList<String> todoList;

    public PiatAdvDroidLmnh(String droidName){
        name = droidName;
        todoList = new ArrayList<>();
    }
    public String toString(){
        return "Hello I am " + name + ", how can I help you today?";
    }

    public boolean taskEnergySml(){
        if (batteryLife < 10){
            System.out.println(name + " does not have enough battery power to perform task.");
            return false;
        }        else{
            batteryLife -= 10;
            return true;
        }

    }
    public boolean taskEnergyMed(){
        if (batteryLife < 20){
            System.out.println(name + " does not have enough battery power to perform task.");
            return false;
        }
        else {
            batteryLife -= 20;
            return true;
        }
    }
    public boolean taskEnergyLrg(){
        if (batteryLife < 30){
            System.out.println(name + " does not have enough battery power to perform task.");
            return false;
        }
        else{
            batteryLife -= 30;
            return true;
        }
    }
    public void performTask(String task){
        if (!taskEnergyMed()){
            return;
        }
        else{
            System.out.println("Task Confirmed! " + name + " will now perform task: " + task);
            System.out.println(task + " Complete! this task used 20% battery power. " + name + " now has " + batteryLife + "% battery life remaining");
        }
    }
    public void energyTransfer(PiatAdvDroidLmnh otherDroid, int energyAmount){
        int freeSpace = 100 - otherDroid.batteryLife;
        if (this.batteryLife < energyAmount){
            System.out.println("Transfer Failed! " + this.name + " does not have enough battery power to make the transfer. Maximum that can be transfered is " + this.batteryLife + "%.");
        } 
        else if (freeSpace < energyAmount) {
            System.out.println("Transfer Failed! " + otherDroid.name + " does not have enough free battery space. The maximum that can be transfered is " + freeSpace + "%.");
        }
        else{
            this.batteryLife -= energyAmount;
            otherDroid.batteryLife += energyAmount;
            System.out.println("Transfer Successful! " + this.name + " has transfered " + energyAmount + "% battery power to " + otherDroid.name + "." + this.name + " now has " + this.batteryLife + ", and " + otherDroid.name + " has " + otherDroid.batteryLife + "% battery power");
        }
    }
    public void energyReport(){
        System.out.println("Energy Report: " + name + " has " + batteryLife + "% battery life remaining.");
    }
    public void randomInspire(int number){
        if (!taskEnergySml()){
            return;
        }
        else{
        switch (number){
            case 1:
                System.out.println("Dream big, start small, act now!");
                break;
            case 2:
                System.out.println("Success is a journey not a destination");
                break;
            case 3:
                System.out.println("Belive you can and your halfway there.");
                break;
            case 4:
                System.out.println("Turn setbacks into comebacks.");
                break;
            case 5:
                System.out.println("Your only limit is your mind");
                break;
            default:
                System.out.println("ERROR: Please choose a number between 1 -5");
        }
        System.out.println("This task used 10% battery power " + name + " now has " + batteryLife + "% battery life remaining.");
        }

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
                System.out.println("ERROR: Please use 'add', 'remove', or 'view.");
        }
    }
    public void addTask(String task){
        if (!taskEnergyLrg()){
            return;
        }
        else{
            todoList.add(task);
            System.out.println("task added to " + name + "'s todo list: " + task);
        }
        System.out.println("This task used 30% battery power. " + name + " now has " + batteryLife + "% battery power remaining.");
    }
    public void removeTask(String task){
        if (!taskEnergyLrg()){
            return;
        }
        else if (todoList.remove(task)){
            System.out.println("You have successfuly removed " + task + " from " + name + "'s todo list");
        }
        else {
            System.out.println("ERROR! Cannot find tge task you have specified?! Please use 'view' to view current list");
        }
        System.out.println("This task used 30% battery power. " + name + " now has " + batteryLife + "% battery life remaining");
    }
    public void viewTasks(){
        if (!taskEnergyLrg()){
            return;
        }
        else if (todoList.isEmpty()){
            System.out.println(name + "'s todo list is empty.");
        }
        else {
            System.out.println(name + "'s Todo List:");
            for (String task : todoList)  {
                System.out.println("- " + task);
            }
        }
        System.out.println("This task used 30% battery life. " + name + " now has " + batteryLife + "% remaining.");
    }
    public void add2nums(int a, int b){
        if (!taskEnergyMed()){
            return;
        }
        int result = a + b;
        System.out.println(a + " + " + b + " = " + result);
        System.out.println("This task used 20% battery life. " + name + " now has " + batteryLife + "% remaining.");
    }
    public void sub2nums(int a, int b){
        if (!taskEnergyMed()){
            return;
        }
        int result = a - b;
        System.out.println(a + " - " + b + " = " + result);
        System.out.println("This task used 20% battery life. " + name + " now has " + batteryLife + "% remaining.");

    }
    public void div2nums(int a, int b){
        if (!taskEnergyMed()){
            return;
        }
        int result = a / b;
        System.out.println(a + " ÷ " + b + " = " + result);
        System.out.println("This task used 20% battery life. " + name + " now has " + batteryLife + "% remaining.");

    }
    public void multi2nums(int a, int b){
        if (!taskEnergyMed()){
            return;
        }
        int result = a * b;
        System.out.println(a + " x " + b + " = " + result);
        System.out.println("This task used 20% battery life. " + name + " now has " + batteryLife + "% remaining.");

    }
    public void loanCalc(int loanLength, int loanAmount, int intrestRate, int downPayment){
        if (!taskEnergyLrg()){
            return;
        }
        else if (loanAmount <= 0 || intrestRate <= 0 || downPayment >= loanAmount){
            System.out.println("ERROR! Please enter a valid loan");
        }
        else{
            int amountRemaining = loanAmount - downPayment;
            int months = loanLength * 12;
            int monthlyBalance = amountRemaining / months;
            int intrest = (monthlyBalance * intrestRate) / 100;
            int monthlyTotal = monthlyBalance + intrest;
            System.out.println("Loan Successful! You will now be charged $" + monthlyTotal + " per month for the next " + months + "months");
        }
    }
    public static void main(String[] args){
    System.out.println("test init");
    PiatAdvDroidLmnh fred = new PiatAdvDroidLmnh("Fred");
    PiatAdvDroidLmnh john = new PiatAdvDroidLmnh("John");
    PiatAdvDroidLmnh charger1 = new PiatAdvDroidLmnh("Charger1");
    PiatAdvDroidLmnh charger2 = new PiatAdvDroidLmnh("Charger2");
    PiatAdvDroidLmnh charger3 = new PiatAdvDroidLmnh("Charger3");
    PiatAdvDroidLmnh charger4 = new PiatAdvDroidLmnh("Charger4");
    System.out.println(fred);
    System.out.println(john);
    fred.performTask("Cleaning");
    john.energyTransfer(fred, 120);
    john.energyTransfer(fred, 30);
    john.energyTransfer(fred, 20);
    john.energyReport();
    john.randomInspire(1);
    john.randomInspire(2);
    john.randomInspire(3);
    john.randomInspire(4);
    john.randomInspire(5);
    john.randomInspire(6);
    System.out.println(charger1);
    john.energyReport();
    charger1.energyTransfer(john, 80);
    john.todoList("add", "Go to the electrical store");
    john.todoList("add", "Buy some switches");
    john.todoList("view", "");
    System.out.println(charger2);
    charger2.energyTransfer(john, 90);
    john.todoList("remove", "Go to the electrical store");
    john.todoList("view", "");
    john.add2nums(12345,12345);
    john.sub2nums(12345,12345);
    john.add2nums(12345,12345);
    charger3.energyTransfer(john, 100);
    john.div2nums(12345,12345);
    john.multi2nums(12345,12345);
    john.loanCalc(5, 10000, 10, 2000);
    john.loanCalc(5, 10000, 0, 2000);
    charger4.energyTransfer(john, 100);
    john.loanCalc(5, 0, 10, 2000);
    john.loanCalc(5, 10000, 10, 20000);


    }

}
