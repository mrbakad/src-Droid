public class Droid{
    int batteryLevel;
    String name;
    public Droid(String droidName){
        name = droidName;
        batteryLevel = 100;
    }
    public static void main(String[]args){
        Droid Codey = new Droid("Codey");
        System.out.println(Codey);
        Codey.performTask("Dancing");
        Codey.secTask("Running");
        Droid Max = new Droid("Max");
        System.out.println(Max);
        Max.performTask("walking");

    }
    public String toString(){
        return "hello, i am droid: " + name;
    }
    public void performTask(String task){
        System.out.println(name + " is performing task: " + task);
        batteryLevel = batteryLevel - 10;
        System.out.println("batteryLevel: " + batteryLevel);
        if (batteryLevel > 20){
            System.out.println("Battery level is good");
        }
        else {
            System.out.println("low battery");}
    }
    public void secTask(String secondTask){
        System.out.println(name + "is performing another task: " + secondTask);
        batteryLevel = batteryLevel - 10;
        System.out.println("batteryLevel: " + batteryLevel);
        if (batteryLevel > 20){
            System.out.println("Battery level is good");
        }
        else {
            System.out.println("low battery");
        }
    }

}