package java_3_hw3;

import java.util.Random;
import java.util.Scanner;

public class HomeWork3 {

    static Scanner sc;
    static Random random;

    public static void main(String[] args) {
        sc = new  Scanner(System.in);
        random = new Random();

        System.out.println("Угадайте число от 0 до 9");
        int userAnswer = sc.nextInt();
        int numberRandom = random.nextInt(10);
        if(userAnswer > numberRandom){
            System.out.println("Вы ввели слишком большое число");
        } else if(userAnswer < numberRandom){
            System.out.println("Вы ввели слишком маленькое число");
        } else if(userAnswer == numberRandom){
            System.out.println("Вы угадали!");
        }

    }

    public static void gameGuessNumber(String[] args) {

    }
}
