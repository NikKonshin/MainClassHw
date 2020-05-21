package java_3_hw3;

import java.util.Random;
import java.util.Scanner;

public class HomeWork3 {

    static Scanner sc;
    static Random random;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        random = new Random();

        // Задание 1.
          gameGuessNumber();

        // Задание 2. В данном задании если слово больше 5 возникает ошибка:

      //   Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 6
	//at java.lang.String.charAt(String.java:658)
	//at java_3_hw3.HomeWork3.gameGuessWord(HomeWork3.java:71)
	//at java_3_hw3.HomeWork3.main(HomeWork3.java:19)
       // К сожалению не понял почему

        gameGuessWord();
    }

    public static void gameGuessNumber() {
        int userAnswer;
        int numberRandom = random.nextInt(10);
        int j = 3;
        System.out.println("Угадайте число от 0 до 9. У вас: " + j + " попытки");
        for (int i = 2; i >= 0; i--) {
            j--;
            userAnswer = sc.nextInt();
            if (userAnswer > numberRandom && i != 0) {
                System.out.println("Вы ввели слишком большое число. Осалось попыток: " + j + ". Попробуйте ещё раз:");
            } else if (userAnswer < numberRandom && i != 0) {
                System.out.println("Вы ввели слишком маленькое число. Осалось попыток: " + j + ". Попробуйте ещё раз:");
            } else if (userAnswer == numberRandom) {
                System.out.println("Ура! Вы победили");
                restartGameGuessNumber();
            } else if (userAnswer != numberRandom && j == 0) {
                System.out.println("Попытки закончились.");
            }
        }
        restartGameGuessNumber();
    }

    public static void restartGameGuessNumber() {
        System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
        int userAnswer = sc.nextInt();
        if (userAnswer == 1) {
            gameGuessNumber();
        } else if (userAnswer == 0) {
            System.out.println("Очень жаль. Всего доброго");
        }

    }

    public static void gameGuessWord() {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        char[] arr = {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'};
        int randomWord = random.nextInt(words.length);
        String answer = words[randomWord];
        String userAnswer = "";
        System.out.println("Я загадал слово.");

        while (!answer.equals(userAnswer)) {
            System.out.println("Введите слово:");
            userAnswer = sc.nextLine();
            userAnswer = userAnswer.toLowerCase();

            for (int i = 0; i < userAnswer.length(); i++) {
                if (answer.charAt(i) == userAnswer.charAt(i)) {
                    arr[i] = userAnswer.charAt(i);
                }
            }

            for (int i = 0; i < arr.length; i++) {
                System.out.printf("%s", arr[i]);
            }
            System.out.println();
        }
        System.out.println("Вы угадали");
    }

}