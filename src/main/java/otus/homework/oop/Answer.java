package otus.homework.oop;

public class Answer {

    private String text;
    private boolean isCorrect;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setCorrect(boolean correct) {
        this.isCorrect = correct;
    }

    public boolean isCorrect() {
        return this.isCorrect;
    }

}
