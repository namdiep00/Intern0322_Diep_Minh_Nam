package services.impl;

import models.Customer;
import models.Employee;
import services.CustomerService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    private LinkedList<Customer> listC = new LinkedList<>();
    static Scanner sc = new Scanner(System.in);

    @Override
    public void display() {
        System.out.println("---------DANH SÁCH KHÁCH HÀNG---------");
        for (Customer c : listC) {
            System.out.println(c.toString());
        }
    }

    @Override
    public void addNew() {
        System.out.println("-----------THÊM MỚI KHÁCH HÀNG------------");
        System.out.print("Nhập id: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập tên: ");
        String name = sc.nextLine();
        System.out.print("Nhập ngày sinh: ");
        String b = sc.nextLine();
        Date birthDate = new Date();
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        df.setLenient(false); //set false để kiểm tra tính hợp lệ của date. Vd: tháng 2 phải có 28,29 ngày, 1 năm phải có 12 tháng,...
        try{
            birthDate = df.parse(b); // parse dateString thành kiểu Date
        }
        catch (ParseException e) { //Quăng lỗi nếu date không hợp lệ
            System.out.println("Invalid date");
        }
        System.out.print("Nhập giới tính: ");
        String sex = sc.nextLine();
        System.out.print("Nhập số cmnd: ");
        String identityCardNumber = sc.nextLine();
        System.out.print("Nhập số điện thoại: ");
        String phoneNumber = sc.nextLine();
        System.out.print("Nhập Email: ");
        String email = sc.nextLine();
        System.out.println("Nhập địa chỉ: ");
        String address = sc.nextLine();
        System.out.print("Nhập loại khách hàng: ");
        String typeCustomer = sc.nextLine();

        Customer e = new Customer(id, name, birthDate, sex, identityCardNumber, phoneNumber, email, address, typeCustomer );
        listC.add(e);
        System.out.println("Đã thêm mới khách hàng thành công!");
    }

    @Override
    public void edit() {
        System.out.println("Nhập id khách hàng cần chỉnh sửa: ");
        int id = Integer.parseInt(sc.nextLine());
        int sizeListE = listC.size();
        boolean check = false;

        for(int i = 0; i<sizeListE; i++) {
            if(listC.get(i).getId() == id) {
                check = true;
                System.out.println("Tìm thấy khách hàng cần chỉnh sửa:");
                System.out.println(listC.get(i));
                int choiceNumber;
                int newId;
                String newName, newSex, newIdentityCardNumber, newPhoneNumber, newEmail, newAddress, newTypeCustomer;
                Date newBirthDate;
                long newSalary;
                while(true) {
                    System.out.println("------------------------------");
                    System.out.println("1. Sửa id");
                    System.out.println("2. Sửa tên");
                    System.out.println("3. Sửa ngày sinh");
                    System.out.println("4. Sửa giới tính");
                    System.out.println("5. Sửa số cmnd");
                    System.out.println("6. Sửa số điện thoại");
                    System.out.println("7. Sửa email");
                    System.out.println("8. Sửa địa chỉ");
                    System.out.println("9. Sửa loại khách");
                    System.out.println("10. Nhập lại tất cả thông tin");
                    System.out.println("11. Trở lại");

                    do{
                        System.out.println("Chọn thông tin cần chỉnh sửa: ");
                        choiceNumber = Integer.parseInt(sc.nextLine());
                    }while(choiceNumber < 1 || choiceNumber > 13);

                    switch (choiceNumber){
                        case 1:
                            System.out.print("Nhập id mới: ");
                            newId = Integer.parseInt(sc.nextLine());
                            listC.get(i).setId(newId);
                            System.out.println("Đã cập nhật thành công!");
                            break;
                        case 2:
                            System.out.print("Nhập tên mới: ");
                            newName = sc.nextLine();
                            listC.get(i).setName(newName);
                            System.out.println("Đã cập nhật thành công!");
                            break;
                        case 3:
                            System.out.print("Nhập ngày sinh mới: ");
                            String b = sc.nextLine();
                            newBirthDate = new Date();
                            SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
                            df.setLenient(false);
                            try {
                                newBirthDate = df.parse(b);
                            } catch (ParseException parseException) {
                                System.out.println("Lỗi định dạng ngày tháng năm!");
                            }
                            listC.get(i).setBirthDay(newBirthDate);
                            System.out.println("Đã cập nhật thành công!");
                            break;
                        case 4:
                            System.out.print("Nhập giới tính mới: ");
                            newSex = sc.nextLine();
                            listC.get(i).setSex(newSex);
                            System.out.println("Đã cập nhật thành công!");
                            break;
                        case 5:
                            System.out.print("Nhập số cmnd mới: ");
                            newIdentityCardNumber = sc.nextLine();
                            listC.get(i).setIdentityCardNumber(newIdentityCardNumber);
                            System.out.println("Đã cập nhật thành công!");
                            break;
                        case 6:
                            System.out.print("Nhập số điện thoại mới: ");
                            newPhoneNumber = sc.nextLine();
                            listC.get(i).setPhoneNumber(newPhoneNumber);
                            System.out.println("Đã cập nhật thành công!");
                            break;
                        case 7:
                            System.out.print("Nhập email mới: ");
                            newEmail = sc.nextLine();
                            listC.get(i).setEmail(newEmail);
                            System.out.println("Đã cập nhật thành công!");
                            break;
                        case 8:
                            System.out.print("Nhập địa chỉ mới: ");
                            newAddress = sc.nextLine();
                            listC.get(i).setAddress(newAddress);
                            System.out.println("Đã cập nhật thành công!");
                            break;
                        case 9:
                            System.out.print("Nhập loại khách hàng mới: ");
                            newTypeCustomer = sc.nextLine();
                            listC.get(i).setTypeCustomer(newTypeCustomer);
                            System.out.println("Đã cập nhật thành công!");
                            break;
                        case 10:
                            System.out.print("Nhập id: ");
                            newId = Integer.parseInt(sc.nextLine());
                            System.out.print("Nhập tên: ");
                            newName = sc.nextLine();
                            System.out.print("Nhập ngày sinh: ");
                            String a = sc.nextLine();
                            newBirthDate = new Date();
                            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                            dateFormat.setLenient(false); //set false để kiểm tra tính hợp lệ của date. Vd: tháng 2 phải có 28,29 ngày, 1 năm phải có 12 tháng,...
                            try{
                                newBirthDate = dateFormat.parse(a); // parse dateString thành kiểu Date
                            }
                            catch (ParseException ex) { //Quăng lỗi nếu date không hợp lệ
                                System.out.println("Invalid date");
                            }
                            System.out.print("Nhập giới tính: ");
                            newSex = sc.nextLine();
                            System.out.print("Nhập số cmnd: ");
                            newIdentityCardNumber = sc.nextLine();
                            System.out.print("Nhập số điện thoại: ");
                            newPhoneNumber = sc.nextLine();
                            System.out.print("Nhập Email: ");
                            newEmail = sc.nextLine();
                            System.out.print("Nhập địa chỉ: ");
                            newAddress = sc.nextLine();
                            System.out.print("Nhập loại khách hàng: ");
                            newTypeCustomer = sc.nextLine();
                            listC.get(i).setId(newId); listC.get(i).setName(newName); listC.get(i).setBirthDay(newBirthDate);
                            listC.get(i).setSex(newSex); listC.get(i).setIdentityCardNumber(newIdentityCardNumber);
                            listC.get(i).setPhoneNumber(newPhoneNumber); listC.get(i).setEmail(newEmail); listC.get(i).setAddress(newAddress);
                            listC.get(i).setTypeCustomer(newTypeCustomer);
                            System.out.println("Đã cập nhật thành công!");
                            break;
                        case 11:
                            System.out.println("Quay trở lại MENU chính");
                            return;
                    }
                }

            } break;
        }

        if(check == false) {
            System.out.println("Không tìm thấy khách hàng với mã id: "+id);
        }
    }

    @Override
    public void delete() {
        int sizeListC = listC.size();
        boolean check = false;
        System.out.print("Nhập vào id khách hàng cần xóa: ");
        int id = Integer.parseInt(sc.nextLine());
        for (int i = 0; i<sizeListC; i++) {
            if(listC.get(i).getId() == id) {
                listC.remove(listC.get(i));
                System.out.println("Đã xóa khách hàng thành công!");
                check = true;
            }
        }

        if(check == false) {
            System.out.println("Không tìm thấy khách hàng với mã id là : "+id);
        }
    }
}
