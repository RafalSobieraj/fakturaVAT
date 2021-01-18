package ProgramowanieObiektowe.fakturaVAT;

public class Main {
    public static void main(String args[])
    {
        Customer customer = new Customer("Paweł", "Gdynia ul. Swiętojańska 11", 43256436);
        Seller seller = new Seller("Euro RTV AGD", "Gdańsk ul. Rodziewiczówny 67", 97864664, 351543197);
        Item item = new Item(2, 149.99,"Klawiatura", 0.23);

        Faktura faktura = new Faktura();

        faktura.generateFaktura(seller, customer, item);
    }
}
