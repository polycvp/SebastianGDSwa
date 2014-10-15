<%-- 
    Document   : selectSchedule
    Created on : Oct 15, 2014, 6:51:51 AM
    Author     : rvhaley
--%>

<%@ include file="header.jsp" %>

<div class="pageTitleDiv">
    <h2 class="pageTitle"> - Select a Schedule - </h2>
</div>

<form action="/SebastianGDSwa/ViewSchedule">
    <!--input type="submit" name="scheduleButton" value="View Schedule" />
    <input type="submit" name="bookingButton" value="Make Booking" />
    <input type="submit" name="viewButton" value="See a Booking" />
    <input type="submit" name="cancelButton" value="Cancel a Booking" /-->

    <table border="1" cellpadding="5" cellspacing="5">
        <tr>
            <th class="scheduleTableSides">Date: </th>
            <td><input type="text" name="date" id="datepicker" /></td>
        </tr>
        <tr>
            <th class="scheduleTableSides">Starting Airport: </th>
            <td><input type="text" id="airport1" name="airport1" /></td>
        </tr>
        <tr>
            <th class="scheduleTableSides">Destination Airport: </th>
            <td><input type="text" id="airport2" name="airport2" /></td>
        </tr>
    </table>
    
    <br />
    
    <input type="submit" name="scheduleButton" id="scheduleSelect" value="Show Schedule" />
    
</form>

<script src="js/index.js" type="text/javascript"></script>
<script src="js/airportCodes.js" type="text/javascript"></script>

<%@ include file="footer.jsp" %>
