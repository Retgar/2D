package clicker;

import clicker.Fight;
import clicker.EnemyMage;
import clicker.Wall;
import java.util.Random;
import java.util.Scanner;

public class Field {

    Fight fight = new Fight();
    Wall wall = new Wall();
    EnemyMage mage = new EnemyMage();
    Random r = new Random();

    private int pix = 1;
    private int[] hero = Hero.getLocation();
    private int heroX = hero[0];
    private int heroY = hero[1];
    private int[] enemyMage = new int[2];
    private int[] mageLoc = new int[2];
    private int[] wallLoc = new int[2];
    private int[] wally = new int[2];
    private int move;
    Scanner sc = new Scanner(System.in);

    public void field() {

        while (true) {

            mageLoc[0] = 5;
            mageLoc[1] = 4;
            wallLoc[0] = 7;
            wallLoc[1] = 2;

            wall.setLocation(wallLoc);
            mage.setLocation(mageLoc);
            int[][] field = new int[10][11];

            int herX = heroX;
            int herY = heroY;

            hero = getMove(move, heroX, heroY);
            heroX = hero[0];
            heroY = hero[1];

            enemyMage = mage.getLocation();
            int mageX = enemyMage[0];
            int mageY = enemyMage[1];

            wally = wall.getLocation();
            int wallX = wally[0];
            int wallY = wally[1];

            int m = 0;
            for (int x = 0; x != 10; x++) {
                for (int y = 0; y != 11; y++) {
                    pix = 1;
                    field[x][y] = pix;
                }
            }

            if (heroX == wallX) {
                if (heroY == wallY) {
                    heroX = herX;
                    heroY = herY;
                    wall.action();

                }
            }

            if (heroX == mageX) {
                if (heroY == mageY) {
                    heroX = herX;
                    heroY = herY;
                    fight.Fight();
                }
            }

            field[heroX][heroY] = 0;
            field[mageX][mageY] = 8;
            field[wallX][wallY] = 7;

            for (int i = 0; i < 2; i++) {
                System.out.println(" ");
            }

            for (int i = 0; i != 10; i++) {
                for (int j = 0; j != 11; j++) {
                    m++;
                    if (m == 11) {
                        System.out.println(" ");
                        m = 0;
                    } else {
                        System.out.print(field[i][j] + " ");
                    }
                }
            }

            move = sc.nextInt();
        }
    }

    public int[] getMove(int move, int x, int y) {
        //Метод изменяющий кардинаты обьекта в зависимости от принимаемого значения move.    

        int[] mass = new int[2];

        if (move == 8) {
            x--;

        } else if (move == 2) {
            x++;

        } else if (move == 4) {
            y--;

        } else if (move == 6) {
            y++;

        }
// Проверяем не выходит ли за пределы массива.
        if (y < 0) {
            y = 0;
        }

        if (y > 9) {
            y = 9;
        }

        if (x < 0) {
            x = 0;
        }

        if (x > 9) {
            x = 9;
        }

// Возвращаем изменённое значение карднат.        
        mass[0] = x;
        mass[1] = y;
        return mass;
    }

    public void filling() {

    }
}
