package be.dpgmedia.butlr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

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
        return "randomString";
    }

    @PostMapping("/checkout/process")
    public String processCheckout(@RequestParam List<String> dish, @RequestParam List<Integer> quantity) {
        System.out.println(dish);
        System.out.println(quantity);
        List<OrderLine> orderLines = new ArrayList<>();
        for (int i = 0; i < dish.size(); i++) {
            orderLines.add(new OrderLine(dish.get(i), quantity.get(i)));
        }
        UUID orderId = UUID.randomUUID();
        checkoutService.placeOrder(orderId.toString(), orderLines);
        return "redirect:/" + orderId;
    }

}
