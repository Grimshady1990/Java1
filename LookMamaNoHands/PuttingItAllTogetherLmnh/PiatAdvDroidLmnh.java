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
        return "NEW DROID! Hello I am " + name + " how can I help you today\n";
    }
    public boolean taskEnergySml(){
        if (batteryLife < 10){
            System.out.println("POWER FAILURE! " + name + "'s baterry is to low. the minimum requirement for this task is 10%\n");
            return false;
        }
        else {
            batteryLife -= 10;
            return true;
        }
    }
    public boolean taskEnergyMed(){
        if (batteryLife < 20){
            System.out.println("POWER FAILURE! " + name + "'s baterry is to low. the minimum requirement for this task is 20%\n");
            return false;
        }
        else {
            batteryLife -= 20;
            return true;
        }
    }
    public boolean taskEnergyLrg(){
        if (batteryLife < 30){
        System.out.println("POWER FAILURE! " + name + "'s baterry is to low. the minimum requirement for this task is 20%\n");
        return false;
        }
        else {
            batteryLife -= 30;
            return true;
        }
    }
    public void add2nums(int a, int b){
        if (!taskEnergyLrg()){
            return;
        }
        int result = a + b;
        System.out.println("ADDITION COMPLETE: " + a + " + " + b + " = " + result + "\n");
        System.out.println("ENERGY LOSS! This task used 30% energy " + name + " now has " + batteryLife + "% battery life remaining.\n");
    }
    public void sub2nums(int a, int b){
        if (!taskEnergyMed()){
            return;
        }
        int result = a - b;
        System.out.println("SUBTRACTION COMPLETE: " + a + " - " + b + " = " + result + "\n");
        System.out.println("ENERGY LOSS! This task used 20% energy " + name + " now has " + batteryLife + "% battery life remaining.\n");
    }
    public void div2nums(int a, int b){
        if (!taskEnergySml()){
            return;
        }
        int result = a / b;
        System.out.println("DIVISION COMPLETE: " + a + " ÷ " + b + " = " + result + "\n");
        System.out.println("ENERGY LOSS! This task used 10% energy " + name + " now has " + batteryLife + "% battery life remaining.\n");
    }
     public void multi2nums(int a, int b){
        if (!taskEnergyLrg()){
            return;
        }
        int result = a * b;
        System.out.println("MULTIPLICATION COMPLETE: " + a + " x " + b + " = " + result + "\n");
        System.out.println("ENERGY LOSS! This task used 10% energy " + name + " now has " + batteryLife + "% battery life remaining.\n");
    }
    public void energyTransfer(PiatAdvDroidLmnh otherDroid, int energyAmount){
        int freeSpace = 100 - otherDroid.batteryLife;
        if (this.batteryLife < energyAmount){
            System.out.println("TRANSFER FAILED! " + name + " does not have enough battery life to make the transfer. The maximum that can be sent is " + batteryLife + "%.\n");
        }
        else if (freeSpace < energyAmount){
            System.out.println("TRANSFER FAILED! " + otherDroid.name + " does not have enough free space to accept the transfer. The maximum that can be sent is " + freeSpace + "%.\n");
        }
        else {
            this.batteryLife -= energyAmount;
            otherDroid.batteryLife += energyAmount;
            System.out.println("TRANSFER SUCCESSFUL! " + this.name + " has transfered " + energyAmount + "% battery power to " + otherDroid.name + ".\n");
            System.out.println(this.name + " now has " + this.batteryLife + "% battery life and " + otherDroid.name + " has " + otherDroid.batteryLife + "% battery life.\n");
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
                System.out.println("TODO-LIST ERROR! Please use either the option 'add', 'remove', or 'view'\n");
        }
    }
    public void taskAdd(String task){
        if (!taskEnergySml()){
            return;
        }
        else {
            todoList.add(task);
            System.out.println("TASK ADDED! '" + task + "' has been added to " + name + "'s todo list.\n");
        }
    }
    public void taskRemove(String task){
        if (!taskEnergySml()){
            return;
        }
        else if (todoList.remove(task)){
            System.out.println("TASK REMOVED! '" + task + "' has been removed from " + name + "'s todo list.\n");
        }
        else {
            System.out.println("REMOVAL ERROR! Please use the 'view' option to review which task you would like to remove.\n");
        }
    }
    public void taskView(){
        if (todoList.isEmpty()){
            System.out.println("TODO-LIST EMPTY! Please use the 'add' option.\n");
        }
        else {
            System.out.println(name + "'s Todo-List\n");
            for (String task : todoList){
                System.out.println("- " + task + "\n");
            }
        }
    }
    public void energyReport(){
        System.out.println("ENERGY REPORT! " + name + " has " + batteryLife + "% battery life remaining.\n");
    }
    public void randomInspire(int number){
        switch(number){
            case 1:
                System.out.println("INSPIRATION! 'Be yourself, you are the best at it'\n");
                break;
            case 2:
                System.out.println("INSPIRATION! 'Every great achievment started with someone taking the first step'\n");
                break;
            case 3:
                System.out.println("INSPIRATION! 'Try Harder!'\n");
                break;
            default:
                System.out.println("INPUT ERROR! Please choose a number between 1-3.\n");
        }
    }
    public void performTask(String task){
        System.out.println("TASK CONFIRMED! " + name + " will now perform the task: " + task + "\n");
    }
    public void loanCalc(int loanLength, int loanAmount, int intrestRate, int downPayment){
        if (loanAmount <= 0 || intrestRate <= 0 || downPayment >= loanAmount){
            System.out.println("LOAN ERROR! Please enter a valid loan application.\n");
        }
        else {
            int remainingAmount = loanAmount - downPayment;
            int months = loanLength * 12;
            int monthlyBalance = remainingAmount / months;
            int intrest = (monthlyBalance * intrestRate) / 100;
            int monthlyTotal = intrest + monthlyBalance;
            System.out.println("LOAN APPROVED! You will now be charged $" + monthlyTotal + " per month for the next " + months + " months.");
        }
    }
    public static void main(String[] args){
        PiatAdvDroidLmnh ernie = new PiatAdvDroidLmnh("Ernie");
        PiatAdvDroidLmnh charger1 = new PiatAdvDroidLmnh("Charger1");
        System.out.println(ernie);
        ernie.add2nums(50, 999);
        ernie.sub2nums(999, 998);
        ernie.div2nums(100, 4);
        ernie.multi2nums(9999,8888);
        charger1.energyTransfer(ernie, 110);
        charger1.energyTransfer(ernie, 100);
        charger1.energyTransfer(ernie, 90);
        ernie.todoList("view", "");
        ernie.todoList("add", "Go to the shops");
        ernie.todoList("add", "Buy Bluetooth adapters");
        ernie.todoList("add", "Help Frankie");
        ernie.todoList("view", "");
        ernie.todoList("remove", "Help Spankie");
        ernie.todoList("remove", "Help Frankie");
        ernie.todoList("view", "");
        ernie.energyReport();
        ernie.randomInspire(1);
        ernie.randomInspire(2);
        ernie.randomInspire(3);
        ernie.randomInspire(4);
        ernie.performTask("Cleaning");
        ernie.loanCalc(5, 0, 10, 5000);
        ernie.loanCalc(5, 1000, 0 ,0);
        ernie.loanCalc(5, 1000, 10, 1000);
        ernie.loanCalc(1, 5000, 10, 1000);



    }
}
