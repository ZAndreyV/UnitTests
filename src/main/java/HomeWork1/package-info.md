В классе Calculator создан метод calculateDiscount, который принимает сумму покупки и процент скидки и возвращает сумму с учетом скидки.
Если передаются недопустимые аргументы, метод выбрасывает исключение ArithmeticException.

Для проверки метода calculateDiscount написаны тесты:

- testCalculateDiscountValidArguments проверяет корректность расчета скидки при передаче допустимых аргументов;
- testCalculateDiscountZeroPurchaseAmount проверяет, что метод выбрасывает исключение при передаче нулевой суммы покупки;
- testCalculateDiscountNegativeDiscountPercentage проверяет, что метод выбрасывает исключение при передаче отрицательного процента скидки;
- testCalculateDiscountExceeds100DiscountPercentage проверяет, что метод выбрасывает исключение при передаче процента скидки больше 100.

Для удобства проверки используется библиотека AssertJ.