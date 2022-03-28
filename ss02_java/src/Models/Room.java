package models;

public class Room extends Facility {
    private String freeService;

    public Room(int idFacility, String nameService, double areaUse, long rentalPrice, int maxQuantityPerson, String rentalType, String freeService) {
        super(idFacility, nameService, areaUse, rentalPrice, maxQuantityPerson, rentalType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }
}