package itmo.java.basics.lesson2;

public class CarService {

    public static Long totalPrice(Car car, Integer servicePrice) {
        Long carPrice = car.getPrice();
        if (servicePrice == null) {
            return carPrice;
        } else {
            return carPrice + servicePrice;
        }

    }

}
