package progammer.amatir.application;

import static progammer.amatir.data.Aplication.*;
//import progammer.amatir.data.Aplication;
//import progammer.amatir.data.Constant;
import static progammer.amatir.data.Constant.*;
import progammer.amatir.data.Country;
import progammer.amatir.util.MathUtil;

public class StaticApp {
    public static void main(String[] args) {
        System.out.println(APLICATION);
        System.out.println(VERSION);


        System.out.println(
                MathUtil.sum(1,2,3,4,5)
        );

        Country.city city = new Country.city();
        city.setName("Bandung");
        city.getName();

        System.out.println(PROCESSORS);
    }
}
