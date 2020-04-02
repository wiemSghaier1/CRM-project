package Frames;

import Back.Questionnaire;
import ConnectionDB.MyConnection;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class QuestionnaireFrame extends MyInternal {

    JPanel pn, pc, ps;
    JLabel typQuest;
    JComboBox cb;
    String types[] = {"Questionnaire d'identification des besoins","Questionnaire d'evaluation globale","Questionnaire d'evaluation spécifique"};
    JButton btnadd;
    JScrollPane scrollPane;
    JTable table;
    JDesktopPane desktopPane;
    Questionnaire questionnaire;
    MyConnection connection;

    public QuestionnaireFrame(String ch) {
        super(ch);
//        connection.connect();
        desktopPane = new JDesktopPane();

        pn = new JPanel(new FlowLayout());
        typQuest = new JLabel("Type Questionnaire: ");
        cb = new JComboBox(types);
        pn.add(typQuest);
        pn.add(cb);
        add(pn,BorderLayout.NORTH);

        ps = new JPanel(new FlowLayout());
        btnadd = new JButton("Ajouter Questionnaire");
        ps.add(btnadd);
        add(ps,BorderLayout.SOUTH);

        //add listners
        //add ajouter questionnaire listner
        btnadd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AddQuestFrame addQuestFrame = new AddQuestFrame(null);
                addQuestFrame.setVisible(true);
            }
        });

        //add affichages des questionnaires listner
        cb.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (cb.getSelectedItem().equals("Questionnaire d'identification des besoins")){
                    QuestIdentBesoinFrame questIdentBesoinFrame = new QuestIdentBesoinFrame("data");
                    desktopPane.add(questIdentBesoinFrame);
                    add(desktopPane, BorderLayout.CENTER);
                }
                if (cb.getSelectedItem().equals("Questionnaire d'evaluation globale")){
                    QuestEvalGlobaeFrame questEvalGlobaeFrame = new QuestEvalGlobaeFrame("data");
                    desktopPane.add(questEvalGlobaeFrame);
                    add(desktopPane,BorderLayout.CENTER);
                }
                if (cb.getSelectedItem().equals("Questionnaire d'evaluation spécifique")){
                    QuestEvalSpecifiqueFrame questEvalSpecifiqueFrame = new QuestEvalSpecifiqueFrame("data");
                    desktopPane.add(questEvalSpecifiqueFrame);
                    add(desktopPane,BorderLayout.CENTER);
                }
            }
        });

    }

}
