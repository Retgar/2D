package clicker;

import clicker.Enemy;
import clicker.EnemyFactory;
import clicker.EnemyType;
import java.util.Scanner;

public class Consol {

    private static Enemy mage;
    private static Enemy warrior;
    private static Enemy rogue;
    private static Enemy yourHero;
    private static Enemy enemyHero;

    private static Scanner scanner = new Scanner(System.in);

    public static void action(Enemy yourHero, Enemy enemyHero) {
        int d;
        while (true) {

            d = scanner.nextInt();

            if (d == 1) {
                Select.kick(yourHero, enemyHero);
                System.out.println("Вы ударили " + enemyHero.getType().getName());
                break;

            } else if (d == 2) {

                Select.protection(yourHero);

                break;

            } else if (d == 3) {
                Select.heal(yourHero);
                System.out.println("Вы решили сегодня не курить! +15 к здоровью! ");
                break;

            } else {
                System.out.println("Введи число от 1 до 3");
            }
        }
    }

    public static Enemy setAttacker() {
        yourHero = warrior;
        /*    
        int i;
        enemyBuild();

        while (true) {

            i = scanner.nextInt();

            if (i == 1) {
                
                return yourHero;
            } else if (i == 2) {
                yourHero = mage;
                return yourHero;
            } else if (i == 3) {
                yourHero = rogue;
                return yourHero;
            } else {
                System.out.println("Введи число от 1 до 3");
            }
        }
         */

        return warrior;
    }

    public static Enemy setDeffer() {
        enemyHero = mage;
        /*    int j;
        enemyBuild();

        while (true) {

            j = scanner.nextInt();

            if (j == 1) {
                enemyHero = warrior;
                return enemyHero;
            } else if (j == 2) {
               
                return enemyHero;
            } else if (j == 3) {
                enemyHero = rogue;
                return enemyHero;
            } else {
                System.out.println("Введи число от 1 до 3");
            }
         }
         
         */

        return mage;
    }

    public static int setMove() {
        int move = scanner.nextInt();
        return move;
    }

    public static void enemyBuild() {
        mage = EnemyFactory.getEnemy(EnemyType.MAGE);
        warrior = EnemyFactory.getEnemy(EnemyType.WARRIOR);
        rogue = EnemyFactory.getEnemy(EnemyType.ROGUE);

    }
}
