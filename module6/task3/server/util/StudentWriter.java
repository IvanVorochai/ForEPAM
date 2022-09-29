package module6.task3.server.util;

import module6.task3.server.bean.Student;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class StudentWriter {

    public static void xmlWriteNewStudent(String path,
                                          Student student) throws IOException, XMLStreamException, ParserConfigurationException, SAXException {
        List<Student> studentList = StudentReader.xmlParser(path);
        XMLOutputFactory factory = XMLOutputFactory.newFactory();
        XMLStreamWriter writer = factory.createXMLStreamWriter(new FileOutputStream(path));

        long newId = studentList.size() + 1;

        studentList.add(new Student(newId, student.getSurname(), student.getFirstName(), student.getAdditionalName(),
                student.getBirthday(), student.getStudentCase()));

        writer.writeStartDocument("UTF-8", "1.0");
        writer.writeStartElement("students");
        for (Student st : studentList) {
            writer.writeStartElement("student");
            writer.writeAttribute("id", String.valueOf(st.getId()));

            writer.writeStartElement("surname");
            writer.writeCharacters(st.getSurname());
            writer.writeEndElement();

            writer.writeStartElement("firstName");
            writer.writeCharacters(st.getFirstName());
            writer.writeEndElement();

            writer.writeStartElement("additionalName");
            writer.writeCharacters(st.getAdditionalName());
            writer.writeEndElement();

            writer.writeStartElement("birthday");
            writer.writeCharacters(st.getBirthday());
            writer.writeEndElement();

            writer.writeStartElement("studentCase");
            writer.writeCharacters(st.getStudentCase());
            writer.writeEndElement();
            writer.writeEndElement();
        }
        writer.writeEndElement();
        writer.writeEndDocument();
    }

    public static void xmlWriteStudents(String path, List<Student> studentList) throws IOException, XMLStreamException {
        XMLOutputFactory factory = XMLOutputFactory.newFactory();
        XMLStreamWriter writer = factory.createXMLStreamWriter(new FileOutputStream(path));

        writer.writeStartDocument("UTF-8", "1.0");
        writer.writeStartElement("students");
        for (Student st : studentList) {
            writer.writeStartElement("student");
            writer.writeAttribute("id", String.valueOf(st.getId()));

            writer.writeStartElement("surname");
            writer.writeCharacters(st.getSurname());
            writer.writeEndElement();

            writer.writeStartElement("firstName");
            writer.writeCharacters(st.getFirstName());
            writer.writeEndElement();

            writer.writeStartElement("additionalName");
            writer.writeCharacters(st.getAdditionalName());
            writer.writeEndElement();

            writer.writeStartElement("birthday");
            writer.writeCharacters(st.getBirthday());
            writer.writeEndElement();

            writer.writeStartElement("studentCase");
            writer.writeCharacters(st.getStudentCase());
            writer.writeEndElement();
            writer.writeEndElement();
        }
        writer.writeEndElement();
        writer.writeEndDocument();
    }
}