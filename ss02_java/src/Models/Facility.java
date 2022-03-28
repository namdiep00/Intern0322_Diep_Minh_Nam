package models;

public abstract class Facility {

    private int idFacility;
    private String nameService;
    private double areaUse;
    private long rentalPrice;
    private int maxQuantityPerson;
    private String rentalType;

    public Facility(int idFacility, String nameService, double areaUse, long rentalPrice, int maxQuantityPerson, String rentalType) {
        this.idFacility = idFacility;
        this.nameService = nameService;
        this.areaUse = areaUse;
        this.rentalPrice = rentalPrice;
        this.maxQuantityPerson = maxQuantityPerson;
        this.rentalType = rentalType;
    }

    public int getIdFacility() {
        return idFacility;
    }

    public void setIdFacility(int idFacility) {
        this.idFacility = idFacility;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public Double getAreaUse() {
        return areaUse;
    }

    public void setAreaUse(double areaUse) {
        this.areaUse = areaUse;
    }

    public long getRentalPrice() {
        return rentalPrice;
    }

    public void setRentalPrice(long rentalPrice) {
        this.rentalPrice = rentalPrice;
    }

    public int getMaxQuantityPerson() {
        return maxQuantityPerson;
    }

    public void setMaxQuantityPerson(int maxQuantityPerson) {
        this.maxQuantityPerson = maxQuantityPerson;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }
}