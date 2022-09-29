package module6.task3.server.util;

import module6.task3.server.bean.Account;
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

public class AccountReader {
    private static final List<Account> accountList1 = new ArrayList<>();

    public static List<Account> xmlParser(String path) throws ParserConfigurationException, SAXException, IOException {
       accountList1.clear();
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser = factory.newSAXParser();
        AdvancedXMLHandler handler = new AdvancedXMLHandler();  //ссылаемся на класс handler
        parser.parse(new File(path), handler);                  //парсим файл
        return accountList1;
    }

    public static class AdvancedXMLHandler extends DefaultHandler {
        String lastElement;
        private boolean admin;
        private String login;
        private String password;

        @Override
        public void startElement(String uri, String localName, String qName, Attributes attributes) {
            lastElement = qName;
            if (qName.equals("account")) {
                admin = Boolean.parseBoolean(attributes.getValue("admin"));
            }
        }

        @Override
        public void characters(char[] ch, int start, int length) {
            String information = new String(ch, start, length);

            information = information.replace("\n", "").trim();

            if (!information.isEmpty()) {
                if (lastElement.equals("login")) {
                    login = information;
                }
                if (lastElement.equals("password")) {
                    password = information;
                }
            }
        }

        @Override
        public void endElement(String uri, String localName, String qName) {
            if ((login != null && !login.isEmpty()) && ((password != null && !password.isEmpty()))) {

                accountList1.add(new Account(admin, login, password));
                admin = false;
                login = null;
                password = null;
            }
        }
    }
}
