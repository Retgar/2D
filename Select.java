package clicker;

import clicker.Enemy;

public class Select {

    private static boolean miss;

    public static void kick(Enemy yourHero, Enemy enemyHero) {

        if (miss == true) {
            System.out.println(enemyHero.getType().getName()+" промахнулся");
            miss = false;
        } else {
            enemyHero.removeHp(yourHero.getDamage());
            System.out.println(yourHero.getType().getName() + " наносит удар!: "
                    + "-" + yourHero.getDamage() + " "
                    + enemyHero.getType().getName() + "(" + enemyHero.getHp() + ").");
        }
    }

    public static void protection(Enemy enemyHero) {
        Intellect.setMiss(true);
        System.out.println("Уворот");

    }

    public static void heal(Enemy yourHero) {
        yourHero.healHp();
        System.out.println(yourHero.getType().getName() + " Подлечил себя! + 15hp" + yourHero.getHp());
    }

    public static void setMiss(boolean mis) {
        miss = mis;
    }

}
