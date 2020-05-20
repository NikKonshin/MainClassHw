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
        //   gameGuessNumber();

        // Задание 2.
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
        //String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        //25 слов 24
        String[] words = {"apple", "appre", "appl"};
        int randomWord = random.nextInt(2);
        String answer = words[randomWord];
        String userAnswer;
        System.out.println("Я загадал слово на английском, попробуйте его угадать:");
        userAnswer = sc.nextLine();
        userAnswer = userAnswer.toLowerCase();
        String str1 = userAnswer;
        String str2 = answer;
        if (userAnswer.equals(answer)) {
            System.out.println("Вы угадали");
        } else {
            printWord(userAnswer, answer);

        }


    }

    public static void printWord(String userAnswer, String answer) {
        char a;
        char b;
        char c;
        char d;
        char e;
        char f;
        char g;
        char h;
        for (int i = 0; i < answer.length(); i++) {

            if (userAnswer.charAt(0) != answer.charAt(0)) {
                System.out.println("Попробуйте снова");
            } else if (userAnswer.charAt(i) == answer.charAt(i)) {


                //  System.out.println(answer.charAt(i));
            } else if (answer.length() < userAnswer.length() || answer.length() > userAnswer.length()) {
                break;
            }

        }

    }
}
//String str = userAnswer.charAt(0);
         /*(int i = 0; i < 15; i++) {
            if(answer.charAt(0) != userAnswer.charAt(0)){
                System.out.println("Попробуйте снова");
            }else if (answer.charAt(i) == userAnswer.charAt(i)){
                //answer.charAt(0) = userAnswer.charAt(1);
            }

        }
        System.out.println(userAnswer.charAt(0) + userAnswer.charAt(1) + userAnswer.charAt(2) );
        userAnswer = sc.nextLine();
        //System.out.println(word);*/
//userAnswer.toLowerCase();

//String[15] word = new String[]{};





       /*do{


            if (userAnswer.equals(answer)){
                System.out.println("Отлично, вы угадали!");
            } else if(answer.charAt(0) == userAnswer.charAt(0)) {
                System.out.printf("%-15s", answer.charAt(0));
            } else if(answer.charAt(0) != userAnswer.charAt(0)){
                //System.out.println("Вы не угадали ни одной буквы");
         //  }

          //  System.out.println(answer.charAt(0));

        }while (!userAnswer.equals(answer));*/
        /*do{
            userAnswer = sc.toString();
            userAnswer.toLowerCase();
            if(userAnswer.equals(answer)){
                System.out.println("Отлично, вы угадали");
            }else {
            String str = new String(answer);


            }
        } while (!userAnswer.equals(answer));*/
