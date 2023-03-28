import org.testng.annotations.Test;

public class TestDelivery {

    @Test
    public void testDelivery() {
        Delivery delivery = new Delivery(100, 30);
        System.out.println(delivery.getCost());
    }
}
