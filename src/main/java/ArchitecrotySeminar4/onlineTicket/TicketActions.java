package ArchitecrotySeminar4.onlineTicket;

interface TicketActions {
    boolean reserveTicket();
    boolean deductFunds();
    boolean confirmPurchase();
    void updateTicketAvailability();
    boolean cancelReservation();
}
