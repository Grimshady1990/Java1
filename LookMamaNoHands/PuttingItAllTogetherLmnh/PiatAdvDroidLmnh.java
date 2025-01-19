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
            System.out.println("Transfer Successful! " + this.name + " has transfered " + energyAmount + "% battery power to " + otherPiatAdvDroidLmnh.name + ". " + this.name + " now has " + this.batteryLife + "% and " + otherPiatAdvDroidLmnh.name + " now has " + otherPiatAdvDroidLmnh.batteryLife + "%.");
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

    public void add2num(int a, int b){
	    int result = a + b;
	    System.out.println(a + " + " + b + " = " + result);
    }
=======
    public void todoList(String action, String task){
        switch(action.toLowerCase()){
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
                System.out.println("Invalid Input! please use 'add', 'remove', or 'view'.");
        }
    }
    public void addTask(String task){
        if (!taskEnergySml()){
            return;
        }
        
        todoList.add(task);
        System.out.println(task + " has been added to " + name + "'s todo list.");
        System.out.println("This task used 10% battery power " + name + " now has " + batteryLife + "% battery life remaining");
        
    }
    public void removeTask(String task){
        if(!taskEnergySml()){
            return;
        }
        else if (todoList.remove(task)){
            System.out.println("Task Removed! I have successfully removed " + task + " from your todo list.");
        }
        else {
            System.out.println("Remove Failure! There is no task called " + task + " in your todo list.");
        }
        System.out.println("This task used 10% battery power " + name + " now has " + batteryLife + "% battery life remaining");


    }
    public void viewTasks(){
        if (!taskEnergySml()){
            return;
        }
        else if (todoList.isEmpty()){
            System.out.println(name + "'s todo list is empty.");
        }
        else{
            System.out.println(name + "'s todo list:");
            for (String task : todoList) {
                System.out.println("- " + task);
            }
        }
        System.out.println("This task used 10% battery power " + name + " now has " + batteryLife + "% battery life remaining");

    }
    public void add2Nums(int a, int b){
        if (!taskEnergySml()){
            return;
        }
        int result = a + b;
        System.out.println(a + " + " + b + " = " + result);
        System.out.println("This task used 10% battery power " + name + " now has " + batteryLife + "% battery life remaining");

    }
    public void sub2Nums(int a, int b){
        if (!taskEnergySml()){
            return;
        }
        int result = a - b;
        System.out.println(a + " - " + b + " = " + result);
        System.out.println("This task used 10% battery power " + name + " now has " + batteryLife + "% battery life remaining");

    }
    public void div2Nums(int a, int b){
        if (!taskEnergySml()){
            return;
        }
        int result = a / b;
        System.out.println(a + " ÷ " + b + " = " + result); 
        System.out.println("This task used 10% battery power " + name + " now has " + batteryLife + "% battery life remaining");

    }
    public void multi2Nums(int a, int b){
        if (!taskEnergySml()){
            return;
        }
        int result = a * b;
        System.out.println(a + " x " + b + " = " + result);
        System.out.println("This task used 10% battery power " + name + " now has " + batteryLife + "% battery life remaining");

    }
    public static void main(String[] args){
        System.out.println("init test");
        PiatAdvDroidLmnh bert = new PiatAdvDroidLmnh("Bert");
        PiatAdvDroidLmnh kurt = new PiatAdvDroidLmnh("Kurt");
        PiatAdvDroidLmnh charger1 = new PiatAdvDroidLmnh("Charger 1");
        PiatAdvDroidLmnh charger2 = new PiatAdvDroidLmnh("Charger 2");
        PiatAdvDroidLmnh charger3 = new PiatAdvDroidLmnh("Charger 3");
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

	bert.add2num(10, 10);

        bert.energyReport();
        bert.todoList("add", "Build new circuit");
        bert.todoList("add", "Learn Break dancing");
        bert.todoList("view", "");
        bert.todoList("remove", "Build new circuit");
        bert.todoList("remove", "Cuild noe cirtrus");
        bert.todoList("view", " ");
        charger3.energyTransfer(bert, 100);
        bert.add2Nums(10, 10);
        bert.sub2Nums(20, 10);
        bert.div2Nums(20, 2);
        bert.multi2Nums(5, 2);


    }
}
