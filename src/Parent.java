class Parent {
    String name;

    void doIt() {
        System.out.println("Do It in Parent");
    }
}

class Child extends Parent {
    String name;

    void doIt() {
        System.out.println("Do It in Child");
        System.out.println("Parent name is " + super.name);
    }
}
