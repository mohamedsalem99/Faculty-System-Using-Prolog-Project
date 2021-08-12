
package mainPackage.guiFormPack;

import java.util.Map;
import org.jpl7.*;


public class DoctorJFrame extends javax.swing.JFrame {

    public DoctorJFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Doctor_Form_Title = new javax.swing.JLabel();
        askQ_lbl = new javax.swing.JLabel();
        Ask_jPanel = new javax.swing.JPanel();
        ask_question_txt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        answer_txt = new javax.swing.JTextArea();
        answer_btn = new javax.swing.JButton();
        Btn_jPanel = new javax.swing.JPanel();
        return_btn = new javax.swing.JButton();
        exit_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Doctor_Form_Title.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        Doctor_Form_Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Doctor_Form_Title.setText("Doctors");
        Doctor_Form_Title.setToolTipText("");
        Doctor_Form_Title.setAutoscrolls(true);
        Doctor_Form_Title.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Doctor_Form_Title.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        askQ_lbl.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        askQ_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        askQ_lbl.setText("Enter Courses");
        askQ_lbl.setToolTipText("");
        askQ_lbl.setName("askQ_lbl"); // NOI18N

        ask_question_txt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ask_question_txt.setName("ask_question_txt"); // NOI18N

        answer_txt.setColumns(20);
        answer_txt.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        answer_txt.setRows(5);
        jScrollPane1.setViewportView(answer_txt);

        answer_btn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        answer_btn.setText("Answer");
        answer_btn.setName("answer_btn"); // NOI18N
        answer_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answer_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Ask_jPanelLayout = new javax.swing.GroupLayout(Ask_jPanel);
        Ask_jPanel.setLayout(Ask_jPanelLayout);
        Ask_jPanelLayout.setHorizontalGroup(
            Ask_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Ask_jPanelLayout.createSequentialGroup()
                .addGap(212, 212, 212)
                .addComponent(answer_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(267, Short.MAX_VALUE))
            .addGroup(Ask_jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Ask_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(ask_question_txt))
                .addContainerGap())
        );
        Ask_jPanelLayout.setVerticalGroup(
            Ask_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Ask_jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ask_question_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(answer_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        return_btn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        return_btn.setText("Return");
        return_btn.setActionCommand("");
        return_btn.setName("return_btn"); // NOI18N
        return_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                return_btnActionPerformed(evt);
            }
        });

        exit_btn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        exit_btn.setText("Exit");
        exit_btn.setActionCommand("");
        exit_btn.setName("exit_btn"); // NOI18N
        exit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Btn_jPanelLayout = new javax.swing.GroupLayout(Btn_jPanel);
        Btn_jPanel.setLayout(Btn_jPanelLayout);
        Btn_jPanelLayout.setHorizontalGroup(
            Btn_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Btn_jPanelLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(return_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(exit_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        Btn_jPanelLayout.setVerticalGroup(
            Btn_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Btn_jPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Btn_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exit_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(return_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Doctor_Form_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(357, 357, 357))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Btn_jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(askQ_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Ask_jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(149, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(Doctor_Form_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Ask_jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(askQ_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 128, Short.MAX_VALUE)
                .addComponent(Btn_jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void answer_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answer_btnActionPerformed
        answer_txt.setText("");
        Query conn = new Query("consult('Knowledge.pl')");
        conn.hasSolution();
        String getQueryText = ask_question_txt.getText();
      
        String askCoursesQuery = "showDoctorByCourses(["+ getQueryText + "] ,Y).";
        Query q = new Query(askCoursesQuery);

        System.out.println(askCoursesQuery);
        this.answer_txt.append("Doctors\n");
        this.answer_txt.append("==================\n");
        Map<String ,Term>[] result = q.allSolutions();
        for (int i = 0; i < result.length; i++) {
            answer_txt.setText(answer_txt.getText() + (i+1) + " - " + result[i].get("Y").toString() + "\n");
            System.out.println(String.valueOf(result[i]));
        }
    }//GEN-LAST:event_answer_btnActionPerformed

    private void exit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_btnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exit_btnActionPerformed

    private void return_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_return_btnActionPerformed
 mainJFrame  mainJf = new mainJFrame();
        mainJf.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_return_btnActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DoctorJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoctorJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoctorJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoctorJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoctorJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Ask_jPanel;
    private javax.swing.JPanel Btn_jPanel;
    private javax.swing.JLabel Doctor_Form_Title;
    private javax.swing.JButton answer_btn;
    private javax.swing.JTextArea answer_txt;
    private javax.swing.JLabel askQ_lbl;
    private javax.swing.JTextField ask_question_txt;
    private javax.swing.JButton exit_btn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton return_btn;
    // End of variables declaration//GEN-END:variables
}
