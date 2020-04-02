package Back;

import java.util.ArrayList;
import java.util.Date;

public class QuestIdentificationBesoin extends Questionnaire {

    ArrayList<QuestIdentificationBesoin> tousQuestIdentBesoins = new ArrayList<>();

    public QuestIdentificationBesoin(String titre, String description, ArrayList<Question> questions, Date date) {
        super(titre, description, questions, date);
    }

    public void ajoutQuestionnaire(Questionnaire q){
        tousLesQuestionnaire.add(q);
        tousQuestIdentBesoins.add((QuestIdentificationBesoin) q);
    }

    public String returnAllQuestIdentBesoin(){
        String s= " ";
        for (int i=0; i<tousQuestIdentBesoins.size();i++){
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
