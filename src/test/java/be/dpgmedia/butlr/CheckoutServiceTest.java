package be.dpgmedia.butlr;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class CheckoutServiceTest {
    @Test
    void name() {
        CheckoutService service = new CheckoutService();
        service.placeOrder("o1", List.of(new OrderLine("spaghetti", 2)));

        FullOrder order = service.getOrder("o1");

        assertThat(order).isEqualTo(new FullOrder(
                List.of(new FullOrderLine(2, "spaghetti", 18))
        ));

        assertThat(order.getTotal()).isEqualTo(2 * 18);
    }
}