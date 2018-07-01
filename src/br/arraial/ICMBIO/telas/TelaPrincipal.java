package br.arraial.ICMBIO.telas;




/**
 * @version 4.0 - 26/06
 * @author Turma INF161:
 * Grupo Embarcações - Matheus Hiroshi, Emilly Rodrigues, Marcelo Coelho,
 * Gabrielli Ramos
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
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

        jSplitPane1 = new javax.swing.JSplitPane();
        pnAreaDeTrabalho = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        imCadModalidade = new javax.swing.JMenuItem();
        imCadEmbarcacao = new javax.swing.JMenuItem();
        imCadSolicitante = new javax.swing.JMenuItem();
        imCadUsuario = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        imConModalidade = new javax.swing.JMenuItem();
        imConEmbarcacao = new javax.swing.JMenuItem();
        imConSolicitante = new javax.swing.JMenuItem();
        imConUsuario = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        imSoliCadastro = new javax.swing.JMenuItem();
        imSoliConsulta = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        imSaiCadastro = new javax.swing.JMenuItem();
        imSaiConsulta = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ICMBio - Instituto Chico Mendes de Conservação da Biodiversidade");
        setResizable(false);

        pnAreaDeTrabalho.setBackground(new java.awt.Color(255, 255, 255));
        pnAreaDeTrabalho.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnAreaDeTrabalhoLayout = new javax.swing.GroupLayout(pnAreaDeTrabalho);
        pnAreaDeTrabalho.setLayout(pnAreaDeTrabalhoLayout);
        pnAreaDeTrabalhoLayout.setHorizontalGroup(
            pnAreaDeTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 666, Short.MAX_VALUE)
        );
        pnAreaDeTrabalhoLayout.setVerticalGroup(
            pnAreaDeTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 461, Short.MAX_VALUE)
        );

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setForeground(new java.awt.Color(255, 255, 255));

        jMenu1.setText("Cadastro");

        imCadModalidade.setText("Modalidade");
        jMenu1.add(imCadModalidade);

        imCadEmbarcacao.setText("Embarcação");
        jMenu1.add(imCadEmbarcacao);

        imCadSolicitante.setText("Solicitante");
        imCadSolicitante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imCadSolicitanteActionPerformed(evt);
            }
        });
        jMenu1.add(imCadSolicitante);

        imCadUsuario.setText("Usuário");
        jMenu1.add(imCadUsuario);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Consulta");

        imConModalidade.setText("Modalidade");
        jMenu2.add(imConModalidade);

        imConEmbarcacao.setText("Embarcação");
        imConEmbarcacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imConEmbarcacaoActionPerformed(evt);
            }
        });
        jMenu2.add(imConEmbarcacao);

        imConSolicitante.setText("Solicitante");
        jMenu2.add(imConSolicitante);

        imConUsuario.setText("Usuário");
        jMenu2.add(imConUsuario);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Solicitação");

        imSoliCadastro.setText("Cadastro");
        jMenu3.add(imSoliCadastro);

        imSoliConsulta.setText("Consulta");
        jMenu3.add(imSoliConsulta);

        jMenuBar1.add(jMenu3);

        jMenu5.setText("Saida");

        imSaiCadastro.setText("Cadastro");
        imSaiCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imSaiCadastroActionPerformed(evt);
            }
        });
        jMenu5.add(imSaiCadastro);

        imSaiConsulta.setText("Consulta");
        imSaiConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imSaiConsultaActionPerformed(evt);
            }
        });
        jMenu5.add(imSaiConsulta);

        jMenuBar1.add(jMenu5);

        jMenu6.setText("Ajuda");
        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnAreaDeTrabalho)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnAreaDeTrabalho)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void imConEmbarcacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imConEmbarcacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_imConEmbarcacaoActionPerformed

    private void imCadSolicitanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imCadSolicitanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_imCadSolicitanteActionPerformed

    private void imSaiCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imSaiCadastroActionPerformed
        TelaSaida saida = new TelaSaida();
        pnAreaDeTrabalho.add(saida);
        saida.setVisible(true);
      //saida.getPnSaida().setSelectedIndex(0);
    }//GEN-LAST:event_imSaiCadastroActionPerformed

    private void imSaiConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imSaiConsultaActionPerformed
        TelaSaida saida = new TelaSaida();
        pnAreaDeTrabalho.add(saida);
        saida.setVisible(true);
    }//GEN-LAST:event_imSaiConsultaActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem imCadEmbarcacao;
    private javax.swing.JMenuItem imCadModalidade;
    private javax.swing.JMenuItem imCadSolicitante;
    private javax.swing.JMenuItem imCadUsuario;
    private javax.swing.JMenuItem imConEmbarcacao;
    private javax.swing.JMenuItem imConModalidade;
    private javax.swing.JMenuItem imConSolicitante;
    private javax.swing.JMenuItem imConUsuario;
    private javax.swing.JMenuItem imSaiCadastro;
    private javax.swing.JMenuItem imSaiConsulta;
    private javax.swing.JMenuItem imSoliCadastro;
    private javax.swing.JMenuItem imSoliConsulta;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JDesktopPane pnAreaDeTrabalho;
    // End of variables declaration//GEN-END:variables
}
