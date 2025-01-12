public class Droid{
	int batteryLife = 100;
	String name;

	public Droid(String droidName){
		name = droidName;
	}
	public String toString(){
		return "Hello I am " + name + "! How can I help you today?";
	} 
	public void taskEnergy(){
		batteryLife = batteryLife -= 10;
	}	
	public void performTask(String task){
		System.out.println("Objective confirmed! " + name + " will now start " + task + ".");
		taskEnergy();
		System.out.println(task + " complete! " + name + " no has " + batteryLife + "% battery life remaining.");
	}
	public void energyReport(){
		System.out.println("Energy Report: " + name + " has " + batteryLife + "% battery remaining.");
	}
	public void energyTransfer(Droid otherDroid, int energyAmount){
		int batteryLeft = 100 % otherDroid.batteryLife;
		if (this.batteryLife < energyAmount){
			System.out.println("Transfer Failed! " + this.name + " does not have enough energy to make the transfer. Maxiumum transfer is " +  this.batteryLife + "%.");
		}
		else if (batteryLeft < energyAmount){
			System.out.println("Transfer failed! " + otherDroid.name + " has to much energy. The maximum that can be transfered is " + batteryLeft + "%.");
		}
		else {
			this.batteryLife -= energyAmount;
			otherDroid.batteryLife += energyAmount;
			System.out.println("Transfer successful! " + this.name + " has transfered " + energyAmount + "% battery power to " + otherDroid.name + ".");
			System.out.println(this.name + " now has " + this.batteryLife + "% battery remaining, and " + otherDroid.name + " has " + otherDroid.batteryLife + "% battery remaining.");
		}
	}
	public static void main(String[] args){
		Droid vex = new Droid("Vex");
		Droid marv = new Droid("Marv");
		System.out.println(vex);
		vex.performTask("Cleaning");
		vex.performTask("Singing");
		vex.performTask("Dancing");
		vex.energyReport();
		System.out.println(marv);
		marv.energyTransfer(vex, 40);
		marv.energyTransfer(vex, 120);
		marv.energyTransfer(vex, 30);
	}
}
