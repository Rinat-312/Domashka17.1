public class Main {
    public static void main(String[] args) {

        Cow cow1 = new Cow(125, 3, 'M', "Nuric");
        Cow cow2 = new Cow(120, 2, 'F', "Asan");
        Horse horse1 = new Horse(124, 5, 'M', "Nuna", "Black");
        Horse horse2 = new Horse(130, 6, 'F', "luna", "White");
        Sheep sheep1 = new Sheep(25, 4, 'M', "Usan");
        Sheep sheep2 = new Sheep(20, 3, 'M', "Nani");


        Cow[] cows = {cow1, cow2};
        Horse[] horses = {horse1, horse2};
        Sheep[] sheep = {sheep1, sheep2};

        Farm farm1 = new Farm("Nick", "Bishkek", cows, horses, sheep);
        Farm farm2 = new Farm("Nick", "Bishkek", cows, horses, sheep);



        for (Cow cowes : cows) {
            System.out.println(cowes);

        }
        for (Horse hors : horses) {
            System.out.println(hors);
        }
        for (Sheep speps : sheep) {
            System.out.println(speps);

            System.out.println(farm1);
            System.out.println(farm2);

        }
    }
}
