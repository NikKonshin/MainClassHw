package homework6.animals;

public class Animal {
    String name;
    int obstacleLength;
    int swimLength;

    public Animal(String name, int obstacleLength, int swimLength) {
        this.name = name;
        this.obstacleLength = obstacleLength;
        this.swimLength = swimLength;
    }

    public void run(){
        System.out.println(name + " Пробежал: " + obstacleLength + " м.");
    }
    public void swim(){
        System.out.println(name + " Проплыл: " + swimLength + " м.");
    }
}
