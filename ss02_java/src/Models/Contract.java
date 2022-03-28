package models;

public class Contract {
    private int numberContract;
    private String idBooking;
    private long deposit;
    private long totalPay;
    private String idCustomer;

    public Contract(int numberContract, String idBooking, long deposit, long totalPay, String idCustomer) {
        this.numberContract = numberContract;
        this.idBooking = idBooking;
        this.deposit = deposit;
        this.totalPay = totalPay;
        this.idCustomer = idCustomer;
    }

    public int getNumberContract() {
        return numberContract;
    }

    public void setNumberContract(int numberContract) {
        this.numberContract = numberContract;
    }

    public String getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(String idBooking) {
        this.idBooking = idBooking;
    }

    public long getDeposit() {
        return deposit;
    }

    public void setDeposit(long deposit) {
        this.deposit = deposit;
    }

    public long getTotalPay() {
        return totalPay;
    }

    public void setTotalPay(long totalPay) {
        this.totalPay = totalPay;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }
}