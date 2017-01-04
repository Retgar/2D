package clicker;

public enum EnemyType {
    
    //herous___________________________
    WARRIOR("Warrior"),
    MAGE("Mage"),
    ROGUE("Rogue"),
    
    //objects___________________________
    HOUSE("house"),
    TREE("tree");
    
    private String name;

    EnemyType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
