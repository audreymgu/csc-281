package GameLogic;
import java.util.Random;

public class DamageRoll extends BaseDamage {

	public DamageRoll() {
		Random flipper = new Random();
		boolean coinFlip = flipper.nextBoolean();
    	if (coinFlip) {
    		this.damage = damage * 2;
		}
	}
  
	public void use() {
		System.out.println("You dealt " + this.damage + " damage!");
		if (this.damage > 12.5) {
			System.out.println("Critical Hit!");
		}    
	}
}
