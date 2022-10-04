package be.dpgmedia.butlr;

import java.util.Objects;

public class FullOrderLine {
    private final int qty;
    private final String name;
    private final int unitPrice;

    public Integer getQuantity() {
        return qty;
    }

    public String getName() {
        return name;
    }

    public int getTotalPrice() {
        return getUnitPrice() * getQuantity();
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public FullOrderLine(int qty, String name, int unitPrice) {
        this.qty = qty;
        this.name = name;
        this.unitPrice = unitPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FullOrderLine that = (FullOrderLine) o;

        if (qty != that.qty) return false;
        if (unitPrice != that.unitPrice) return false;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        int result = qty;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + unitPrice;
        return result;
    }
}
