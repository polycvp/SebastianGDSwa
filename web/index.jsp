<%-- 
    Document   : index
    Created on : Oct 15, 2014, 1:02:28 AM
    Author     : rvhaley
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sebastian GDS - Index</title>

        <script src="//code.jquery.com/jquery-1.10.2.js"></script>
        <script src="//code.jquery.com/ui/1.11.1/jquery-ui.js"></script>
        <link rel="stylesheet" href="/resources/demos/style.css">
        <script>
            $(function() {
                $("#datepicker").datepicker(
                        {dateFormat: 'dd/mm/yy'});
            });
        </script>
    </head>
    <body>
        <h1>Sebastian GDS - Index</h1>
        <br />
        <br />
        <form action="/SebastianGDSwa/ViewSchedule">
            <input type="submit" name="scheduleButton" value="View Schedule" />
            <input type="submit" name="bookingButton" value="Make Booking" />
            <input type="submit" name="viewButton" value="See a Booking" />
            <input type="submit" name="cancelButton" value="Cancel a Booking" />
            
            <br />
            <br />

            <p>Date: <input type="text" name="date" id="datepicker" /></p>
            <p>Airport 1: <input type="text" name="airport1" /></p>
            <p>Airport 2: <input type="text" name="airport2" /></p>
        </form>
    </body>
</html>
