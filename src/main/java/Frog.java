import java.util.Objects;

public class Frog {

    private String name;
    private String color;

    public Frog(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public Frog() {
        this.name = "default name";
        this.color = "default color";
    }

    public Frog sayName() {
        System.out.println("MY NAME IS" + name + "KVA");
        return this;
    }

    public Frog sayColor() {
        System.out.println("MY NAME IS" + name + "KVA");
        return this;
    }

    public Frog withColor(String color) {
        this.color = color;
        return this;
    }

    public Frog withName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Frog frog = (Frog) o;
        return Objects.equals(name, frog.name) &&
                Objects.equals(color, frog.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color);
    }

    @Override
    public String toString() {
        return "Frog{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
