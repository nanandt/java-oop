class Person {
    // field
    String name;
    String address;
    final String country = "Indonesia";

    /*
    Constructor akan dijlankan ketika object dibuat
     */
    // construct
//    Person(String paramName, String paramAddress){
//        name = paramName;
//        address = paramAddress;
//    }
//    variable shadowing
//    Person(String name, String address){
//        name = name;
//        address = address;
//    }

//    solusi variable shadowing
    Person(String name, String address){
        this.name = name;
        this.address = address;
    }

//    constructor overloading
    Person(String paramName){
     this(paramName,null); // memanggil constructor lain
    }
    // constructor overloading
    Person(){
        this(null); // memanggil constructor lain
    }

    void sayHello(String name) {
        System.out.println("Hello " + name + ", My Name Is " + this.name);
    }
}
