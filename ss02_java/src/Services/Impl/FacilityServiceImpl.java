package services.impl;

import models.Facility;
import models.House;
import models.Room;
import models.Villa;
import services.FacilityService;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImpl implements FacilityService {
    private static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
    private static Scanner sc = new Scanner(System.in);
    @Override
    public void display() {
        System.out.println("------DANH SÁCH FACILITY------");
        for (Map.Entry<Facility, Integer> f : facilityIntegerMap.entrySet()) {
            System.out.println("Service: "+f.getKey()+ " - Số lần đã thuê: "+f.getValue());
        }
    }

    @Override
    public void displayMaintain() {

    }

    @Override
    public void addNewVilla() {
        System.out.println("-----THÊM MỚI VILLA-----");
        System.out.println("Nhập id:");
        int idFacility = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập tên dịch vụ: ");
        String nameService = sc.nextLine();
        System.out.println("Nhập diện tích sử dụng:");
        double areaUse = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập chi phí thuê:");
        long rentalPrice = Long.parseLong(sc.nextLine());
        System.out.println("Nhập số lượng người tối đa:");
        int maxQuantityPerson = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập kiểu thuê:");
        String rentalType = sc.nextLine();
        System.out.println("Nhập phòng tiêu chuẩn:");
        String roomStandard = sc.nextLine();
        System.out.println("Nhập diện tích hồ bơi:");
        double areaPool = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập số tầng: ");
        int numberFloor = Integer.parseInt(sc.nextLine());

        Villa v = new Villa(idFacility, nameService, areaUse, rentalPrice, maxQuantityPerson, rentalType, roomStandard, areaPool, numberFloor);
        facilityIntegerMap.put(v, 0);
        System.out.println("Thêm mới thành công!");
    }

    @Override
    public void addNewRoom() {
        System.out.println("-----THÊM MỚI ROOM-----");
        System.out.println("Nhập id:");
        int idFacility = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập tên dịch vụ: ");
        String nameService = sc.nextLine();
        System.out.println("Nhập diện tích sử dụng:");
        Double areaUse = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập chi phí thuê:");
        long rentalPrice = Long.parseLong(sc.nextLine());
        System.out.println("Nhập số lượng người tối đa:");
        int maxQuantityPerson = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập kiểu thuê:");
        String rentalType = sc.nextLine();
        System.out.println("Nhập dịch vụ miễn phí kèm theo: ");
        String freeService = sc.nextLine();

        Room r = new Room(idFacility, nameService, areaUse, rentalPrice, maxQuantityPerson, rentalType, freeService);
        facilityIntegerMap.put(r, 0);
        System.out.println("Thêm mới thành công!");
    }

    @Override
    public void addNewHouse() {
        System.out.println("-----THÊM MỚI ROOM-----");
        System.out.println("Nhập id:");
        int idFacility = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập tên dịch vụ: ");
        String nameService = sc.nextLine();
        System.out.println("Nhập diện tích sử dụng:");
        Double areaUse = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập chi phí thuê:");
        long rentalPrice = Long.parseLong(sc.nextLine());
        System.out.println("Nhập số lượng người tối đa:");
        int maxQuantityPerson = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập kiểu thuê:");
        String rentalType = sc.nextLine();
        System.out.println("Nhập phòng tiêu chuẩn:");
        String roomStandard = sc.nextLine();
        System.out.println("Nhập số tầng: ");
        int numberFloor = Integer.parseInt(sc.nextLine());

        House h = new House(idFacility, nameService, areaUse, rentalPrice, maxQuantityPerson, rentalType, roomStandard, numberFloor);
        facilityIntegerMap.put(h, 0);
        System.out.println("Thêm mới thành công!");
    }
}