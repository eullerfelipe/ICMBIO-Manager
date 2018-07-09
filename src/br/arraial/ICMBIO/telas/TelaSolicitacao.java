/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.arraial.ICMBIO.telas;

import br.arraial.ICMBIO.DAO.BancoDeDados;
import static br.arraial.ICMBIO.DAO.BancoDeDados.retornarConexao;
import br.arraial.ICMBIO.model.Embarcacao;
import br.arraial.ICMBIO.model.Solicitante;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Aluno
 */
public class TelaSolicitacao extends javax.swing.JInternalFrame {
    private Object JoptionPane;

    /**
     * Creates new form Solicitacao1
     */
    public TelaSolicitacao() {
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

        tpEmbarcacao = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtNumerodoProcesso = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtSequenciaAnual = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        lblCodigoSolicitante = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lbCodigoEmbarcacao = new javax.swing.JLabel();
        btTrocaTelaSol = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtMotivo = new javax.swing.JTextField();
        btLimparSolicitacao = new javax.swing.JButton();
        btVoltarSolicitacao = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btTrocaTelaEmb = new javax.swing.JButton();
        pnConsulta = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtNomeDoSolicitante = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbSolicitante = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtNomeEmbaracacao = new javax.swing.JTextField();
        btBuscaEmb = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbEmbarcacao = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();

        tpEmbarcacao.setName("Embarcação"); // NOI18N

        jLabel6.setText("Número do Processo:");

        txtNumerodoProcesso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumerodoProcessoActionPerformed(evt);
            }
        });

        jLabel1.setText("Sequência anual:");

        jLabel2.setText("Status:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecionar\t", "Aprovado", "Reprovado\t", "Em Análise" }));

        jLabel4.setText("Código do solicitante:");

        lblCodigoSolicitante.setText("jLabel7");

        jLabel7.setText("Código da embaracação:");

        lbCodigoEmbarcacao.setText("jLabel8");

        btTrocaTelaSol.setText("Buscar");
        btTrocaTelaSol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTrocaTelaSolActionPerformed(evt);
            }
        });

        jLabel8.setText("Motivo:");

        txtMotivo.setText("jTextField1");

        btLimparSolicitacao.setText("Limpar");
        btLimparSolicitacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparSolicitacaoActionPerformed(evt);
            }
        });

        btVoltarSolicitacao.setText("Menu Principal");
        btVoltarSolicitacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarSolicitacaoActionPerformed(evt);
            }
        });

        jButton3.setText("Cadastrar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        btTrocaTelaEmb.setText("Buscar");
        btTrocaTelaEmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTrocaTelaEmbActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNumerodoProcesso, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSequenciaAnual, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(148, 148, 148)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCodigoSolicitante, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(105, 105, 105)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbCodigoEmbarcacao))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(btTrocaTelaSol)
                        .addGap(216, 216, 216)
                        .addComponent(btTrocaTelaEmb)))
                .addGap(215, 215, 215))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtMotivo, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(btLimparSolicitacao)
                .addGap(41, 41, 41)
                .addComponent(btVoltarSolicitacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(72, 72, 72))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtNumerodoProcesso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtSequenciaAnual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblCodigoSolicitante)
                    .addComponent(jLabel7)
                    .addComponent(lbCodigoEmbarcacao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btTrocaTelaSol)
                    .addComponent(btTrocaTelaEmb))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(txtMotivo, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel8)))
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btLimparSolicitacao)
                    .addComponent(btVoltarSolicitacao)
                    .addComponent(jButton3))
                .addContainerGap(90, Short.MAX_VALUE))
        );

        tpEmbarcacao.addTab("Solicitação", jPanel3);

        jLabel3.setText("Nome do Solicitante:");

        txtNomeDoSolicitante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeDoSolicitanteActionPerformed(evt);
            }
        });

        jButton4.setText("Buscar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        tbSolicitante.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo do Solicitante", "nome", "CPF"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tbSolicitante);

        jButton5.setText("Preencher");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNomeDoSolicitante, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jButton4)
                        .addContainerGap(99, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNomeDoSolicitante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton5)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnConsultaLayout = new javax.swing.GroupLayout(pnConsulta);
        pnConsulta.setLayout(pnConsultaLayout);
        pnConsultaLayout.setHorizontalGroup(
            pnConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnConsultaLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnConsultaLayout.setVerticalGroup(
            pnConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnConsultaLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.getAccessibleContext().setAccessibleName("Consulta\n");

        tpEmbarcacao.addTab("Solicitante", pnConsulta);

        jLabel5.setText("Nome da embarcação:");

        txtNomeEmbaracacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeEmbaracacaoActionPerformed(evt);
            }
        });

        btBuscaEmb.setText("Buscar");
        btBuscaEmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscaEmbActionPerformed(evt);
            }
        });

        tbEmbarcacao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código da embarcação", "Nome da embarcação"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tbEmbarcacao);

        jButton6.setText("Preencher");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(txtNomeEmbaracacao, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(btBuscaEmb))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(219, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton6)
                .addGap(185, 185, 185))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtNomeEmbaracacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btBuscaEmb))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jButton6))
        );

        tpEmbarcacao.addTab("Embarcação", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tpEmbarcacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tpEmbarcacao, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        tpEmbarcacao.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeDoSolicitanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeDoSolicitanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeDoSolicitanteActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            Solicitante sol = new Solicitante(); // TODO add your handling code here:
            Connection conexao = BancoDeDados.retornarConexao();
            PreparedStatement consulta1 = conexao.prepareStatement("Select * from solicitante where nome like ? ");
            consulta1.setString(1,"%" +txtNomeDoSolicitante.getText() +"%");
            
            //consulta1.setString(1,"%" + txtNomeDoSolicitante.getText() + "%");
            ResultSet resultado = consulta1.executeQuery();
            System.out.println(resultado.getRow());
            DefaultTableModel model = (DefaultTableModel) tbSolicitante.getModel();
            model.setNumRows(0);
            while(resultado.next()){
             model.addRow(new Object[] { resultado.getInt("codigo_solicitante"),resultado.getString("nome"),resultado.getString("CPF/CNPJ"),});
            }
            tbSolicitante.setRowSelectionAllowed(true);
        } catch (SQLException ex) {
            Logger.getLogger(TelaSolicitacao.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       
       
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
          Object x = tbSolicitante.getModel().getValueAt(tbSolicitante.getSelectedRow(), 0);//pego o codigo do produto na posição 0 da tabela
            lblCodigoSolicitante.setText(x.toString());
            tpEmbarcacao.setSelectedIndex(0);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btBuscaEmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscaEmbActionPerformed
       try {
            Embarcacao emb = new Embarcacao(); // TODO add your handling code here:
            Connection conexao = BancoDeDados.retornarConexao();
            PreparedStatement consulta1 = conexao.prepareStatement("Select * from embarcacao where nome_embarcacao like ? ");
            consulta1.setString(1,"%" +txtNomeEmbaracacao.getText() +"%");
            
            //consulta1.setString(1,"%" + txtNomeDoSolicitante.getText() + "%");
            ResultSet resultado = consulta1.executeQuery();
            System.out.println(resultado.getRow());
            DefaultTableModel model = (DefaultTableModel) tbEmbarcacao.getModel();
            model.setNumRows(0);
            while(resultado.next()){
             model.addRow(new Object[] { resultado.getString("codigo_embarcacao"),resultado.getString("nome_embarcacao"),});
            }
            tbEmbarcacao.setRowSelectionAllowed(true);
        } catch (SQLException ex) {
            Logger.getLogger(TelaSolicitacao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_btBuscaEmbActionPerformed

    private void txtNomeEmbaracacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeEmbaracacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeEmbaracacaoActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
     Object z = tbEmbarcacao.getModel().getValueAt(tbEmbarcacao.getSelectedRow(), 0);//pego o codigo do produto na posição 0 da tabela
            lbCodigoEmbarcacao.setText(z.toString());
            tpEmbarcacao.setSelectedIndex(0);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void txtNumerodoProcessoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumerodoProcessoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumerodoProcessoActionPerformed

    private void btTrocaTelaSolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTrocaTelaSolActionPerformed
        tpEmbarcacao.setSelectedIndex(1);          // TODO add your handling code here:
    }//GEN-LAST:event_btTrocaTelaSolActionPerformed

    private void btTrocaTelaEmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTrocaTelaEmbActionPerformed
       tpEmbarcacao.setSelectedIndex(2);        // TODO add your handling code here:
    }//GEN-LAST:event_btTrocaTelaEmbActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         try {
            PreparedStatement inserir = retornarConexao().prepareStatement("insert into solicitacao(numero_processo, sequencia_anual, status, motivo, codigo_solicitante, codigo_embarcacao) values(?,?,?,?,?,?)");

            inserir.setString(1,txtNumerodoProcesso.getText());
            inserir.setString(2,txtSequenciaAnual.getText() );
            inserir.setString(3,String.valueOf(jComboBox1.getSelectedItem()));
            inserir.setString(4,txtMotivo.getText());
            inserir.setInt(5, Integer.parseInt(lblCodigoSolicitante.getText()));
            inserir.setInt(6, Integer.parseInt(lbCodigoEmbarcacao.getText()));
            inserir.execute();
        } catch (SQLException ex) {
            Logger.getLogger(TelaSolicitacao.class.getName()).log(Level.SEVERE, null, ex);
        }
         JOptionPane.showMessageDialog(null,"Cadastrado com sucesso");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btLimparSolicitacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparSolicitacaoActionPerformed

       txtNumerodoProcesso.setText(""); 
       txtSequenciaAnual.setText(""); 
       lblCodigoSolicitante.setText(""); 
       lbCodigoEmbarcacao.setText(""); 
       txtMotivo.setText(""); 
      
    }//GEN-LAST:event_btLimparSolicitacaoActionPerformed

    private void btVoltarSolicitacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarSolicitacaoActionPerformed
        this.dispose();

    }//GEN-LAST:event_btVoltarSolicitacaoActionPerformed
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBuscaEmb;
    private javax.swing.JButton btLimparSolicitacao;
    private javax.swing.JButton btTrocaTelaEmb;
    private javax.swing.JButton btTrocaTelaSol;
    private javax.swing.JButton btVoltarSolicitacao;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbCodigoEmbarcacao;
    private javax.swing.JLabel lblCodigoSolicitante;
    private javax.swing.JPanel pnConsulta;
    private javax.swing.JTable tbEmbarcacao;
    private javax.swing.JTable tbSolicitante;
    private javax.swing.JTabbedPane tpEmbarcacao;
    private javax.swing.JTextField txtMotivo;
    private javax.swing.JTextField txtNomeDoSolicitante;
    private javax.swing.JTextField txtNomeEmbaracacao;
    private javax.swing.JTextField txtNumerodoProcesso;
    private javax.swing.JTextField txtSequenciaAnual;
    // End of variables declaration//GEN-END:variables
}
