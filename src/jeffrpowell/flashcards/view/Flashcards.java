/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jeffrpowell.flashcards.view;

import java.awt.CardLayout;
import java.awt.event.ItemEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;
import jeffrpowell.flashcards.controller.Controller;
import jeffrpowell.flashcards.model.Deck;
import jeffrpowell.flashcards.model.FlashCard;

/**
 *
 * @author Jeff
 */
public class Flashcards extends javax.swing.JFrame {
    private final Controller controller;
    private CardLayout cardLayout;
	private transient final WindowAdapter persistOnClose;
	private Deck deckCache;
	private int runningIndex;
    /**
     * Creates new form Flashcards
     */
    public Flashcards() {
		this.controller = new Controller(this);
		this.persistOnClose = new PersistOnClose();
        initComponents();
        manualInit();
    }
    
    private void manualInit(){
        JPanel buttonBar = new ButtonBar(controller);
        getContentPane().add(buttonBar, java.awt.BorderLayout.NORTH);
        cardLayout = (CardLayout)cardPanel.getLayout();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        cardPanel = new javax.swing.JPanel();
        IntroPanel = new javax.swing.JPanel();
        AddDeckPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        deckNameTxt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        flashcardAnswerTxtArea = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        flashcardPromptTxtArea = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        addFlashcardBtn = new javax.swing.JButton();
        saveNewDeckBtn = new javax.swing.JButton();
        EditDeckPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        RunDeckPanel = new javax.swing.JPanel();
        deckSelect = new javax.swing.JComboBox();
        jScrollPane3 = new javax.swing.JScrollPane();
        runPromptTxtArea = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        runAnswerTxtArea = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        previousBtn = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        revealButton = new javax.swing.JButton();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        nextBtn = new javax.swing.JButton();
        feedbackLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Flashcard Buddy");

        cardPanel.setLayout(new java.awt.CardLayout());
        cardPanel.add(IntroPanel, "introPanel");

        jLabel5.setText("Deck Name");

        jScrollPane1.setHorizontalScrollBar(null);

        flashcardAnswerTxtArea.setColumns(20);
        flashcardAnswerTxtArea.setLineWrap(true);
        flashcardAnswerTxtArea.setRows(7);
        flashcardAnswerTxtArea.setTabSize(4);
        flashcardAnswerTxtArea.setWrapStyleWord(true);
        jScrollPane1.setViewportView(flashcardAnswerTxtArea);

        jLabel6.setText("Flashcard Prompt");

        jScrollPane2.setHorizontalScrollBar(null);

        flashcardPromptTxtArea.setColumns(20);
        flashcardPromptTxtArea.setLineWrap(true);
        flashcardPromptTxtArea.setRows(7);
        flashcardPromptTxtArea.setTabSize(4);
        flashcardPromptTxtArea.setWrapStyleWord(true);
        jScrollPane2.setViewportView(flashcardPromptTxtArea);

        jLabel7.setText("Flashcard Answer");

        addFlashcardBtn.setText("Add New Flashcard");
        addFlashcardBtn.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                addFlashcardBtnActionPerformed(evt);
            }
        });

        saveNewDeckBtn.setText("Save New Deck");
        saveNewDeckBtn.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                saveNewDeckBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AddDeckPanelLayout = new javax.swing.GroupLayout(AddDeckPanel);
        AddDeckPanel.setLayout(AddDeckPanelLayout);
        AddDeckPanelLayout.setHorizontalGroup(
            AddDeckPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddDeckPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AddDeckPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddDeckPanelLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel5))
                    .addComponent(jLabel7)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AddDeckPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddDeckPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(deckNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AddDeckPanelLayout.createSequentialGroup()
                        .addComponent(addFlashcardBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(saveNewDeckBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        AddDeckPanelLayout.setVerticalGroup(
            AddDeckPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddDeckPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AddDeckPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(deckNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AddDeckPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(AddDeckPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AddDeckPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addFlashcardBtn)
                    .addComponent(saveNewDeckBtn))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        cardPanel.add(AddDeckPanel, "addDeckPanel");

        jLabel2.setText("I'm editing a deck");
        EditDeckPanel.add(jLabel2);

        cardPanel.add(EditDeckPanel, "editDeckPanel");

        deckSelect.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        deckSelect.addItemListener(new java.awt.event.ItemListener()
        {
            public void itemStateChanged(java.awt.event.ItemEvent evt)
            {
                deckSelectItemStateChanged(evt);
            }
        });

        jScrollPane3.setHorizontalScrollBar(null);

        runPromptTxtArea.setEditable(false);
        runPromptTxtArea.setColumns(20);
        runPromptTxtArea.setLineWrap(true);
        runPromptTxtArea.setRows(7);
        runPromptTxtArea.setTabSize(4);
        runPromptTxtArea.setWrapStyleWord(true);
        jScrollPane3.setViewportView(runPromptTxtArea);

        jScrollPane4.setHorizontalScrollBar(null);

        runAnswerTxtArea.setEditable(false);
        runAnswerTxtArea.setColumns(20);
        runAnswerTxtArea.setLineWrap(true);
        runAnswerTxtArea.setRows(7);
        runAnswerTxtArea.setTabSize(4);
        runAnswerTxtArea.setWrapStyleWord(true);
        jScrollPane4.setViewportView(runAnswerTxtArea);

        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));

        previousBtn.setText("Previous");
        previousBtn.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                previousBtnActionPerformed(evt);
            }
        });
        jPanel1.add(previousBtn);
        jPanel1.add(filler1);

        revealButton.setText("Reveal Answer");
        revealButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                revealButtonActionPerformed(evt);
            }
        });
        jPanel1.add(revealButton);
        jPanel1.add(filler2);

        nextBtn.setText("Next");
        nextBtn.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                nextBtnActionPerformed(evt);
            }
        });
        jPanel1.add(nextBtn);

        javax.swing.GroupLayout RunDeckPanelLayout = new javax.swing.GroupLayout(RunDeckPanel);
        RunDeckPanel.setLayout(RunDeckPanelLayout);
        RunDeckPanelLayout.setHorizontalGroup(
            RunDeckPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RunDeckPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
            .addGroup(RunDeckPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(RunDeckPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RunDeckPanelLayout.createSequentialGroup()
                        .addComponent(deckSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(599, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RunDeckPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79))))
        );
        RunDeckPanelLayout.setVerticalGroup(
            RunDeckPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RunDeckPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(deckSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );

        cardPanel.add(RunDeckPanel, "runDeckPanel");

        getContentPane().add(cardPanel, java.awt.BorderLayout.CENTER);

        feedbackLbl.setFont(new java.awt.Font("Tempus Sans ITC", 0, 36)); // NOI18N
        feedbackLbl.setText("Welcome to your FlashCard Companion");
        getContentPane().add(feedbackLbl, java.awt.BorderLayout.SOUTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addFlashcardBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addFlashcardBtnActionPerformed
        addNewFlashcard();
    }//GEN-LAST:event_addFlashcardBtnActionPerformed

    private void saveNewDeckBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveNewDeckBtnActionPerformed
        addNewFlashcard();
        controller.saveNewDeck(deckNameTxt.getText());
        setFeedbackText(deckNameTxt.getText() + " was successfully saved.");
        deckNameTxt.setText("");
    }//GEN-LAST:event_saveNewDeckBtnActionPerformed

    private void deckSelectItemStateChanged(java.awt.event.ItemEvent evt)//GEN-FIRST:event_deckSelectItemStateChanged
    {//GEN-HEADEREND:event_deckSelectItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED){
			deckCache = controller.runDeckSelectItemChanged(evt);
			runningIndex = 0;
			runAnswerTxtArea.setVisible(false);
		}
    }//GEN-LAST:event_deckSelectItemStateChanged

    private void previousBtnActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_previousBtnActionPerformed
    {//GEN-HEADEREND:event_previousBtnActionPerformed
        runningIndex--;
		runAnswerTxtArea.setVisible(false);
    }//GEN-LAST:event_previousBtnActionPerformed

    private void nextBtnActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_nextBtnActionPerformed
    {//GEN-HEADEREND:event_nextBtnActionPerformed
        runningIndex++;
		runAnswerTxtArea.setVisible(false);
    }//GEN-LAST:event_nextBtnActionPerformed

    private void revealButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_revealButtonActionPerformed
    {//GEN-HEADEREND:event_revealButtonActionPerformed
        runAnswerTxtArea.setVisible(true);
    }//GEN-LAST:event_revealButtonActionPerformed
    
    private void addNewFlashcard(){
        controller.addNewFlashcardButtonClicked(new FlashCard(flashcardPromptTxtArea.getText(), flashcardAnswerTxtArea.getText()));
        flashcardPromptTxtArea.setText("");
        flashcardAnswerTxtArea.setText("");
		flashcardPromptTxtArea.requestFocusInWindow();
    }
    
    public void showNewDeckPanel(){
        switchCardPanel("addDeckPanel");
        setFeedbackText("");
    }
    
    public void showEditDeckPanel(){
        switchCardPanel("editDeckPanel");
        setFeedbackText("");
    }
    
    public void showRunDeckPanel(){
        switchCardPanel("runDeckPanel");
		deckSelect.removeAllItems();
		deckSelect.addItem("Choose a deck...");
		for (String deck : controller.getDeckNames())
		{
			deckSelect.addItem(deck);
		}
        setFeedbackText("");
    }
    
    private void switchCardPanel(String cardName){
        cardLayout.show(cardPanel, cardName);
        revalidate();
        pack();
        repaint();
    }
    
    public void setFeedbackText(String text){
        feedbackLbl.setText(text);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Flashcards.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Flashcards F = new Flashcards();
				F.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
				F.addWindowListener(F.persistOnClose);
                F.pack();
                F.setVisible(true);
            }
        });
    }
	
	private class PersistOnClose extends WindowAdapter{
		@Override
		public void windowClosing(WindowEvent e){
			controller.persistBeforeClosing();
			System.exit(0);
		}
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AddDeckPanel;
    private javax.swing.JPanel EditDeckPanel;
    private javax.swing.JPanel IntroPanel;
    private javax.swing.JPanel RunDeckPanel;
    private javax.swing.JButton addFlashcardBtn;
    private javax.swing.JPanel cardPanel;
    private javax.swing.JTextField deckNameTxt;
    private javax.swing.JComboBox deckSelect;
    private javax.swing.JLabel feedbackLbl;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.JTextArea flashcardAnswerTxtArea;
    private javax.swing.JTextArea flashcardPromptTxtArea;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton nextBtn;
    private javax.swing.JButton previousBtn;
    private javax.swing.JButton revealButton;
    private javax.swing.JTextArea runAnswerTxtArea;
    private javax.swing.JTextArea runPromptTxtArea;
    private javax.swing.JButton saveNewDeckBtn;
    // End of variables declaration//GEN-END:variables
}
