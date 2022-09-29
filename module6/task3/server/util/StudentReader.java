package module6.task3.server.util;

import module6.task3.server.bean.Student;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StudentReader {
    public static List<Student> studentList1 = new ArrayList<>();

    public static List<Student> xmlParser(String path) throws ParserConfigurationException, SAXException, IOException {
        studentList1.clear();
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser = factory.newSAXParser();

        AdvancedXMLHandler handler = new AdvancedXMLHandler();  //ссылаемся на класс handler
        parser.parse(new File(path), handler);                  //парсим файл

        return studentList1;
    }

    public static Student xmlParserId(String path, long id) throws ParserConfigurationException, SAXException, IOException {
        List<Student> studentList1 = xmlParser(path);
        for (Student student : studentList1) {
            if (id == student.getId()) {
                return student;
            }
        }
        return null;
    }

    public static class AdvancedXMLHandler extends DefaultHandler {
        private long id;
        private String surname;
        private String firstName;
        private String additionalName;
        private String birthday;
        private String studentCase;
        private String lastElement;

        @Override
        public void startElement(String uri, String localName, String qName, Attributes attributes) {
            lastElement = qName;
//            System.out.println(attributes.getIndex("id") +" ");
            if (qName.equals("student")) {
                id = Long.parseLong(attributes.getValue("id"));
            }
        }

        @Override
        public void characters(char[] ch, int start, int length) {
            String information = new String(ch, start, length);

            information = information.replace("\n", "").trim();

            if (!information.isEmpty()) {
                if (lastElement.equals("surname")) {
                    surname = information;
                }
                if (lastElement.equals("firstName")) {
                    firstName = information;
                }
                if (lastElement.equals("additionalName")) {
                    additionalName = information;
                }
                if (lastElement.equals("birthday")) {
                    birthday = information;
                }
                if (lastElement.equals("studentCase")) {
                    studentCase = information;
                }
            }
        }

        @Override
        public void endElement(String uri, String localName, String qName) {
            if ((surname != null && !surname.isEmpty()) && ((firstName != null && !firstName.isEmpty())) &&
                    ((additionalName != null && !additionalName.isEmpty())) &&
                    ((birthday != null && !birthday.isEmpty())) && ((studentCase != null && !studentCase.isEmpty()))) {

                studentList1.add(new Student(id, surname, firstName, additionalName, birthday, studentCase));
                id = -1L;
                surname = null;
                firstName = null;
                additionalName = null;
                birthday = null;
                studentCase = null;
            }
        }
    }
}
