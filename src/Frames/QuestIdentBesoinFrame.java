package Frames;

import Back.QuestIdentificationBesoin;

import javax.swing.*;

public class QuestIdentBesoinFrame extends MyInternal {

    JLabel l;
    QuestIdentificationBesoin questIdentificationBesoin;

    public QuestIdentBesoinFrame(String ch) {
        super(ch);
        setSize(650,500);
        l= new JLabel(questIdentificationBesoin.returnAllQuestIdentBesoin());
        add(l);
    }


}
