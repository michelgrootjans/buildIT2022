package be.dpgmedia.butlr;

import java.util.List;
import java.util.Objects;

public class FullOrder {
    private final List<FullOrderLine> lines;

    public FullOrder(List<FullOrderLine> lines) {
        this.lines = lines;
    }


    public List<FullOrderLine> getLines() {
        return lines;
    }

    public Integer getTotal() {
        int orderTotal = lines.stream()
                .mapToInt(line -> line.getTotalPrice())
                .sum();
        return orderTotal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FullOrder fullOrder = (FullOrder) o;

        return Objects.equals(lines, fullOrder.lines);
    }

    @Override
    public int hashCode() {
        return lines != null ? lines.hashCode() : 0;
    }
}
