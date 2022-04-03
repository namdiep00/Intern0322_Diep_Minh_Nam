<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 4/1/2022
  Time: 3:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create</title>
</head>
<body>
<form method="post" action="/customer?action=create">

    <div class="form-group">
        <label for="exampleInputId">ID </label>
        <input name="id" type="text" class="form-control" id="exampleInputId" aria-describedby="emailHelp" placeholder="ID">
    </div>
    <div class="form-group">
        <label for="exampleInputTypeId">Type_ID </label>
        <input name="type_id" type="text" class="form-control" id="exampleInputTypeId" aria-describedby="emailHelp" placeholder="Type_ID">
    </div>
    <div class="form-group">
        <label for="exampleInputName">Name </label>
        <input name="name" type="text" class="form-control" id="exampleInputName" aria-describedby="emailHelp" placeholder="Name">
    </div>
    <div class="form-group">
        <label for="exampleInputBirthday">Birthday</label>
        <input name="birthday" type="text" class="form-control" id="exampleInputBirthday" placeholder="Birthday">
    </div>
    <div class="form-check">
        <select name="gender" >
            <option value="0">Nam</option>
            <option value="1">Nữ</option>
        </select>
    </div>
    <div class="form-group">
        <label for="exampleInputID_Card">Id_Card</label>
        <input name="id_Card" type="text" class="form-control"  id="exampleInputID_Card" placeholder="Id_Card">
    </div>
    <div class="form-group">
        <label for="exampleInputPhone">Phone</label>
        <input name="phone" type="text" class="form-control" id="exampleInputPhone" placeholder="Phone">
    </div>
    <div class="form-group">
        <label for="exampleInputEmail">Email</label>
        <input name="email" type="text" class="form-control" id="exampleInputEmail" placeholder="Email">
    </div>
    <div class="form-group">
        <label for="exampleInputAddress">Address</label>
        <input name="Address" type="text" class="form-control" id="exampleInputAddress" placeholder="Address">
    </div>
    <button type="submit" class="btn btn-primary">Submit</button>
</form>



</body>
</html>
