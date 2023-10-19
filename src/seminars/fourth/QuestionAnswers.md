1. Почему использование тестовых заглушек может быть полезным при написании модульных тестов?

Использование тестовых заглушек может быть полезным при написании модульных тестов, так как они позволяют контролировать и изолировать поведение зависимостей модуля. Заглушки могут заменить вызовы реальных объектов или функций и возвращать предопределенные значения или симулировать определенное поведение. Это позволяет проверить логику модуля независимо от его зависимостей, что делает тесты более надежными и предсказуемыми.
2. Какой тип тестовой заглушки следует использовать, если вам нужно проверить, что метод был вызван с определенными аргументами?

Для проверки, что метод был вызван с определенными аргументами, следует использовать заглушки-шпионы. Шпионы регистрируют вызовы метода и сохраняют переданные аргументы, что позволяет в дальнейшем проверить их корректность. Шпионы также могут возвращать предопределенные значения или выбрасывать исключения при вызове.
3. Какой тип тестовой заглушки следует использовать, если вам просто нужно вернуть определенное значение или исключение в ответ на вызов метода?

Для простого возврата определенного значения или исключения в ответ на вызов метода следует использовать заглушки-заменители (моки). Моки предоставляют замену реального объекта или функции и предопределяют, как они должны вести себя при вызове. Моки могут возвращать заданные значения, выбрасывать исключения или выполнять другие определенные действия.
4. Какой тип тестовой заглушки вы бы использовали для имитации взаимодействия с внешним API или базой данных?

Для имитации взаимодействия с внешним API или базой данных следует использовать заглушки-дублеры. Дублеры представляют собой замену реальных зависимостей, которые взаимодействуют с внешними ресурсами, и могут имитировать их поведение. Дублеры могут быть настроены для возврата предопределенных данных или выполнения определенных действий без фактического обращения к ресурсам. Это позволяет тестировать логику взаимодействия с внешними системами независимо от их доступности или состояния.