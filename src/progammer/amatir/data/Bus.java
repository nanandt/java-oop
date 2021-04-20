package progammer.amatir.data;

public class Bus implements Car {
    @Override
    public int getTire() {
        return 9;
    }

    @Override
    public String getBrand() {
        return "Handoyo";
    }

    @Override
    public void drive() {
        System.out.println("APAJA");
    }

    @Override
    public boolean isMaintenance() {
        return false;
    }



}
