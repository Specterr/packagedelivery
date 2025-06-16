import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DeliveryServiceTest {

    DeliveryService service = new DeliveryService();

    @Test
    void createDelivery() {
        Delivery delivery = service.createDelivery("Moscow, ul. Pushkina, d. Kolotushkina","Lego", 2.5);
        assertNotNull(delivery);
        assertNotNull(delivery.getTrackId());
    }

    @Test
    void deliveryRetrieve() {
        Delivery delivery = service.createDelivery("Moscow, ul. Pushkina, d. Kolotushkina","Lego", 2.5);
        Delivery retrieved = service.getDelivery(delivery.getTrackId());
        assertEquals("Moscow, ul. Pushkina, d. Kolotushkina", retrieved.getAddress());
        assertEquals("Lego", retrieved.getCargo());
        assertEquals(2.5, retrieved.getWeight());
    }
}