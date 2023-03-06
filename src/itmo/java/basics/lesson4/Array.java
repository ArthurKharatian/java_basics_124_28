package itmo.java.basics.lesson4;

import itmo.java.basics.lesson2.Car;
import itmo.java.basics.lesson2.Color;

import java.util.Arrays;

public class Array {

    public static void main(String[] args) {

        int[] ints = new int[10];

        ints[0] = 20;
        ints[1] = 230;
        ints[2] = 40;
        ints[3] = 550;
        ints[4] = 540;
        ints[5] = 232;


//        System.out.println(Arrays.toString(ints));

        String[] strings = new String[5];
//        System.out.println(Arrays.toString(strings));

        long[] longs = new long[]{122L, 321L, 333L};
        long[] longs2 = {123L, 321L, 333L};

        Car[] cars = new Car[3];

        cars[0] = new Car("Lada", "Largus", Color.WHITE, true);
        cars[1] = new Car("BMW", "X5", Color.BLACK, false);
        cars[2] = new Car("KIA", "Rio", Color.BLUE, true);

//        System.out.println(Arrays.toString(cars));


//        System.out.println(cars[0].getModel());

//        int x = 0;
//        x++;
//
//        x = x + 1;

//        for (int i = 0; i < longs.length; i++) {
//            if (longs[i] % 2 == 0) {
//                System.out.println(longs[i]);
//            }
//        }

//        for (Car car : cars) {
//            if (car.getColor() == Color.BLACK) {
//                continue;
//            }
//
//            System.out.println(car);
//
//        }

        int x = 0;

//        do {
//            //logic
//            System.out.println(x++);
//        } while (x != 10);


//        while (x != 5) {
//            //logic
//
//            System.out.println(x++);
//
//            if (x == 3) {
//                break;
//            }
//
//            if (x == 2) {
//                continue;
//            }
//
//            System.out.println("end of cycle");


//        }


//        varargMethod2(123, "Hello", "world", "!!!");

        System.out.println(Arrays.toString(ints));

        Arrays.sort(ints);

        System.out.println(Arrays.toString(ints));


        System.out.println(Arrays.binarySearch(ints, 40));
        System.out.println(Arrays.binarySearch(ints, 100));


    }


    public void someMethod(String[] arr) {
        System.out.println(Arrays.toString(arr));
    }


    public static void varargMethod(String... line) {
        System.out.println(Arrays.toString(line));
    }

    public static void varargMethod2(Integer integer, String... line) {
        System.out.println(Arrays.toString(line));
    }


}
