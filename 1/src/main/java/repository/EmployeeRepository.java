package repository;

import model.Employee;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository {
    private static List<Employee> employeeList = new ArrayList<>();
    private Base base = new Base();

    public List<Employee> getEmployeeList() {
        List<Employee> employeeList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = this.base.getConnection().prepareStatement("select * from nhan_vien");
            Employee employee;
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int ma_nhan_vien = resultSet.getInt("ma_nhan_vien");
                String ho_ten = resultSet.getString("ho_ten");
                String ngay_sinh = resultSet.getString("ngay_sinh" );
                int luong = resultSet.getInt("luong");
                String  so_cmnd = resultSet.getString("so_cmnd" );
                String so_dien_thoai = resultSet.getString("so_dien_thoai" );
                String email = resultSet.getString("email" );
                String dia_chi = resultSet.getString("dia_chi" );
                String ma_vi_tri = resultSet.getString("ma_vi_tri" );
                String ma_trinh_do = resultSet.getString("ma_trinh_do" );
                String ma_bo_phan = resultSet.getString("ma_bo_phan" );

                employee = new Employee(ma_nhan_vien,ho_ten,ngay_sinh,so_cmnd,luong,so_dien_thoai,email,dia_chi,ma_vi_tri,ma_trinh_do,ma_bo_phan);
                employeeList.add(employee);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return  employeeList;

    }
    public void createEmployee(Employee employee){employeeList.add(employee);
        try {
            PreparedStatement preparedStatement = this.base
                    .getConnection()
                    .prepareStatement("insert into nhan_vien(ma_nhan_vien,ho_ten,ngay_sinh,so_cmnd,luong,so_dien_thoai,email,dia_chi,ma_vi_tri,ma_trinh_do,ma_bo_phan) value(?,?,?,?,?,?,?,?,?,?,?)");
            preparedStatement.setInt(1,employee.getMa_nhan_vien());
            preparedStatement.setString(2, employee.getHo_ten());
            preparedStatement.setString(3,employee.getNgay_sinh());
            preparedStatement.setInt(5,employee.getLuong());
            preparedStatement.setString(4, employee.getSo_cmnd());
            preparedStatement.setString(6, employee.getSo_dien_thoai());
            preparedStatement.setString(7, employee.getEmail());
            preparedStatement.setString(8,employee.getDia_chi());
            preparedStatement.setString(9,employee.getMa_vi_tri());
            preparedStatement.setString(10,employee.getMa_trinh_do());
            preparedStatement.setString(11,employee.getMa_bo_phan());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}



