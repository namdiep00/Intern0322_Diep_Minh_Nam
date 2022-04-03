package controller;

import model.Customer;
import service.CustomerServiceImpl;
import service.CustomerService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "CustomerServlet", urlPatterns = "/customer")
public class CustomerServlet extends HttpServlet {

    private CustomerService customerService = new CustomerServiceImpl();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                createCustomer(request, response);
                break;
            default:
                getListCustomer(request, response);
        }
    }
    public void createCustomer(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int ma_khach_hang = Integer.parseInt(request.getParameter("ma_khach_hang"));
        int ma_loai_khach = Integer.parseInt(request.getParameter("ma_loai_khach"));
        String ho_ten = request.getParameter("ho_ten");
        String ngay_sinh = request.getParameter("ngay_sinh");
        int gioi_tinh = Integer.parseInt(request.getParameter("gioi_tinh"));
        String so_cmnd = request.getParameter("so_cmnd");
        String so_dien_thoai = request.getParameter("so_dien_thoai");
        String email = request.getParameter("email");
        String dia_chi = request.getParameter("dia_chi");

        Customer customer = new Customer(ma_khach_hang,ma_loai_khach,ho_ten,ngay_sinh,gioi_tinh,so_cmnd,so_dien_thoai,email,dia_chi);
        customerService.createCustomer(customer);
        response.sendRedirect("/customer");
    }
    public void getListCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customer> customerList = customerService.getCustomerList();
        request.setAttribute("customerList", customerList);
        request.getRequestDispatcher("/customer/displaycustomer.jsp").forward(request, response);
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
                getListCustomer(request, response);
        }

    }
}
