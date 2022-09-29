package module6.task3.server.bean;

public class Student {
    private final long id;
    private String surname;
    private String firstName;
    private String additionalName;
    private String birthday;
    private String studentCase;

    public Student(String surname, String firstName, String additionalName, String birthday, String studentCase) {
        this(-1, surname, firstName, additionalName, birthday, studentCase);
    }

    public Student(long id, String surname, String firstName, String additionalName, String birthday, String studentCase) {
        this.id = id;
        this.surname = surname;
        this.firstName = firstName;
        this.additionalName = additionalName;
        this.birthday = birthday;
        this.studentCase = studentCase;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getAdditionalName() {
        return additionalName;
    }

    public void setAdditionalName(String additionalName) {
        this.additionalName = additionalName;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getStudentCase() {
        return studentCase;
    }

    public void setStudentCase(String studentCase) {
        this.studentCase = studentCase;
    }

    public long getId() {
        return id;
    }


    @Override
    public String toString() {
        return "id " + id +
                ", student " + surname +
                " " + firstName +
                " " + additionalName +
                ", birthday " + birthday +
                ", studentCase " + studentCase;

    }
}