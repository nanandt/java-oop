package progammer.amatir.application;

import progammer.amatir.data.Customer;
import progammer.amatir.data.Level;

public class EnumApp {
    public static void main(String[] args) {


        Customer customer = new Customer();
        customer.setName("Majid");
        customer.setLevel(Level.STANDART);

        System.out.println(customer.getName());
        System.out.println(customer.getLevel());
        System.out.println(customer.getLevel().getDescription());

        String levelName = Level.VIP.name();
        System.out.println(levelName);

        Level level = Level.valueOf("STANDART");
        System.out.println(level);

        System.out.println("PRINT LEVEL");
        Level[] levels = Level.values();
        for (var value:Level.values()){
            System.out.println(value);
        }
    }
}
