public class Droid {
    // Instance field
    int batteryLevel = 0;
    String name;

    // Constructor
    public Droid(String droidName){
        name = droidName;
    }

    //Method to drain battery level

    public void batteryAfterTask(){
        if (batteryLevel > 0) {
            System.out.println("Tasks are tiring - Energy depleted by 15 points");
            batteryLevel = batteryLevel - 10;
        } else {
            System.out.println("Cannot perform task - battery power too low");
        }
    }

    public void chargeDroid(){
        if (batteryLevel < 100) {
            System.out.println("You have set your droid to charge for a bit - charged by 10 points");
            batteryLevel = batteryLevel + 10;
        } else {
            System.out.println("Your battery is already fully charged");
        }
    }

    public void energyReport(){
        if (batteryLevel > 0 && batteryLevel < 100) {
            System.out.println("Your current energy level is:" + batteryLevel);
        } else if (batteryLevel <= 0 ){
            System.out.println("Battery too low, " + name + " has shut down");
        } else {
            System.out.println("Battery is at 100%");
        }
    }

    // Work in progress - i wanna be able to transfer specific amount of energy from 1 droid to the other
    public void transferEnergy(Droid a, Droid b){
        int c = a.batteryLevel;
        int d = b.batteryLevel;
        System.out.println("Initiating energy transfer between " + a + " and " + b);
        c -= 10;
        d += 10;
    }

    public void droidTask(String task){
        if (batteryLevel < 0 ) {
            System.out.println(name + " is currently performing the task: " + task);
        } else {
            System.out.println("Cannot perform task:" + task + " - battery power too low");
        }
    }

    public String toString() {
        return name;
    }


    public static void main(String[] args){
        Droid droid1 = new Droid("Brian");
        Droid droid2 = new Droid("Codey");

        System.out.println(droid1.name);
        System.out.println(droid2.name);

        droid1.transferEnergy(droid1,droid2);

        droid1.energyReport();
        droid2.energyReport();

        droid2.droidTask("Dancing");









    }
}
