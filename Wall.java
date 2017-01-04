package clicker;

public class Wall extends Object {

    public void action() {

        int gold = Hero.getGold();
        int res;
        System.out.println("купить ботл? Если да нажмите 1 если нет нажмите 0");

        while (true) {

            res = Consol.setMove();
            if (res == 1) {
                if (gold >= 5) {

                    Hero.setGold(gold - 5);
                    Hero.setItems(Hero.getItems() + 1);
                    System.out.println("Вы купили ботл! Всего штук: " + Hero.getItems());
                    break;
                } else {
                    System.out.println("накопи ещё денег");
                    break;

                }
            } else if (res == 0) {
                System.out.println("До скорой встречи");
                break;
            } else {
                System.out.println("введите число 1 либо 0");
            }
        }
    }
}
