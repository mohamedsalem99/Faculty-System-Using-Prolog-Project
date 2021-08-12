
package mainPackage.guiFormPack;
import org.jpl7.*;
import java.util.Map;
import javax.swing.JPanel;
public class AssistantJFrame extends javax.swing.JFrame {

    /**
     * Creates new form AssistantJFrame
     */
    public AssistantJFrame() {
        initComponents();
        courses_result_chosen_lbl.setVisible(false);
        layeredPane.removeAll();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        button_panel = new javax.swing.JPanel();
        help_btn = new javax.swing.JButton();
        exit_btn = new javax.swing.JButton();
        Assistant_Form_Title = new javax.swing.JLabel();
        askNoCourses_lbl = new javax.swing.JLabel();
        Courses_jComboBox = new javax.swing.JComboBox<>();
        courses_result_chosen_lbl = new javax.swing.JLabel();
        layeredPane = new javax.swing.JLayeredPane();
        OneCoursejPanel12 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        OneCourse_Ask_txt = new javax.swing.JTextField();
        jScrollPane14 = new javax.swing.JScrollPane();
        OneCourse_Answer_txt = new javax.swing.JTextArea();
        One_Course_Answer_btn = new javax.swing.JButton();
        TwoCoursejPanel = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        ask_Fcourse_name_txt_p2 = new javax.swing.JTextField();
        jScrollPane13 = new javax.swing.JScrollPane();
        TwoCourse_Answer_txt = new javax.swing.JTextArea();
        Two_Course_Answer_btn = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        ask_Scourse_name_txt_p2 = new javax.swing.JTextField();
        ThreeCoursejPanel = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        ask_Fcourse_name_txt_p3 = new javax.swing.JTextField();
        jScrollPane15 = new javax.swing.JScrollPane();
        ThreeCourse_Answer_txt = new javax.swing.JTextArea();
        Three_Course_Answer_btn = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        ask_Scourse_name_txt_p3 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        ask_Tcourse_name_txt_p3 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        help_btn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        help_btn.setText("Return");
        help_btn.setActionCommand("");
        help_btn.setName("help_btn"); // NOI18N
        help_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                help_btnActionPerformed(evt);
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

        javax.swing.GroupLayout button_panelLayout = new javax.swing.GroupLayout(button_panel);
        button_panel.setLayout(button_panelLayout);
        button_panelLayout.setHorizontalGroup(
            button_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(button_panelLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(help_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(exit_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        button_panelLayout.setVerticalGroup(
            button_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, button_panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(button_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exit_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(help_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        Assistant_Form_Title.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        Assistant_Form_Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Assistant_Form_Title.setText("Assistants");
        Assistant_Form_Title.setToolTipText("");
        Assistant_Form_Title.setAutoscrolls(true);
        Assistant_Form_Title.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Assistant_Form_Title.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        askNoCourses_lbl.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        askNoCourses_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        askNoCourses_lbl.setText("Enter Number of Courses");
        askNoCourses_lbl.setToolTipText("");
        askNoCourses_lbl.setName("askNoCourses_lbl"); // NOI18N

        Courses_jComboBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Courses_jComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3" }));
        Courses_jComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Courses_jComboBoxActionPerformed(evt);
            }
        });

        courses_result_chosen_lbl.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        courses_result_chosen_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        courses_result_chosen_lbl.setToolTipText("");
        courses_result_chosen_lbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        courses_result_chosen_lbl.setName("askQ_lbl"); // NOI18N

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Enter The Name of The Course");

        OneCourse_Ask_txt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        OneCourse_Ask_txt.setName("ask_course_name_txt"); // NOI18N

        OneCourse_Answer_txt.setColumns(20);
        OneCourse_Answer_txt.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        OneCourse_Answer_txt.setRows(5);
        jScrollPane14.setViewportView(OneCourse_Answer_txt);

        One_Course_Answer_btn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        One_Course_Answer_btn.setText("Answer");
        One_Course_Answer_btn.setName("answer_btn"); // NOI18N
        One_Course_Answer_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                One_Course_Answer_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout OneCoursejPanel12Layout = new javax.swing.GroupLayout(OneCoursejPanel12);
        OneCoursejPanel12.setLayout(OneCoursejPanel12Layout);
        OneCoursejPanel12Layout.setHorizontalGroup(
            OneCoursejPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OneCoursejPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(One_Course_Answer_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(188, 188, 188))
            .addGroup(OneCoursejPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(OneCoursejPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(OneCoursejPanel12Layout.createSequentialGroup()
                        .addGap(0, 171, Short.MAX_VALUE)
                        .addComponent(jLabel15)
                        .addGap(136, 136, 136))
                    .addComponent(OneCourse_Ask_txt)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OneCoursejPanel12Layout.createSequentialGroup()
                        .addComponent(jScrollPane14)
                        .addContainerGap())))
        );
        OneCoursejPanel12Layout.setVerticalGroup(
            OneCoursejPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OneCoursejPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(OneCourse_Ask_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(One_Course_Answer_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(105, Short.MAX_VALUE))
        );

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Enter The Name of The Course");

        ask_Fcourse_name_txt_p2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ask_Fcourse_name_txt_p2.setName("ask_course_name_txt"); // NOI18N

        TwoCourse_Answer_txt.setColumns(20);
        TwoCourse_Answer_txt.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        TwoCourse_Answer_txt.setRows(5);
        jScrollPane13.setViewportView(TwoCourse_Answer_txt);

        Two_Course_Answer_btn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Two_Course_Answer_btn.setText("Answer");
        Two_Course_Answer_btn.setName("answer_btn"); // NOI18N
        Two_Course_Answer_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Two_Course_Answer_btnActionPerformed(evt);
            }
        });

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Enter The Name of The Course");

        ask_Scourse_name_txt_p2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ask_Scourse_name_txt_p2.setName("ask_course_name_txt"); // NOI18N

        javax.swing.GroupLayout TwoCoursejPanelLayout = new javax.swing.GroupLayout(TwoCoursejPanel);
        TwoCoursejPanel.setLayout(TwoCoursejPanelLayout);
        TwoCoursejPanelLayout.setHorizontalGroup(
            TwoCoursejPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TwoCoursejPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TwoCoursejPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane13)
                    .addGroup(TwoCoursejPanelLayout.createSequentialGroup()
                        .addGroup(TwoCoursejPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(TwoCoursejPanelLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel13))
                            .addComponent(ask_Fcourse_name_txt_p2, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(TwoCoursejPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ask_Scourse_name_txt_p2, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(TwoCoursejPanelLayout.createSequentialGroup()
                .addGap(378, 378, 378)
                .addComponent(Two_Course_Answer_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        TwoCoursejPanelLayout.setVerticalGroup(
            TwoCoursejPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TwoCoursejPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(TwoCoursejPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TwoCoursejPanelLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ask_Fcourse_name_txt_p2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TwoCoursejPanelLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ask_Scourse_name_txt_p2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Two_Course_Answer_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11))
        );

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Enter The Name of The Course");

        ask_Fcourse_name_txt_p3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ask_Fcourse_name_txt_p3.setName("ask_course_name_txt"); // NOI18N

        ThreeCourse_Answer_txt.setColumns(20);
        ThreeCourse_Answer_txt.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        ThreeCourse_Answer_txt.setRows(5);
        jScrollPane15.setViewportView(ThreeCourse_Answer_txt);

        Three_Course_Answer_btn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Three_Course_Answer_btn.setText("Answer");
        Three_Course_Answer_btn.setName("answer_btn"); // NOI18N
        Three_Course_Answer_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Three_Course_Answer_btnActionPerformed(evt);
            }
        });

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Enter The Name of The Course");

        ask_Scourse_name_txt_p3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ask_Scourse_name_txt_p3.setName("ask_course_name_txt"); // NOI18N

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Enter The Name of The Course");

        ask_Tcourse_name_txt_p3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ask_Tcourse_name_txt_p3.setName("ask_course_name_txt"); // NOI18N

        javax.swing.GroupLayout ThreeCoursejPanelLayout = new javax.swing.GroupLayout(ThreeCoursejPanel);
        ThreeCoursejPanel.setLayout(ThreeCoursejPanelLayout);
        ThreeCoursejPanelLayout.setHorizontalGroup(
            ThreeCoursejPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ThreeCoursejPanelLayout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(ThreeCoursejPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ThreeCoursejPanelLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel16))
                    .addComponent(ask_Fcourse_name_txt_p3, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(ThreeCoursejPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ask_Scourse_name_txt_p3, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(77, 77, 77))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ThreeCoursejPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ThreeCoursejPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ask_Tcourse_name_txt_p3, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addGap(302, 302, 302))
            .addGroup(ThreeCoursejPanelLayout.createSequentialGroup()
                .addGroup(ThreeCoursejPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ThreeCoursejPanelLayout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 685, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ThreeCoursejPanelLayout.createSequentialGroup()
                        .addGap(499, 499, 499)
                        .addComponent(Three_Course_Answer_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ThreeCoursejPanelLayout.setVerticalGroup(
            ThreeCoursejPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ThreeCoursejPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ThreeCoursejPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ThreeCoursejPanelLayout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ask_Fcourse_name_txt_p3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ThreeCoursejPanelLayout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ask_Scourse_name_txt_p3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ask_Tcourse_name_txt_p3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(Three_Course_Answer_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        layeredPane.setLayer(OneCoursejPanel12, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredPane.setLayer(TwoCoursejPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredPane.setLayer(ThreeCoursejPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layeredPaneLayout = new javax.swing.GroupLayout(layeredPane);
        layeredPane.setLayout(layeredPaneLayout);
        layeredPaneLayout.setHorizontalGroup(
            layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layeredPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(OneCoursejPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(578, Short.MAX_VALUE)))
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layeredPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(TwoCoursejPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(198, Short.MAX_VALUE)))
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layeredPaneLayout.createSequentialGroup()
                    .addGap(22, 22, 22)
                    .addComponent(ThreeCoursejPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(188, Short.MAX_VALUE)))
        );
        layeredPaneLayout.setVerticalGroup(
            layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 477, Short.MAX_VALUE)
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layeredPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(OneCoursejPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layeredPaneLayout.createSequentialGroup()
                    .addGap(65, 65, 65)
                    .addComponent(TwoCoursejPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(66, 66, 66)))
            .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layeredPaneLayout.createSequentialGroup()
                    .addGap(75, 75, 75)
                    .addComponent(ThreeCoursejPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(56, 56, 56)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(askNoCourses_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108)
                .addComponent(Courses_jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116)
                .addComponent(courses_result_chosen_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 183, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(button_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(247, 247, 247))
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addGap(509, 509, 509)
                .addComponent(Assistant_Form_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(layeredPane)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Assistant_Form_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(askNoCourses_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Courses_jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(courses_result_chosen_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(layeredPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(button_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_btnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exit_btnActionPerformed

    public void switch_panels(JPanel jpanal){
        layeredPane.removeAll();
        layeredPane.add(jpanal);
        layeredPane.repaint();
        layeredPane.revalidate();
    }
    
    private void Courses_jComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Courses_jComboBoxActionPerformed
        String chosenItem = Courses_jComboBox.getSelectedItem().toString();
        courses_result_chosen_lbl.setText("Your Choise is : \n"+  chosenItem);
        courses_result_chosen_lbl.setVisible(true);
        if("1".equalsIgnoreCase(Courses_jComboBox.getSelectedItem().toString())){
            //Removing Panel
            switch_panels(OneCoursejPanel12);
        }
        if("2".equalsIgnoreCase(Courses_jComboBox.getSelectedItem().toString())){
            //Removing Panel
            switch_panels(TwoCoursejPanel);
        }
        if("3".equalsIgnoreCase(Courses_jComboBox.getSelectedItem().toString())){
            switch_panels(ThreeCoursejPanel);
        }
    }//GEN-LAST:event_Courses_jComboBoxActionPerformed

    private void One_Course_Answer_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_One_Course_Answer_btnActionPerformed
         OneCourse_Answer_txt.setText("");
        Query conn = new Query("consult('Knowledge.pl')");
        conn.hasSolution();
        String getQueryText = OneCourse_Ask_txt.getText();
        String askCoursesQuery = "assistCourses(["+ getQueryText.trim() + "], [H|T]).";
        Query q = new Query(askCoursesQuery);
        
        System.out.println(askCoursesQuery);
        this.OneCourse_Answer_txt.append("Teaching Assistant\n");
        this.OneCourse_Answer_txt.append("==================\n");
        Map<String ,Term>[] result = q.allSolutions();
        for (int i = 0; i < result.length; i++) {
            OneCourse_Answer_txt.setText(OneCourse_Answer_txt.getText() + (i+1) + " - " + result[i].get("H").toString() + "\n");
            System.out.println(String.valueOf(result[i].get("H")));
        }
    }//GEN-LAST:event_One_Course_Answer_btnActionPerformed

    private void Two_Course_Answer_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Two_Course_Answer_btnActionPerformed
      TwoCourse_Answer_txt.setText("");
        Query conn = new Query("consult('Knowledge.pl')");
        conn.hasSolution();
        String getQueryText = ask_Fcourse_name_txt_p2.getText();
        String getQueryText2 = ask_Scourse_name_txt_p2.getText();
        String askCoursesQuery = "assistCourses(["+ getQueryText.trim() + "," + getQueryText2.trim() + "], [H,Y|T]).";
        Query q = new Query(askCoursesQuery);
        
        System.out.println(askCoursesQuery);
        this.TwoCourse_Answer_txt.append("Teaching Assistant\n");
        this.TwoCourse_Answer_txt.append("==================\n");
        Map<String ,Term>[] result = q.allSolutions();
        for (int i = 0; i < result.length; i++) {
            TwoCourse_Answer_txt.setText(TwoCourse_Answer_txt.getText() + (i+1) + " - " + result[i].get("H").toString() + "\n"
            +   (i+2) + " - " + result[i].get("Y").toString() + "\n"
            );
            System.out.println(String.valueOf(result[i].get("H")));
            System.out.println(String.valueOf(result[i].get("Y")));
            System.out.println(String.valueOf(result[i].get("T")));
        }
    }//GEN-LAST:event_Two_Course_Answer_btnActionPerformed

    private void Three_Course_Answer_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Three_Course_Answer_btnActionPerformed
        ThreeCourse_Answer_txt.setText("");
        Query conn = new Query("consult('Knowledge.pl')");
        conn.hasSolution();
        String getQueryText = ask_Fcourse_name_txt_p3.getText();
        String getQueryText2 = ask_Scourse_name_txt_p3.getText();
        String getQueryText3 = ask_Tcourse_name_txt_p3.getText();
        String askCoursesQuery = "assistCourses(["+ getQueryText.trim() + "," + getQueryText2.trim() + "," + getQueryText3.trim() + "], [H,Y,Z|T]).";
        Query q = new Query(askCoursesQuery);
        
        System.out.println(askCoursesQuery);
        this.ThreeCourse_Answer_txt.append("Teaching Assistant\n");
        this.ThreeCourse_Answer_txt.append("==================\n");
        Map<String ,Term>[] result = q.allSolutions();
        for (int i = 0; i < result.length; i++) {
            ThreeCourse_Answer_txt.setText(ThreeCourse_Answer_txt.getText() + (i+1) + " - " + result[i].get("H").toString() + "\n"
            +   (i+2) + " - " + result[i].get("Y").toString() + "\n"
            +   (i+3) + " - " + result[i].get("Z").toString() + "\n"
            );
            System.out.println(String.valueOf(result[i].get("H")));
            System.out.println(String.valueOf(result[i].get("Y")));
            System.out.println(String.valueOf(result[i].get("T")));
        }
    }//GEN-LAST:event_Three_Course_Answer_btnActionPerformed

    private void help_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_help_btnActionPerformed
 mainJFrame  mainJf = new mainJFrame();
        mainJf.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_help_btnActionPerformed

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
            java.util.logging.Logger.getLogger(AssistantJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AssistantJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AssistantJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AssistantJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AssistantJFrame().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Assistant_Form_Title;
    private javax.swing.JComboBox<String> Courses_jComboBox;
    private javax.swing.JTextArea OneCourse_Answer_txt;
    private javax.swing.JTextField OneCourse_Ask_txt;
    private javax.swing.JPanel OneCoursejPanel;
    private javax.swing.JPanel OneCoursejPanel1;
    private javax.swing.JPanel OneCoursejPanel10;
    private javax.swing.JPanel OneCoursejPanel11;
    private javax.swing.JPanel OneCoursejPanel12;
    private javax.swing.JPanel OneCoursejPanel2;
    private javax.swing.JPanel OneCoursejPanel3;
    private javax.swing.JPanel OneCoursejPanel4;
    private javax.swing.JPanel OneCoursejPanel5;
    private javax.swing.JPanel OneCoursejPanel6;
    private javax.swing.JPanel OneCoursejPanel7;
    private javax.swing.JPanel OneCoursejPanel8;
    private javax.swing.JPanel OneCoursejPanel9;
    private javax.swing.JButton One_Course_Answer_btn;
    private javax.swing.JTextArea ThreeCourse_Answer_txt;
    private javax.swing.JPanel ThreeCoursejPanel;
    private javax.swing.JButton Three_Course_Answer_btn;
    private javax.swing.JTextArea TwoCourse_Answer_txt;
    private javax.swing.JPanel TwoCoursejPanel;
    private javax.swing.JButton Two_Course_Answer_btn;
    private javax.swing.JButton answer_btn;
    private javax.swing.JButton answer_btn1;
    private javax.swing.JButton answer_btn10;
    private javax.swing.JButton answer_btn11;
    private javax.swing.JButton answer_btn2;
    private javax.swing.JButton answer_btn3;
    private javax.swing.JButton answer_btn4;
    private javax.swing.JButton answer_btn5;
    private javax.swing.JButton answer_btn6;
    private javax.swing.JButton answer_btn7;
    private javax.swing.JButton answer_btn8;
    private javax.swing.JButton answer_btn9;
    private javax.swing.JTextArea answer_txt;
    private javax.swing.JTextArea answer_txt1;
    private javax.swing.JTextArea answer_txt10;
    private javax.swing.JTextArea answer_txt11;
    private javax.swing.JTextArea answer_txt2;
    private javax.swing.JTextArea answer_txt3;
    private javax.swing.JTextArea answer_txt4;
    private javax.swing.JTextArea answer_txt5;
    private javax.swing.JTextArea answer_txt6;
    private javax.swing.JTextArea answer_txt7;
    private javax.swing.JTextArea answer_txt8;
    private javax.swing.JTextArea answer_txt9;
    private javax.swing.JLabel askNoCourses_lbl;
    private javax.swing.JTextField ask_Fcourse_name_txt_p2;
    private javax.swing.JTextField ask_Fcourse_name_txt_p3;
    private javax.swing.JTextField ask_Scourse_name_txt_p2;
    private javax.swing.JTextField ask_Scourse_name_txt_p3;
    private javax.swing.JTextField ask_Tcourse_name_txt_p3;
    private javax.swing.JTextField ask_course_name_txt;
    private javax.swing.JTextField ask_course_name_txt1;
    private javax.swing.JTextField ask_course_name_txt10;
    private javax.swing.JTextField ask_course_name_txt11;
    private javax.swing.JTextField ask_course_name_txt2;
    private javax.swing.JTextField ask_course_name_txt3;
    private javax.swing.JTextField ask_course_name_txt4;
    private javax.swing.JTextField ask_course_name_txt5;
    private javax.swing.JTextField ask_course_name_txt6;
    private javax.swing.JTextField ask_course_name_txt7;
    private javax.swing.JTextField ask_course_name_txt8;
    private javax.swing.JTextField ask_course_name_txt9;
    private javax.swing.JPanel button_panel;
    private javax.swing.JLabel courses_result_chosen_lbl;
    private javax.swing.JButton exit_btn;
    private javax.swing.JButton help_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JLayeredPane layeredPane;
    // End of variables declaration//GEN-END:variables
}
