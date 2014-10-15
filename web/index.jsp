<%-- 
    Document   : index
    Created on : Oct 15, 2014, 1:02:28 AM
    Author     : rvhaley
--%>

<%@ include file="header.jsp" %>

<div class="pageTitleDiv">
    <h2> - Index - </h2>
</div>
<br />
<br />
<form action="/SebastianGDSwa/ViewSchedule">
    <input type="submit" name="scheduleButton" value="View Schedule" />
    <input type="submit" name="bookingButton" value="Make Booking" />
    <input type="submit" name="viewButton" value="See a Booking" />
    <input type="submit" name="cancelButton" value="Cancel a Booking" />

    <br />
    <br />
    <br />

    <table border="1" cellpadding="5" cellspacing="5">
        <tr>
            <th class="scheduleTableSides">Date: </th>
            <td><input type="text" name="date" id="datepicker" /></td>
        </tr>
        <tr>
            <th class="scheduleTableSides">Starting Airport: </th>
            <td><input type="text" name="airport1" /></td>
        </tr>
        <tr>
            <th class="scheduleTableSides">Destination Airport: </th>
            <td><input type="text" name="airport2" /></td>
        </tr>
    </table>
    <!--p>Date: <input type="text" name="date" id="datepicker" /></p>
    <p>Airport 1: <input type="text" name="airport1" /></p>
    <p>Airport 2: <input type="text" name="airport2" /></p-->
</form>

<script src="js/index.js" type="text/javascript"></script>

<%@ include file="footer.jsp" %>
