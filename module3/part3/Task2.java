package module3.part3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


//Напишите анализатор, позволяющий последовательно возвращать содержимое узлов xml-документа и его тип (открывающий
//тег, закрывающий тег, содержимое тега, тег без тела). Пользоваться готовыми парсерами XML для решения данной задачи
//нельзя.
//<notes>
// <note id = "1">
// <to>Вася</to>
// <from>Света</from>
// <heading>Напоминание</heading>
// <body>Позвони мне завтра!</body>
// </note>
// <note id = "2">
// <to>Петя</to>
// <from>Маша</from>
// <heading>Важное напоминание</heading>
// <body/>
// </note>
//</notes>
public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
        String separator = File.separator;
        String path = "c:" + separator + "Users" + separator + "User" + separator + "IdeaProjects" + separator +
                "untitled" + separator + "src" + separator + "module3" + separator + "part3" + separator + "note.xml";

        File file = new File(path);

        Scanner scanner = new Scanner(file);
        Pattern pattern = Pattern.compile("(<\\w+>|<\\w+.id.+>)|(</\\w+>)|([\\wа-яА-Я.,:;!?]+)|(<\\w+/>)");

        while (scanner.hasNextLine()) {
            Matcher matcher = pattern.matcher(scanner.nextLine());
            while (matcher.find()) {
                if (matcher.group(1) != null) {
                    System.out.println(matcher.group(1) + " ++++++ opening teg");
                } else {
                    if (matcher.group(2) != null) {
                        System.out.println(matcher.group(2) + " ------ closing teg");
                    } else {
                        if (matcher.group(3) != null) {
                            System.out.println(matcher.group(3) + " ****** tag content");
                        } else {
                            if (matcher.group(4) != null) {
                                System.out.println(matcher.group(4) + " ====== teg without body");
                            }
                        }
                    }
                }
            }
        }
    }
}