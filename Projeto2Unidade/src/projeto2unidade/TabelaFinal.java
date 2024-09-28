package projeto2unidade;


import javax.swing.table.DefaultTableModel;

public class TabelaFinal extends javax.swing.JFrame {

    DefaultTableModel modelo = null;
    String[][] tabela1;

    private void preencherTabela() {
        modelo.getDataVector().clear();

        for (int i = 0; i < tabela1.length; i++) {
            modelo.addRow(new Object[]{tabela1[i][0],
                tabela1[i][1],
                tabela1[i][2],
                tabela1[i][3]}
            );
        }
    }

    public TabelaFinal(String[][] tabela) {
        initComponents();
        setLocationRelativeTo(null);
        this.tabela1 = tabela;
        modelo = (DefaultTableModel) tblImprimir.getModel();
        preencherTabela();
    }
    
    public TabelaFinal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblImprimir = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblImprimir.setAutoCreateRowSorter(true);
        tblImprimir.setBackground(new java.awt.Color(204, 255, 204));
        tblImprimir.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 18)); // NOI18N
        tblImprimir.setForeground(new java.awt.Color(0, 102, 51));
        tblImprimir.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "Cidade", "Estado", "CPF"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblImprimir);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 772, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TabelaFinal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblImprimir;
    // End of variables declaration//GEN-END:variables
}
