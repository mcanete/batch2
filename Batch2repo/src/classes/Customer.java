package classes;

/**
 * Created by JPMPC-B211 on 11/10/2016.
 */
public class Customer extends Person {
    public String customeraddress;
    public int customerid, creditcardnumber;
    public int membershiplevel; //1 - VIP 2 = premium, 3 = special

    public int getCustomerid() {
        return customerid;
    }

    public void setCustomerid(int customerid) {
        this.customerid = customerid;
    }

    public int getCreditcardnumber() {
        return creditcardnumber;
    }

    public void setCreditcardnumber(int creditcardnumber) {
        this.creditcardnumber = creditcardnumber;
    }

    public int getMembershiplevel() {
        return membershiplevel;
    }

    public String getCustomeraddress() {
        return customeraddress;
    }

    public void setCustomeraddress(String customeraddress) {
        this.customeraddress = customeraddress;
    }

    public void setMembershiplevel(int membershiplevel) {
        this.membershiplevel = membershiplevel;

    }
}