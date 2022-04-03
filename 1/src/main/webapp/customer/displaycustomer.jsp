<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 4/1/2022
  Time: 8:51 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Customer</title>
    <link rel="stylesheet" href="css/customer.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

</head>
<body>
<div class="container">
    <div class="header  ">
        <div class="header-left ">
            <div class="logo">
                <img src="img/logo.jpg" alt="logo furama">
            </div>
        </div>
        <div class="header-right ">
            <p>Diệp Minh Nam</p>
        </div>
    </div>
    <div class="Nav">
        <div class="Menu ">
            <a href="http://localhost:8080/">Home</a>
            <a href="">Employee</a>
            <a href="">Customer</a>
            <a href="">Service</a>
            <a href="">Contract</a>
        </div>
        <div class="Search">
            <form class="d-flex">
                <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                <button class="btn btn-outline-success" type="submit">Search</button>
            </form>
        </div>
    </div>
    <div class="body ">
        <div class="body-left">
            <ul>
                <li><a href="">Add new customer</a></li>
                <li><a href="">Display customer</a></li>
                <li><a href="">Edit customer</a></li>
            </ul>
        </div>
        <div class="body-right ">
            <div class="view">
                <a href="/customer?action=create" class="btn-info">Create</a>
                <c:if test="${empty customerList}">
                    <h2 style="color:  red">Customer List Empty</h2>
                </c:if>
                <c:if test="${not empty customerList}">
                    <table class="table">
                        <thead>
                        <tr>
                            <th> ID</th>
                            <th> Type_ID</th>
                            <th> Name</th>
                            <th> Birthday</th>
                            <th> Gender</th>
                            <th> ID_Card</th>
                            <th> Phone</th>
                            <th> Email</th>
                            <th> Address</th>
                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach var="khach_hang" items="${customerList}">
                            <tr>
                                <td>${khach_hang.ma_khach_hang}</td>
                                <td>${khach_hang.ma_loai_khach}</td>
                                <td>${khach_hang.ho_ten}</td>
                                <td>${khach_hang.ngay_sinh}</td>
                                <td>${khach_hang.gioi_tinh}</td>
                                <td>${khach_hang.so_cmnd}</td>
                                <td>${khach_hang.so_dien_thoai}</td>
                                <td>${khach_hang.email}</td>
                                <td>${khach_hang.dia_chi}</td>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>
                </c:if>
            </div>

            <%--            modal--%>

            <div class="modal fade" id="modelId" tabindex="-1" role="dialog" aria-labelledby="modelTitleId" aria-hidden="true">
                <div class="modal-dialog" role="document">
                    <div class="modal-content">
                        <div class="modal-header">
                            <h5 class="modal-title">Confirm Delete</h5>
                            <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                <span aria-hidden="true">&times;</span>
                            </button>
                        </div>
                        <form action="/customer" method="post">
                            <input type="hidden" name="action" value="delete">
                            <input type="hidden" name="id" id="idEmployeeDel">
                            <div class="modal-body">
                                Ban co muon xoa khong ??
                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                                <button type="submit" class="btn btn-primary">Delete</button>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
<%--            <div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel"--%>
<%--                 aria-hidden="true">--%>
<%--                <div class="modal-dialog">--%>
<%--                    <div class="modal-content">--%>
<%--                        <div class="modal-header">--%>
<%--                            <h5 class="modal-title" id="exampleModalLabel">Edit Customer</h5>--%>
<%--                            <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>--%>
<%--                        </div>--%>
<%--                        <div class="modal-body">--%>
<%--                            <form>--%>
<%--                                <div class="mb-3">--%>
<%--                                    <input type="text" class="form-control" placeholder="Customer_name">--%>
<%--                                </div>--%>
<%--                                <div class="mb-3">--%>
<%--                                    <input type="text" class="form-control" placeholder="Customer_id_card">--%>
<%--                                </div>--%>
<%--                                <div class="mb-3">--%>
<%--                                    <input type="text" class="form-control" placeholder="Customer_phone">--%>
<%--                                </div>--%>

<%--                            </form>--%>
<%--                        </div>--%>
<%--                        <div class="modal-footer">--%>
<%--                            <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>--%>
<%--                            <button type="button" class="btn btn-primary">Saves</button>--%>
<%--                        </div>--%>
<%--                    </div>--%>
<%--                </div>--%>
<%--            </div>--%>
            <nav id="navig" aria-label="Page navigation example">
                <ul class="pagination">
                    <li class="page-item">
                        <a class="page-link" href="#" aria-label="Previous">
                            <span aria-hidden="true">&laquo;</span>
                            <span class="sr-only">Previous</span>
                        </a>
                    </li>
                    <li class="page-item"><a class="page-link" href="#">1</a></li>
                    <li class="page-item"><a class="page-link" href="#">2</a></li>
                    <li class="page-item"><a class="page-link" href="#">3</a></li>
                    <li class="page-item">
                        <a class="page-link" href="#" aria-label="Next">
                            <span aria-hidden="true">&raquo;</span>
                            <span class="sr-only">Next</span>
                        </a>
                    </li>
                </ul>
            </nav>
        </div>
    </div>
    <div class="footer">
        <h2>DMN</h2>
    </div>
</div>
<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
        integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
        integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
        crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
        integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
        crossorigin="anonymous"></script>
<script>
    function onDelete(idCustomerDel){
        document.getElementById("idCustomerDel").value = idCustomerDel;
    }
</script>
</body>
</html>
