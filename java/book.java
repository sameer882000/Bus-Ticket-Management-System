import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/book")
public class book extends HttpServlet {
	static int cost=0;
	protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
         
        String bid = request.getParameter("id");
        String num = request.getParameter("num");
        String clss = request.getParameter("class");
        
        @SuppressWarnings("unused")
		String tictype = null;
        if(clss.equals("frontrow"))
        	tictype="Front Row(s)";
        else if(clss.equals("middlerow"))
        	tictype="Middle Row(s)";
        else
        	tictype="Back Row(s)";
        	
        System.out.println(clss);

        try
        {
          String myDriver = "com.mysql.jdbc.Driver";
          String myUrl = "jdbc:mysql://localhost:3306/db";
          Class.forName(myDriver);
          Connection conn = DriverManager.getConnection(myUrl, "root", "12345678");
          Statement stmt = null;
          stmt = conn.createStatement();
          String query = "select id, journey, busno, seats from busdatabase where id="+bid;
          System.out.println(bid);
          ResultSet rs = null;
          int busno=0, seats=0, id=0;
          rs = stmt.executeQuery(query);
          PrintWriter writer = response.getWriter();
          String htmlRespone = "<html>";            
          
          if(rs==null){
        	  htmlRespone += "<h2>Wrong Entry</h2><br/>"; 
          }
          while(rs.next()){
        	  busno = rs.getInt("busno");
        	  seats = rs.getInt("seats");
        	  id = rs.getInt("id");
          }
          
          query = " select * from busdatabase where id="+id;
          rs = stmt.executeQuery(query);
          String name=null;
          int duration=0;
          while(rs.next()){
        	  name = rs.getString("journey");
        	  busno = rs.getInt("busno");
        	  duration = rs.getInt("duration");
        	  seats = rs.getInt("seats");
        	  
          }
          
          if(clss.equals("frontrow")){
        	  cost=500;
          }
          else if(clss.equals("middlerow")){
        	  cost=300;
          }
          else if(clss.equals("backrow")){
        	  cost=200;
          }          
          
          int number =Integer.parseInt(num);
          cost*=number;
          System.out.println(cost);
          switch(busno) {
          	
          	case 1:
          		showS1 m1=new showS1(name, busno, duration, seats);
          		m1.seats=seats;
          		if(!m1.bookNew(number) || m1.seats == 0){
      				htmlRespone += "<body style='background: linear-gradient(0.25turn, #3f87a6, #ebf8e1, #f69d3c);'>"
      						+ "<h2 style='left: 0; line-height: 200px; margin-top: -100px; margin-left: 450px;"
      						+ " position: absolute; top: 50%; width: 100%;'>All Bus Seats Booked Or Invalid entry</h2></body>"; 
      			}
      			else{
      				htmlRespone += "<body style='background: linear-gradient(0.25turn, #3f87a6, #ebf8e1, #f69d3c);'>"
      						+ "<center><div style='background: linear-gradient(0.25turn, #f69d3c, #ebf8e1, #3f87a6);"
      						+ "position:absolute; top:160px; right:460px; border:1px solid black; border-radius:7px; width:350px;'>"
      						+ "<h2>Tickets Booked</h2><hr><br/><h3>Please pay Rs." + cost + "</h3><br>"
      								+ "<hr><p>Order Placed: "+ number+" x " +tictype+" tickets<br>Journey: "+name+""
      										+ "<br/>Travelling Time: "+duration+" HRS</p>"
      										+ "<h2>Bus Number: "+busno+"</h2><br></div></center></body>";
      				
      					m1.seats=m1.seats-m1.booked;
	          			query = "update busdatabase set seats="+m1.seats+" where busno="+busno;
	          			System.out.println(query);
	          			PreparedStatement preparedStmt = conn.prepareStatement(query);
	      	          	preparedStmt.execute();
	      	          	//System.out.println("Number of seats booked :"+(60-m1.seats));
      			}
          		break;
          	case 2:
          		showS2 m2=new showS2(name, busno, duration, seats);
          		m2.seats=seats;
          		if(!m2.bookNew(number) || m2.seats == 0){
          			htmlRespone += "<body style='background: linear-gradient(0.25turn, #3f87a6, #ebf8e1, #f69d3c);'>"
      						+ "<h2 style='left: 0; line-height: 200px; margin-top: -100px; margin-left: 450px;"
      						+ " position: absolute; top: 50%; width: 100%;'>All Bus Seats Booked Or Invalid entry</h2></body>"; 
      			}
      			else{
      				htmlRespone += "<body style='background: linear-gradient(0.25turn, #3f87a6, #ebf8e1, #f69d3c);'>"
      						+ "<center><div style='background: linear-gradient(0.25turn, #f69d3c, #ebf8e1, #3f87a6);"
      						+ "position:absolute; top:160px; right:460px; border:1px solid black; border-radius:7px; width:350px;'>"
      						+ "<h2>Tickets Booked</h2><hr><br/><h3>Please pay Rs." + cost + "</h3><br>"
      								+ "<hr><p>Order Placed: "+ number+" x " +tictype+" tickets<br>Journey: "+name+""
      										+ "<br/>Travelling Time: "+duration+" HRS</p>"
      										+ "<h2>Bus Number: "+busno+"</h2><br></div></center></body>";
      					m2.seats=m2.seats-m2.booked;
	          			query = " update busdatabase set seats="+m2.seats+" where busno="+busno;
	          			System.out.println(query);
	          			PreparedStatement preparedStmt = conn.prepareStatement(query);
	      	          	preparedStmt.execute();
      			}
          		break;
          	case 3:
          		showS3 m3=new showS3(name, busno, duration, seats);
          		m3.seats=seats;
          		if(!m3.bookNew(number) || m3.seats == 0){
          			htmlRespone += "<body style='background: linear-gradient(0.25turn, #3f87a6, #ebf8e1, #f69d3c);'>"
      						+ "<h2 style='left: 0; line-height: 200px; margin-top: -100px; margin-left: 450px;"
      						+ " position: absolute; top: 50%; width: 100%;'>All Bus Seats Booked Or Invalid entry</h2></body>"; 
      			}
      			else{
      				htmlRespone += "<body style='background: linear-gradient(0.25turn, #3f87a6, #ebf8e1, #f69d3c);'>"
      						+ "<center><div style='background: linear-gradient(0.25turn, #f69d3c, #ebf8e1, #3f87a6);"
      						+ "position:absolute; top:160px; right:460px; border:1px solid black; border-radius:7px; width:350px;'>"
      						+ "<h2>Tickets Booked</h2><hr><br/><h3>Please pay Rs." + cost + "</h3><br>"
      								+ "<hr><p>Order Placed: "+ number+" x " +tictype+" tickets<br>Journey: "+name+""
      										+ "<br/>Travelling Time: "+duration+" HRS</p>"
      										+ "<h2>Bus Number: "+busno+"</h2><br></div></center></body>"; 
      					m3.seats=m3.seats-m3.booked;
      					query = " update busdatabase set seats="+m3.seats+" where busno="+busno;
	          			System.out.println(query);
	          			PreparedStatement preparedStmt = conn.prepareStatement(query);
	      	          	preparedStmt.execute();
      			}
          		break;
          	case 4:
          		showS4 m4=new showS4(name, busno, duration, seats);
          		m4.seats=seats;
          		if(!m4.bookNew(number) || m4.seats == 0){
          			htmlRespone += "<body style='background: linear-gradient(0.25turn, #3f87a6, #ebf8e1, #f69d3c);'>"
      						+ "<h2 style='left: 0; line-height: 200px; margin-top: -100px; margin-left: 450px;"
      						+ " position: absolute; top: 50%; width: 100%;'>All Bus Seats Booked Or Invalid entry</h2></body>"; 
      			}
      			else{
      				htmlRespone += "<body style='background: linear-gradient(0.25turn, #3f87a6, #ebf8e1, #f69d3c);'>"
      						+ "<center><div style='background: linear-gradient(0.25turn, #f69d3c, #ebf8e1, #3f87a6);"
      						+ "position:absolute; top:160px; right:460px; border:1px solid black; border-radius:7px; width:350px;'>"
      						+ "<h2>Tickets Booked</h2><hr><br/><h3>Please pay Rs." + cost + "</h3><br>"
      								+ "<hr><p>Order Placed: "+ number+" x " +tictype+" tickets<br>Journey: "+name+""
      										+ "<br/>Travelling Time: "+duration+" HRS</p>"
      										+ "<h2>Bus Number: "+busno+"</h2><br></div></center></body>"; 
      					m4.seats=m4.seats-m4.booked;
      					query = " update busdatabase set seats="+m4.seats+" where busno="+busno;
	          			System.out.println(query);
	          			PreparedStatement preparedStmt = conn.prepareStatement(query);
	      	          	preparedStmt.execute();
      			}
          		break;
          	case 5:
          		showS5 m5=new showS5(name, busno, duration, seats);
          		m5.seats=seats;
          		if(!m5.bookNew(number) || m5.seats == 0){
          			htmlRespone += "<body style='background: linear-gradient(0.25turn, #3f87a6, #ebf8e1, #f69d3c);'>"
      						+ "<h2 style='left: 0; line-height: 200px; margin-top: -100px; margin-left: 450px;"
      						+ " position: absolute; top: 50%; width: 100%;'>All Bus Seats Booked Or Invalid entry</h2></body>"; 
      			}
      			else{
      				htmlRespone += "<body style='background: linear-gradient(0.25turn, #3f87a6, #ebf8e1, #f69d3c);'>"
      						+ "<center><div style='background: linear-gradient(0.25turn, #f69d3c, #ebf8e1, #3f87a6);"
      						+ "position:absolute; top:160px; right:460px; border:1px solid black; border-radius:7px; width:350px;'>"
      						+ "<h2>Tickets Booked</h2><hr><br/><h3>Please pay Rs." + cost + "</h3><br>"
      								+ "<hr><p>Order Placed: "+ number+" x " +tictype+" tickets<br>Journey: "+name+""
      										+ "<br/>Travelling Time: "+duration+" HRS</p>"
      										+ "<h2>Bus Number: "+busno+"</h2><br></div></center></body>"; 
      					m5.seats=m5.seats-m5.booked;
      					query = " update busdatabase set seats="+m5.seats+" where busno="+busno;
	          			System.out.println(query);
	          			PreparedStatement preparedStmt = conn.prepareStatement(query);
	      	          	preparedStmt.execute();
      			}
          		break;

  			default: htmlRespone += "<center><h2>Wrong Input</h2><br/></center>"; 
 
          }
          
          conn.close();
          htmlRespone += "</html>";
          writer.println(htmlRespone);
          htmlRespone="<br></a><br><br><a href='user.jsp'>"
          		+ "<button style=' line-height: 30px;"
          		+ " position: absolute; text-align: center; width: 10%;"
          		+ " background-color: #ffe599; -webkit-box-shadow: 1px 2px 5px rgba(0,0,0,.31);"
          		+ " -moz-box-shadow: 1px 2px 5px rgba(0,0,0,.31);box-shadow: 1px 2px 5px rgba(0,0,0,.31);"
          		+ " border: solid 3px #351c75; top:10; right:10;'>Back</button></a></center>";
          writer.println(htmlRespone);
        }
        catch (Exception e)
        {
          System.err.println("Got an exception!");
          System.err.println(e.getMessage());
        }       
    }
}
