package be.dpgmedia.butlr;

public class OrderLine {
    private final String name;
    private final Integer quantity;

    public OrderLine(String name, Integer quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "OrderLine{" +
                "name='" + name + '\'' +
                ", qty=" + quantity +
                '}';
    }
}
