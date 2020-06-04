package homework7;

public class Main {

    public static void main(String[] args) {

        Cat[] cats = {
                new Cat("Барсик", 60, 10, 15),
                new Cat("Тортик", 80, 15, 10),
                new Cat("Шустрик", 20, 4, 4)
        };

        Plate plate = new Plate(15);
        for (int i = 0; i <cats.length ; i++) {
            cats[i].eat(plate, cats[i].getName(), cats[i].getSatiety());
            plate.info();
        }
        plate.addFood(cats);
    }
}
