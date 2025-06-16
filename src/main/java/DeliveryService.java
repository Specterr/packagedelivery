import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class DeliveryService {

    private final Map<String, Delivery> deliveries = new HashMap<>();

    public Delivery createDelivery(String address, String cargo, double weight) {
        String trackId = UUID.randomUUID().toString();
        Delivery delivery = new Delivery(trackId, address, cargo,  weight);
        deliveries.put(trackId, delivery);
        return delivery;
    }

    public Delivery getDelivery(String trackId) {
        return deliveries.get(trackId);
    }

}