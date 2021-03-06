/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moraqui.ui;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import moraqui.dao.GerenciarContratoDAO;
import moraqui.entity.GerenciarContrato;
import moraqui.dao.GerenciarUsuarioDAO;
import moraqui.entity.GerenciarUsuario;
import moraqui.dao.GerenciarMoradiaDAO;
import moraqui.entity.GerenciarMoradia;
/**
 *
 * @author Thayna
 */
public class GerenciarContratoUI extends javax.swing.JFrame {
    GerenciarContratoDAO ger;
    GerenciarContrato contrato;
    GerenciarUsuarioDAO ger2;
    GerenciarUsuario usuario;
    GerenciarMoradiaDAO ger3;
    GerenciarMoradia moradia;
    GerenciarUsuario locador;
    String id;
    
    /**
     * Creates new form GerenciarContratoUI
     * @param id
     */
    public GerenciarContratoUI(String id) {
        initComponents();
        ger = new GerenciarContratoDAO();
        ger2 = new GerenciarUsuarioDAO();
        ger3 = new GerenciarMoradiaDAO();

        contrato = new GerenciarContrato();
        usuario = new GerenciarUsuario();
        moradia = new GerenciarMoradia();
        locador = new GerenciarUsuario();
        this.id = id;
        
        String condLocador = "CODUSUARIO = "+id+"";
        locador = ger.pesquisarLocador(condLocador);
        txtNomeLocador.setText(locador.getNome());
        txtRgLocadorContrato.setText(locador.getRg());
        txtCpfLocadorContrato.setText(locador.getCpf());
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        tabInfoContrato = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        btnPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableContrato = new javax.swing.JTable();
        ckNomeContrato = new javax.swing.JCheckBox();
        txtContratoNome = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnPesquisarMoradia = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableMoradias = new javax.swing.JTable();
        ckEndMoradia = new javax.swing.JCheckBox();
        txtConsultaEnd = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtNomeLocatario = new javax.swing.JTextField();
        txtNomeLocador = new javax.swing.JTextField();
        txtRgLocadorContrato = new javax.swing.JTextField();
        txtCpfLocadorContrato = new javax.swing.JTextField();
        txtRgLocatario = new javax.swing.JTextField();
        txtCpfLocatario = new javax.swing.JTextField();
        txtMoradiaEndereco = new javax.swing.JTextField();
        cbDiaIni = new javax.swing.JComboBox();
        cbMesIni = new javax.swing.JComboBox();
        cbDiaFim = new javax.swing.JComboBox();
        cbMesFim = new javax.swing.JComboBox();
        txtAnoIni = new javax.swing.JTextField();
        txtAnoFim = new javax.swing.JTextField();
        txtTipoMoradia = new javax.swing.JTextField();
        txtMoradiaValor = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        tableContrato.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableContrato.setEnabled(false);
        tableContrato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableContratoMouseDoubleClickTable(evt);
            }
        });
        jScrollPane1.setViewportView(tableContrato);

        ckNomeContrato.setText("Nome");
        ckNomeContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckNomeContratoActionPerformed(evt);
            }
        });

        txtContratoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContratoNomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(btnPesquisar))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(ckNomeContrato)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtContratoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ckNomeContrato)
                    .addComponent(txtContratoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnPesquisar)
                .addGap(69, 69, 69)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(156, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Selecionar Locatário", jPanel4);

        btnPesquisarMoradia.setText("Pesquisar Moradias");
        btnPesquisarMoradia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarMoradiaActionPerformed(evt);
            }
        });

        tableMoradias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableMoradias.setEnabled(false);
        tableMoradias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMoradiasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableMoradias);

        ckEndMoradia.setText("Endereço");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(ckEndMoradia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtConsultaEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisarMoradia))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ckEndMoradia)
                    .addComponent(txtConsultaEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPesquisarMoradia)
                .addGap(32, 32, 32)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(226, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Selecionar Moradia", jPanel2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );

        tabInfoContrato.addTab("Contrato", jPanel3);

        jLabel1.setText("Nome Locador");

        jLabel2.setText("Nome Locatário");

        jLabel3.setText("RG");

        jLabel4.setText("CPF");

        jLabel5.setText("CPF");

        jLabel6.setText("RG");

        jLabel7.setText("Tipo");

        jLabel8.setText("Endereço");

        jLabel9.setText("Valor");

        jLabel10.setText("Data de Início");

        jLabel11.setText("Data de Término");

        txtNomeLocatario.setEditable(false);

        txtNomeLocador.setEditable(false);
        txtNomeLocador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeLocadorActionPerformed(evt);
            }
        });

        txtRgLocadorContrato.setEditable(false);

        txtCpfLocadorContrato.setEditable(false);

        txtRgLocatario.setEditable(false);

        txtCpfLocatario.setEditable(false);

        txtMoradiaEndereco.setEditable(false);

        cbDiaIni.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        cbMesIni.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro" }));

        cbDiaFim.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        cbMesFim.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro" }));

        txtTipoMoradia.setEditable(false);

        txtMoradiaValor.setEditable(false);

        jButton1.setText("Salvar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Excluir");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)))
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRgLocatario, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRgLocadorContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNomeLocador, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCpfLocadorContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNomeLocatario, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCpfLocatario, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTipoMoradia, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMoradiaEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMoradiaValor, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cbDiaIni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbMesIni, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtAnoIni, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cbDiaFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jButton2))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(cbMesFim, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtAnoFim, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jButton1)))
                .addContainerGap(133, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNomeLocador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtRgLocadorContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCpfLocadorContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNomeLocatario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtRgLocatario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtCpfLocatario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtTipoMoradia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtMoradiaEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtMoradiaValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbDiaIni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbMesIni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtAnoIni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbDiaFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbMesFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtAnoFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(108, Short.MAX_VALUE))
        );

        tabInfoContrato.addTab("Informações Contrato", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabInfoContrato))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tabInfoContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ckNomeContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckNomeContratoActionPerformed
             String condicoes = "";
       
        if(usuario.getTipo().equals("Locatario")){
            condicoes = "codlocatario = '"+GerenciarUsuario.getIdTipo()+"'";
        }
         if(usuario.getTipo().equals("Locador")){
            condicoes = "codlocador = '"+GerenciarUsuario.getIdTipo()+"'";
        }

        try{
            DefaultTableModel model = ger2.pesquisarLocatario(condicoes);
            tableContrato.setModel(model);
        }
        catch(Exception erro){
            JOptionPane.showConfirmDialog(null, erro, "ERRO", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_ckNomeContratoActionPerformed

  
    
    private void tableContratoMouseDoubleClickTable(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableContratoMouseDoubleClickTable
        //MUDAR PARA DOIS CLICKS
        if(evt.getClickCount() == 1){
            int linha = tableContrato.rowAtPoint(evt.getPoint());
            contrato.setCodLocatario(tableContrato.getModel().getValueAt(linha, 0).toString());
            txtNomeLocatario.setText(tableContrato.getModel().getValueAt(linha, 1).toString());
            txtRgLocatario.setText(tableContrato.getModel().getValueAt(linha, 2).toString());
            txtCpfLocatario.setText(tableContrato.getModel().getValueAt(linha, 3).toString());
           // String a = tableContrato.getModel().getValueAt(linha, 4).toString();
            
            //contrato.setCodLocatario(usuario.getId());
            

            tabInfoContrato.setSelectedIndex(1);
            jTabbedPane2.setEnabledAt(0,false);
        }
    }//GEN-LAST:event_tableContratoMouseDoubleClickTable

  
    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        String condicoes = "";

        if(ckNomeContrato.isSelected()){
            condicoes = " u.nome LIKE '%"+txtContratoNome.getText()+"%' ";
        } 

        try{
            DefaultTableModel model = ger2.pesquisarLocatario(condicoes);
            tableContrato.setModel(model);
        }
        catch(Exception erro){
            JOptionPane.showConfirmDialog(null, erro, "ERRO", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void txtNomeLocadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeLocadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeLocadorActionPerformed

    private void txtContratoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContratoNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContratoNomeActionPerformed

    private void btnPesquisarMoradiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarMoradiaActionPerformed
        String condicoes = "CODLOCATOR = '"+id+"'";

        if(ckEndMoradia.isSelected()){
            condicoes = " endereco LIKE '%"+txtConsultaEnd.getText()+"%' ";
        } 

        try{
            DefaultTableModel model = ger3.pesquisar(condicoes);
            tableMoradias.setModel(model);
        }
        catch(Exception erro){
            JOptionPane.showConfirmDialog(null, erro, "ERRO", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnPesquisarMoradiaActionPerformed

    private void tableMoradiasMouseDoubleClickTable(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMoradiasMouseDoubleClickTable
        if(evt.getClickCount() == 1){
            int linha = tableMoradias.rowAtPoint(evt.getPoint());
            moradia.setCodMoradia(tableMoradias.getModel().getValueAt(linha, 0).toString());
            txtTipoMoradia.setText(tableMoradias.getModel().getValueAt(linha, 2).toString());
            txtMoradiaEndereco.setText(tableMoradias.getModel().getValueAt(linha, 0).toString());
            txtMoradiaValor.setText(tableMoradias.getModel().getValueAt(linha, 6).toString());
            
            String aux = tableMoradias.getModel().getValueAt(linha, 5).toString();
            
            contrato.setValor(tableMoradias.getModel().getValueAt(linha, 6).toString());
            String codmoradia = ger3.codMoradia(tableMoradias.getModel().getValueAt(linha, 0).toString());
            contrato.setCodMoradia(codmoradia);
             
            tabInfoContrato.setSelectedIndex(1);  
            jTabbedPane2.setEnabledAt(1,false);
        }
    }//GEN-LAST:event_tableMoradiasMouseDoubleClickTable

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        contrato.setDataInicioContrato((int)(cbDiaIni.getSelectedIndex() + 1) +"-"+ (int)(cbMesIni.getSelectedIndex() + 1) +"-"+ txtAnoIni.getText());
        contrato.setDataTerminoContrato((int)(cbDiaFim.getSelectedIndex() + 1) +"-"+ (int)(cbMesFim.getSelectedIndex() + 1) +"-"+ txtAnoFim.getText());
        ger.inserir(contrato);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tableMoradiasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMoradiasMouseClicked
        if(evt.getClickCount() == 1){
            int linha = tableMoradias.rowAtPoint(evt.getPoint());
            moradia.setCodMoradia(tableMoradias.getModel().getValueAt(linha, 0).toString());
            txtTipoMoradia.setText(tableMoradias.getModel().getValueAt(linha, 2).toString());
            txtMoradiaEndereco.setText(tableMoradias.getModel().getValueAt(linha, 0).toString());
            txtMoradiaValor.setText(tableMoradias.getModel().getValueAt(linha, 6).toString());
            
            String aux = tableMoradias.getModel().getValueAt(linha, 5).toString();
            
            contrato.setValor(tableMoradias.getModel().getValueAt(linha, 6).toString());
            String codmoradia = ger3.codMoradia(tableMoradias.getModel().getValueAt(linha, 0).toString());
            contrato.setCodMoradia(codmoradia);
             
            tabInfoContrato.setSelectedIndex(1);  
            jTabbedPane2.setEnabledAt(1,false);
        }
    }//GEN-LAST:event_tableMoradiasMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
         
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnPesquisarMoradia;
    private javax.swing.JComboBox cbDiaFim;
    private javax.swing.JComboBox cbDiaIni;
    private javax.swing.JComboBox cbMesFim;
    private javax.swing.JComboBox cbMesIni;
    private javax.swing.JCheckBox ckEndMoradia;
    private javax.swing.JCheckBox ckNomeContrato;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTabbedPane tabInfoContrato;
    private javax.swing.JTable tableContrato;
    private javax.swing.JTable tableMoradias;
    private javax.swing.JTextField txtAnoFim;
    private javax.swing.JTextField txtAnoIni;
    private javax.swing.JTextField txtConsultaEnd;
    private javax.swing.JTextField txtContratoNome;
    private javax.swing.JTextField txtCpfLocadorContrato;
    private javax.swing.JTextField txtCpfLocatario;
    private javax.swing.JTextField txtMoradiaEndereco;
    private javax.swing.JTextField txtMoradiaValor;
    private javax.swing.JTextField txtNomeLocador;
    private javax.swing.JTextField txtNomeLocatario;
    private javax.swing.JTextField txtRgLocadorContrato;
    private javax.swing.JTextField txtRgLocatario;
    private javax.swing.JTextField txtTipoMoradia;
    // End of variables declaration//GEN-END:variables
}

