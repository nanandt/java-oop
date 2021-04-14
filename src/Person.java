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

    // constructor overloading
    Person(String paramName){
     this(paramName,null); // memanggil constructor lain
    }
    // constructor overloading
    Person(){
        this(null); // memanggil constructor lain
    }

    void sayHello(String paramName) {
        System.out.println("Hello " + paramName + ", My Name Is " + name);
    }
}
