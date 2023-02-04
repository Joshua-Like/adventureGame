public class Player{

    private int health;
    private int speed;
    private Armor armor;
    private Weapon weapon;

    public Player() {
        
        this.health = 100;
        this.speed = 5;
        this.armor = new Armor("Birthday Suit", 0);
        this.weapon = new Weapon("Stick", 1);

    }

    public void setHealth(final int theHealth) {
        this.health = theHealth;

    }

    public void setSpeed(final int theSpeed) {
        this.speed = theSpeed;

    }

    public void setArmor(final Armor theArmor) {
        this.armor = theArmor;

    }

    public void setWeapon(final Weapon theWeapon) {
        this.weapon = theWeapon;

    }

    public int getHealth() {
        return this.health;
    }
    public int getSpeed() {
        return this.speed;
    }

    public Armor getArmor() {
        return this.armor;
    }

    public Weapon getWeapon() {
        return this.weapon;
    }
}