/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

/**
 *
 * @author Fofao
 */
public class CadastroFornecedor extends javax.swing.JFrame {

    /**
     * Creates new form CadastroFornecedor
     */
    public CadastroFornecedor() {
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

        Botao_Excluir = new javax.swing.JButton();
        Botao_Listar = new javax.swing.JButton();
        Text_Nome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Text_Telefone = new javax.swing.JFormattedTextField();
        Text_Email = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Botao_Sair = new javax.swing.JButton();
        Text_CPF = new javax.swing.JTextField();
        Botao_Cadastrar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        Botao_Alterar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela_Fornecedor = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuCadastros = new javax.swing.JMenu();
        MenuCadastroClientes = new javax.swing.JMenuItem();
        MenuCadastroFornecedores = new javax.swing.JMenuItem();
        MenuCadastroProdutos = new javax.swing.JMenuItem();
        MenuFinanceiro = new javax.swing.JMenu();
        MenuPedidos = new javax.swing.JMenuItem();
        MenuVendas = new javax.swing.JMenuItem();
        MenuSaldos = new javax.swing.JMenuItem();
        MenuHistorico = new javax.swing.JMenu();
        MenuHistoricogeral = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Botao_Excluir.setText("Excluir");

        Botao_Listar.setText("Atualizar");
        Botao_Listar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_ListarActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome:");

        jLabel2.setText("Telefone");

        try {
            Text_Telefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel3.setText("Email:");

        Botao_Sair.setText("Sair");
        Botao_Sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botao_SairMouseClicked(evt);
            }
        });

        Botao_Cadastrar.setText("Cadastrar");

        jLabel4.setText("CNPJ:");

        Botao_Alterar.setText("Alterar");

        Tabela_Fornecedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "Telefone", "Email", "CNPJ"
            }
        ));
        jScrollPane1.setViewportView(Tabela_Fornecedor);

        MenuCadastros.setText("Cadastros");

        MenuCadastroClientes.setText("Clientes");
        MenuCadastroClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuCadastroClientesMouseClicked(evt);
            }
        });
        MenuCadastroClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCadastroClientesActionPerformed(evt);
            }
        });
        MenuCadastros.add(MenuCadastroClientes);

        MenuCadastroFornecedores.setText("Fornecedores");
        MenuCadastroFornecedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCadastroFornecedoresActionPerformed(evt);
            }
        });
        MenuCadastros.add(MenuCadastroFornecedores);

        MenuCadastroProdutos.setText("Produtos");
        MenuCadastroProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCadastroProdutosActionPerformed(evt);
            }
        });
        MenuCadastros.add(MenuCadastroProdutos);

        jMenuBar1.add(MenuCadastros);

        MenuFinanceiro.setText("Financeiro");

        MenuPedidos.setText("Pedido");
        MenuPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuPedidosActionPerformed(evt);
            }
        });
        MenuFinanceiro.add(MenuPedidos);

        MenuVendas.setText("Vendas");
        MenuVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuVendasActionPerformed(evt);
            }
        });
        MenuFinanceiro.add(MenuVendas);

        MenuSaldos.setText("Saldos");
        MenuSaldos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuSaldosActionPerformed(evt);
            }
        });
        MenuFinanceiro.add(MenuSaldos);

        jMenuBar1.add(MenuFinanceiro);

        MenuHistorico.setText("Histórico");

        MenuHistoricogeral.setText("Geral");
        MenuHistoricogeral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuHistoricogeralActionPerformed(evt);
            }
        });
        MenuHistorico.add(MenuHistoricogeral);

        jMenuBar1.add(MenuHistorico);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Text_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Text_Telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(Text_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(Text_CPF, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Botao_Cadastrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Botao_Alterar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Botao_Excluir)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Botao_Listar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Botao_Sair, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Text_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Text_Telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Text_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Text_CPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(Botao_Listar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Botao_Cadastrar)
                    .addComponent(Botao_Alterar)
                    .addComponent(Botao_Excluir)
                    .addComponent(Botao_Sair, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Botao_ListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao_ListarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Botao_ListarActionPerformed

    private void MenuCadastroClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuCadastroClientesMouseClicked

    }//GEN-LAST:event_MenuCadastroClientesMouseClicked

    private void MenuCadastroClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCadastroClientesActionPerformed
        CadastroClientes c = new CadastroClientes();
        c.setVisible(true);
        dispose();
    }//GEN-LAST:event_MenuCadastroClientesActionPerformed

    private void MenuCadastroFornecedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCadastroFornecedoresActionPerformed
        CadastroFornecedor c = new CadastroFornecedor();
        c.setVisible(true);
        dispose();
    }//GEN-LAST:event_MenuCadastroFornecedoresActionPerformed

    private void MenuCadastroProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCadastroProdutosActionPerformed
        CadastroProdutos c = new CadastroProdutos();
        c.setVisible(true);
        dispose();
    }//GEN-LAST:event_MenuCadastroProdutosActionPerformed

    private void MenuPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuPedidosActionPerformed
        Pedidos c = new Pedidos();
        c.setVisible(true);
        dispose();
    }//GEN-LAST:event_MenuPedidosActionPerformed

    private void MenuVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuVendasActionPerformed
        Vendas c = new Vendas();
        c.setVisible(true);
        dispose();
    }//GEN-LAST:event_MenuVendasActionPerformed

    private void MenuSaldosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuSaldosActionPerformed
        Saldos c = new Saldos();
        c.setVisible(true);
        dispose();
    }//GEN-LAST:event_MenuSaldosActionPerformed

    private void MenuHistoricogeralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuHistoricogeralActionPerformed
        HistGeral c = new HistGeral();
        c.setVisible(true);
        dispose();
    }//GEN-LAST:event_MenuHistoricogeralActionPerformed

    private void Botao_SairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botao_SairMouseClicked
        Menu m = new Menu();
        m.setVisible(true);
        dispose();
    }//GEN-LAST:event_Botao_SairMouseClicked

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
            java.util.logging.Logger.getLogger(CadastroFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroFornecedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Botao_Alterar;
    private javax.swing.JButton Botao_Cadastrar;
    private javax.swing.JButton Botao_Excluir;
    private javax.swing.JButton Botao_Listar;
    private javax.swing.JButton Botao_Sair;
    private javax.swing.JMenuItem MenuCadastroClientes;
    private javax.swing.JMenuItem MenuCadastroFornecedores;
    private javax.swing.JMenuItem MenuCadastroProdutos;
    private javax.swing.JMenu MenuCadastros;
    private javax.swing.JMenu MenuFinanceiro;
    private javax.swing.JMenu MenuHistorico;
    private javax.swing.JMenuItem MenuHistoricogeral;
    private javax.swing.JMenuItem MenuPedidos;
    private javax.swing.JMenuItem MenuSaldos;
    private javax.swing.JMenuItem MenuVendas;
    private javax.swing.JTable Tabela_Fornecedor;
    private javax.swing.JTextField Text_CPF;
    private javax.swing.JTextField Text_Email;
    private javax.swing.JTextField Text_Nome;
    private javax.swing.JFormattedTextField Text_Telefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}