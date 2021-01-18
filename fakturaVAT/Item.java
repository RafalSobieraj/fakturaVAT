package ProgramowanieObiektowe.fakturaVAT;

public class Item{
        private String itemName;
        private int itemQuantity;
        double tax;
        private double itemCost;

    public Item(int itemQuantity, double itemCost, String itemName, double tax)
    {
        this.itemName = itemName;
        this.itemQuantity = itemQuantity;
        this.itemCost = itemCost;
        this.tax = tax;
    }

    public Item() {

    }

    public String getItemName()
    {
        return itemName;
    }

    public void setItemName(String itemName)
    {
        this.itemName = itemName;
    }

    public int getItemQuantity()
    {
        return itemQuantity;
    }

    public void setItemQuantity(int itemQuantity)
    {
        this.itemQuantity = itemQuantity;
    }

    public double getItemCost()
    {
        return itemCost;
    }

    public void setItemCost(double itemCost)
    {
        this.itemCost = itemCost;
    }

    public double getTax()
    {
        return tax;
    }

    public void setTax(double tax)
    {
        this.tax = tax;
    }
}
