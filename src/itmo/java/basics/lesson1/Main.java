package itmo.java.basics.lesson1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Первое занятие
 */
public class Main {

    public static void main(String[] args) throws IOException {

//        System.out.println("Hello world!");

        byte b = 100;
        short s = 123;
        int i = 500;
        long l = 5000000000L;
        float f = 12.3f;
        double d = 14.5;

        char c = 'c';
        boolean isTrue = true;

        byte r = (byte) (b + i);

//        System.out.println(r);

//        long sum = (b + i);


        double result = i * 1.0 / 3;
//        System.out.println(result);


        String str = "Java";


//        System.out.println(str);

        if (isTrue) {
            //logic
        }

        if (isTrue) {
            //logic
        } else {
            //logic
        }

        if (isTrue) {

        } else if (false) {

        } else if (false) {

        } else if (false) {

        } else if (false) {

        } else if (false) {

        } else {

        }

        int x = 10;
        int y = 20;


//        x == y; x != y; x > y; x < y; x >= y; x <= y; x % 2 == 0;

        if (x == y && x != 0) {

        }

        if (x == y || x != 0) {

        }

        int a = 3;

        String res = a == 2 ? "Yes" : a == 3 ? "Java" : "No";

//        System.out.println(res);

        Scanner scanner = new Scanner(System.in);
//        String line = scanner.nextLine();
//        System.out.println(line);
//
//        int num = scanner.nextInt();
//        System.out.println(num);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

//        String line = reader.readLine();
//        String line2 = reader.readLine();
//
//        System.out.println(line);
//
//        int someNum = Integer.parseInt(line2);
//        System.out.println(someNum);

//        someMethod();

        switcher(10);
    }

    public static void someMethod() {
        System.out.println("someMethod is working");
    }

    public static int getNumber() {
        return 1000;
    }

    public static void switcher(Integer number) {

        int x;

        switch (number) {
            case 10:
                x = 10;
                break;
            case 20:
                x = 20;
                break;
            case  50:
                x = 50;
                break;
            default:
                x = -1;
        }

        System.out.println(x);

    }

}
