package Frames;

import Back.QuestEvalSpecifique;

import javax.swing.*;

public class QuestEvalSpecifiqueFrame extends MyInternal {

    JLabel l;
    QuestEvalSpecifique questEvalSpecifique;

    public QuestEvalSpecifiqueFrame(String ch) {
        super(ch);
        setSize(650,500);
        l= new JLabel(questEvalSpecifique.returnAllQuestEvalSpecifique());
        add(l);
    }
}
