package architectoryHW4.onlineTicket;
import java.util.Date;

abstract class Ticket implements TicketActions {
    String routeId;
    Date departureTime;
    double price;
}
