package projekat_jedan;

public class Game {
	

	public boolean checkCollision(Player p, Enemy e) {  //prekopirali kod od projekta 1
		return p.getX() < e.getX() + e.getWidth() &&
		  p.getX() + p.getWidth() > e.getX() &&
		  p.getY() < e.getY() + e.getHeight() &&
		  p.getY() + p.getHeight() > e.getY();
		}

		public void decreaseHealth(Player p, Enemy e) {
		int oldHP = p.getHealth();  //uzimamo trenutno zdravlje igraca
		int newHP = Math.max(0, oldHP - e.getDamage());  //novo zdravlje nakon sto je igrac pogodjen
		p.setHealth(newHP); //zbog max ne pada ispod 0
		eventLog.add("Player hit by " + e.getType() + " for " + e.getDamage() +
		" -> HP " + oldHP + " -> " + newHP);  //Type - daje tip koji ga neprijatelj napada
		}
	
	
	
	

}
