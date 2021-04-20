package progammer.amatir.application;

public class EqualsApp {
    public static void main(String[] args) {
        String first = "Hasan";
        first = first + " " + "Cahyono";
        System.out.println(first);

        String second = "Hasan Cahyono";
        System.out.println(second);

        System.out.println(first == second); // false
        System.out.println(first.equals(second)); // true

        String third = "Hasan Cahyono";
        System.out.println(second == third);
        System.out.println(second.equals(third));
    }
}
