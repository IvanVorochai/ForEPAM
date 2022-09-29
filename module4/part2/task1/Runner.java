package module4.part2.task1;

//1. Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на
//консоль текст, заголовок текста.
public class Runner {
    public static void main(String[] args) {

        Word word = new Word("Polina");
        Sentence sentence = new Sentence("Polina goes to a market");

        Text text = new Text(sentence, word, new Sentence("Polina"));

        Sentence addText = new Sentence("la-la-la");

        text.printText();
        System.out.println();
        text.printHead();
        System.out.println();
        text.printAddWord(addText);
    }
}
//    public Text(Sentence sentence, Word word, Sentence head)