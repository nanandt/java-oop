class Person {
    // field
    String name;
    String address;
    final String country = "Indonesia";

    /*
    Constructor akan dijlankan ketika object dibuat
     */
    // construct
    Person(String paramName, String paramAddress){
        name = paramName;
        address = paramAddress;
    }

    void sayHello(String paramName) {
        System.out.println("Hello " + paramName + ", My Name Is " + name);
    }
}
