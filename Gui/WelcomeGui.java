/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 *
 * @author Ethan
 */
public class WelcomeGui extends javax.swing.JPanel implements ActionListener{

    /**
     * Creates new form NewJPanel
     */
    
    private JFrame frame;
    
    public WelcomeGui() {
        frame = new JFrame();
        initComponents();
        easy.addActionListener(this);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(this);
        frame.setVisible(true);
        frame.pack();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;
        frame.setLocation(screenWidth/2 - frame.getWidth()/2, screenHeight/2 - frame.getHeight()/2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gameTitle = new javax.swing.JLabel();
        onePlayerRadio = new javax.swing.JRadioButton();
        twoPlayerRadio = new javax.swing.JRadioButton();
        difficultyLabel = new javax.swing.JLabel();
        easy = new javax.swing.JButton();
        medium = new javax.swing.JButton();
        hard = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 204, 255));

        gameTitle.setFont(new java.awt.Font("Calibri", 1, 70)); // NOI18N
        gameTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gameTitle.setText("KIWI ISLAND");

        onePlayerRadio.setBackground(new java.awt.Color(0, 204, 255));
        onePlayerRadio.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        onePlayerRadio.setText("1 Player");

        twoPlayerRadio.setBackground(new java.awt.Color(0, 204, 255));
        twoPlayerRadio.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        twoPlayerRadio.setText("2 Players");
        twoPlayerRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoPlayerRadioActionPerformed(evt);
            }
        });

        difficultyLabel.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        difficultyLabel.setText("Select Difficulty:");

        easy.setBackground(new java.awt.Color(0, 204, 255));
        easy.setText("Easy");

        medium.setBackground(new java.awt.Color(0, 204, 255));
        medium.setText("Medium");

        hard.setBackground(new java.awt.Color(0, 204, 204));
        hard.setText("Hard");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(difficultyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gameTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(easy)
                .addGap(74, 74, 74)
                .addComponent(medium)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(hard)
                .addGap(33, 33, 33))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(onePlayerRadio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(twoPlayerRadio)
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gameTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(onePlayerRadio)
                    .addComponent(twoPlayerRadio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(difficultyLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(easy)
                    .addComponent(medium)
                    .addComponent(hard))
                .addGap(56, 56, 56))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void twoPlayerRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoPlayerRadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_twoPlayerRadioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel difficultyLabel;
    private javax.swing.JButton easy;
    private javax.swing.JLabel gameTitle;
    private javax.swing.JButton hard;
    private javax.swing.JButton medium;
    private javax.swing.JRadioButton onePlayerRadio;
    private javax.swing.JRadioButton twoPlayerRadio;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == easy){
            System.out.println("Easy clicked");
            OnePlayerGui onePlayer = new OnePlayerGui(frame);
            frame.remove(this);
            frame.add(onePlayer);
            frame.revalidate();
            frame.repaint();
            frame.pack();
             Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            int screenWidth = screenSize.width;
            int screenHeight = screenSize.height;
            frame.setLocation(screenWidth/2 - frame.getWidth()/2, screenHeight/2 - frame.getHeight()/2);
        }
    }
    
   

    
}

