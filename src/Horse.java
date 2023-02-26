import java.util.Arrays;

public class Horse extends Animal {
    private String color;

    public Horse(int weigt, int age, char gender, String name, String color) {
        super(weigt, age, gender, name);
        this.color = color;

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Horse{" +
                "color='" + color + '\'' +
                "} " + super.toString();
    }
}

