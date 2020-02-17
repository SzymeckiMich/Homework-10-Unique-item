import java.util.Objects;

public class Sword {
    private String name;
    private double damage;
    private boolean twoHanded;

    public Sword(String name, double damage, boolean twoHanded) {
        this.name = name;
        this.damage = damage;
        this.twoHanded = twoHanded;
    }

    public String getName() {
        return name;
    }

    public double getDamage() {
        return damage;
    }

    public boolean isTwoHanded() {
        return twoHanded;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Sword)) return false;
        Sword sword = (Sword) o;
        return Double.compare(sword.damage, damage) == 0 &&
                twoHanded == sword.twoHanded &&
                Objects.equals(name, sword.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getDamage(), isTwoHanded());
    }

    @Override
    public String toString() {
        return "Sword name: " +
                name +
                ", damage: " + damage +
                ", is two handed: " + twoHanded;
    }
}
