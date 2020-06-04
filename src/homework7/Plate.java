package homework7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void decreaseFood(int appetite, int getSatiety, String name) {
        int countSatiety=0;
        while (food > 0 && getSatiety > countSatiety) {
            food -= appetite;
            countSatiety += appetite;
        }
            System.out.println("Кот " + name + " наелся");

    }

    public void info() {
        System.out.println("Еды осталось в тарелке " + food);
        System.out.println();
    }
    public void addFood(Cat[] cats){
        int totalFood = 0;
        for (int i = 0; i <cats.length ; i++) {
            totalFood += cats[i].satiety;
        }
        food+=totalFood;
        System.out.println("Коты не останутся голодными, добавил еды " + totalFood+" хватит на всех!!!");
    }
}
