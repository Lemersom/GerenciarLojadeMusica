
import javax.swing.JOptionPane;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author User
 */
public class JanelaProdutos extends javax.swing.JFrame {

    private static JanelaProdutos janelaProd1 = new JanelaProdutos();
    
    /**
     * Creates new form Main
     */
    public JanelaProdutos() {
        initComponents();
    }
    
    public static JanelaProdutos getJanelaProd(){
        if(janelaProd1 == null){
            janelaProd1 = new JanelaProdutos();
        }
        return janelaProd1;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblInstrumentoMusical = new javax.swing.JLabel();
        btGuitarra = new javax.swing.JButton();
        btViolao = new javax.swing.JButton();
        btBaixo = new javax.swing.JButton();
        btItem = new javax.swing.JToggleButton();
        btSair = new javax.swing.JToggleButton();
        MenuPrincipal = new javax.swing.JMenuBar();
        MenuTabelas = new javax.swing.JMenu();
        MnItemTabProd = new javax.swing.JMenuItem();
        MnItemTabGuit = new javax.swing.JMenuItem();
        MnItemTabViolao = new javax.swing.JMenuItem();
        MnItemTabBaixo = new javax.swing.JMenuItem();
        MnItemItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gerenciar Produtos");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        lblInstrumentoMusical.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblInstrumentoMusical.setText("Instrumento M??sical");

        btGuitarra.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btGuitarra.setText("Guitarra");
        btGuitarra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGuitarraActionPerformed(evt);
            }
        });

        btViolao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btViolao.setText("Viol??o");
        btViolao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btViolaoActionPerformed(evt);
            }
        });

        btBaixo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btBaixo.setText("Baixo");
        btBaixo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBaixoActionPerformed(evt);
            }
        });

        btItem.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btItem.setText("Item");
        btItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btItemActionPerformed(evt);
            }
        });

        btSair.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        MenuTabelas.setText("Tabelas");

        MnItemTabProd.setText("Tabela Produto");
        MnItemTabProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnItemTabProdActionPerformed(evt);
            }
        });
        MenuTabelas.add(MnItemTabProd);

        MnItemTabGuit.setText("Tabela Guitarra");
        MnItemTabGuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnItemTabGuitActionPerformed(evt);
            }
        });
        MenuTabelas.add(MnItemTabGuit);

        MnItemTabViolao.setText("Tabela Viol??o");
        MnItemTabViolao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnItemTabViolaoActionPerformed(evt);
            }
        });
        MenuTabelas.add(MnItemTabViolao);

        MnItemTabBaixo.setText("Tabela Baixo");
        MnItemTabBaixo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnItemTabBaixoActionPerformed(evt);
            }
        });
        MenuTabelas.add(MnItemTabBaixo);

        MnItemItem.setText("Tabela Item");
        MnItemItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnItemItemActionPerformed(evt);
            }
        });
        MenuTabelas.add(MnItemItem);

        MenuPrincipal.add(MenuTabelas);

        setJMenuBar(MenuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(250, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblInstrumentoMusical, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(233, 233, 233))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btViolao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btGuitarra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btBaixo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(311, 311, 311))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btSair)
                        .addGap(45, 45, 45))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(lblInstrumentoMusical, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btGuitarra)
                .addGap(43, 43, 43)
                .addComponent(btViolao)
                .addGap(43, 43, 43)
                .addComponent(btBaixo)
                .addGap(47, 47, 47)
                .addComponent(btItem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(btSair)
                .addGap(45, 45, 45))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btGuitarraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuitarraActionPerformed
        JanelaGuit.getJanelaGuit().setVisible(true);
    }//GEN-LAST:event_btGuitarraActionPerformed

    private void btViolaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btViolaoActionPerformed
        JanelaViolao.getJanelaViolao().setVisible(true);
    }//GEN-LAST:event_btViolaoActionPerformed

    private void btBaixoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBaixoActionPerformed
        JanelaBaixo.getJanelaBaixo().setVisible(true);
    }//GEN-LAST:event_btBaixoActionPerformed

    private void MnItemTabGuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnItemTabGuitActionPerformed
        TabGuit.getTabGuit().setVisible(true);
        TabGuit.listarTab1();
    }//GEN-LAST:event_MnItemTabGuitActionPerformed

    private void MnItemTabViolaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnItemTabViolaoActionPerformed
        TabViolao.getTabViolao().setVisible(true);
        TabViolao.listarTab1();
    }//GEN-LAST:event_MnItemTabViolaoActionPerformed

    private void MnItemTabBaixoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnItemTabBaixoActionPerformed
        TabBaixo.getTabBat().setVisible(true);
        TabBaixo.listarTab1();
    }//GEN-LAST:event_MnItemTabBaixoActionPerformed

    private void MnItemTabProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnItemTabProdActionPerformed
        TabProduto.getTabProd().setVisible(true);
        TabProduto.listarTab1();
    }//GEN-LAST:event_MnItemTabProdActionPerformed

    private void btItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btItemActionPerformed
        JanelaItem.getJanelaItem().setVisible(true);
    }//GEN-LAST:event_btItemActionPerformed

    private void MnItemItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnItemItemActionPerformed
        TabItem.getTabItem().setVisible(true);
        TabItem.listarTab1();
    }//GEN-LAST:event_MnItemItemActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        sair();
    }//GEN-LAST:event_btSairActionPerformed

    public void sair(){
        int resp = JOptionPane.showConfirmDialog(null, 
                "Deseja Sair?", 
                "Sair", 
                JOptionPane.YES_NO_OPTION);
        if(resp == 0){
            this.dispose();
        }
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JanelaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaProdutos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar MenuPrincipal;
    private javax.swing.JMenu MenuTabelas;
    private javax.swing.JMenuItem MnItemItem;
    private javax.swing.JMenuItem MnItemTabBaixo;
    private javax.swing.JMenuItem MnItemTabGuit;
    private javax.swing.JMenuItem MnItemTabProd;
    private javax.swing.JMenuItem MnItemTabViolao;
    private javax.swing.JButton btBaixo;
    private javax.swing.JButton btGuitarra;
    private javax.swing.JToggleButton btItem;
    private javax.swing.JToggleButton btSair;
    private javax.swing.JButton btViolao;
    private javax.swing.JLabel lblInstrumentoMusical;
    // End of variables declaration//GEN-END:variables
}
