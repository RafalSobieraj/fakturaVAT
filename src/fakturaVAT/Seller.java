package ProgramowanieObiektowe.fakturaVAT;

public class Seller {
    private String sellerName;
    private String sellerAddress;
    private int sellerNIP;
    private int sellerBankNumber;

    public Seller(String sellerName, String sellerAddress, int sellerNIP, int sellerBankNumber)
    {
        this.sellerName = sellerName;
        this.sellerAddress = sellerAddress;
        this.sellerNIP = sellerNIP;
        this.sellerBankNumber = sellerBankNumber;
    }

    public Seller() {

    }

    public String getSellerName()
    {
        return sellerName;
    }

    public void setSellerName(String sellerName)
    {
        this.sellerName = sellerName;
    }

    public String getSellerAddress()
    {
        return sellerAddress;
    }

    public void setSellerAddress(String sellerAddress)
    {
        this.sellerAddress = sellerAddress;
    }

    public int getSellerNIP()
    {
        return sellerNIP;
    }

    public void setSellerNIP(int sellerNIP)
    {
        this.sellerNIP = sellerNIP;
    }

    public int getSellerBankNumber()
    {
        return sellerBankNumber;
    }

    public void setSellerBankNumber(int sellerBankNumber)
    {
        this.sellerBankNumber = sellerBankNumber;
    }
}
