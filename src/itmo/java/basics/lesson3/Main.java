package itmo.java.basics.lesson3;


public class Main {

    public static void main(String[] args) {
//        System.out.println(STATIC_CONSTANT);


//      StaticExample example = null;
//      example.printNonStaticVar();
//
//
//        Integer number = null;
//
//        int result = number.parseInt("1234");
//        System.out.println(result);

//        Singleton singleton = Singleton.getInstance();

        Sun sun = Sun.getSun();
        sun.setColor("White");
        sun.setSize(123);


        Sun sun2 = Sun.getSun();
        sun2.setColor("Black");
        sun2.setSize(777);


        System.out.println(sun);
        System.out.println(sun2);

    }
}
