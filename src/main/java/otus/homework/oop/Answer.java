package otus.homework.oop;

public class Answer {


    private Question question;
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

    public Question getQuestion() {
        return this.question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

}
