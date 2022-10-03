package be.dpgmedia.butlr;

import java.util.List;

public class PlaceOrderForm {
    private List<PlaceOrderFormItem> dishes;

    public List<PlaceOrderFormItem> getDishes() {
        return dishes;
    }

    public void setDishes(List<PlaceOrderFormItem> dishes) {
        this.dishes = dishes;
    }

    @Override
    public String toString() {
        return "PlaceOrderForm{" +
                "lines=" + dishes +
                '}';
    }
}
