## Содержание
1. Предусловия.\
2. Постусловия.\
3. Инвариант.\
4. Определить абстрактные и конкретные классы.\
5. Определить интерфейсы.\
6. Реализовать наследование.\
7. Выявить компоненты.\
8. Разработать Диаграмму компонент использую нотацию UML 2.0. Общая без деталей.\
9. Определить алгоритм взаимодействия Группы 1 и Группы 2 – разработать контракт.\
10. Посчитать Метрики абстрактности компонент.\
11. Присвоить компонентам версию по принципу SemVer\

## Покупка онлайн билетов на автобус в час пик.
### Предусловия:

Авторизация пользователя: Пользователь должен быть авторизован в системе, чтобы иметь
возможность покупки билетов. Это может включать в себя вход с использованием имени 
пользователя и пароля или других методов аутентификации.

Выбор маршрута и времени: Пользователь должен иметь возможность выбрать конкретный 
маршрут и время отправления. Это означает, что система должна предоставить 
пользователю доступ к списку доступных маршрутов и расписанию.

Доступность билетов: Перед покупкой система должна проверить доступность билетов на 
выбранный маршрут и время. Если билеты распроданы, пользователю должно быть сообщено 
об этом.

Наличие средств: Пользователь должен иметь достаточное количество средств на своем 
счете или выбрать удобный метод оплаты.

### Постусловия:

Бронирование билета: После успешной операции покупки, система должна забронировать 
выбранный билет на маршрут и время для пользователя. Это гарантирует, что билет не 
будет доступен для других пользователей.

Списание средств: Если операция прошла успешно, система должна учесть средства 
пользователя и списать стоимость билета.

Подтверждение покупки: Пользователь должен получить подтверждение о покупке, которое 
может включать в себя электронный билет или уведомление о покупке.

Обновление доступности билетов: Система должна обновить доступность билетов для 
данного маршрута и времени, чтобы отразить бронирование.

Отмена бронирования (при необходимости): Если пользователь отменяет операцию 
покупки, система должна освободить забронированный билет и вернуть средства на счет 
пользователя.
---
### Инварианты
Инварианты (Invariants) - это условия, которые должны быть истинными на протяжении 
выполнения операции или в каком-то состоянии системы. В вашей диаграмме есть два 
инварианта:

User --[invariant]-> User : Funds >= 0 - это инвариант для пользователя (User). 
Он гарантирует, что сумма средств на счете пользователя (Funds) не может быть 
отрицательной. Это важно, чтобы предотвратить отрицательный баланс на счете 
пользователя.

BusTicket --[invariant]-> BusTicket : Price > 0 - это инвариант для объекта BusTicket.
Он гарантирует, что цена билета (Price) всегда больше нуля. Это важно, чтобы 
предотвратить создание билетов с неправильной ценой.

Инварианты всегда пишутся в конце.

### Определить абстрактные и конкретные классы.\

### Определить интерфейсы.\

### Реализовать наследование.\

## Оценка абстрактности
Оценка абстрактности: Подсчитайте метрику абстрактности для вашей системы на основе созданных интерфейсов и абстрактных классов. Определите, какой процент компонентов является абстрактными.

Для оценки абстрактности вашей системы на основе UML-диаграммы классов, вы можете использовать следующий подход:

Подсчет компонентов: Определите общее количество компонентов в вашей системе. Это включает в себя классы и интерфейсы.

Подсчет абстрактных компонентов: Определите, сколько из этих компонентов являются абстрактными. Абстрактные компоненты включают в себя интерфейсы и абстрактные классы.

Вычисление метрики: Для вычисления метрики абстрактности используйте следующую формулу:

Метрика абстрактности = (Количество абстрактных компонентов / Общее количество компонентов) * 100%

Например, если у вас есть 4 компонента, и из них 2 абстрактных (1 интерфейс и 1 абстрактный класс), то метрика абстрактности будет:

Метрика абстрактности = (2 / 4) * 100% = 50%

Это означает, что 50% компонентов в вашей системе являются абстрактными.

Оценка абстрактности полезна, так как она может указать на степень абстракции и гибкости вашей системы. Большая метрика абстрактности может указывать на более гибкую и расширяемую

Конечно, давайте подсчитаем метрику абстрактности для вашей системы на основе приведенного примера с семинара:

Подсчет компонентов:

Ваша система включает в себя следующие компоненты:

UserActions (интерфейс)
TicketActions (интерфейс)
User (класс)
Ticket (абстрактный класс)
BusTicket (класс)
Main (класс)
Всего 6 компонентов.

Подсчет абстрактных компонентов:

Ваша система имеет следующие абстрактные компоненты:

UserActions (интерфейс)
TicketActions (интерфейс)
Ticket (абстрактный класс)
Всего 3 абстрактных компонента.

Вычисление метрики:

Теперь мы можем вычислить метрику абстрактности:

Метрика абстрактности = (3 / 6) * 100% = 50%

Это означает, что 50% компонентов в вашей системе являются абстрактными.

Итак, в данной системе 50% компонентов являются абстрактными. Это довольно хороший баланс между абстракцией и конкретной реализацией.