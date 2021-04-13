
import java.util.Scanner;

public class HomeWorkApp4 {
    static final char def = '_';
    static final char X = 'X';
    static final char O = 'O';
    static final int size = 5;
    static char[][] field = new char[size][size];
    static int xU, yU;

    static void initGame() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                field[i][j] = def;
            }
        }
    }

    static void printField() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
    }

    static boolean isCellValid(int x, int y) {
        boolean isInF = x > 0 && x <= size && y > 0 && y <= size;
        return isInF && field[x - 1][y - 1] == def;
    }

    static void makeStep(int x, int y, char value) {
        field[x - 1][y - 1] = value;
    }

    static void moveAI() {
        int x, y;
        boolean flag = false;
        do {
            x = (int) (1 + Math.random() * 5);
            y = (int) (1 + Math.random() * 5);
        } while (!isCellValid(x, y));


        field[x - 1][y - 1] = O;
    }


    static boolean chekWin(char sym) {
        boolean vert = false, horiz = false, diag = false, diagP = false;
        int vertC = 0, horizC = 0, diagC = 0, diagPC = 0;
        for (int i = 0; i < size; i++) {
            vert = false;
            horiz = false;
            vertC = 0;
            horizC = 0;
            for (int j = 0; j < size; j++) {
                if (vertC == 4 || horizC == 4 || diagC == 4 || diagPC == 4) {
                    break;
                }
                if (field[i][j] == sym) {
                    horiz = true;
                    horizC++;
                }
                if (field[j][i] == sym) {
                    vert = true;
                    vertC++;
                }
                if (i == j) {
                    if (field[i][j] == sym) {
                        diag = true;
                        diagC++;
                    }
                }
                if (i == size - 1 - j) {
                    if (field[i][j] == sym) {
                        diagP = true;
                        diagPC++;
                    }
                }

                if (field[i][j] != sym) {
                    horiz = false;
                    horizC = 0;
                }
                if (field[j][i] != sym) {
                    vert = false;
                    vertC = 0;
                }
                if (i == j) {
                    if (field[i][j] != sym) {
                        diag = false;
                        diagC = 0;
                    }
                }
                if (i == size - 1 - j) {
                    if (field[i][j] != sym) {
                        diagP = false;
                        diagPC = 0;
                    }
                }

            }
            if ((vert && vertC == 4) || (horiz && horizC == 4) || (diag && diagC == 4) || (diagP && diagPC == 4)) {
                return true;
            }
        }
        return false;
    }


    static void startGame() {
        initGame();
        System.out.println("Вы в игре крестики и нолики.");
        System.out.println("Для победы необходимо собрать три крестика подряд.");
        System.out.println("Для того, чтобы сделать ход, введите\n2 целых числа от 1 до 5 - номер строки и номер " +
                "столбца...");
        printField();
        Scanner inS = new Scanner(System.in);
        int cnt = 0;
        while (true) {
            System.out.println("Делайте ваш ход:");
            String[] values = inS.nextLine().split(" ");
            if (values.length != 2) {
                System.out.println("Вы ввели некорректные данные.\nВведите ровно два числа от 1 до 5!");
                continue;
            }
            try {
                int x = Integer.parseInt(values[0]);
                int y = Integer.parseInt(values[1]);
                if (isCellValid(x, y)) {
                    makeStep(x, y, X);

                    cnt++;
                    if (cnt >= 7) {
                        if (chekWin(X)) {
                            System.out.println("Вы победили");
                            printField();
                            showEndGameDialog(inS);
                            break;
                        }
                    }
                    printField();
                    if (cnt == 25) {
                        System.out.println("Ничья");
                        printField();
                        showEndGameDialog(inS);
                        break;
                    }
                    System.out.println("Ход компьютера:");

                    moveAI();
                    cnt++;
                    if (cnt >= 8) {
                        if (chekWin(O)) {
                            System.out.println("Вы проиграли");
                            printField();
                            showEndGameDialog(inS);
                            break;
                        }
                    }
                    printField();
                } else {
                    System.out.println("Невозможно сделать такой ход! Введите другие значения");
                }
            } catch (NumberFormatException e) {
                System.out.println("Вы ввели некорректные данные.\nДанные должны быть числами от 1 до 5");
            }
        }
    }

    private static void showEndGameDialog(Scanner in) {
        System.out.println("1. Начать новую игру");
        System.out.println("Для выхода введите любую другую клавишу");

        System.out.println("Введите команду...");
        String command = in.next();
        if (command.equals("1")) {
            startGame();
            return;
        }
        System.out.println("Игра завершена!");

    }

    public static void main(String[] args) {
        startGame();
    }
}
/*
1. Полностью разобраться с кодом, попробовать переписать с нуля, стараясь не подглядывать в методичку.
2. Переделать проверку победы, чтобы она не была реализована просто набором условий, например, с использованием циклов.
3. * Попробовать переписать логику проверки победы, чтобы она работала для поля 5х5 и количества фишек 4. Очень желательно не делать это просто набором условий для каждой из возможных ситуаций;
4. *** Доработать искусственный интеллект, чтобы он мог блокировать ходы игрока.
 */