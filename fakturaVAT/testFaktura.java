package ProgramowanieObiektowe.fakturaVAT;

import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;

public class testFaktura {

    private final Faktura result = new Faktura();
    private final Customer info = new Customer();
    private final Seller seller = new Seller();
    private final Item item = new Item();

    @Test
    public void testItemName()
    {
        String input;
        item.setItemName("McDonalds");
        input = item.getItemName();
        assertEquals("McDonalds", input);
    }

    @Test
    public void testItemQuantity()
    {
        int input = 0;
        item.setItemQuantity(4);
        input = item.getItemQuantity();
        assertEquals(4, input);
    }

    @Test
    public void testItemCost()
    {
        double input = 0;
        item.setItemCost(149.99);
        input = item.getItemCost();
        assertEquals(149.99, input, 0.001);
    }

   @Test
    public void testTotalCost()
    {
        double input = 0;
        item.setItemCost(149.99);
        item.setItemQuantity(4);
        item.setTax(0.23);
        input = result.setGrossPrice(item);
        assertEquals(737.95, input, 0.001);
    }

    @Test
    public void testCustomerName()
    {
        String input;
        info.setCustomerName("Paweł");
        input = info.getCustomerName();
        assertEquals("Paweł", input);
    }

    @Test
    public void testCustomerAddress()
    {
        String input;
        info.setCustomerAddress("Grunwaldzka 11" +
                "81-000 Gdynia");
        input = info.getCustomerAddress();
        assertEquals("Grunwaldzka 11" +
                "81-000 Gdynia", input);
    }

    @Test
    public void testCustomerNIP()
    {
        int input = 0;
        info.setCustomerNIP(567-345-63-66);
        input = info.getCustomerNIP();
        assertEquals(567-345-63-66, input);
    }

    @Test
    public void testSellerBankNumber()
    {
        int input = 0;
        seller.setSellerBankNumber(351543191);
        input = seller.getSellerBankNumber();
        assertEquals(351543191, input);
    }
}
