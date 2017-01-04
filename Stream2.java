package clicker;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

class Stream2 implements Runnable {
    private static int enemyHp;
    private static int enemyDmg;
    private static String enemyName;
    static boolean res = false;
    static int time = 1;
                
            
    

    Stream2(int hp, int dmg, String name) {
        
        Stream2.enemyHp = hp;
        Stream2.enemyDmg = dmg;
        Stream2.enemyName = name;

    }

    @Override
    public void run() {
        int h1 = 1;
        System.out.print("Тестовый текст");
        while (true) {
            
                h1 = enemyHp;
                h1 = h1 - enemyDmg;
                enemyHp = h1;
                
                if (h1 <=0 ) {
                    System.out.println("Победил " + enemyName);
                    res = true;
                    break;
                    
                }
                
                System.out.println(enemyName + " наносит удар!: "
                        + "-" + enemyDmg
                        + enemyName + "(" + h1 + ").");
                
                
            try {
                TimeUnit.SECONDS.sleep(time);
            } catch (InterruptedException ex) {
                Logger.getLogger(Stream.class.getName()).log(Level.SEVERE, null, ex);
            }
           
            

        }
    }
    
    public boolean getRes (){
        return res = true;
    }
    
}
