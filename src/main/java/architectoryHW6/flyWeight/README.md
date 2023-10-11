## Паттерн Flyweight(Легковес)
****
**Flyweight** — это один из паттернов проектирования, который может использоваться 
для оптимизации работы программы. Этот паттерн направлен на уменьшение количества 
создаваемых объектов путем использования уже созданных экземпляров схожих объектов.

Предположим, что у нас есть большое количество объектов, которые имеют похожие 
свойства, но отличаются друг от друга лишь в некоторых параметрах. В данной 
ситуации создание отдельного объекта для каждого такого случая может привести 
к значительному потреблению памяти и негативно отразиться на производительности 
программы. Паттерн **Flyweight** позволяет решить эту проблему, разделив объект на 
две части — внутреннее и внешнее состояние.

* **Внутреннее состояние (intrinsic state)** — это те свойства объекта, которые меняться 
не будут. То есть, если мы создали один экземпляр объекта с определенным внутренним 
состоянием, то мы можем использовать его повторно для других объектов с таким же 
внутренним состоянием.

* **Внешнее состояние (extrinsic state)** — это те свойства объекта, которые будут 
изменяться от объекта к объекту. Например, мы можем иметь множество объектов, 
которые имеют похожую форму, но отличаются цветом или размером.

Таким образом паттерн **Flyweight** позволяет оптимизировать работу программы, 
используя меньше памяти и обеспечивая более быстрое выполнение.

Для реализации паттерна **Flyweight** в Java необходимо создать **интерфейс** или 
**абстрактный класс**, определяющий методы для работы с объектом. Затем создаем 
**конкретный класс (ConcreteFlyweight)**, который реализует методы интерфейса 
абстрактного класса и содержит внутреннее состояние. Стоит отметить, что этот 
класс может быть многоразово использован.

Далее необходимо создать **фабрику**, которая будет создавать и возвращать объекты. 
В зависимости от параметров, переданных в фабрику, она может создавать новый 
объект или возвращать уже существующий, если объект с такими параметрами уже 
был создан ранее.

Кроме того, необходимо создать **класс Client**, который будет использовать фабрику 
для создания объектов и настройки их внешнего состояния.

В данном примере мы создаем интерфейс IAnimal, который содержит метод zoo(). 
Затем создаём классы Dog и Cat, которые реализуют метод zoo() интерфейса IAnimal и 
содержат внутреннее состояние объекта ("System.out.println()").

Для создания фабрики используем класс FactoryAnimal, который создает объекты только 
в том случае, если они еще не были созданы. Если же объект уже создан, то фабрика 
возвращает ссылку на этот уже созданный объект.

Класс Main — это наш клиентский код, который использует фабрику для 
создания объектов и задания их внешнего состояния.

Преимущества использования **Flyweight** в Java

Паттерн Flyweight позволяет значительно сократить количество создаваемых объектов, 
и следовательно, потребляемую ими память. Меньше объектов означает меньше вызовов 
сборщика мусора и более быструю работу программы.

Однако, паттерн **Flyweight** также может привести к усложнению вычислений и увеличению 
времени выполнения. Если объект будет часто изменять свое внешнее состояние, это 
может создавать дополнительные расходы на обновление объектов.

Кроме того, если нет гарантий, что объекты будут иметь только определенные 
комбинации внешнего и внутреннего состояния, использование паттерна **Flyweight** 
может быть невозможно.

### В заключение

**Flyweight** — это действительно полезный паттерн проектирования, который может 
помочь оптимизировать работу вашей программы. Но важно помнить о том, что его 
использование не всегда оправдано, и что нужно провести анализ ситуации, прежде 
чем решить, подойдет ли этот паттерн для решения ваших задач.