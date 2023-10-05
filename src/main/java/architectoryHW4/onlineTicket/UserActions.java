package architectoryHW4.onlineTicket;

import java.util.Date;
/**
 * Компонент: UserActions
 * Версия: 1.0.0
 *
 * Описание: Этот компонент определяет контракты для действий пользователя.
 *
 * Изменения:
 * - 1.0.0: Первая версия.
 * - 1.1.0: Добавлена поддержка новой функциональности.
 */
interface UserActions {
    /**
     * Вход в систему для приобретения билетов
     * @param username имя пользователя
     * @param password пароль пользователя для входа в систему
     * @pre верно введён username
     * @pre верно введён password
     * @post Вход в систему
     * @return true, в случае правильно введённых username и password, false в противном случае.
     * <P>
     * Этот метод позволяет войти в систему для осуществления покупок билетов.
     * Если все предусловия выполняются, вход в систему будет осуществлён успешно, и метод вернет true.
     * В противном случае, если хотя бы одно из предусловий не выполняется, вход в систему не будет произведён, и метод
     * вернет false.
     */
    boolean authorize(String username, String password);

    /**
     * Выбор маршрута
     * @param routeId номер маршрута
     * @param time время отправления со станции
     * @pre верно введён routeId
     * @pre верно введено time
     * @return true, в случае правильно введённых routeId и time, false в противном случае.
     * <P>
     * Этот метод позволяет выбрать маршрут и время отправления.
     * Если все предусловия будут выполнены, маршрут будет выбран успешно, и метод вернет true.
     * В противном случае, если хотя бы одно из предусловий не выполняется, выбор маршрута не будет произведён, и метод
     * вернет false.
     */
    boolean selectRoute(String routeId, Date time);

    /**
     * Проверка наличия билетов по выбранному маршруту
     * @pre верно введён routeId
     * @pre верно введено time
     * @return true, в случае правильно введённых routeId и time, а также наличию свободных мест по выбранному маршруту,
     *  false в противном случае.
     * <P>
     * Этот метод позволяет определить наличие свободных мест по выбранному маршруту
     * Если все предусловия будут выполнены, а также по выбранному маршруту будут свободные места, метод вернет true.
     * В противном случае, если свободные места будут отсутствовать, метод вернет false.
     */
    boolean checkTicketAvailability();

    /**
     * Проверка наличия денежных средств на счёте пользователя
     * @return true, в случае наличия денежных средств на счёте пользователя достаточных для оплаты зарезервированного
     * билета, false в противном случае.
     * @pre введён routeId, стоимость билета зависит от выбранного маршрута
     * @pre У пользователя должно быть достаточно средств на счёте для оплаты билета по выбранному маршруту
     * @post доступ к возможности зарезервировать билет.
     * <P>
     *     Этот метод позволяет определить, есть ли денежные средства для приобретения билета
     *     Если все предусловия выполняются, метод вернёт true.
     *     В противном случае, если хотя бы одно из предусловий не выполняется, метод вернет false.
     */
    boolean checkFunds();
}