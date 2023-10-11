package ArchitecrotySeminar4.onlineTicket;


import java.util.Date;

/**
 * Абстрактный класс, представляющий билет.
 */
// Абстрактный класс и наследование
abstract class Ticket implements TicketActions {
    String routeId;
    Date departureTime;
    double price;
}