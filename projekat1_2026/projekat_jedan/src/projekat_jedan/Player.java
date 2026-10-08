package projekat_jedan;

public class Player {

	    private String name;
	    private int x;
	    private int y;
	    private int width;
	    private int height;
	    private int health;

	    public Player(String name, int x, int y, int width, int height, int health) {
	        setName(name);
	        this.x = x;
	        this.y = y;
	        setWidth(width);
	        setHeight(height);
	        setHealth(health);
	    }

	    

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        if (name == null || name.trim().isEmpty()) {
	            System.out.println("ime ne smije biti prazno");
	            return;
	        }

	        name = name.trim().toLowerCase();

	        String[] rijeci = name.split(" ");
	        String novoIme = "";

	        for (int i = 0; i < rijeci.length; i++) {
	            String rijec = rijeci[i];

	            if (rijec.length() > 0) {
	                String prvoSlovo = rijec.substring(0, 1);
	                String ostatak = rijec.substring(1);

	                novoIme = novoIme + prvoSlovo.toUpperCase() + ostatak + " ";
	            }
	        }

	        this.name = novoIme.trim();
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
	            System.out.println("Sirina mora biti pozitivna!");
	            return;
	        }
	        this.width = width;
	    }

	    public int getHeight() {
	        return height;
	    }

	    public void setHeight(int height) {
	        if (height <= 0) {
	            System.out.println("Visina mora biti pozitivna!");
	            return;
	        }
	        this.height = height;
	    }

	    public int getHealth() {
	        return health;
	    }

	    public void setHealth(int health) {
	        if (health < 0 || health > 100) {
	            System.out.println("health mora biti izmedju 0 i 100!");
	            return;
	        }
	        this.health = health;
	    }}

	   