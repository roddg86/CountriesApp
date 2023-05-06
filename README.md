# Countries App

В приложении можно найти информацию о странах

Используя Rest api, и библиотеку для работы с сетью Retrofit получаем данные с сервера в формате Json.
converter-gson - автоматически конвертируем данные Json в удобный для нас формат который мы описали в Kotlin.
Подключаем coroutines коррутин для создания фонового потока, что-бы основной поток не завис.
И используем coil библиотеку для загрузки картинок в формате svg.

![](app/src/main/res/drawable-v24/screenshot.jpg)
![](app/src/main/res/drawable-v24/screenshot2.jpg)
![](app/src/main/res/drawable-v24/screenshot3.jpg)
![](app/src/main/res/drawable-v24/screenshot4.jpg)
![](app/src/main/res/drawable-v24/screenshot5.jpg)