package module6.task3.server.bean;

import java.util.List;

public class Archive {
    private List<Student> studentList;

    public Archive() {
    }

    public Archive(List<Student> studentList) {
        this.studentList = studentList;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public String toString() {
        return "Archive{" +
                "studentList=" + studentList +
                '}';
    }
}
