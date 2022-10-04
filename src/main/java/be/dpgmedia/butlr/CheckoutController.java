package be.dpgmedia.butlr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Controller
public class CheckoutController {
    private CheckoutService checkoutService;

    public CheckoutController(CheckoutService checkoutService) {
        this.checkoutService = checkoutService;
    }

    @GetMapping("/")
    public String getCheckoutPage(Model model) {
        Restaurant restaurant = new Restaurant();
        model.addAttribute("dishes", restaurant.getDishes());
        return "checkoutPage";
    }

    @PostMapping("/checkout/process")
    public String processCheckout(@ModelAttribute PlaceOrderForm form) {
        UUID orderId = UUID.randomUUID();
        List<OrderLine> orderLines = form.getDishes().stream()
                .map(dish -> new OrderLine(dish.getName(), dish.getQuantity()))
                .collect(Collectors.toList());
        checkoutService.placeOrder(orderId.toString(), orderLines);
        return "redirect:/checkout/" + orderId;
    }

    @GetMapping("/checkout/{orderId}")
    public String getOrder(@PathVariable String orderId, Model model) {
        FullOrder order = checkoutService.getOrder(orderId);

        model.addAttribute("dishes", order.getLines());
        model.addAttribute("totalPrice", order.getTotal());
        return "orderPage";
    }

}
