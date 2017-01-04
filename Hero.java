package clicker;

public class Hero {

    private static int[] location = {1, 1};
    private static int gold = 1;
    private static int items;

    public static void setLocation(int[] location) {
        Hero.location = location;
    }

    public static void setGold(int gold) {
        Hero.gold = gold;
    }

    public static int getGold() {
        return gold;
    }

    public static int[] getLocation() {
        return location;
    }

    public static void setItems(int item) {
        Hero.items = item;
    }

    public static int getItems() {
        return items;
    }

}
