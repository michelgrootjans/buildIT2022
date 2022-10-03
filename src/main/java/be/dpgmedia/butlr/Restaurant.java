package be.dpgmedia.butlr;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Restaurant {

    private List<String> dishes = List.of("Spaghetti", "Pizza", "Sushi");

    public Collection<String> getDishes() {
        return dishes;
    }
}
