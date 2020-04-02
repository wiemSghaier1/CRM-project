package Back;

import java.util.ArrayList;
import java.util.Date;

public class Questionnaire {

    ArrayList<Questionnaire> tousLesQuestionnaire = new ArrayList<>();
    protected String questId;
    protected String titre;
    protected String description;
    protected ArrayList<Question> questions;
    protected Date date;
    static  protected int nb = 0;

    public Questionnaire(String titre, String description, ArrayList<Question> questions, Date date) {
        nb++;
        this.questId = "Q"+nb ;
        this.titre = titre;
        this.description = description;
        this.questions = questions;
        this.date = date;
    }

    public Questionnaire(){

    }

    public int nbrQuestionnaire(){
        return nb;
    }

    public void ajoutQuestionnaire(Questionnaire q){
        tousLesQuestionnaire.add(q);
    }

    @Override
    public String toString() {
        return "Questionnaire{" +
                "questId='" + questId + '\'' +
                ", titre='" + titre + '\'' +
                ", description='" + description + '\'' +
                ", date=" + date +
                '}';
    }
}
