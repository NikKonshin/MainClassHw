package homework4;

import java.util.Random;
import java.util.Scanner;

public class HomeWork4_XO {
    public static final int SIZE = 3;
    public static final int LENGTH_WIN_LINE = 3;
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static final char DOT_EMPTY = '.';

    static char map[][];

    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        initMap();
        printMap();

        while (true) {
            humanTurn();
            printMap();

            if (autoCheckWin(DOT_X)) {
                System.out.println("Ты победил!!!");
                break;
            }
            if (isFull()) {
                System.out.println("Ничья");
                break;
            }

            aiTurn();
            //riseOfTheMachines(); К сожалению ИИ мне не поддался((
            printMap();

            if (autoCheckWin(DOT_O)) {
                System.out.println("Тебя уделал компьютер");
                break;
            }
            if (isFull()) {
                System.out.println("Ничья");
                break;
            }

        }
    }

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }

        }

    }

    public static void printMap() {
        System.out.print("  ");
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + 1 + "  ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + "  ");
            }
            System.out.println();
        }


    }

    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты вашего хода X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(y, x));
        map[y][x] = DOT_X;
    }

    public static boolean isCellValid(int y, int x) {
        if (x < 0 || y < 0 || x >= SIZE || y >= SIZE) {
            return false;
        }
        return map[y][x] == DOT_EMPTY;
    }

    public static void aiTurn() {
        int x, y;
        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (!isCellValid(y, x));
        map[y][x] = DOT_O;
    }

    public static boolean isFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean checkWin(char c) {
        if (map[0][0] == c && map[0][1] == c && map[0][2] == c) {
            return true;
        }
        if (map[1][0] == c && map[1][1] == c && map[1][2] == c) {
            return true;
        }
        if (map[2][0] == c && map[2][1] == c && map[2][2] == c) {
            return true;
        }

        if (map[0][0] == c && map[1][0] == c && map[2][0] == c) {
            return true;
        }
        if (map[0][1] == c && map[1][1] == c && map[2][1] == c) {
            return true;
        }
        if (map[0][2] == c && map[1][2] == c && map[2][2] == c) {
            return true;
        }

        if (map[0][0] == c && map[1][1] == c && map[2][2] == c) {
            return true;
        }

        if (map[0][2] == c && map[1][1] == c && map[2][0] == c) {
            return true;
        }

        return false;
    }

    // Задание 2 и 3* Универсальный метод для определения победы. Количество символов подря для победы определяются переменными win и win2,
    // По умолчанию победа определяется количеством символов в строке или столбце массива, для того что бы метод подходил под задание 3*
    // достаточно вначеле программы значение SIZE поменять на 5 и в полях данного метода if (win == LENGTHWINLINE) и if (win2 == LENGTHWINLINE) LENGTHWINLINE заменить на 4;
    // но есть у этого метода нюанс, если указывать что  длина меполя больше чем длина победной линии то срабатывает и такой вариант XX.XX, тоже как победа не разобрался как исправить
    public static boolean autoCheckWin(char a) {
        int win;
        int g;
        int win2;
        int i;
        int j = 0;
        for (i = 0; i < SIZE; i++) {
            win = 0;
            g = SIZE;
            win2 = 0;
            for (j = 0; j < SIZE; j++) {
                g--;
                if (map[i][j] == a || map[j][i] == a || map[win][win] == a ) {
                    win++;
                    if (win == LENGTH_WIN_LINE) {
                        return true;
                    }
                }
                if (map[g][win] == a ) {
                    win2++;
                    if (win2 == LENGTH_WIN_LINE) {
                        return true;
                    }
                }
            }
        }
        return false;
    }


    public static void riseOfTheMachines() {
        int win;
        int g;
        int win2;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_X;
                if (autoCheckWin(DOT_X)){
                    map[i][j] = DOT_O;
                }
                }
            }
        }




}













