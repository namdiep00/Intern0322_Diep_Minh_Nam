package models;

public class House extends Facility {
    private String roomStandard;
    private int numberFloor;

    public House(int idFacility, String nameService, Double areaUse, long rentalPrice, int maxQuantityPerson, String rentalType, String roomStandard, int numberFloor) {
        super(idFacility, nameService, areaUse, rentalPrice, maxQuantityPerson, rentalType);
        this.roomStandard = roomStandard;
        this.numberFloor = numberFloor;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getNumberFloor() {
        return numberFloor;
    }

    public void setNumberFloor(int numberFloor) {
        this.numberFloor = numberFloor;
    }
}