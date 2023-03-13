package itmo.java.basics.lesson7;

public class OuterClass {

    private int a;
    private int b;

    static String name = "Mike";

    void setParams(final int x, final int y){
        this.a = x;
        this.b = y;
    }


    class InnerClass {

        void sumAndPrint() {
            setParams(4, 6);
            System.out.println("sum = " + (a + b));
        }

    }

    public void innerMethod() {
        OuterClass.InnerClass innerClass = new OuterClass.InnerClass();
        innerClass.sumAndPrint();
    }


    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        outerClass.innerMethod();
    }

    static class NestedStaticClass {
        void methodNestedStaticClass() {
            System.out.println("Static nested method");
            System.out.println(name);
        }
    }


}
