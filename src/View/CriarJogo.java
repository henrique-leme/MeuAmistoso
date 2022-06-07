/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.CriarJogoController;

/**
 *
 * @author Henrique
 */
public class CriarJogo extends javax.swing.JFrame {

    private final CriarJogoController controller;

    /**
     * Creates new form CriarJogo
     */
    public CriarJogo() {
        initComponents();
        controller = new CriarJogoController(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelNomeDoOrganizador = new javax.swing.JLabel();
        jLabelLocalDoJogo = new javax.swing.JLabel();
        jLabelDataDoJogo = new javax.swing.JLabel();
        jLabelNumerodeJogadores = new javax.swing.JLabel();
        jLabelDescricao = new javax.swing.JLabel();
        BotaoSalvar = new javax.swing.JButton();
        NomeDoOrganizador = new javax.swing.JTextField();
        LocalDoJogo = new javax.swing.JTextField();
        DataDoJogo = new javax.swing.JTextField();
        NumeroDeJogadores = new javax.swing.JTextField();
        Descricao = new javax.swing.JTextField();
        TituloPaginaCriar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabelNomeDoOrganizador.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelNomeDoOrganizador.setText("Nome do organizador:");

        jLabelLocalDoJogo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelLocalDoJogo.setText("Local do Jogo:");

        jLabelDataDoJogo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelDataDoJogo.setText("Data do Jogo:");

        jLabelNumerodeJogadores.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelNumerodeJogadores.setText("Número de Jogadores:");

        jLabelDescricao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelDescricao.setText("Descrição ( Opcional ):");

        BotaoSalvar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BotaoSalvar.setText("Salvar");
        BotaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSalvarActionPerformed(evt);
            }
        });

        LocalDoJogo.setPreferredSize(new java.awt.Dimension(185, 40));
        LocalDoJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LocalDoJogoActionPerformed(evt);
            }
        });

        DataDoJogo.setPreferredSize(new java.awt.Dimension(185, 40));

        NumeroDeJogadores.setPreferredSize(new java.awt.Dimension(185, 40));

        TituloPaginaCriar.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        TituloPaginaCriar.setText("Crie o seu Amistoso");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelNumerodeJogadores)
                        .addGap(18, 18, 18)
                        .addComponent(NumeroDeJogadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNomeDoOrganizador)
                            .addComponent(jLabelLocalDoJogo)
                            .addComponent(jLabelDataDoJogo))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DataDoJogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LocalDoJogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NomeDoOrganizador, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelDescricao)
                    .addComponent(BotaoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Descricao, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60))
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(TituloPaginaCriar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelDescricao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Descricao, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BotaoSalvar))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(TituloPaginaCriar)
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelNomeDoOrganizador)
                            .addComponent(NomeDoOrganizador, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelLocalDoJogo)
                            .addComponent(LocalDoJogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelDataDoJogo)
                            .addComponent(DataDoJogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelNumerodeJogadores)
                            .addComponent(NumeroDeJogadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSalvarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoSalvarActionPerformed

    private void LocalDoJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LocalDoJogoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LocalDoJogoActionPerformed

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
            java.util.logging.Logger.getLogger(CriarJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CriarJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CriarJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CriarJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CriarJogo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoSalvar;
    private javax.swing.JTextField DataDoJogo;
    private javax.swing.JTextField Descricao;
    private javax.swing.JTextField LocalDoJogo;
    private javax.swing.JTextField NomeDoOrganizador;
    private javax.swing.JTextField NumeroDeJogadores;
    private javax.swing.JLabel TituloPaginaCriar;
    private javax.swing.JLabel jLabelDataDoJogo;
    private javax.swing.JLabel jLabelDescricao;
    private javax.swing.JLabel jLabelLocalDoJogo;
    private javax.swing.JLabel jLabelNomeDoOrganizador;
    private javax.swing.JLabel jLabelNumerodeJogadores;
    // End of variables declaration//GEN-END:variables
}
