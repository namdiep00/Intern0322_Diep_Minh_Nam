package controller;

import model.Employee;
import service.EmployeeService;
import service.EmployeeServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "EmployeeServlet", urlPatterns = "/employee")
public class EmployeeServlet extends HttpServlet {
    private EmployeeService employeeService = new EmployeeServiceImpl();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                createEmployee(request, response);
                break;
            default:
                getListEmployee(request, response);
        }
    }
    public void createEmployee(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int ma_nhan_vien = Integer.parseInt(request.getParameter("ma_nhan_vien"));
        String ho_ten = request.getParameter("ho_ten");
        String ngay_sinh = request.getParameter("ngay_sinh");
        String so_cmnd = request.getParameter("so_cmnd");
        int luong = Integer.parseInt(request.getParameter("luong"));
        String so_dien_thoai = request.getParameter("so_dien_thoai");
        String email = request.getParameter("email");
        String dia_chi = request.getParameter("dia_chi");
        String ma_vi_tri = request.getParameter("ma_vi_tri");
        String ma_trinh_do = request.getParameter("ma_trinh_do");
        String ma_bo_phan = request.getParameter("ma_bo_phan");


        Employee employee = new Employee(ma_nhan_vien,ho_ten,ngay_sinh,so_cmnd,luong,so_dien_thoai,email,dia_chi,ma_vi_tri,ma_trinh_do,ma_bo_phan);
        employeeService.createEmployee(employee);
        response.sendRedirect("/employee");
    }
    public void getListEmployee(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Employee> employeeList = employeeService.getListEmployee;
        request.setAttribute("customerList", employeeList);
        request.getRequestDispatcher("/customer/displayemployee.jsp").forward(request, response);
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                request.getRequestDispatcher("/customer/create.jsp").forward(request, response);
            default:
                getListEmployee(request, response);
        }

    }
}
