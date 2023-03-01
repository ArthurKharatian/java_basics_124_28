package itmo.java.basics.lesson2;

public class Car {

    private String brand;
    private String model;
    private Integer seatPlace;
    private Color color;
    private Long price;
    private Double engineCapacity;
    private Boolean isNew;

    public Car() {
    }

    public Car(String brand, String model, Color color, Boolean isNew) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.isNew = isNew;
    }

    public Car(String brand, String model, Integer seatPlace, Color color, Long price, Double engineCapacity, Boolean isNew) {
        this.brand = brand;
        this.model = model;
        this.seatPlace = seatPlace;
        this.color = color;
        this.price = price;
        this.engineCapacity = engineCapacity;
        this.isNew = isNew;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getSeatPlace() {
        return seatPlace;
    }

    public void setSeatPlace(Integer seatPlace) {
        this.seatPlace = seatPlace;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(Double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public Boolean getNew() {
        return isNew;
    }

    public void setNew(Boolean aNew) {
        isNew = aNew;
    }


    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", seatPlace=" + seatPlace +
                ", color=" + color +
                ", price=" + price +
                ", engineCapacity=" + engineCapacity +
                ", isNew=" + isNew +
                '}';
    }
}
