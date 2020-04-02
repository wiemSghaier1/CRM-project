package Frames;

import Back.QuestEvalGlobale;

import javax.swing.*;

public class QuestEvalGlobaeFrame extends MyInternal {

    JLabel l;
    QuestEvalGlobale questEvalGlobale;

    public QuestEvalGlobaeFrame(String ch) {
        super(ch);
        setSize(650,500);
     //  String s= questEvalGlobale.returnAllQuestEvalGlobale();
        l= new JLabel("hey");
        add(l);
    }
}
