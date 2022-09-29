package module6.task3.server.util;

import module6.task3.server.bean.Account;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class AccountWriter {
    public static void xmlWriteNewAccount(String path, Account account)
            throws IOException, XMLStreamException, ParserConfigurationException, SAXException {

        List<Account> accountList = AccountReader.xmlParser(path);
        XMLOutputFactory factory = XMLOutputFactory.newFactory();
        XMLStreamWriter writer = factory.createXMLStreamWriter(new FileOutputStream(path));

        accountList.add(new Account(account.isAdmin(), account.getLogin(), account.getPassword()));

        writer.writeStartDocument("UTF-8", "1.0");
        writer.writeStartElement("accounts");
        for (Account acc : accountList) {
            writer.writeStartElement("account");
            writer.writeAttribute("admin", String.valueOf(acc.isAdmin()));

            writer.writeStartElement("login");
            writer.writeCharacters(acc.getLogin());
            writer.writeEndElement();

            writer.writeStartElement("password");
            writer.writeCharacters(acc.getPassword());
            writer.writeEndElement();
            writer.writeEndElement();
        }
        writer.writeEndElement();
        writer.writeEndDocument();
    }
}
