package Frames;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Myf extends JFrame {

    JMenuBar bar;
    JMenu refc, avV, v, apV, com,  planC;
    JMenuItem etudD, realC, suivC, quest,comp;
    QuestionnaireFrame questionnaireFrame;
    JDesktopPane desktopPane;


    public Myf(String ch){
        super(ch);
        setSize(850,800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        bar = new JMenuBar();
        refc = new JMenu("Referentiel Commun");
        avV = new JMenu("Avant Vente");
        v = new JMenu("Vente");
        apV = new JMenu("Apres Vente");
        com = new JMenu("communication");
        etudD = new JMenuItem("Etude données Commerciale");
        planC = new JMenu("Planification des Campagnes");
        realC = new JMenuItem("Realisation des Campagnes");
        suivC = new JMenuItem("Suivie des Campagnes");
        quest = new JMenuItem("Questionnaire");
        comp = new JMenuItem("Compagne");

        avV.add(etudD);
        avV.add(planC);
        avV.add(realC);
        avV.add(suivC);
        planC.add(quest);
        planC.add(comp);

        bar.add(refc);
        bar.add(avV);
        bar.add(v);
        bar.add(apV);
        bar.add(com);
        this.setJMenuBar(bar);

        desktopPane = new JDesktopPane();
        this.add(desktopPane,BorderLayout.CENTER);

        //add listners
        //add questionnaire lister
        quest.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                questionnaireFrame = new QuestionnaireFrame("Questionnaire");
                questionnaireFrame.setVisible(true);
                questionnaireFrame.toFront();
                desktopPane.add(questionnaireFrame);
            }
        });
    }
}
