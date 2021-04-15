public class PolymorphismApp {
    public static void main(String[] args) {
        Employee employee = new Employee("Harun");
        employee.sayHello("Bagas");

        employee = new Manager("Nanang");
        employee.sayHello("Saud");

        employee = new VicePresident("Toprak");
        employee.sayHello("Nasgor");

        sayHello(new Employee("Jaka"));
        sayHello(new Manager("Tingkir"));
        sayHello(new VicePresident("Kentir"));
    }

    static void sayHello(Employee employee) {
        if (employee instanceof VicePresident) {
            VicePresident vicePresident = (VicePresident) employee;
            System.out.println("Hello VP " + vicePresident.name);
        } else if (employee instanceof Manager) {
            Manager manager = (Manager) employee;
            System.out.println("Hello Manager " + manager.name);
        } else {
            System.out.println("Hello " + employee.name);
        }
    }
}
