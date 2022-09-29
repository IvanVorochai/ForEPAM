package module4.part2.task1;

//1. Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на
//консоль текст, заголовок текста.
public class Text {

    private Sentence sentence;
    private Word word;
    private Sentence head;

    public Text() {
    }

    public Text(Sentence sentence, Word word, Sentence head) {
        this.sentence = sentence;
        this.word = word;
        this.head = head;
    }

    public Sentence getSentence() {
        return sentence;
    }

    public void setSentence(Sentence sentence) {
        this.sentence = sentence;
    }

    public Word getWord() {
        return word;
    }

    public void setWord(Word word) {
        this.word = word;
    }

    public Sentence getHead() {
        return head;
    }

    public void setHead(Sentence head) {
        this.head = head;
    }

    @Override
    public String toString() {
        return "Text{" +
                sentence +
                word +
                head +
                '}';
    }

    public void printHead() {
        System.out.println(getHead());
    }

    public void printText() {
        System.out.println(this);
    }

    public void printAddWord(Sentence sentence) {
        System.out.println(this);
        System.out.println(sentence.toString());
    }
}
