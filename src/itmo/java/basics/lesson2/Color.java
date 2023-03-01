package itmo.java.basics.lesson2;

public enum Color {

    GREEN("зеленый"),
    BLUE("синий"),
    BLACK("черный"),
    WHITE(""),
    RED(""),
    YELLOW("");

    Color(String description) {
        this.description = description;
    }

    private final String description;

    public String getDescription() {
        return description;
    }
}
