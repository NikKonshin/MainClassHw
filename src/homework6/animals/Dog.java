package homework6.animals;

public class Dog extends Animal{
    public Dog(String name, int obstacleLength, int swimLength) {
        super(name, obstacleLength, swimLength);
    }
    @Override
    public void run() {
        if (obstacleLength <= 500 && obstacleLength >= 0) {
            System.out.println(name + " Пробежал: " + obstacleLength + " м.");
        } else {
            System.out.println(name + " не в силах пробежать " + obstacleLength + " м.");
        }
    }

    @Override
    public void swim() {
        if (swimLength <= 10 && swimLength >= 0) {
            System.out.println(name + " Проплыл: " + swimLength + " м.");
        } else {
            System.out.println(name + " не в силах проплыть " + swimLength + " м.");
        }
    }
}
