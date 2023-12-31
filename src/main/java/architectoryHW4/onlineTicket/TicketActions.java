package architectoryHW4.onlineTicket;

public interface TicketActions {
    /**
     * Попытка забронировать билет.
     * @return true, если бронирование успешно, false в противном случае.
     * @pre User должен быть авторизован и выбран маршрут.
     * @pre Билеты на выбранный маршрут и время должны быть доступны.
     * @pre У пользователя должно быть достаточно средств для бронирования.
     * @post Билет забронирован.
     *<P>
     * Этот метод позволяет пользователю попытаться забронировать билет на выбранный маршрут и время.
     * Для успешной бронировки необходимо выполнение следующих условий:
     * - Пользователь должен быть предварительно авторизован в системе (authorize).
     * - Пользователь должен выбрать конкретный маршрут и время (selectRoute).
     * - Должны быть доступны билеты на выбранный маршрут и время (checkTicketAvailability).
     * - У пользователя должно быть достаточно средств для бронирования (checkFunds).
     *<P>
     * Если все предусловия выполняются, билет будет успешно забронирован, и метод вернет true.
     * В противном случае, если хотя бы одно из предусловий не выполняется, бронирование не будет произведено, и метод
     * вернет false.
     */
    boolean reserveTicket();

    /**
     * Попытка списания средств
     * @return true, в случае наличия денежных средств на счёте пользователя достаточных для оплаты зарезервированного
     * билета, происходит списание денежных средств, false в противном случае.
     * @pre У пользователя должно быть достаточно средств на счёте для оплаты билета
     * @post Списание средств
     * <P>
     *     Этот метод позволяет списать денежные средства за приобретённый билет
     *     Если все предусловия выполняются, списание средств будет успешным, и метод вернёт true.
     *     В противном случае, если хотя бы одно из предусловий не выполняется, списание не будет произведено, и метод
     *     вернет false.
     */
    boolean deductFunds();

    /**
     * Подтверждение покупки билета
     * @return true, в случае списания средств со счёта пользователя происходит подтверждение о списании денежных средств
     * и приобретении билета, false в противном случае.
     * @pre Списание средств прошло успешно.
     * @post Подтверждение о приобретении билета(ов)
     * <P>
     *     Этот метод позволяет подтвердить списание денежных средств за приобретённый билет, а так же приобретение
     *     билета(ов)
     *<P>
     *     Если все предусловия выполняются, подтверждение о покупке будет успешным, и метод вернёт true.
     *     В противном случае, если хотя бы одно из предусловий не выполняется, подтверждение о покупке не будет
     *     произведено, и метод вернет false.
     */
    boolean confirmPurchase();

    /**
     * Обновление информации о доступности билета
     * В случае списания средств со счёта пользователя обновляется информация о доступных билетах маршруту.
     * @pre Списание средств прошло успешно.
     * @post Обновление информации о доступности билетов
     * <P>
     *     Этот метод позволяет обновить информацию о доступных билетах
     *<P>
     *     Если все предусловия выполняются, обновится информация о доступных билетах.
     *     В противном случае, если хотя бы одно из предусловий не выполняется, обновления информации не произойдёт
     */
    void updateTicketAvailability();

    /**
     * Отмена резервирования билета
     * @return true, если отмена резервирования успешно, false в противном случае.
     * @pre У пользователя нет достаточных средств на счёте для оплаты билета
     * @post Отмена резервирования билета(ов)
     * <P>
     *     Этот метод позволяет отменить резервирование билета для дальнейшей доступности другим пользователям
     *     В случае отсутствия средств на счёте пользователя достаточных для приобретения билета или решении
     *     пользователя об отмене покупки билета происходит отмена резервирования билета
     *<P>
     *     Если все предусловия выполняются, отмена резервирования билета будет выполнена
     *     В противном случае, если хотя бы одно из предусловий не выполняется, отмена резервирования билета не будет
     *     произведено, и метод вернет false.
     */
    boolean cancelReservation();
}
