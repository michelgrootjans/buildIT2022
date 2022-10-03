package be.dpgmedia.butlr;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

//@SpringBootTest
class ButlrApplicationTests {

//    @Test
//    void contextLoads() {
//    }

    @Test
    void checkContentOfDishes(){
        Restaurant restaurant = new Restaurant();
        assertThat(restaurant.getDishes()).containsExactlyInAnyOrder("Spaghetti", "Sushi");
    }

}
