package itmo.java.basics.lesson6;

public interface Moveable {

    public static final String BRAND = "BMW";

    public abstract void printTransportName();

    String transportName();

    default void someMethod() {
        System.out.println("someMethod");
    }

    public static void staticMethod() {
        System.out.println("staticMethod");
    }

}
