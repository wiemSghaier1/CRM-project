package Back;

import java.util.ArrayList;
import java.util.Date;

public class QuestEvalSpecifique extends Questionnaire {

    ArrayList<QuestEvalSpecifique> tousQuestEvalSpecifique = new ArrayList<>();

    public QuestEvalSpecifique(String titre, String description, ArrayList<Question> questions, Date date) {
        super(titre, description, questions, date);
    }

    public void ajoutQuestionnaire(Questionnaire q){
        tousLesQuestionnaire.add(q);
        tousQuestEvalSpecifique.add((QuestEvalSpecifique) q);
    }

    public String returnAllQuestEvalSpecifique(){
        String s= " ";
        for (int i=0; i<tousQuestEvalSpecifique.size();i++){
            s += "Questionnaire{" +
                    "questId='" + questId + '\'' +
                    ", titre='" + titre + '\'' +
                    ", description='" + description + '\'' +
                    ", date=" + date +
                    '}' + "\n";
        }
        return s;
    }
}
