package repository;

import model.Customer;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepository {
    private static List<Customer> customerList = new ArrayList<>();
    private Base base = new Base();
//    static {
//        customerList.add(new Customer(1,2,"An","11/11/2020",1,"0135","ad@gmaij.com","Đn"));
//        customerList.add(new Customer(2,2,"An","11/11/2020",1,"0135","abd@gmaij.com","Qn"));
//        customerList.add(new Customer(3,2,"An","11/11/2020",1,"0135","acsd@gmaij.com","Qt"));
//    }

    public List<Customer> getCustomerList() {
        List<Customer> customerList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = this.base.getConnection().prepareStatement("select * from khach_hang");
            Customer customer;
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int ma_khach_hang = resultSet.getInt("ma_khach_hang");
                int ma_loai_khach = resultSet.getInt("ma_loai_khach") ;
                String ho_ten = resultSet.getString("ho_ten");
                String ngay_sinh = resultSet.getString("ngay_sinh" );
                int gioi_tinh = resultSet.getInt("gioi_tinh");
                String  so_cmnd = resultSet.getString("so_cmnd" );
                String so_dien_thoai = resultSet.getString("so_dien_thoai" );
                String email = resultSet.getString("email" );
                String dia_chi = resultSet.getString("dia_chi" );

                customer = new Customer(ma_khach_hang,ma_loai_khach,ho_ten,ngay_sinh,gioi_tinh,so_cmnd,so_dien_thoai,email,dia_chi);
                customerList.add(customer);
            }
        } catch (SQLException e) {
                e.printStackTrace();
        }
        return  customerList;

    }
    public void createCustomer(Customer customer){customerList.add(customer);
        try {
            PreparedStatement preparedStatement = this.base
                    .getConnection()
                    .prepareStatement("insert into khach_hang(ma_khach_hang,ma_loai_khach,ho_ten,ngay_sinh,gioi_tinh,so_cmnd,so_dien_thoai,email,dia_chi) value(?,?,?,?,?,?,?,?,?)");
            preparedStatement.setInt(1,customer.getMa_khach_hang());
            preparedStatement.setInt(2,customer.getMa_loai_khach());
            preparedStatement.setString(3, customer.getHo_ten());
            preparedStatement.setString(4,customer.getNgay_sinh());
            preparedStatement.setInt(5,customer.getGioi_tinh());
            preparedStatement.setString(6, customer.getSo_cmnd());
            preparedStatement.setString(7, customer.getSo_dien_thoai());
            preparedStatement.setString(8, customer.getEmail());
            preparedStatement.setString(9, customer.getDia_chi());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    }



