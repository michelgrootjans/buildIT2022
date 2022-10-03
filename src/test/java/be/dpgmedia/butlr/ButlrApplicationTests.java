package be.dpgmedia.butlr;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class ButlrApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void checkContentOfDishes(){
        Restaurant restaurant = new Restaurant();
        assertThat(restaurant.getDishes()).containsExactlyInAnyOrder("Spaghetti", "Pizza", "Sushi");
//        assertTrue(restaurant.getDishes().contains("Spaghetti"));
//        assertTrue(restaurant.getDishes().contains("Pizza"));
//        assertTrue(restaurant.getDishes().contains("Sushi"));
//        assertTrue(restaurant.getDishes().size() == 3);
    }

    @Test
    void restaurantHasDishes(){
        Restaurant restaurant = new Restaurant();
        assertTrue(!restaurant.getDishes().isEmpty());
        System.out.println(restaurant.getDishes());
    }
}
