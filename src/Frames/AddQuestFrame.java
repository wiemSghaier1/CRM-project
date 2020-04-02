package Frames;

import Back.Question;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class AddQuestFrame extends JDialog {

    JPanel pn, ptype, ptitre, pdescription, pc, ps, pbloc, pquestion,pReponse;
    JLabel ltitre, ltype, ldescription, lquestion, loption;
    JTextField titreText, questionText, optionText;
    JTextArea descriptionText;
    JComboBox cb;
    String types[] = {"Questionnaire d'identification des besoins","Questionnaire d'evaluation globale","Questionnaire d'evaluation spécifique"};
    JButton btnajout, btnannul, btnajoutQuestion, btnAjoutOption;
    JCheckBox repLibre;
    JSplitPane jsp;
    DefaultListModel model;
    JList<Question> list = new JList<>();
    ArrayList<String> options = new ArrayList<>();
    ArrayList<Question> questions = new ArrayList<>();

    public AddQuestFrame(Frame parent){
        super(parent,"Ajout Questionnaire",true);
        super.setSize(600,650);
        super.setLocation(50,50);
        super.setResizable(false);
        model = new DefaultListModel();

        pn = new JPanel(new GridLayout(3,1));

        ptype = new JPanel(new FlowLayout());
        ltype = new JLabel("type questionnaire");
        cb = new JComboBox(types);
        ptype.add(ltype);
        ptype.add(cb);

        ptitre = new JPanel(new FlowLayout());
        ltitre = new JLabel("titre: ");
        titreText = new JTextField(20);
        ptitre.add(ltitre);
        ptitre.add(titreText);

        pdescription = new JPanel(new FlowLayout());
        ldescription = new JLabel("Description:");
        descriptionText = new JTextArea();
        descriptionText.setLineWrap(true);
        descriptionText.setSize(200,300);
        pdescription.add(ldescription);
        pdescription.add(descriptionText);

        pn.add(ptype);
        pn.add(ptitre);
        pn.add(pdescription);

        add(pn,BorderLayout.NORTH);

        pbloc = new JPanel(new FlowLayout());

        pquestion = new JPanel(new FlowLayout());
        lquestion = new JLabel("Question:");
        questionText = new JTextField(15);
        pquestion.add(lquestion);
        pquestion.add(questionText);

        pReponse = new JPanel(new FlowLayout());
        repLibre = new JCheckBox("Reponse Libre");
        loption = new JLabel("Option:");
        optionText = new JTextField(10);
        btnAjoutOption = new JButton("+");
        btnajoutQuestion = new JButton("Ajout Question");
        pReponse.add(repLibre);
        pReponse.add(loption);
        pReponse.add(optionText);
        pReponse.add(btnAjoutOption);

        pbloc.add(pquestion);
        pbloc.add(pReponse);
        pbloc.add(btnajoutQuestion);

        model.addElement("questions:");
        list.setModel(model);
        list.setSize(300,200);
        jsp = new JSplitPane();
        jsp.setDividerLocation(200);
        jsp.setLeftComponent(list);
        jsp.setRightComponent(pbloc);
        add(jsp,BorderLayout.CENTER);

        ps = new JPanel(new FlowLayout());
        btnajout = new JButton("valider");
        btnannul = new JButton("annuler");
        ps.add(btnajout);
        ps.add(btnannul);

        add(ps,BorderLayout.SOUTH);

        //ADD LISTNERS
        //add listner pour annuler l'ajout
        btnannul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        //add listner pour ajouter les option de rep pour la question
        btnAjoutOption.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (questionText.getText().equals(""))
                    JOptionPane.showMessageDialog(AddQuestFrame.this,
                            "Entrer d'abord une question SVP !",
                            "erreur",
                            JOptionPane.ERROR_MESSAGE);
                else if (optionText.getText().equals(""))
                    JOptionPane.showMessageDialog(AddQuestFrame.this,
                            "Entrer d'abord une Option SVP !",
                            "erreur",
                            JOptionPane.ERROR_MESSAGE);
                     else{
                    options.add(optionText.getText());
                    optionText.setText("");
                    }
            }
        });

        //add listner pour ajouter une question
        btnajoutQuestion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (questionText.getText().equals(""))
                    JOptionPane.showMessageDialog(AddQuestFrame.this,
                            "Entrer d'abord une question SVP !",
                            "erreur",
                            JOptionPane.ERROR_MESSAGE);
                if (!repLibre.isSelected() && options.isEmpty())
                    JOptionPane.showMessageDialog(AddQuestFrame.this,
                            "Entrer d'abord une Methoode de reponse !",
                            "erreur",
                            JOptionPane.ERROR_MESSAGE);
                if (!questionText.getText().equals("") && (repLibre.isSelected() || !options.isEmpty())){
                    Question question = new Question(questionText.getText(),options,repLibre.isSelected());
                    questions.add(question);
                    model.addElement(question);
                    questionText.setText("");
                    options.clear();
                }
            }
        });

        //add listner pour valider le questionnaire


    }
}
