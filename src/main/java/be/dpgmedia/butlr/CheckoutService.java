package be.dpgmedia.butlr;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Component
public class CheckoutService {
    Map<String, List<OrderLine>> inMemoryCache = new HashMap<>();

    public void placeOrder(String orderId, List<OrderLine> orderLines) {
        inMemoryCache.put(orderId, orderLines);
    }

    public FullOrder getOrder(String orderId) {
        List<OrderLine> orderLines = inMemoryCache.get(orderId);
        List<FullOrderLine> fullOrderLines = orderLines.stream()
                .map(ol -> new FullOrderLine(ol.getQuantity(), ol.getName(), 18))
                .collect(Collectors.toList());
        return new FullOrder(fullOrderLines);
    }
}
