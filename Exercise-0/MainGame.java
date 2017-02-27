import GameLogic.*;

public class MainGame {
	public static void main(String[] args) {
		BaseDamage base = new BaseDamage();
		System.out.println("The base damage value of your character is " + base.damage + " HP.");
    
		DamageRoll damageCheck = new DamageRoll();
		damageCheck.use();
	}
}