package homework6;

import homework6.animals.Animal;
import homework6.animals.Cat;
import homework6.animals.Dog;

public class Main {

    public static void main(String[] args) {
        int catCount = 0;
        int dogCount = 0;

        Animal[] animals = {
                new Cat("Barsik", 200, 0),
                new Cat("Shustrik", 300, 0),
                new Dog("Sharik", 500, 10)
        };


        for (int i = 0; i < animals.length; i++) {
            animals[i].swim();
            animals[i].run();
            if(animals[i] instanceof Cat){
                catCount++;
            }
            if(animals[i] instanceof Dog){
                dogCount++;
            }
            System.out.println();
        }
        System.out.println( "Всего у вас животных: "+ animals.length + ". Из них кошек: " + catCount + ". Собак: " + dogCount +".");


    }
}
