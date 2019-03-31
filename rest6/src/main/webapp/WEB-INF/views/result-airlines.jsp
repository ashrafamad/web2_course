<html>
<head>
<title>TRAVELX</title>
<style>
table, th, td {
  border: 1px solid black;
  border-collapse: collapse;
}
th, td {
  padding: 5px;
}
th {
  text-align: left;
}
</style>
</head>
<body>

<table style="width:100%">
  <tr>
    <th>Airline-id</th>
      <th>Airline-lcc</th>
       <th>Airline-Name</th> 
  </tr>
<tr>

<%@ page import="airlinesAPIdata.MyPojoAirlines" %>
<%

MyPojoAirlines[] api_airlines = (MyPojoAirlines[])request.getAttribute("api_airlines");


for (int i = 0; i < api_airlines.length; i++) {
    out.print("<td>" + api_airlines[i].getId() + "</td>");
    out.print("<td>" + api_airlines[i].getLcc() + "</td>");
    out.print("<td>" + api_airlines[i].getName() + "</td>");
    out.print("</tr>");
 }
     
   
%>
</table>
</body>
</html>