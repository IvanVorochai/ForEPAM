package module6.task3.server.util;

import module6.task3.server.bean.Student;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLStreamException;
import java.io.IOException;
import java.util.List;

public class StudentRedaction {
    public static List<Student> xmlRedaction(String path, int id, int whereRedactionField, String newField)
            throws IOException, XMLStreamException, ParserConfigurationException, SAXException {

        List<Student> studentList = StudentReader.xmlParser(path);

        for (Student student : studentList) {
            if (id == student.getId()) {
                switch (whereRedactionField) {
                    case 1:
                        student.setSurname(newField);
                        break;
                    case 2:
                        student.setFirstName(newField);
                        break;
                    case 3:
                        student.setAdditionalName(newField);
                        break;
                    case 4:
                        student.setBirthday(newField);
                        break;
                    case 5:
                        student.setStudentCase(newField);
                        break;
                }
            }
        }
//        сохраняем коллекцию в xml
        StudentWriter.xmlWriteStudents(path, studentList);
//        читаем заново сохраненную коллекцию
        return StudentReader.xmlParser(path);
    }
}