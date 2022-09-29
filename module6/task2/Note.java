package module6.task2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

//Задание 2. Блокнот. Разработать консольное приложение, работающее с Заметками в Блокноте. Каждая Заметка это:
// Заметка (тема, дата создания, e-mail, сообщение).
//Общие пояснения к практическому заданию.
//• В начале работы приложения данные должны считываться из файла, в конце работы – сохраняться в файл.
//• У пользователя должна быть возможность найти запись по любому параметруили по группе параметров (группу параметров
// можно определить самостоятельно), получить требуемые записи в отсортированном виде, найтизаписи, текстовое поле
// которой содержит определенное слово, а также добавить новую запись.
//• Особое условие: поиск, сравнение и валидацию вводимой информации осуществлять с использованием регулярных выражений.
//• Особое условие: проверку введенной информации на валидность должен осуществлять код, непосредственно добавляющий
// информацию.
public class Note {
    private String topic;
    private LocalDateTime dateOfCreate;
    private String emailAddress;
    private String message;

    public Note() {
    }

    public Note(String topic, String emailAddress, String massage) {
        this.topic = topic;
        this.dateOfCreate = LocalDateTime.now();
        this.message = massage;
        this.emailAddress = emailAddress;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public LocalDateTime getDateOfCreate() {
        return dateOfCreate;
    }

    public void setDateOfCreate(LocalDateTime dateOfCreate) {
        this.dateOfCreate = dateOfCreate;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");
        return
                topic + ";" +
                        emailAddress + ";" +
                        message + ";" +
                        dateOfCreate.format(formatter);
    }
}
