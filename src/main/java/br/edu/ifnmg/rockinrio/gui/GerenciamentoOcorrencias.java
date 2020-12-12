/*
 * Projeto de conclusão das disciplinas de BD e POO (Ciência da Computação/IFNMG).
 */
package br.edu.ifnmg.rockinrio.gui;

import br.edu.ifnmg.rockinrio.dao.OcorrenciaDao;
import br.edu.ifnmg.rockinrio.entity.Ocorrencia;
import javax.swing.DefaultListModel;

public class GerenciamentoOcorrencias extends javax.swing.JFrame {

    private DefaultListModel<Ocorrencia> ocorrenciasEditaveis;
    private DefaultListModel<Ocorrencia> ocorrenciasLeitura;
    private int indiceOcorrenciaSelecionada;
    
    public GerenciamentoOcorrencias() {
        initData();
        initComponents();
    }
    
    private void initData() {
        ocorrenciasEditaveis = new DefaultListModel<>();
        ocorrenciasLeitura = new DefaultListModel<>();
        
        var ocorrencias = OcorrenciaDao.obterTodos();
        
        for (Ocorrencia ocorrencia : ocorrencias) {
            if ("54079310530".equals(ocorrencia.getCpfProfissionalSeguranca())) {
                ocorrenciasEditaveis.addElement(ocorrencia);
            }
            else {
                ocorrenciasLeitura.addElement(ocorrencia);
            }
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

        popUpMenu = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        menuItemEditar = new javax.swing.JMenuItem();
        menuItemExcluir = new javax.swing.JMenuItem();
        painelPrincipal = new javax.swing.JPanel();
        retornarMenuPrincipal = new javax.swing.JLabel();
        buttonRetornarMenuPrincipal = new javax.swing.JButton();
        tituloPrincipal = new javax.swing.JLabel();
        nomeUsuarioLogado = new javax.swing.JLabel();
        registradasPorVoce = new javax.swing.JLabel();
        scrollPanelOcorrenciasEditaveis = new javax.swing.JScrollPane();
        listaOcorrenciasEditaveis = new javax.swing.JList<>();
        porOutrosProfissionais = new javax.swing.JLabel();
        scrollPanelOcorrenciasLeitura = new javax.swing.JScrollPane();
        listaOcorrenciasLeitura = new javax.swing.JList<>();
        buttonRegistrarNovaOcorrencia = new javax.swing.JButton();

        jMenuItem1.setMnemonic('d');
        jMenuItem1.setText("Detalhes");
        popUpMenu.add(jMenuItem1);

        menuItemEditar.setMnemonic('e');
        menuItemEditar.setText("Editar");
        popUpMenu.add(menuItemEditar);

        menuItemExcluir.setMnemonic('x');
        menuItemExcluir.setText("Excluir");
        popUpMenu.add(menuItemExcluir);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Rock In Rio - Gerenciamento de Ocorrências");
        setName("frm-gerenciamento-ocorrencias"); // NOI18N
        setResizable(false);

        retornarMenuPrincipal.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        retornarMenuPrincipal.setText("Retornar ao menu principal");

        buttonRetornarMenuPrincipal.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonRetornarMenuPrincipal.setText("<");
        buttonRetornarMenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRetornarMenuPrincipalActionPerformed(evt);
            }
        });

        tituloPrincipal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tituloPrincipal.setText("Gerenciamento de ocorrências");

        nomeUsuarioLogado.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        nomeUsuarioLogado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        nomeUsuarioLogado.setText("Usuário: _______________________");

        registradasPorVoce.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        registradasPorVoce.setText("Registradas por você:");

        listaOcorrenciasEditaveis.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        listaOcorrenciasEditaveis.setModel(ocorrenciasEditaveis);
        scrollPanelOcorrenciasEditaveis.setViewportView(listaOcorrenciasEditaveis);

        porOutrosProfissionais.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        porOutrosProfissionais.setText("Por outros profissionais:");

        listaOcorrenciasLeitura.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        listaOcorrenciasLeitura.setModel(ocorrenciasLeitura);
        scrollPanelOcorrenciasLeitura.setViewportView(listaOcorrenciasLeitura);

        buttonRegistrarNovaOcorrencia.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        buttonRegistrarNovaOcorrencia.setText("Registrar Nova Ocorrência");
        buttonRegistrarNovaOcorrencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRegistrarNovaOcorrenciaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelPrincipalLayout = new javax.swing.GroupLayout(painelPrincipal);
        painelPrincipal.setLayout(painelPrincipalLayout);
        painelPrincipalLayout.setHorizontalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addComponent(buttonRetornarMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(retornarMenuPrincipal)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                        .addComponent(registradasPorVoce)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(buttonRegistrarNovaOcorrencia, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE)
                    .addComponent(scrollPanelOcorrenciasEditaveis))
                .addGap(18, 18, 18)
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(porOutrosProfissionais)
                    .addComponent(scrollPanelOcorrenciasLeitura, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addComponent(tituloPrincipal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nomeUsuarioLogado, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        painelPrincipalLayout.setVerticalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonRetornarMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(retornarMenuPrincipal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nomeUsuarioLogado)
                    .addComponent(tituloPrincipal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registradasPorVoce)
                    .addComponent(porOutrosProfissionais))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                        .addComponent(scrollPanelOcorrenciasEditaveis, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonRegistrarNovaOcorrencia))
                    .addComponent(scrollPanelOcorrenciasLeitura)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonRegistrarNovaOcorrenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRegistrarNovaOcorrenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonRegistrarNovaOcorrenciaActionPerformed

    private void buttonRetornarMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRetornarMenuPrincipalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonRetornarMenuPrincipalActionPerformed

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
            java.util.logging.Logger.getLogger(GerenciamentoOcorrencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GerenciamentoOcorrencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GerenciamentoOcorrencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GerenciamentoOcorrencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GerenciamentoOcorrencias().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonRegistrarNovaOcorrencia;
    private javax.swing.JButton buttonRetornarMenuPrincipal;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JList<Ocorrencia> listaOcorrenciasEditaveis;
    private javax.swing.JList<Ocorrencia> listaOcorrenciasLeitura;
    private javax.swing.JMenuItem menuItemEditar;
    private javax.swing.JMenuItem menuItemExcluir;
    private javax.swing.JLabel nomeUsuarioLogado;
    private javax.swing.JPanel painelPrincipal;
    private javax.swing.JPopupMenu popUpMenu;
    private javax.swing.JLabel porOutrosProfissionais;
    private javax.swing.JLabel registradasPorVoce;
    private javax.swing.JLabel retornarMenuPrincipal;
    private javax.swing.JScrollPane scrollPanelOcorrenciasEditaveis;
    private javax.swing.JScrollPane scrollPanelOcorrenciasLeitura;
    private javax.swing.JLabel tituloPrincipal;
    // End of variables declaration//GEN-END:variables
}
