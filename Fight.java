package clicker;

import clicker.Enemy;

public class Fight {

    private Enemy player;
    private Enemy intellectI;

    public void Fight() {

        /*
        System.out.println(
                "Вам стоит выбрать ваш класс:");
        System.out.println(
                "'1'- Выбрать класс 'war'");
        System.out.println(
                "'2'- Выбрать класс 'mag'");
        System.out.println(
                "'3'- Выбрать класс 'rog'");
       

        System.out.println(
                "Теперь вам стоит выбрать класс противника!");
        System.out.println(
                "'1'- Выбрать класс 'war'");
        System.out.println(
                "'2'- Выбрать класс 'mag'");
        System.out.println(
                "'3'- Выбрать класс 'rog'");

        
         */
        Enemy player = EnemyFactory.getEnemy(EnemyType.WARRIOR);
        Enemy intellectI = EnemyFactory.getEnemy(EnemyType.MAGE);

        while (true) {

            if (player.getHp() > 0) {
                if (intellectI.getHp() > 0) {

                    System.out.println("Выберите дейстиве!");
                    System.out.println("'1'- Ударить по голове противника вашей дубиной");
                    System.out.println("'2'- Попытаться увернуться от дубиный противника");
                    System.out.println("'3'- Наклееть никотиновый пластырь");

                    Consol.action(player, intellectI);
                    Intellect.intAction(intellectI, player);
                } else {
                    System.out.println("Битва закончена.Вы победили! Теперь у вас: " + Hero.getGold() + " монет");
                    int gold = Hero.getGold();
                    gold = gold + 3;
                    Hero.setGold(gold);
                    break;
                }
            } else {
                System.out.println("Битва закончена.Вы проиграли.");

                break;
            }

        }

    }

}
