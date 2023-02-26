public class Animal {
    private int weigt;
    private int age;
    private char gender;
    private String name;

    public Animal(int weigt, int age, char gender, String name) {
        this.weigt = weigt;
        this.age = age;
        this.gender = gender;
        this.name = name;
    }

    public int getWeigt() {
        return weigt;
    }

    public void setWeigt(int weigt) {
        this.weigt = weigt;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "weigt=" + weigt +
                ", age=" + age +
                ", gender=" + gender +
                ", name='" + name + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }


    }

