package Back;

import java.util.ArrayList;

public class Question {

    private  String question;
    private ArrayList<String> options;
    private Boolean repLibre;

    public Question(String question, ArrayList<String> options, Boolean repLibre) {
        this.question = question;
        this.options = options;
        this.repLibre = repLibre;
    }

    @Override
    public String toString() {
        return  question ;
    }
}
