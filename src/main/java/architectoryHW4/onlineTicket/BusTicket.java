package architectoryHW4.onlineTicket;

class BusTicket extends Ticket {
    int number;
    /**
     * Попытка забронировать билет.
     * @return true, если бронирование успешно, false в противном случае.
     * @pre User должен быть авторизован и выбран маршрут.
     * @pre Билеты на выбранный маршрут и время должны быть доступны.
     * @pre У пользователя должно быть достаточно средств для бронирования.
     * @post Билет забронирован.
     *
     * Этот метод позволяет пользователю попытаться забронировать билет на выбранный маршрут и время.
     * Для успешной бронировки необходимо выполнение следующих условий:
     * - Пользователь должен быть предварительно авторизован в системе (authorize).
     * - Пользователь должен выбрать конкретный маршрут и время (selectRoute).
     * - Должны быть доступны билеты на выбранный маршрут и время (checkTicketAvailability).
     * - У пользователя должно быть достаточно средств для бронирования (checkFunds).
     *
     * Если все предусловия выполняются, билет будет успешно забронирован, и метод вернет true.
     * В противном случае, если хотя бы одно из предусловий не выполняется, бронирование не будет произведено, и метод вернет false.
     */
    @Override
    public boolean reserveTicket() {
        // Реализация метода
        return false;
    }
    /**
     * Попытка списания средств
     * @return true, в случае наличия денежных средств на счёте пользователя достаточных для оплаты зарезервированного
     * билета, происходит списание денежных средств
     * @pre у пользователя должно быть достаточно средств на счёте для оплаты билета
     * @post списание средств
     */
    @Override
    public boolean deductFunds() {
        // Реализация метода
        return false;
    }

    @Override
    public boolean confirmPurchase() {
        // Реализация метода
        return false;
    }

    @Override
    public void updateTicketAvailability() {
        // Реализация метода
    }

    @Override
    public boolean cancelReservation() {
        // Реализация метода
        return false;
    }
}