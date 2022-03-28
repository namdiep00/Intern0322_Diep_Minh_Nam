package models;

import java.util.Date;

public class Customer extends Person {
    private String typeCustomer;

    public Customer(int id, String name, Date birthDay, String sex, String identityCardNumber, String phoneNumber, String email, String address, String typeCustomer) {
        super(id, name, birthDay, sex, identityCardNumber, phoneNumber, email, address);
        this.typeCustomer = typeCustomer;
    }

    public String getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(String typeCustomer) {
        this.typeCustomer = typeCustomer;
    }


}