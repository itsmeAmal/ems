<%@page import="com.ems.control.monthlySalaryControl"%>
<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="ISO-8859-1">
        <title>Add Salary</title>
        <!-- Font Awesome -->
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.2/css/all.css">
        <!-- Google Fonts -->
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700&display=swap">
        <!-- Bootstrap core CSS -->
        <link href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.4.1/css/bootstrap.min.css" rel="stylesheet">
        <!-- Material Design Bootstrap -->
        <link href="https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.18.0/css/mdb.min.css" rel="stylesheet">

        <!-- JQuery -->
        <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <!-- Bootstrap tooltips -->
        <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.4/umd/popper.min.js"></script>
        <!-- Bootstrap core JavaScript -->
        <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.4.1/js/bootstrap.min.js"></script>
        <!-- MDB core JavaScript -->
        <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.18.0/js/mdb.min.js"></script>
    </head>
    <body>
        <form action="addMonthlySalaryDetail" method="post">
            <div style="position: absolute; left: 0px; width: 100%; height: 100%; top: 0px; "></div> 

            <div style="position: absolute; left: 5%; top:  5%; width: 400px; height: 60px" class="md-form">
                <h5 class="card-title">Add Employee Monthly Salary Detail</h5>
            </div>

            <div style="position: absolute; left: 5%; top:  15%; width: 300px; height: 60px">
                <div class="dropdown">
                    <div id="employee_name">
                        <label for="form7">Employee Name</label>
                        <select class="form-control" name="employee" id=form7>
                            <option>Pasindu</option>
                            <option>Chamoth</option>
                            <option>Akila</option>
                            <option>Sachin</option>
                            <option>Chamidhu</option>
                        </select>
                    </div>
                </div>
            </div>

            <div style="position: absolute; left: 5%; top:  25%; width: 300px; height: 60px" class="md-form">
                <input type="text" name="basic_salary" placeholder="Basic Salary" class="form-control" id="form1" required> 
                <label for="form1">Basic Salary</label>
            </div>

            <div style="position: absolute; left: 5%; top:  35%; width: 300px; height: 60px" class="md-form">
                <input type="text" name=fixed_allowence placeholder="Fixed Allowence" class="form-control" id="form2" required> 
                <label for="form2">Fixed Allowence</label>
            </div>

            <div style="position: absolute; left: 5%; top:  45%; width: 300px; height: 60px" class="md-form">
                <input type="text" name=other_allowence placeholder="Other Allowence" class="form-control" id="form3" required> 
                <label for="form3">Other Allowence</label>
            </div>

            <div style="position: absolute; left: 5%; top:  55%; width: 300px; height: 60px" class="md-form">
                <input type="text" name=salary_deduction placeholder="Salary Deduction" class="form-control" id="form4" required> 
                <label for="form4">Salary Deduction</label>
            </div>

            <div style="position: absolute; left: 5%; top:  65%; width: 300px; height: 60px" class="md-form">
                <input type="text" name=note placeholder="Note" class="form-control" id="form5" required> 
                <label for="form5">Note</label>
            </div>

            <div style="position: absolute; left: 5%; top:  75%; width: 300px; height: 60px" align="left"> 
                <input type="submit" value="ADD SALARY DETAIL" name="save"  class="btn btn-info btn-rounded" id="form6"> 
            </div>

            <div style="position: absolute; left: 5%; top:  85%; width: 300px; height: 60px" align="left"> 
                <input type="submit" value="UPDATE SALARY DETAIL" name="update"  class="btn btn-success btn-rounded" id="form8"> 
            </div>
        </form>
        <div style="position: absolute; left: 28%; top: 10%; width: 60%; height: 80%"> 
            <form action="deleteSalaryDetail" method="post">
                <table class="table">
                    <thead class="black white-text">
                        <tr>
                            <th scope="col">Employee Name </th>
                            <th scope="col">Salary Date</th>
                            <th scope="col">Basic Salary</th>
                            <th scope="col">Fixed Allowence</th>
                            <th scope="col">Other Allowence</th>
                            <th scope="col">Deduction</th>
                            <th scope="col">Delete</th>
                        </tr>
                    </thead>
                    <tbody>
                        <%
                            ResultSet rset = monthlySalaryControl.getAllMonthlySalaryDetail();
                            while (rset.next()) {
                        %>
                        <tr>
                            <td><%= rset.getString("monthly_salary_note")%></td>
                            <td><%= rset.getDate("monthly_salary_date")%></td>
                            <td><%= rset.getBigDecimal("monthly_salary_basic_salary")%></td>
                            <td><%= rset.getBigDecimal("monthly_salary_fixed_allowence")%></td>
                            <td><%= rset.getBigDecimal("monthly_salary_other_allowance")%></td>
                            <td><%= rset.getBigDecimal("monthly_salary_deduction")%>
                                <input type="hidden" value="<%= rset.getString("monthly_salary_note")%>" name="hiddenEmpName">
                            </td>
                            <!--<td><input type="submit" value="DELETE"  class="btn btn-info btn-danger" id="form6"></td>-->
                            <td><input type="submit" class="btn btn-danger btn-sm m-0" value="DELETE"></td>
                        </tr>
                        <%
                            }
                        %>
                    </tbody>
                </table>
            </form>
        </div>
    </body>
</html> 