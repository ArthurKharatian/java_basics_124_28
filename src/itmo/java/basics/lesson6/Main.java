package itmo.java.basics.lesson6;

public class Main {

    public static void main(String[] args) {

//        Car car = new Car();
//
//        Field[] declaredFields = car.getClass().getDeclaredFields();
//
//        for (Field field : declaredFields) {
//            System.out.println(field);
//        }

//        Object object = new Object();

        Parent parent = new Parent();
        Parent child = new Child();
        Parent anotherChild = new AnotherChild();

//        parent.print();
//        child.print();
//        anotherChild.print();


//        Child someChild = new Parent();   <- создание невозможно!

//         ((Child)parent).print();  // исключение  ClassCastException

//        Child someChild = new Child();
////        ((Parent)someChild).print();
//
//        System.out.println(parent instanceof Child);


//        printInfo(parent);
//        printInfo(child);
//        printInfo(anotherChild);


//        Moveable scania = new Bus();
//        Moveable lada = new Car();
//
//        printInfo(scania);
//        printInfo(lada);


        Transport bus = new Bus(4000, 30, false);
        Transport plane = new Plane(14000, 300, true);

        printInfo(bus);
        printInfo(plane);


    }


    public static void printInfo(Parent parent) {
        parent.print();
    }

    public static void printInfo(Moveable moveable) {
        moveable.printTransportName();
    }


    public static void printInfo(Transport transport) {
        transport.printTransportName();
    }


}
