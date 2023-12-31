package HomeWork4;
# Задание 1

1)  Почему использование тестовых заглушек может быть полезным при написании модульных тестов?

Использование тестовых заглушек может быть полезным при написании модульных тестов, так как они
позволяют изолировать тестируемый код от его зависимостей. Тестовые заглушки можно использовать
для имитации объектов, которые можно вызывать или с которыми можно взаимодействовать,
чтобы проверить правильность работы кода в различных сценариях.

2) Какой тип тестовой заглушки следует использовать, если вам нужно проверить, что метод был вызван с определенными аргументами?

Для проверки, что метод был вызван с определенными аргументами, можно использовать моки (mocks). 
Моки позволяют настроить ожидаемое поведение для вызовов методов и проверить, был ли метод вызван с определенными аргументами.

3) Какой тип тестовой заглушки следует использовать, если вам просто нужно 
вернуть определенное значение или исключение в ответ на вызов метода?

Если вам просто нужно вернуть определенное значение или исключение в ответ на вызов метода, 
можно использовать заглушки (stubs). Заглушки предоставляют фиктивную реализацию метода, 
которая возвращает предопределенное значение или генерирует исключение.

4) Какой тип тестовой заглушки вы бы использовали для имитации  взаимодействия с внешним API или базой данных?

Для имитации взаимодействия с внешним API или базой данных рекомендуется использовать 
фейковые объекты (fakes) или специальные тестовые двойники (test doubles), такие как встроенные 
в фреймворки моки или заглушки. Фейковые объекты обычно предоставляют более простую 
и контролируемую реализацию внешних зависимостей для использования в тестах.