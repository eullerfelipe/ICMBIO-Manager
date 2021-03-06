/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.arraial.ICMBIO.telas;

import br.arraial.ICMBIO.DAO.BancoDeDados;
import static br.arraial.ICMBIO.DAO.BancoDeDados.retornarConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Aluno
 */
public class TelaEmbarcacao extends javax.swing.JInternalFrame {

    /**
     * Creates new form Embarcacao
     */
    
    private String cod;
    
    
    public TelaEmbarcacao() {
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

        jPanel3 = new javax.swing.JPanel();
        TelaEmbarcacao = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        lbNomeEmbarcacao = new javax.swing.JLabel();
        txtNomeEmbarcacao = new javax.swing.JTextField();
        lbTie = new javax.swing.JLabel();
        lbNomeProprietario = new javax.swing.JLabel();
        txtNomeProprietario = new javax.swing.JTextField();
        lbNPassageiros = new javax.swing.JLabel();
        cgNumeroPassageiros = new javax.swing.JSpinner();
        lbTEmbarcacao = new javax.swing.JLabel();
        lbCPassageiros = new javax.swing.JLabel();
        cgCapacidadePassageiros = new javax.swing.JSpinner();
        lbLocal = new javax.swing.JLabel();
        txtLocal = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        lbObs = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        btAlterar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        atObs = new javax.swing.JTextArea();
        lbModalidade = new javax.swing.JLabel();
        cbModalidade = new javax.swing.JComboBox();
        fmTamanhoEmbarcacao = new javax.swing.JFormattedTextField();
        fmTie = new javax.swing.JFormattedTextField();
        lbMetros = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        lbPesquisa = new javax.swing.JLabel();
        txtConsulta = new javax.swing.JTextField();
        jbConsultar = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tTabela = new javax.swing.JTable();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 571, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 444, Short.MAX_VALUE)
        );

        setClosable(true);

        TelaEmbarcacao.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lbNomeEmbarcacao.setText("Nome da embarcação:");

        txtNomeEmbarcacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeEmbarcacaoActionPerformed(evt);
            }
        });

        lbTie.setText("TIE:");

        lbNomeProprietario.setText("Nome do proprietário:");

        txtNomeProprietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeProprietarioActionPerformed(evt);
            }
        });

        lbNPassageiros.setText("Número de passageiros:");

        cgNumeroPassageiros.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));

        lbTEmbarcacao.setText("Tamanho da embarcação: ");

        lbCPassageiros.setText("Capacidade de passageiros:");

        cgCapacidadePassageiros.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));

        lbLocal.setText("Local de atuação:");

        txtLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLocalActionPerformed(evt);
            }
        });

        lbObs.setText("OBS.:");

        btAlterar.setText("Alterar");
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });

        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(btAlterar)
                .addGap(18, 18, 18)
                .addComponent(btExcluir)
                .addGap(26, 26, 26)
                .addComponent(btLimpar)
                .addGap(18, 18, 18)
                .addComponent(btSalvar)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAlterar)
                    .addComponent(btExcluir)
                    .addComponent(btLimpar)
                    .addComponent(btSalvar))
                .addGap(66, 66, 66))
        );

        atObs.setColumns(20);
        atObs.setRows(5);
        jScrollPane1.setViewportView(atObs);

        lbModalidade.setText("Modalidade:");

        cbModalidade.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Mergulho", "Pesca esportiva", "Passeio", "Taxi" }));
        cbModalidade.setSelectedIndex(-1);
        cbModalidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbModalidadeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbObs)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbModalidade)
                        .addGap(47, 47, 47)
                        .addComponent(cbModalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(196, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbObs)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbModalidade)
                    .addComponent(cbModalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        fmTamanhoEmbarcacao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        fmTamanhoEmbarcacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fmTamanhoEmbarcacaoActionPerformed(evt);
            }
        });

        fmTie.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##########/####"))));
        fmTie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fmTieActionPerformed(evt);
            }
        });

        lbMetros.setText("metros");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbTie, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbNomeProprietario)
                                    .addComponent(lbNPassageiros, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(265, 265, 265)
                                        .addComponent(lbMetros))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(132, 132, 132)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(fmTamanhoEmbarcacao, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cgNumeroPassageiros, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cgCapacidadePassageiros, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtNomeProprietario, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(fmTie, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtNomeEmbarcacao, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(lbTEmbarcacao)
                                    .addGap(231, 231, 231))
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lbCPassageiros)
                                        .addComponent(lbLocal))
                                    .addGap(223, 223, 223)))
                            .addComponent(lbNomeEmbarcacao, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(605, 605, 605))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeEmbarcacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNomeEmbarcacao))
                .addGap(9, 9, 9)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTie)
                    .addComponent(fmTie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeProprietario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNomeProprietario, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNPassageiros)
                    .addComponent(cgNumeroPassageiros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTEmbarcacao)
                    .addComponent(jLabel10)
                    .addComponent(fmTamanhoEmbarcacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbMetros))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCPassageiros)
                    .addComponent(cgCapacidadePassageiros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbLocal)
                    .addComponent(txtLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(120, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        TelaEmbarcacao.addTab("Cadastrar", jPanel1);

        lbPesquisa.setText("Digite o nome da embarcação:");

        txtConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConsultaActionPerformed(evt);
            }
        });

        jbConsultar.setText("Consultar");
        jbConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConsultarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(lbPesquisa)
                .addGap(18, 18, 18)
                .addComponent(txtConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbConsultar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPesquisa)
                    .addComponent(txtConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbConsultar))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        tTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código da Embarcação", "Nome da embarcação", "TIE", "Código da modalidade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tTabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tTabelaMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tTabela);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        TelaEmbarcacao.addTab("Consultar", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TelaEmbarcacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TelaEmbarcacao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeProprietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeProprietarioActionPerformed
        txtNomeProprietario.getText();
    }//GEN-LAST:event_txtNomeProprietarioActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        txtNomeEmbarcacao.setText("");
        fmTie.setText("");
        txtNomeProprietario.setText("");
        cgNumeroPassageiros.setValue(0);
        fmTamanhoEmbarcacao.setText("");
        cgCapacidadePassageiros.setValue(0);
        txtLocal.setText("");
        atObs.setText("");
        cbModalidade.setSelectedIndex(0);


    }//GEN-LAST:event_btLimparActionPerformed

    private void fmTamanhoEmbarcacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fmTamanhoEmbarcacaoActionPerformed
        fmTamanhoEmbarcacao.getAction();
    }//GEN-LAST:event_fmTamanhoEmbarcacaoActionPerformed

    private void txtLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLocalActionPerformed
        txtLocal.getText();
    }//GEN-LAST:event_txtLocalActionPerformed

    private void txtNomeEmbarcacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeEmbarcacaoActionPerformed
        txtNomeEmbarcacao.getText();
    }//GEN-LAST:event_txtNomeEmbarcacaoActionPerformed

    private void fmTieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fmTieActionPerformed
        fmTie.getAction();
    }//GEN-LAST:event_fmTieActionPerformed

    private void cbModalidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbModalidadeActionPerformed
        cbModalidade.getAction();
    }//GEN-LAST:event_cbModalidadeActionPerformed

    private void txtConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConsultaActionPerformed

    }//GEN-LAST:event_txtConsultaActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        Connection conexao = BancoDeDados.retornarConexao();
        try {
               
            PreparedStatement inserir = conexao.prepareStatement("insert into embarcacao(nome_embarcacao, tie, nome_proprietario, numero_passageiros, tamanho_embarcacao, capacidade_passageiros, local, obs, codigo_modalidade) values(?,?,?,?,?,?,?,?,?)");
            inserir.setString(1, txtNomeEmbarcacao.getText());
            inserir.setString(2, fmTie.getText());
            inserir.setString(3, txtNomeProprietario.getText());
            inserir.setString(4, cgNumeroPassageiros.getValue().toString());
            inserir.setString(5, fmTamanhoEmbarcacao.getText());
            inserir.setString(6, cgCapacidadePassageiros.getValue().toString());
            inserir.setString(7, txtLocal.getText());
            inserir.setString(8, atObs.getText());
            inserir.setInt(9, cbModalidade.getSelectedIndex());
           
            inserir.execute();
            inserir.close();
        } catch (SQLException ex) {
            Logger.getLogger(TelaEmbarcacao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btSalvarActionPerformed

    private void jbConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConsultarActionPerformed
        Connection conexao = retornarConexao();
        try {
            PreparedStatement consultar = conexao.prepareStatement("select * from embarcacao where nome_embarcacao like ?");
            consultar.setString(1,"%" + txtConsulta.getText() + "%");
            ResultSet resultado = consultar.executeQuery();
            DefaultTableModel model = (DefaultTableModel) tTabela.getModel();
            model.setNumRows(0);
            while (resultado.next()) {
                model.addRow(new String[]{resultado.getString("codigo_embarcacao"), resultado.getString("nome_embarcacao"), resultado.getString("TIE"), resultado.getString("codigo_modalidade")});
            }
            tTabela.setRowSelectionAllowed(true);
            
            resultado.close();
            consultar.close();
        } catch (SQLException ex) {
            Logger.getLogger(TelaEmbarcacao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
       
        
    }//GEN-LAST:event_jbConsultarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        Connection conexao = BancoDeDados.retornarConexao();
        try{
          System.out.println(cod);         
          PreparedStatement deletar = conexao.prepareStatement("delete from embarcacao where codigo_embarcacao = "+cod);
          deletar.executeUpdate();
          txtNomeEmbarcacao.setText("");
          fmTie.setText("");
          txtNomeProprietario.setText("");
          cgNumeroPassageiros.setValue(0);
          fmTamanhoEmbarcacao.setText("");
          cgCapacidadePassageiros.setValue(0);
          txtLocal.setText("");
          atObs.setText("");
          cbModalidade.setSelectedIndex(0);
          deletar.execute();
          deletar.close();
        } catch (SQLException ex) {
             System.out.println(ex);
             Logger.getLogger(TelaEmbarcacao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        Connection conexao = BancoDeDados.retornarConexao();
        try {
            System.out.println(cod);  
          PreparedStatement alterar = conexao.prepareStatement("update embarcacao set nome_embarcacao=?, tie=?, nome_proprietario=?, numero_passageiros=?, tamanho_embarcacao=?, capacidade_passageiros=?, local=?, obs=?, codigo_modalidade=? where codigo_embarcacao = "+cod);
          
          alterar.setString(1, txtNomeEmbarcacao.getText());
          alterar.setString(2, fmTie.getText());
          alterar.setString(3, txtNomeProprietario.getText());
          alterar.setString(4, cgNumeroPassageiros.getValue().toString());
          alterar.setString(5, fmTamanhoEmbarcacao.getText());
          alterar.setString(6, cgCapacidadePassageiros.getValue().toString());
          alterar.setString(7, txtLocal.getText());
          alterar.setString(8, atObs.getText());
          alterar.setInt(9, cbModalidade.getSelectedIndex());
          alterar.executeUpdate();
          alterar.close();          
        } catch (SQLException ex) {
            Logger.getLogger(TelaEmbarcacao.class.getName()).log(Level.SEVERE, null, ex);
        }

       
 
    }//GEN-LAST:event_btAlterarActionPerformed

    private void tTabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tTabelaMouseClicked

        TelaEmbarcacao.setSelectedIndex(0);
      /* txtNomeEmbarcacao.setText(String.valueOf(tTabela.getModel().getValueAt(tTabela.getSelectedRow(), 1)));
        fmTie.setText(String.valueOf(tTabela.getModel().getValueAt(tTabela.getSelectedRow(), 2)));
        txtNomeProprietario.setText(String.valueOf(tTabela.getModel().getValueAt(tTabela.getSelectedRow(), 3)));
        cgNumeroPassageiros.setValue(String.valueOf(tTabela.getModel().getValueAt(tTabela.getSelectedRow(), 4)));
        fmTamanhoEmbarcacao.setText(String.valueOf(tTabela.getModel().getValueAt(tTabela.getSelectedRow(), 5)));
        cgCapacidadePassageiros.setValue(String.valueOf(tTabela.getModel().getValueAt(tTabela.getSelectedRow(), 6)));
        txtLocal.setText(String.valueOf(tTabela.getModel().getValueAt(tTabela.getSelectedRow(), 7)));
        atObs.setText(String.valueOf(tTabela.getModel().getValueAt(tTabela.getSelectedRow(), 8)));
        cbModalidade.setSelectedIndex((int) tTabela.getModel().getValueAt(tTabela.getSelectedRow(), 9));
       */
        
        Connection conexao = retornarConexao();
        this.cod = tTabela.getValueAt(tTabela.getSelectedRow(), 0).toString();
        try {
            PreparedStatement consultar = conexao.prepareStatement("select * from embarcacao where codigo_embarcacao = "+cod);
            ResultSet resultado = consultar.executeQuery();
            if (resultado != null && resultado.next()) 
            {            
                txtNomeEmbarcacao.setText(resultado.getString("nome_embarcacao"));
                fmTie.setText(resultado.getString("tie"));
                txtNomeProprietario.setText(resultado.getString("nome_proprietario"));
                cgNumeroPassageiros.setValue(resultado.getInt("numero_passageiros"));
                fmTamanhoEmbarcacao.setText(resultado.getString("tamanho_embarcacao"));
                cgCapacidadePassageiros.setValue(resultado.getInt("capacidade_passageiros"));
                txtLocal.setText(resultado.getString("local"));
                atObs.setText(resultado.getString("obs"));
                cbModalidade.setSelectedIndex(resultado.getInt("codigo_modalidade"));
            }
            resultado.close();
            consultar.close();
        } catch (SQLException ex) {
            Logger.getLogger(TelaEmbarcacao.class.getName()).log(Level.SEVERE, null, ex);
        }
      txtConsulta.setText("");
                
    }//GEN-LAST:event_tTabelaMouseClicked
    private void TelaEmbarcacaoMouseClicked(java.awt.event.MouseEvent evt) {                                             
        this.cod=null;
    }                                            

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane TelaEmbarcacao;
    private javax.swing.JTextArea atObs;
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JComboBox cbModalidade;
    private javax.swing.JSpinner cgCapacidadePassageiros;
    private javax.swing.JSpinner cgNumeroPassageiros;
    private javax.swing.JFormattedTextField fmTamanhoEmbarcacao;
    private javax.swing.JFormattedTextField fmTie;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton jbConsultar;
    private javax.swing.JLabel lbCPassageiros;
    private javax.swing.JLabel lbLocal;
    private javax.swing.JLabel lbMetros;
    private javax.swing.JLabel lbModalidade;
    private javax.swing.JLabel lbNPassageiros;
    private javax.swing.JLabel lbNomeEmbarcacao;
    private javax.swing.JLabel lbNomeProprietario;
    private javax.swing.JLabel lbObs;
    private javax.swing.JLabel lbPesquisa;
    private javax.swing.JLabel lbTEmbarcacao;
    private javax.swing.JLabel lbTie;
    private javax.swing.JTable tTabela;
    private javax.swing.JTextField txtConsulta;
    private javax.swing.JTextField txtLocal;
    private javax.swing.JTextField txtNomeEmbarcacao;
    private javax.swing.JTextField txtNomeProprietario;
    // End of variables declaration//GEN-END:variables

    private void inserir(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void inserir(String text, String text0, String text1, Object value, String text2, Object value0, String text3, String text4, Object selectedItem) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
