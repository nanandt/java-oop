public class PersonApp {
    public static void main(String[] args) {
        // object
        var person1 = new Person("Agil", "Sidapurna");
//        person1.name = "Bashri";
//        person1.address = "Brebes";
//        person1.country = "Argentina"; karena field country sudah final

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        person1.sayHello("Cahyono");

        Person person2 = new Person("Bayu");

        Person person3;
        person3 = new Person();
        person3.name = "Budi";
        person3.sayHello("Fahmi");
    }
}
