
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author User
 */
public class TabProduto extends javax.swing.JFrame {

    private static TabProduto tabProduto1;
    
    /**
     * Creates new form TabelaProduto
     */
    public TabProduto() {
        initComponents();
        listarTab1();
    }
    
    public static TabProduto getTabProd(){
        if(tabProduto1 == null){
            tabProduto1 = new TabProduto();
        }
        return tabProduto1;
    }

    public static void listarTab1(){
        DefaultTableModel modelo = (DefaultTableModel) tabProduto.getModel();
        int i = 0;
        
        modelo.setRowCount(i);
        
        for(Guitarra guit : JanelaGuit.getGerGuit().getBdGuit()){
            modelo.insertRow(i, new Object[]{guit.getCodigo(), 1, guit.produto, guit.getTipo(), guit.getMarca(), 
                    guit.getModelo(), guit.getCaptador(), guit.getQtdCordas(), guit.getVenda1().getPreco()});
            i++;
        }
        
        for(Violao violao : JanelaViolao.getGerViolao().getBdViolao()){
            modelo.insertRow(i, new Object[]{violao.getCodigo(), 1, violao.produto, violao.getTipo(), violao.getMarca(), 
                    violao.getModelo(), " ", violao.getQtdCordas(), violao.getVenda1().getPreco()});
            i++;
        }
        
        for(Baixo baixo : JanelaBaixo.getGerBaixo().getBdBaixo()){
            modelo.insertRow(i, new Object[]{baixo.getCodigo(), 1, baixo.produto, baixo.getTipo(), baixo.getMarca(), 
                    baixo.getModelo(), baixo.getCaptador(), baixo.getQtdCordas(), baixo.getVenda1().getPreco()});
            i++;
        }
        for(Item item : JanelaItem.getGerItem().getBdItem()){
            modelo.insertRow(i, new Object[]{item.getCodigo(), item.getQtd(), item.produto, " ", 
                    " ", " ", " ", item.getPreco()});
            i++;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TabProduto1 = new javax.swing.JScrollPane();
        tabProduto = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        tabProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Quantidade", "Produto", "Tipo", "Marca", "Modelo", "Captador", "QtdCordas", "Preço"
            }
        ));
        TabProduto1.setViewportView(tabProduto);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(TabProduto1, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(TabProduto1, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(TabProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TabProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TabProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TabProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TabProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane TabProduto1;
    private static javax.swing.JTable tabProduto;
    // End of variables declaration//GEN-END:variables
}