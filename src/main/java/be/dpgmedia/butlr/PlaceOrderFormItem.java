package be.dpgmedia.butlr;

public class PlaceOrderFormItem {
    private String name;
    private Integer quantity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "PlaceOrderFormItem{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
