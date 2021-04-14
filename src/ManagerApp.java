public class ManagerApp {
    public static void main(String[] args) {
        var manager = new Manager("Rizky");
        manager.name = "Hoja";
        manager.sayHello("Nasrudin");

        var vicePresident = new VicePresident("Sueb");
        vicePresident.name = "Basa";
        vicePresident.sayHello("Asam");

    }
}
