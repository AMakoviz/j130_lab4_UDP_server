### **README для серверной части (UDP Server)**   

# UDP Server — Серверная часть сетевого приложения

Этот проект представляет собой **серверную часть** UDP-приложения, принимающего текстовые сообщения от клиента и отправляющего ответ с отметкой времени.

## Функциональность
- Ожидание сообщений от клиента через **UDP**.
- Фиксация времени приёма сообщений.
- Отправка ответа клиенту с временной меткой.

## Установка и запуск
### 1️ **Клонирование репозитория**
```sh
git clone https://github.com/AMakoviz/j130_lab4_UDP_server.git
cd j130_lab4_UDP_server
```

### 2️ **Сборка проекта**
Проект использует Maven, поэтому для сборки выполните команду:

```sh
mvn clean package
```

### 3️ **Запуск сервера**
```sh
java -jar target/udp-server.jar <port>
```

Пример:

```sh
java -jar target/udp-server.jar 9876
```
Здесь:
9876 — порт, на котором сервер будет ожидать соединения.

## **Технологии**
- Java SE 8+
- UDP (DatagramSocket)
- Maven

## **Лицензия**
Этот проект распространяется под лицензией MIT.

Разработчик: Анастасия Маковиз

Контакты: chanas98@gmail.com
