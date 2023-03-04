package itmo.java.basics.lesson3;

public class StaticExample {

    public static final String STATIC_CONSTANT = "some constant";
    private String string;
    public static String staticString;
    private final String nonStaticString;
    protected String protectedString;
    Integer defaultInteger;

    static {

        System.out.println("=============");
        System.out.println("static block start");
        staticString = "staticString";
//        nonStaticString =     <- инициализация и применение невозможно!
        System.out.println(staticString);
        System.out.println("static block end");
        System.out.println("=============");
    }

    {
        System.out.println("=============");
        System.out.println("non-static block start");
        staticString = "123";
        nonStaticString = "nonStaticString";
        System.out.println(staticString);
        System.out.println("non-static block end");
        System.out.println("=============");
    }


    public static void main(String[] args) {
        StaticExample example = new StaticExample();
    }


    public static void printStaticVar() {
        StaticExample example = new StaticExample();
        example.printNonStaticVar();
    }

    public void printNonStaticVar() {
        System.out.println("123");
    }

    public static void printSomeStaticVar() {
        printStaticVar();
    }

    public String getName() {
        printNonStaticVar();
        return "name";
    }

    public static void methodWithFinalArgs(final int x, final int y) {
        int result = x + y;
        System.out.println(result);

        int xCopy = x;

//        x = result;    <- модификация невозможна!


    }

}
