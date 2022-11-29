<%@ page import="com.mysql.*" %>
<%@ page import="java.sql.*" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DatabaseMetaData" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.SQLException" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
  <link rel = "icon" href = "images/logo.jpeg" type = "image/x-icon">
  <title>Not Red Bus Booking</title>
  <meta charset="utf-8">
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<style>
    body{
    	background: linear-gradient(0.25turn, #3f87a6, #ebf8e1, #f69d3c);
    }
</style>

<nav class="navbar navbar-inverse" style="margin-bottom:0px;">
  <div class="container"  style="margin-left:400px;">
    <div class="navbar-header">
      <a class="navbar-brand" href="user.jsp" style="font-size: 40px;"><b>NOT RED BUS BOOKING</b></a>
    </div>
  </div>
</nav>

<body>
<center>

<div id="carousel-example-generic" class="carousel slide container-fluid" data-ride="carousel">
  <ol class="carousel-indicators">
    <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
    <li data-target="#carousel-example-generic" data-slide-to="1"></li>
    <li data-target="#carousel-example-generic" data-slide-to="2"></li>
    <li data-target="#carousel-example-generic" data-slide-to="3"></li>
    <li data-target="#carousel-example-generic" data-slide-to="4"></li>
  </ol>

  <!-- Wrapper for slides -->
  <div class="carousel-inner" role="listbox">
    <div class="item active">
      <img src="images/b1.jpeg" alt="..." style="width:800px; height:500px;">
      <div class="carousel-caption">
        <b>Bangalore To Mumbai</b>
      </div>
    </div>
    <div class="item">
      <img src="images/b2.jpeg" alt="..." style="width:800px;height:500px;">
      <div class="carousel-caption">
       <b>Bangalore to Hyderabad</b>
      </div>
    </div>
    <div class="item">
      <img src="images/b1.jpeg" alt="..." style="width:800px;height:500px;">
      <div class="carousel-caption">
      <b>Bangalore To Kochi</b>
      </div>
    </div>
    <div class="item">
      <img src="images/b4.jpeg" alt="..." style="width:800px;height:500px;">
      <div class="carousel-caption">
      <b>Bangalore To Mysore</b>
      </div>
    </div>
    <div class="item">
      <img src="images/b5.jpeg" alt="..." style="width:800px;height:500px;">
      <div class="carousel-caption">
      <b>Bangalore To Chennai</b>
      </div>
    </div>
  </div>

  <!-- Controls -->
  <a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">
    <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
    <span class="sr-only">Previous</span>
  </a>
  <a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
    <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
    <span class="sr-only">Next</span>
  </a>
</div>
<br>
<br>
<br>
<form action="book" method="post">
<div>

  <div class="container" style="float:left; margin-left:80px;">
    <table class="table table-hover">
        <thead>
            <tr>
            <th>Choose</th>
            <th>Bus Number</th>
                <th>Journey</th>
                <!--<th>Show Slot</th>-->
                <th>Travelling Time</th>                
                <th>Available Seats</th>
                <th>Booked seats</th>
            </tr>
        </thead>
        <tbody>


            <%
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = null;
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "root", "12345678");
                Statement stmt = null;
                Statement stmt2 = null;
                stmt = conn.createStatement();
                stmt2 = conn.createStatement();
                String query = "select * from busdatabase";
                ResultSet rs = null;
                rs = stmt.executeQuery(query);
                while(rs.next()){
            %>
            
                <%
                    
                  int id = rs.getInt("id");
                  int busno = rs.getInt("busno");
                  int seats = rs.getInt("seats");
                  String query2 = "select journey, duration from busdatabase where id="+id;
                  ResultSet rs2 = null;
                    rs2 = stmt2.executeQuery(query2);
                    String journey=null;
                    int duration=0;
                    boolean a=true;
                    while(a && rs2.next()){
                      journey= rs2.getString("journey");
                      duration= rs2.getInt("duration");
                      a=false;
                    }
                %>
                
                <tr>
                <td><input type="radio" value=<%=id %> name="id"></td>
                <td><%=busno %></td>
                <td><%=journey %></td> 
                <td><%=duration %> Hrs</td>
                <td><%=seats %></td>
                <td><%=60-seats%></td>
            </tr>        
            <%} %>

        </tbody>
    </table>
  </div>
</div>

<div class="testbox3"  style="float:right; margin-right:450px;">
        <h1>Book Bus Tickets</h1>
          <input type="number" name="num" placeholder="No. Of Seats">
          <br>
          <select name="class"">
              <option value="frontrow">Front Rows(1-3) - Rs.500</option>
              <option value="middlerow">Middle Rows(4-7) - Rs.300</option>
              <option value="backrow">Back Rows(8-10) - Rs.200</option>
        </select>
          <br/><br/>
          <input class="btn btn-primary" type="submit" value="BOOK NOW">
          <br/>
          <br/>
      
</div>
</form>
</center>



</body>

<style>
      /* NOTE: The styles were added inline because Prefixfree needs access to your styles and they must be inlined if they are on local disk! */
body, div, dl, dt, dd, ul, ol, li, h1, h2, h3, h4, h5, h6, pre, form, fieldset, input, textarea, p, blockquote, th, td { 
  padding:0;
  margin:0;}

body,
input,
textarea,
select {
  font-family: 'Open Sans', sans-serif;
  font-size: 16px;
  color: #4c4c4c;
}

h1 {
  font-size: 32px;
  font-weight: 300;
  color: #4c4c4c;
  text-align: center;
  padding-top: 10px;
  margin-bottom: 10px;
}

.testbox3 {
  width: 300px; 
  -webkit-border-radius: 8px/7px; 
  -moz-border-radius: 8px/7px; 
  border-radius: 8px/7px; 
  background-color: #ffe599; 
  -webkit-box-shadow: 1px 2px 5px rgba(0,0,0,.31); 
  -moz-box-shadow: 1px 2px 5px rgba(0,0,0,.31); 
  box-shadow: 1px 2px 5px rgba(0,0,0,.31); 
  border: solid 3px #351c75;
}

.testbox3{
  height: 185px; 
}
form{
  margin: 0 30px;
}

input[type=text],input[type=password]{
  width: 200px; 
  height: 39px; 
  -webkit-border-radius: 0px 4px 4px 0px/5px 5px 4px 4px; 
  -moz-border-radius: 0px 4px 4px 0px/0px 0px 4px 4px; 
  border-radius: 0px 4px 4px 0px/5px 5px 4px 4px; 
  background-color: #fff; 
  -webkit-box-shadow: 1px 2px 5px rgba(0,0,0,.09); 
  -moz-box-shadow: 1px 2px 5px rgba(0,0,0,.09); 
  box-shadow: 1px 2px 5px rgba(0,0,0,.09); 
  border: solid 1px #cbc9c9;
  margin-left: -5px;
  margin-top: 13px; 
  padding-left: 10px;
}

input[type=password]{
  margin-bottom: 25px;
}

</style>
</html>