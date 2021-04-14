public class ManagerApp {
    public static void main(String[] args) {
        var manager = new Manager();
        manager.name = "Hoja";
        manager.sayHello("Nasrudin");

        var vicePresident = new VicePresident();
        vicePresident.name = "Basa";
        vicePresident.sayHello("Asam");

    }
}
