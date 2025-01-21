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
        return "Hello my name is " + name + " how can I help you today?";
    }
    public boolean taskEnergySml(){
        if (batteryLife < 10){
            System.out.println("POWER FAILURE! " + name + " does not have enough power to perform this task. The minimum requirement is 10%");
            return false;
        }
        else {
            batteryLife -= 10;
            return true;
        }
    }
    public boolean taskEnergyMed(){
        if (batteryLife < 20){
            System.out.println("POWER FAILURE! " + name + " does not have enough power to perform this task. The minimum requirement is 20%");
            return false;
        }
        else {
            batteryLife -= 20;
            return true;
        }
    }
    public boolean taskEnergyLrg(){
        if (batteryLife < 30){
            System.out.println("POWER FAILURE! " + name + " does not have enough power to perform this task. The minimum requirement is 30%");
            return false;
        }
        else {
            batteryLife -= 30;
            return true;
        }
    }
    public void todoList(String action, String task){
        switch(action.toLowerCase()){
            case "add":
                taskAdd(task);
                break;
            case "remove":
                taskRemove(task);
                break;
            case "view":
                taskView();
                break;
            default:
                System.out.println("INPUT FAILURE! Please use 'add', 'remove', or 'view'");

        }
    }
    public void taskAdd(String task){
        if (!taskEnergySml()){
            return;
        }
        else {
            todoList.add(task);
            System.out.println("\"" + task + "\" added to " + name + "'s todolist.");
            System.out.println("This task used 10% of " + name + "'s total battery capacity. " + name + " now has " + batteryLife + "% battery remaining");
        }
    }
    public void taskRemove(String task){
        if (!taskEnergySml()){
            return;
        }
        else if (todoList.remove(task)){
        System.out.println("\"" + task + "\" has been removed from " + name + "'s todo list.");
        }
        else{
            System.out.println("INPUT ERROR! Please check you have input the correct task. use 'view' to list all available tasks.");
            System.out.println("This task used 10% of " + name + "'s total battery capacity. " + name + " now has " + batteryLife + "% battery remaining");
        }
    }
    public void taskView(){
        if (todoList.isEmpty()){
            System.out.println(name + "'s todo list is empty. Please use 'add' to add a task");
        }
        else {
            System.out.println("*****" + name + "'s Todo List*****");
            for (String task : todoList){
                System.out.println("- " + task);
            }
        }
            
    }
    public void energyReport(){
        System.out.println("ENERGY REPORT: " + name + "'s battery is now at " + batteryLife + "%.");
    }
    public void randomInspire(int number){
        if (!taskEnergyMed()){
            return;
        }
        else{
            switch(number){
            case 1:
                System.out.println("Turn setbacks into combacks");
                break;
            case 2:
                System.out.println("Don't wait till tommorow, act now!");
                break;
            case 3:
                System.out.println("All great accomplishments started with the first step.");
                break;
           default:
                System.out.println("INPUT ERROR! Please choose a number between 1-3");
            }
        }
        System.out.println("This task used 20% battery power. " + name + "'s battery is now at " + batteryLife + "%.");
    }
    public void energyTransfer(PiatAdvDroidLmnh otherDroid, int energyAmount){
        int freeSpace = 100 - otherDroid.batteryLife;
        if (this.batteryLife < energyAmount){
            System.out.println("TRANSFER FAILURE! " + this.name + " does not have enough battery power to make the transfer. The maximum that can be transfered is " + batteryLife + "%.");
        }
        else if (freeSpace < energyAmount){
            System.out.println("TRANSFER FAILURE! " + otherDroid.name + " does not have enough free battery space to make the transfer. The maximum that can be sent is " + batteryLife + "%.");
        }
        else {
            this.batteryLife -= energyAmount;
            otherDroid.batteryLife += energyAmount;
            System.out.println("TRANSFER COMPLETE! " + this.name + " has successfully transfered " + energyAmount + "% to " + otherDroid.name + ".");
            System.out.println(this.name + " now has " + this.batteryLife + "% battery remaining and " + otherDroid.name + " has " + otherDroid.batteryLife + "% remaining.");
        }
    }
    public void loanCalc(int loanLength, int loanAmount, int intrestRate, int downPayment){
        if (!taskEnergySml()){
            return;
        }
        else if (loanAmount <= 0 || intrestRate <= 0 || downPayment >= loanAmount){
            System.out.println("INVALID LOAN! please enter a valid loan.");
        }
        else {
            int remainingBalance = loanAmount - downPayment;
            int months = loanLength * 12;
            int monthlyBalance = remainingBalance / months;
            int intrest = (monthlyBalance * intrestRate) / 100;
            int monthlyTotal = monthlyBalance + intrest;
            System.out.println("LOAN SUCCESSFUL! You will now be charged " + monthlyTotal + " per month for the next " + months + " months.");
            System.out.println("This task used 10% battery power. " + name + "'s battery is now at " + batteryLife + "%.");
        }
    }
    public void add2nums(int a, int b){
        if (!taskEnergyLrg()){
            return;
        }
        int result = a + b;
        System.out.println(a + " + " + b + " = " + result);
        System.out.println("This task used 30% battery power. " + name + "'s battery is now at " + batteryLife + "%.");
    }
    public void sub2nums(int a, int b){
        if (!taskEnergyMed()){
            return;
        }
        int result = a - b;
        System.out.println(a + " - " + b + " = " + result);
        System.out.println("This task used 20% battery power. " + name + "'s battery is now at " + batteryLife + "%.");
    }
    public void div2nums(double a, double b){
        if (!taskEnergySml()){
            return;
        }
        double result = a / b;
        System.out.println(a + " ÷ " + b + " = " + result);
        System.out.println("This task used 10% battery power. " + name + "'s battery is now at " + batteryLife + "%.");
        }
    public void multi2nums(int a, int b){
        if (!taskEnergySml()){
            return;
        }
        int result = a * b;
        System.out.println(a + " x " + b + " = " + result);
        System.out.println("This task used 10% battery power. " + name + "'s battery is now at " + batteryLife + "%.");
  
    }
    public void performTask(String task){
      if (!taskEnergySml()){
            return;
        }
      System.out.println("TASK CONFIRMED! " + name + " will now perform the task of: " + task);
      System.out.println("This task used 10% battery power. " + name + "'s battery is now at " + batteryLife + "%.");

    }
    public static void main(String[] args){
        PiatAdvDroidLmnh bert = new PiatAdvDroidLmnh("Bert");
        PiatAdvDroidLmnh charger1 = new PiatAdvDroidLmnh("Charger1");
        PiatAdvDroidLmnh charger2 = new PiatAdvDroidLmnh("Charger2");
        System.out.println(bert);
        bert.todoList("add", "Go to electronics store");
        bert.todoList("add", "Buy some processors");
        bert.todoList("add", "Go back home and charge battery");
        bert.todoList("remove", "dfjdkf");
        bert.todoList("remove", "Go to electronics store");
        bert.todoList("view", "");
        bert.todoList("remove", "Buy some processors");
        bert.todoList("remove", "Go back home and charge battery");
        bert.todoList("view", "");
        bert.energyReport();
        charger1.energyTransfer(bert, 110);
        charger1.energyTransfer(bert, 100);
        charger1.energyTransfer(bert, 70);
        bert.randomInspire(1);
        bert.randomInspire(2);
        bert.randomInspire(3);
        bert.randomInspire(4);
        bert.energyReport();
        charger2.energyTransfer(bert, 80);
        bert.loanCalc(5, 0, 10, 0);
        bert.loanCalc(5, 1000, 0, 500);
        bert.loanCalc(5, 1000, 10, 2000);
        bert.loanCalc(5, 1000, 10, 10);
        bert.energyReport();
        charger1.energyTransfer(bert, 30);
        bert.add2nums(50,159);
        bert.sub2nums(10000, 99);
        bert.div2nums(100, 3);
        bert.multi2nums(99, 99);
        bert.performTask("Cleaning");
    }
}
