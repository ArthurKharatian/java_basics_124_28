package itmo.java.basics.lesson2;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("BMW", "X3", Color.BLACK, true);

        car.setSeatPlace(5);
        car.setPrice(100000000L);
        car.setEngineCapacity(3.0);
//        System.out.println(car);


        String color = car.getColor().getDescription();
        System.out.println(color);


        Long totalPrice = CarService.totalPrice(car, 5000);

        System.out.println(totalPrice);

    }


    public String getInfo() {
        return "info";
    }

    public String getInfo(String info) {
        return info;
    }


    public String getInfo(Integer age) {
        return String.valueOf(age);
    }


    public Integer getInfo(Integer age, String some) {
        return 200;
    }

}
