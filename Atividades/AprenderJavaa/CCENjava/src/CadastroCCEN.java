
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;


public class CadastroCCEN extends javax.swing.JFrame {

    String nome = null;
    String matricula = null;
    String curso = null;
    String nascimento = null;
    String serie = null;
    String turma = null;
    private Calendar dataNasc;

    public CadastroCCEN() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GrupoSerie = new javax.swing.ButtonGroup();
        GrupoTurma = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtnome = new javax.swing.JTextField();
        txtmatricula = new javax.swing.JTextField();
        txtcurso = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        ano2 = new javax.swing.JRadioButton();
        ano1 = new javax.swing.JRadioButton();
        ano3 = new javax.swing.JRadioButton();
        ano4 = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        turmaB = new javax.swing.JRadioButton();
        turmaUnica = new javax.swing.JRadioButton();
        turmaA = new javax.swing.JRadioButton();
        astronomia = new javax.swing.JCheckBox();
        biologia = new javax.swing.JCheckBox();
        fisica = new javax.swing.JCheckBox();
        mat = new javax.swing.JCheckBox();
        quimica = new javax.swing.JCheckBox();
        Cadastrar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txtdata = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationByPlatform(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(14, 6, 50));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Imagem do WhatsApp de 2024-03-18 à(s) 19.19.49_d7900fd8.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(521, 16, 195, 119));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(155, 212, 185));
        jLabel3.setText("Inscrição do Clube");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 44, 420, -1));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("Inscrição do Clube");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 44, 420, 60));

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(155, 212, 185));
        jLabel4.setText("Nome:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 147, 70, -1));

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(155, 212, 185));
        jLabel5.setText("Curso:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 60, -1));

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(155, 212, 185));
        jLabel6.setText("Data de nascimento:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 190, -1));

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(155, 212, 185));
        jLabel7.setText("Setor do Clube:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 425, 150, -1));

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(155, 212, 185));
        jLabel8.setText("Matrícula:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 100, -1));

        txtnome.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        txtnome.setForeground(new java.awt.Color(14, 6, 50));
        txtnome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnomeActionPerformed(evt);
            }
        });
        txtnome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnomeKeyPressed(evt);
            }
        });
        jPanel1.add(txtnome, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 153, 480, -1));

        txtmatricula.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        txtmatricula.setForeground(new java.awt.Color(14, 6, 50));
        txtmatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmatriculaActionPerformed(evt);
            }
        });
        jPanel1.add(txtmatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 450, -1));

        txtcurso.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        txtcurso.setForeground(new java.awt.Color(14, 6, 50));
        txtcurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcursoActionPerformed(evt);
            }
        });
        jPanel1.add(txtcurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 477, -1));

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(155, 212, 185));
        jLabel9.setText("Série:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 60, -1));

        GrupoSerie.add(ano2);
        ano2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 20)); // NOI18N
        ano2.setForeground(new java.awt.Color(204, 204, 204));
        ano2.setText(" 2° ano");
        ano2.setContentAreaFilled(false);
        ano2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ano2ActionPerformed(evt);
            }
        });
        jPanel1.add(ano2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, 98, -1));

        GrupoSerie.add(ano1);
        ano1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 20)); // NOI18N
        ano1.setForeground(new java.awt.Color(204, 204, 204));
        ano1.setText(" 1° ano");
        ano1.setBorder(null);
        ano1.setContentAreaFilled(false);
        ano1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ano1ActionPerformed(evt);
            }
        });
        jPanel1.add(ano1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, 98, -1));

        GrupoSerie.add(ano3);
        ano3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 20)); // NOI18N
        ano3.setForeground(new java.awt.Color(204, 204, 204));
        ano3.setText(" 3° ano");
        ano3.setContentAreaFilled(false);
        jPanel1.add(ano3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 320, 98, -1));

        GrupoSerie.add(ano4);
        ano4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 20)); // NOI18N
        ano4.setForeground(new java.awt.Color(204, 204, 204));
        ano4.setText(" 4° ano");
        ano4.setContentAreaFilled(false);
        jPanel1.add(ano4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 320, 98, -1));

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(155, 212, 185));
        jLabel10.setText("Turma:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, -1, -1));

        GrupoTurma.add(turmaB);
        turmaB.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 20)); // NOI18N
        turmaB.setForeground(new java.awt.Color(204, 204, 204));
        turmaB.setText("  B");
        turmaB.setBorder(null);
        turmaB.setBorderPainted(true);
        turmaB.setContentAreaFilled(false);
        jPanel1.add(turmaB, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, 98, -1));

        GrupoTurma.add(turmaUnica);
        turmaUnica.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 20)); // NOI18N
        turmaUnica.setForeground(new java.awt.Color(204, 204, 204));
        turmaUnica.setText(" Única");
        turmaUnica.setContentAreaFilled(false);
        jPanel1.add(turmaUnica, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 370, 98, -1));

        GrupoTurma.add(turmaA);
        turmaA.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 20)); // NOI18N
        turmaA.setForeground(new java.awt.Color(204, 204, 204));
        turmaA.setText("  A");
        turmaA.setContentAreaFilled(false);
        turmaA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                turmaAActionPerformed(evt);
            }
        });
        jPanel1.add(turmaA, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, 98, -1));

        astronomia.setBackground(new java.awt.Color(14, 6, 50));
        astronomia.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 20)); // NOI18N
        astronomia.setForeground(new java.awt.Color(204, 204, 204));
        astronomia.setText(" Astronomia");
        astronomia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                astronomiaActionPerformed(evt);
            }
        });
        jPanel1.add(astronomia, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 462, 164, -1));

        biologia.setBackground(new java.awt.Color(14, 6, 50));
        biologia.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 20)); // NOI18N
        biologia.setForeground(new java.awt.Color(204, 204, 204));
        biologia.setText(" Biologia");
        jPanel1.add(biologia, new org.netbeans.lib.awtextra.AbsoluteConstraints(257, 462, 119, -1));

        fisica.setBackground(new java.awt.Color(14, 6, 50));
        fisica.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 20)); // NOI18N
        fisica.setForeground(new java.awt.Color(204, 204, 204));
        fisica.setText(" Física");
        jPanel1.add(fisica, new org.netbeans.lib.awtextra.AbsoluteConstraints(443, 462, 112, -1));

        mat.setBackground(new java.awt.Color(14, 6, 50));
        mat.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 20)); // NOI18N
        mat.setForeground(new java.awt.Color(204, 204, 204));
        mat.setText(" Matemática");
        jPanel1.add(mat, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 499, 164, -1));

        quimica.setBackground(new java.awt.Color(14, 6, 50));
        quimica.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 20)); // NOI18N
        quimica.setForeground(new java.awt.Color(204, 204, 204));
        quimica.setText(" Química");
        jPanel1.add(quimica, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 499, 164, -1));

        Cadastrar.setBackground(new java.awt.Color(14, 6, 50));
        Cadastrar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 20)); // NOI18N
        Cadastrar.setForeground(new java.awt.Color(155, 212, 185));
        Cadastrar.setText("Cadastrar");
        Cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarActionPerformed(evt);
            }
        });
        jPanel1.add(Cadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(591, 425, 129, 128));

        jPanel2.setBackground(new java.awt.Color(14, 6, 50));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Imagem do WhatsApp de 2024-03-18 à(s) 21.03.03_5df27214_resized.jpg"))); // NOI18N
        jLabel12.setText("jLabel12");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 145, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(605, 147, -1, -1));

        txtdata.setForeground(new java.awt.Color(14, 6, 50));
        try {
            txtdata.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtdata.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        txtdata.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtdataKeyPressed(evt);
            }
        });
        jPanel1.add(txtdata, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 360, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void turmaAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_turmaAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_turmaAActionPerformed

    private void ano1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ano1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ano1ActionPerformed

    private void ano2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ano2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ano2ActionPerformed

    private void txtcursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcursoActionPerformed

    private void txtmatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmatriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmatriculaActionPerformed

    private void txtnomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnomeActionPerformed

    private void CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarActionPerformed

        nome = txtnome.getText();
        matricula = txtmatricula.getText();
        curso = txtcurso.getText();
        nascimento = txtdata.getText();
        String setor[] = new String[5];

        if (ano1.isSelected()) {
            serie = ano1.getText();
        } else if (ano2.isSelected()) {
            serie = ano2.getText();
        } else if (ano3.isSelected()) {
            serie = ano3.getText();
        } else if (ano4.isSelected()) {
            serie = ano4.getText();
        }

        if (turmaA.isSelected()) {
            turma = turmaA.getText();
        } else if (turmaB.isSelected()) {
            turma = turmaB.getText();
        } else if (turmaUnica.isSelected()) {
            turma = turmaUnica.getText();
        }
       
      
       if (astronomia.isSelected()){
           setor[0] = astronomia.getText();
       }
       else
           setor[0] = "";
       if (biologia.isSelected()){
           setor[1] = biologia.getText();
       }
       else
           setor[1] = "";
       if (fisica.isSelected()){
           setor[2] = fisica.getText();
       }
       else
           setor[2] = "";
       if (mat.isSelected()){
           setor[3] = mat.getText();
       }
       else
           setor[3] = "";
       if (quimica.isSelected()){
           setor[4] = quimica.getText();
       }
       else
           setor[4] = "";
       
        if(setor[0] == "" && setor[1] == "" && setor[2] == "" && setor[3] == "" && setor[4] == ""){
            JOptionPane.showMessageDialog(this, "Selecione o setor.");
        } 
        
              
           
        if (nome.isBlank()) {
            JOptionPane.showMessageDialog(this, "Nome precisa ser preenchido, insira seu nome completo.");
            txtnome.requestFocus();
        }else if(nascimento.isBlank()){
            JOptionPane.showMessageDialog(this, "Data precisa ser preenchida, insira data completa.");
            txtdata.requestFocus();
        }else if(matricula.isBlank()){
            JOptionPane.showMessageDialog(this, "Matrícula precisa ser preenchida, insira matrícula completa.");
            txtmatricula.requestFocus();
        }else if(curso.isBlank()){
            JOptionPane.showMessageDialog(this, "Curso precisa ser preenchido, insira curso completo.");
            txtcurso.requestFocus();
        }
        
        if(serie == null){
            JOptionPane.showMessageDialog(this, "Selecione a série.");
        }
        else if(turma == null){
            JOptionPane.showMessageDialog(this, "Selecione a turma.");
        }
        
        
        
        else{
            Date datanascimento = null;
            Calendar datanasc = Calendar.getInstance();
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            formato.setLenient(false);
            try{
                datanascimento = formato.parse(nascimento);
                int idade = CalcularIdade.calcular(datanascimento);
                if(idade < 18){
                    CadastroCCEN2 CadastroCCEN2 = new CadastroCCEN2(); // define o frame como parametro
                    CadastroCCEN2.setVisible(true); // chama o frame 2
                    CadastroCCEN2.setVar(nome, matricula, curso, nascimento, idade, setor[0],setor[1],setor[2],setor[3],setor[4], turma, serie);
                    
                 
                }else{
                    JOptionPane.showMessageDialog(this, "Nome: "+ nome + "\nData de nascimento: "+ nascimento + "\nIdade: "+idade+ "\nMatrícula: "+ matricula + "\nCurso: " + curso + "\nTurma: " + serie + "" + turma +"\nSetor(es): " + setor[0] + setor[1] + setor[2] + setor[3] + setor[4] ); //resultado final caso for de maior
                }
            }catch(HeadlessException | ParseException e){
                JOptionPane.showMessageDialog(this, "data invalida");
            }
            
        }   
        
    }//GEN-LAST:event_CadastrarActionPerformed

    private void txtnomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnomeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtdata.requestFocus();
        }
    }//GEN-LAST:event_txtnomeKeyPressed

    private void txtdataKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdataKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtmatricula.requestFocus();
        }
    }//GEN-LAST:event_txtdataKeyPressed

    private void astronomiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_astronomiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_astronomiaActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroCCEN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cadastrar;
    private javax.swing.ButtonGroup GrupoSerie;
    private javax.swing.ButtonGroup GrupoTurma;
    private javax.swing.JRadioButton ano1;
    private javax.swing.JRadioButton ano2;
    private javax.swing.JRadioButton ano3;
    private javax.swing.JRadioButton ano4;
    private javax.swing.JCheckBox astronomia;
    private javax.swing.JCheckBox biologia;
    private javax.swing.JCheckBox fisica;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JCheckBox mat;
    private javax.swing.JCheckBox quimica;
    private javax.swing.JRadioButton turmaA;
    private javax.swing.JRadioButton turmaB;
    private javax.swing.JRadioButton turmaUnica;
    private javax.swing.JTextField txtcurso;
    private javax.swing.JFormattedTextField txtdata;
    private javax.swing.JTextField txtmatricula;
    private javax.swing.JTextField txtnome;
    // End of variables declaration//GEN-END:variables
}
