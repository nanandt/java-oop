package progammer.amatir.application;

import progammer.amatir.data.City;
import progammer.amatir.data.Location;

public class LocationApp {
    public static void main(String[] args) {
//        var location = new Location(); tidak bisa di instance
        var city = new City();
        city.name = "Bali";

        System.out.println(city.name);

    }
}
