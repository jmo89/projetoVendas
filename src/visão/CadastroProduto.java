/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visão;
/**
 *
 * @author Joel
 */
public class CadastroProduto extends javax.swing.JFrame {

    /**
     * Creates new form CadastroProduto
     */
    public CadastroProduto() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        coProduto = new javax.swing.JLabel();
        codProduto = new javax.swing.JTextField();
        produto = new javax.swing.JLabel();
        codExterno = new javax.swing.JTextField();
        unidade = new javax.swing.JComboBox<>();
        unid = new javax.swing.JLabel();
        salvarProd = new javax.swing.JButton();
        excluirProd = new javax.swing.JButton();
        cancelarProd = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        precoCompra = new javax.swing.JTextField();
        precoVenda = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        qtd = new javax.swing.JLabel();
        qtdProduto = new javax.swing.JTextField();
        novoProd = new javax.swing.JButton();
        editarPord = new javax.swing.JButton();
        fornProduto = new javax.swing.JLabel();
        fornecedorProd = new javax.swing.JComboBox<>();
        campoPesquisa = new javax.swing.JTextField();
        pesquisaProd = new javax.swing.JButton();
        sairProd = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        cadprod = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Protudos");

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        coProduto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        coProduto.setText("Cod:");

        codProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codProdutoActionPerformed(evt);
            }
        });

        produto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        produto.setText("Produto:");

        codExterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codExternoActionPerformed(evt);
            }
        });

        unidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "UN", "CX", "MT", "LT", "KG" }));

        unid.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        unid.setText("Unidade:");

        salvarProd.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        salvarProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/gravar.png"))); // NOI18N
        salvarProd.setText("Salvar");
        salvarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarProdActionPerformed(evt);
            }
        });

        excluirProd.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        excluirProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/excluir.png"))); // NOI18N
        excluirProd.setText("Excluir");

        cancelarProd.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cancelarProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/cancelar.png"))); // NOI18N
        cancelarProd.setText("Cancelar");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Preço de compra:");

        precoVenda.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        precoVenda.setText("Preço de venda:");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        qtd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        qtd.setText("Quatidade:");

        novoProd.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        novoProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/adicionar.png"))); // NOI18N
        novoProd.setText("Novo");

        editarPord.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        editarPord.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/editar.png"))); // NOI18N
        editarPord.setText("Editar");

        fornProduto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        fornProduto.setText("Fonecedor:");

        fornecedorProd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        campoPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoPesquisaActionPerformed(evt);
            }
        });

        pesquisaProd.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        pesquisaProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/pesquisar.png"))); // NOI18N
        pesquisaProd.setText("Pesquisar");

        sairProd.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        sairProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/sair.png"))); // NOI18N
        sairProd.setText("Sair");

        jTable1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Data", "Tipo de Documento", "Quantidade", "Saldo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Histórico:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(coProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(codProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(produto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(codExterno)
                        .addGap(110, 110, 110)
                        .addComponent(unid)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(unidade, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(novoProd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(salvarProd, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(qtd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(qtdProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(editarPord, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(excluirProd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cancelarProd)
                                .addGap(18, 18, 18)
                                .addComponent(campoPesquisa)
                                .addGap(18, 18, 18)
                                .addComponent(pesquisaProd, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(precoCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(precoVenda)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                                .addComponent(fornProduto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fornecedorProd, 0, 111, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sairProd)))
                .addGap(28, 28, 28))
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 902, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(coProduto)
                    .addComponent(codProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(produto)
                    .addComponent(codExterno, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(unid)
                    .addComponent(unidade, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(precoVenda)
                    .addComponent(precoCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qtd)
                    .addComponent(qtdProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fornProduto)
                    .addComponent(fornecedorProd, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salvarProd)
                    .addComponent(cancelarProd)
                    .addComponent(novoProd)
                    .addComponent(editarPord)
                    .addComponent(excluirProd)
                    .addComponent(campoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pesquisaProd))
                .addGap(33, 33, 33)
                .addComponent(sairProd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cadprod.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        cadprod.setText("Cadastro de Produtos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cadprod)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cadprod)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(972, 617));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void codProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codProdutoActionPerformed

    private void codExternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codExternoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codExternoActionPerformed

    private void salvarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salvarProdActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void campoPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoPesquisaActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cadprod;
    private javax.swing.JTextField campoPesquisa;
    private javax.swing.JButton cancelarProd;
    private javax.swing.JLabel coProduto;
    private javax.swing.JTextField codExterno;
    private javax.swing.JTextField codProduto;
    private javax.swing.JButton editarPord;
    private javax.swing.JButton excluirProd;
    private javax.swing.JLabel fornProduto;
    private javax.swing.JComboBox<String> fornecedorProd;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton novoProd;
    private javax.swing.JButton pesquisaProd;
    private javax.swing.JTextField precoCompra;
    private javax.swing.JLabel precoVenda;
    private javax.swing.JLabel produto;
    private javax.swing.JLabel qtd;
    private javax.swing.JTextField qtdProduto;
    private javax.swing.JButton sairProd;
    private javax.swing.JButton salvarProd;
    private javax.swing.JLabel unid;
    private javax.swing.JComboBox<String> unidade;
    // End of variables declaration//GEN-END:variables
}
