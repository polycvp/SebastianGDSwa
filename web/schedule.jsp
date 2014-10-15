<%-- 
    Document   : home
    Created on : Oct 14, 2014, 6:43:57 PM
    Author     : rvhaley
--%>

<%@ include file="header.jsp" %>

<h2> - Schedule - </h2>
<br />
<br />

<table border="1">
    <tr>
        <th>Departure</th>
        <th>Arrival</th>
        <th>Carrier Code</th>
        <th>Seats</th>
    </tr>
    <c:forEach var="schedule" items="${schedules}" varStatus="counter">
        <tr>
            <th>
                <fmt:formatDate type="both" dateStyle="long" timeStyle="long" value="${schedule.departureDate}" />
            </th>
            <th>
                <fmt:formatDate type="both" dateStyle="long" timeStyle="long" value="${schedule.arrivalDate}" />
            </th>
            <th>${schedule.carrierCode}</th>
            <th>${schedule.noOfFreeSeats}</th>
        </tr>
    </c:forEach>
</table>

<%@ include file="footer.jsp" %>