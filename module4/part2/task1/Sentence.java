package module4.part2.task1;

public class Sentence {
    private String sentence;

    public Sentence() {
    }

    public Sentence(String sentence) {
        this.sentence = sentence;
    }

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    @Override
    public String toString() {
        return "Sentence{" +
                sentence + '\'' +
                '}';
    }
}
