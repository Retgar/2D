package clicker;

public class EnemyFactory {

    public static Enemy getEnemy(EnemyType type) {
        switch (type) {
            case WARRIOR:
                return new Enemy(150, 30, type);
            case MAGE:
                return new Enemy(75, 25, type);
            case ROGUE:
                return new Enemy(100, 15, type);
            case TREE:
                return new Enemy(0, 0, type);
            case HOUSE:
                return new Enemy(0, 0, type);
            default:
                return null;
        }
    }
}
