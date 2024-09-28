
package projeto2unidade;

import javax.swing.JOptionPane;

public class Projeto2Unidadee extends javax.swing.JFrame {

    String matriz [][] = new String [10][4];
    int i = 0, j = 0;
    
    public Projeto2Unidadee() {
        initComponents();
        
        campoum.setVisible(false);
        campodois.setVisible(false);
        campotres.setVisible(false);
        campoquatro.setVisible(false);
        
        setLocationRelativeTo(null);
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtcidade = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtnome = new javax.swing.JTextField();
        txtestado = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cadastrar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtcpf = new javax.swing.JTextField();
        campoum = new javax.swing.JLabel();
        campodois = new javax.swing.JLabel();
        campotres = new javax.swing.JLabel();
        campoquatro = new javax.swing.JLabel();
        cadastrar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 153));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto2unidade/image-removebg-preview (3).png"))); // NOI18N
        jLabel2.setText("jLabel2");

        jLabel3.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 51));
        jLabel3.setText("ACADEMIA BEM-ESTAR");

        jLabel1.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 51));
        jLabel1.setText("NOME:");

        txtcidade.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 30)); // NOI18N
        txtcidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcidadeActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 51));
        jLabel4.setText("CIDADE:");

        jLabel5.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 51));
        jLabel5.setText("ESTADO:");

        txtnome.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 30)); // NOI18N
        txtnome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnomeActionPerformed(evt);
            }
        });

        txtestado.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 30)); // NOI18N
        txtestado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtestadoActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 1, 60)); // NOI18N
        jLabel6.setText("FICHA DE INSCRIÇÃO");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto2unidade/image-removebg-preview (4).png"))); // NOI18N
        jLabel7.setText("jLabel7");

        cadastrar.setBackground(new java.awt.Color(0, 102, 51));
        cadastrar.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 1, 30)); // NOI18N
        cadastrar.setForeground(new java.awt.Color(255, 255, 255));
        cadastrar.setText("CADASTRAR");
        cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 51));
        jLabel8.setText("CPF:");

        txtcpf.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 30)); // NOI18N
        txtcpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcpfActionPerformed(evt);
            }
        });

        campoum.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        campoum.setForeground(new java.awt.Color(255, 0, 0));
        campoum.setText("*CAMPO OBRIGATÓRIO*");

        campodois.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        campodois.setForeground(new java.awt.Color(255, 0, 0));
        campodois.setText("*CAMPO OBRIGATÓRIO*");

        campotres.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        campotres.setForeground(new java.awt.Color(255, 0, 0));
        campotres.setText("*CAMPO OBRIGATÓRIO*");

        campoquatro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        campoquatro.setForeground(new java.awt.Color(255, 0, 0));
        campoquatro.setText("*CAMPO OBRIGATÓRIO*");

        cadastrar1.setBackground(new java.awt.Color(0, 102, 51));
        cadastrar1.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 1, 30)); // NOI18N
        cadastrar1.setForeground(new java.awt.Color(255, 255, 255));
        cadastrar1.setText("IMPRIMIR DADOS");
        cadastrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtcidade))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoum)
                    .addComponent(campodois)
                    .addComponent(campotres)
                    .addComponent(campoquatro))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(156, 156, 156)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtcpf, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(12, 12, 12)
                                        .addComponent(txtestado, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(124, 124, 124)
                                .addComponent(cadastrar)
                                .addGap(18, 18, 18)
                                .addComponent(cadastrar1)))
                        .addGap(123, 123, 123))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(campoum)))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtcidade, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(campodois)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtestado, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(campotres)))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtcpf, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(campoquatro)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cadastrar)
                            .addComponent(cadastrar1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtcidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcidadeActionPerformed

    private void txtnomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnomeActionPerformed

    private void txtestadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtestadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtestadoActionPerformed

    private void cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarActionPerformed

        if ((txtestado.getText().trim().isEmpty()) || (txtnome.getText().trim().isEmpty()) || (txtcidade.getText().trim().isEmpty()) || (txtcpf.getText().trim().isEmpty())) {
            if (txtnome.getText().trim().isEmpty()) {
                campoum.setVisible(true);
            } else {
                campoum.setVisible(false);
            }
            if (txtcidade.getText().trim().isEmpty()) {
                campodois.setVisible(true);
            } else {
                campodois.setVisible(false);
            }
            if (txtestado.getText().trim().isEmpty()) {
                campotres.setVisible(true);
            } else {
                campotres.setVisible(false);
            }
            if (txtcpf.getText().trim().isEmpty()) {
                campoquatro.setVisible(true);
            } else {
                campoquatro.setVisible(false);
            }

        } else {
            matriz[i][j] = txtnome.getText();
            j++;
            matriz[i][j] = txtcidade.getText();
            j++;
            matriz[i][j] = txtestado.getText();
            j++;
            matriz[i][j] = txtcpf.getText();
            j = 0;
            i++;

            JOptionPane.showMessageDialog(this, "INSCRIÇÃO CADASTRADA COM SUCESSO!");
            txtnome.setText(" ");
            txtestado.setText(" ");
            txtcidade.setText(" ");
            txtcpf.setText(" ");
            campoum.setVisible(false);
            campodois.setVisible(false);
            campotres.setVisible(false);
            campoquatro.setVisible(false);
        }
        
    }//GEN-LAST:event_cadastrarActionPerformed

    private void txtcpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcpfActionPerformed

    private void cadastrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrar1ActionPerformed

        new TabelaFinal (matriz).setVisible(true);


    }//GEN-LAST:event_cadastrar1ActionPerformed

    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Projeto2Unidadee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastrar;
    private javax.swing.JButton cadastrar1;
    private javax.swing.JLabel campodois;
    private javax.swing.JLabel campoquatro;
    private javax.swing.JLabel campotres;
    private javax.swing.JLabel campoum;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtcidade;
    private javax.swing.JTextField txtcpf;
    private javax.swing.JTextField txtestado;
    private javax.swing.JTextField txtnome;
    // End of variables declaration//GEN-END:variables
}
