package pattern.flyweight;

/**
 * ConcreteFlyweight
 * created on 22.11.2017
 *
 * @author Nikita Zabaykin vladlihovid@gmail.com
 * @version 1.0
 */
public class ConcreteFlyweight implements Flyweight {
    private int data;

    public ConcreteFlyweight(int data) {
        this.data = data;
    }

    public void operation() {
        System.out.println("Doing things" + data);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ConcreteFlyweight that = (ConcreteFlyweight) o;

        return data == that.data;
    }

    @Override
    public int hashCode() {
        return data;
    }
}
