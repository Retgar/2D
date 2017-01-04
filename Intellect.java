package clicker;

import clicker.Enemy;
import java.util.Random;

public class Intellect {

    private static Random r = new Random();
    private static boolean miss;

    public static void intAction(Enemy yourHero, Enemy enemyHero) {

        while (true) {
            int i = r.nextInt(2);

            if (i == 0) {
                if (miss == true) {
                    System.out.println("Герой промахнулся!");
                    miss = false;
                    break;
                } else {
                    enemyHero.removeHp(yourHero.getDamage());
                    System.out.println(yourHero.getType().getName() + " наносит удар!: "
                            + "-" + yourHero.getDamage() + " "
                            + enemyHero.getType().getName() + "(" + enemyHero.getHp() + ").");
                    break;
                }
            } else if (i == 1) {
                Select.setMiss(true);
                System.out.println("Пытаеться уклониться");
                break;
            } else if (i == 2) {
                Select.heal(yourHero);
                break;
            } else {
                System.out.println("ИИ решил что выбирать из трёх вариантов скучно и выбрал четвёртый");
                break;
            }
        }
    }

    public static void setMiss(boolean mis) {
        miss = mis;
    }

}
