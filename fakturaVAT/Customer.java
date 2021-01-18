package ProgramowanieObiektowe.fakturaVAT;

public class Customer {
    private String customerName;
    private String customerAddress;
    private int customerNIP;

    public Customer(String customerName, String customerAddress, int customerNIP)
    {
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.customerNIP = customerNIP;
    }

    public Customer() {

    }

    public String getCustomerName()
    {
        return customerName;
    }

    public void setCustomerName(String customerName)
    {
        this.customerName = customerName;
    }

    public String getCustomerAddress()
    {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress)
    {
        this.customerAddress = customerAddress;
    }

    public int getCustomerNIP()
    {
        return customerNIP;
    }

    public void setCustomerNIP(int customerNIP)
    {
        this.customerNIP = customerNIP;
    }
}

