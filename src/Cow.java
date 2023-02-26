public class Cow extends Animal {

    @Override
    public String toString() {
        return "Cow{} " + super.toString();
    }

    public Cow(int weigt, int age, char gender, String name) {
        super(weigt, age, gender, name);

    }


}
