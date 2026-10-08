package projekat_jedan;

public class Enemy {

	    private String type;
	    private int x;
	    private int y;
	    private int width;
	    private int height;
	    private int damage;

	    public Enemy(String type, int x, int y, int width, int height, int damage) {
	        setType(type);
	        this.x = x;
	        this.y = y;
	        setWidth(width);
	        setHeight(height);
	        setDamage(damage);
	    }

	    public String getType() {
	        return type;
	    }

	    public void setType(String type) {
	        if (type == null || type.trim().isEmpty()) {
	           System.out.println("Tip ne smije biti prazan.");
	        }
	        this.type = type.trim();
	    }

	    public int getX() {
	        return x;
	    }

	    public void setX(int x) {
	        this.x = x;
	    }

	    public int getY() {
	        return y;
	    }

	    public void setY(int y) {
	        this.y = y;
	    }

	    public int getWidth() {
	        return width;
	    }

	    public void setWidth(int width) {
	        if (width <= 0) {
	            System.out.println("Sirina mora biti pozitivna.");
	        }
	        this.width = width;
	    }

	    public int getHeight() {
	        return height;
	    }

	    public void setHeight(int height) {
	        if (height <= 0) {
	            System.out.println("Visina mora biti pozitivna.");
	        }
	        this.height = height;
	    }

	    public int getDamage() {
	        return damage;
	    }

	    public void setDamage(int damage) {
	        if (damage < 0 || damage > 100) {
	            System.out.println("Damage mora biti od 0 do 100.");
	        }
	        this.damage = damage;
	    }
	}
	
	
	
	
	
	
	
