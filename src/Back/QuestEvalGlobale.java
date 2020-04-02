package Back;

import java.util.ArrayList;
import java.util.Date;

public class QuestEvalGlobale extends Questionnaire {

    ArrayList<QuestEvalGlobale> tousQuestEvalGlobal = new ArrayList<>();

    public QuestEvalGlobale(String titre, String description, ArrayList<Question> questions, Date date) {
        super(titre, description, questions, date);
    }

    public void ajoutQuestionnaire(Questionnaire q){
        tousLesQuestionnaire.add(q);
        tousQuestEvalGlobal.add((QuestEvalGlobale) q);
    }

    public String returnAllQuestEvalGlobale(){
        String s= " ";
        for (int i=0; i<tousQuestEvalGlobal.size();i++){
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
