package be.dpgmedia.butlr;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class CheckoutServiceTest {
    @Test
    void name() {
        CheckoutService service = new CheckoutService();
        service.placeOrder("o1", List.of(new OrderLine("spaghetti", 1)));
        assertThat(service.getOrder("o1")).isEqualTo(new FullOrder(
                List.of(new FullOrderLine(1, "spaghetti", 18))
        ));
    }
}