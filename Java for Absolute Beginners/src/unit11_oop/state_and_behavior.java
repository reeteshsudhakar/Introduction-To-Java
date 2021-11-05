package unit11_oop;

public class state_and_behavior {
    public static void main(String[] args) {
        Door dd = new Door();
        dd.name = "Driver";

        dd.open();
        dd.printStatus();

        Door pd = new Door();
        pd.name = "Passenger";
        pd.printStatus();
        pd.open();
        pd.printStatus();
        dd.closed();
        dd.printStatus();

    }
}