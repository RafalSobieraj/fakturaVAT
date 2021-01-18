package ProgramowanieObiektowe.fakturaVAT;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Faktura {

    public double setGrossPrice(Item item)
    {
        double grossPrice = (item.getItemCost() + item.getItemCost()*item.getTax())*item.getItemQuantity();
        return (double) Math.round(grossPrice * 100) / 100;
    }

    public int setFakturaNumber()
    {
        Random number = new Random();

        return number.nextInt(100000);
    }

    public String fakturaIssueDate()
    {
        SimpleDateFormat date = new SimpleDateFormat("MM-dd-yyyy");

        return date.format(new Date());
    }

    public String fakturaPaymentDate()
    {
        SimpleDateFormat date = new SimpleDateFormat("MM-dd-yyyy");

        return date.format(new Date());
    }

    public String fakturaSaleDate()
    {
        SimpleDateFormat date = new SimpleDateFormat("MM-dd-yyyy");

        return date.format(new Date());
    }

    public void generateFaktura(Seller seller, Customer customer, Item item)
    {
        System.out.println("Numer faktury: " + setFakturaNumber());
        System.out.println("Data sprzedaży: " + fakturaSaleDate());
        System.out.println("Data zakupu: " + fakturaPaymentDate());
        System.out.println("Data wystawienia faktury: " + fakturaIssueDate());
        System.out.println("Sprzedawca: " + seller.getSellerName());
        System.out.println("Adres: " + seller.getSellerAddress());
        System.out.println("Numer NIP " + seller.getSellerNIP());
        System.out.println("Numer konta bankowego: " + seller.getSellerBankNumber());
        System.out.println("Kupujący: " + customer.getCustomerName());
        System.out.println("Adres kupującego: " + customer.getCustomerAddress());
        System.out.println("Numer NIP " + customer.getCustomerNIP());
        System.out.println("Nazwa produktu: " + item.getItemName());
        System.out.println("Ilość: " + item.getItemQuantity());
        System.out.println("Cena netto: " + item.getItemCost());
        System.out.println("Podatek VAT: " + item.getTax());
        System.out.println("Cena brutto: " + setGrossPrice(item));
    }
}
