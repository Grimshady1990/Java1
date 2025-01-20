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
    public static void main(String[] args){
    System.out.println("test init");
    PiatAdvDroidLmnh fred = new PiatAdvDroidLmnh("Fred");
    PiatAdvDroidLmnh john = new PiatAdvDroidLmnh("John");
    System.out.println(fred);
    System.out.println(john);
    fred.performTask("Cleaning");
    john.energyTransfer(fred, 120);
    john.energyTransfer(fred, 30);
    john.energyTransfer(fred, 20);
}

}
