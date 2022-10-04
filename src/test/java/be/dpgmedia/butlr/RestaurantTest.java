package be.dpgmedia.butlr;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RestaurantTest {
    @Test
    void checkContentOfDishes(){
        Restaurant restaurant = new Restaurant();
        assertThat(restaurant.getDishes()).containsExactlyInAnyOrder("Spaghetti", "Sushi");
    }

}
