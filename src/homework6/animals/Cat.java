package homework6.animals;

public class Cat extends Animal {
    public Cat(String name, int obstacleLength, int swimLength) {
        super(name, obstacleLength, swimLength);
    }

    @Override
    public void run() {
        if (name == "Barsik" && obstacleLength <= 200 && obstacleLength >= 0) {
            System.out.println(name + " Пробежал: " + obstacleLength + " м.");
        } else if(name == "Barsik" && obstacleLength > 200 || obstacleLength < 0 ) {
            System.out.println(name + " не в силах пробежать " + obstacleLength + " м.");
        }
        else if (name == "Shustrik" && obstacleLength <= 300 && obstacleLength >= 0) {
            System.out.println(name + " Пробежал: " + obstacleLength + " м.");
        } else if(name == "Shustrik" && obstacleLength > 300 || obstacleLength < 0 ) {
            System.out.println(name + " не в силах пробежать " + obstacleLength + " м.");
        }

    }

    @Override
    public void swim() {
        System.out.println(name + " кот, предпочитает быть сухим.");
    }
}
