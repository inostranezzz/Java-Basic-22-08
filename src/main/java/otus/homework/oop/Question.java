package otus.homework.oop;

public class Question {
    private String text;
    private Answer[] answers;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Answer[] getAnswers() {
        return answers;
    }

    public void setAnswers(Answer[] answers) {
        this.answers = answers;
    }
}
