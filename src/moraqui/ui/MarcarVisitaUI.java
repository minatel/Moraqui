/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moraqui.ui;
import moraqui.dao.GerenciarMoradiaDAO;
import moraqui.entity.GerenciarMoradia;
import moraqui.dao.MarcarVisitaDAO;
import moraqui.entity.MarcarVisita;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jéssica
 */
public class MarcarVisitaUI extends javax.swing.JFrame {

    String idlocatario;
    String idmoradia;
    
    MarcarVisitaDAO mar;
    MarcarVisita visita;
    GerenciarMoradiaDAO ger;
    GerenciarMoradia moradia;
    
    public MarcarVisitaUI(String idLocatario) {
        initComponents();
        mar = new MarcarVisitaDAO();
        visita = new MarcarVisita();
        ger = new GerenciarMoradiaDAO();
        moradia = new GerenciarMoradia();
        this.idlocatario = idLocatario;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabMarcarVisita = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txt_End = new javax.swing.JTextField();
        txt_min = new javax.swing.JTextField();
        txt_max = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        btn_Pesq = new javax.swing.JToggleButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableVisita = new javax.swing.JTable();
        cbGenero2 = new javax.swing.JComboBox();
        ck_Valor = new javax.swing.JCheckBox();
        ck_End = new javax.swing.JCheckBox();
        ck_Tipo = new javax.swing.JCheckBox();
        ck_Gen = new javax.swing.JCheckBox();
        cbTipo2 = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cb_Mes = new javax.swing.JComboBox();
        txt_Ano = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_Desc = new javax.swing.JTextArea();
        btn_Salvar = new javax.swing.JButton();
        txt_EndVisita = new javax.swing.JTextField();
        btn_Alterar = new javax.swing.JButton();
        btn_Excluir = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        cb_Hora = new javax.swing.JComboBox();
        cb_dia = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txt_End.setEnabled(false);

        txt_min.setEnabled(false);
        txt_min.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_minActionPerformed(evt);
            }
        });

        txt_max.setEnabled(false);

        jLabel12.setText("Até:");

        btn_Pesq.setText("Pesquisar");
        btn_Pesq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PesqActionPerformed(evt);
            }
        });

        tableVisita.setModel(new javax.swing.table.DefaultTableModel(
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
        tableVisita.setEnabled(false);
        tableVisita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableVisitaMouseDoubleClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableVisita);

        cbGenero2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Feminino", "Masculino", "Misto" }));
        cbGenero2.setEnabled(false);

        ck_Valor.setText("Valor de");
        ck_Valor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ck_ValorActionPerformed(evt);
            }
        });

        ck_End.setText("Endereço");
        ck_End.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ck_EndActionPerformed(evt);
            }
        });

        ck_Tipo.setText("Tipo");
        ck_Tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ck_TipoActionPerformed(evt);
            }
        });

        ck_Gen.setText("Gênero");
        ck_Gen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ck_GenActionPerformed(evt);
            }
        });

        cbTipo2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Apartamento", "Casa", "Edícula", "Kitnet", "Pensionato", "República" }));
        cbTipo2.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ck_Valor)
                            .addComponent(ck_End)
                            .addComponent(ck_Tipo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(txt_min, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel12))
                                    .addComponent(cbTipo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_max, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addComponent(btn_Pesq, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(ck_Gen)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbGenero2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(16, 16, 16))))
                            .addComponent(txt_End, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_End, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ck_End))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbGenero2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ck_Tipo)
                    .addComponent(ck_Gen)
                    .addComponent(cbTipo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_min, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_max, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(btn_Pesq)
                    .addComponent(ck_Valor))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 414, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        tabMarcarVisita.addTab("Consultar Moradia", jPanel1);

        jLabel8.setText("Endereço");

        jLabel1.setText("Data");

        cb_Mes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro", " " }));

        jLabel2.setText("Descrição");

        txt_Desc.setColumns(20);
        txt_Desc.setRows(5);
        jScrollPane1.setViewportView(txt_Desc);

        btn_Salvar.setText("Inserir");
        btn_Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SalvarActionPerformed(evt);
            }
        });

        txt_EndVisita.setEnabled(false);

        btn_Alterar.setText("Alterar");
        btn_Alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AlterarActionPerformed(evt);
            }
        });

        btn_Excluir.setText("Excluir");
        btn_Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ExcluirActionPerformed(evt);
            }
        });

        jLabel4.setText("Hora");

        cb_Hora.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "07:00", "07:30", "08:00", "08:30", "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00" }));

        cb_dia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_EndVisita, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cb_Hora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(cb_dia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cb_Mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txt_Ano, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btn_Salvar)
                        .addGap(28, 28, 28)
                        .addComponent(btn_Alterar)
                        .addGap(31, 31, 31)
                        .addComponent(btn_Excluir)
                        .addGap(68, 68, 68)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txt_EndVisita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cb_Mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Ano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_dia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cb_Hora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Salvar)
                    .addComponent(btn_Alterar)
                    .addComponent(btn_Excluir))
                .addGap(40, 40, 40))
        );

        tabMarcarVisita.addTab("Marcar Visita", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(tabMarcarVisita)
                .addGap(47, 47, 47))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tabMarcarVisita, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void limpar(){
        txt_EndVisita.setText("");
        txt_Ano.setText("");
        txt_Desc.setText("");
    }
    
    private void btn_SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SalvarActionPerformed
        visita.setVisita(idlocatario, idmoradia, (int)(cb_dia.getSelectedIndex() + 1) +"-"+ (int)(cb_Mes.getSelectedIndex() + 1) +"-"+ txt_Ano.getText(), cb_Hora.getSelectedItem().toString(), txt_Desc.getText(), "Indefinido");
        mar.cadastrar(visita);
        limpar();
        tabMarcarVisita.setSelectedIndex(0);
    }//GEN-LAST:event_btn_SalvarActionPerformed

    private void txt_minActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_minActionPerformed

    }//GEN-LAST:event_txt_minActionPerformed

    private void btn_PesqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PesqActionPerformed
        String condicoes = "";
        if(ck_End.isSelected())
        condicoes = " endereco LIKE '%"+txt_End.getText()+"%' ";
        if(ck_Tipo.isSelected())
        if (condicoes.equals(""))
        condicoes = " tipo = "+cbTipo2.getSelectedItem().toString()+" ";
        else
        condicoes = condicoes + " AND  tipo = "+cbTipo2.getSelectedItem().toString()+" ";
        if(ck_Gen.isSelected())
        if (condicoes.equals(""))
        condicoes = " genero = "+cbGenero2.getSelectedItem().toString()+ " ";
        else
        condicoes = condicoes + " AND genero = "+cbGenero2.getSelectedItem().toString()+ " ";
        if(ck_Valor.isSelected()){
            if (condicoes.equals("")){
                if (txt_min.equals(""))
                condicoes = " valorunitario BETWEEN 0 AND "+txt_max.getText()+" ";
                else{
                    if (txt_max.equals(""))
                    condicoes = " valorunitario BETWEEN "+txt_min.getText()+" AND 100000000";
                    else
                    condicoes = " valorunitario BETWEEN "+txt_min.getText()+" AND "+txt_max.getText()+"";
                }
            }
            else{
                if (txt_min.equals(""))
                condicoes = condicoes + " AND valorunitario BETWEEN 0 AND "+txt_max.getText()+" ";
                else{
                    if (txt_max.equals(""))
                    condicoes = condicoes + " AND valorunitario BETWEEN "+txt_min.getText()+" AND 100000000";
                    else
                    condicoes = condicoes + " AND valorunitario BETWEEN "+txt_min.getText()+" AND "+txt_max.getText()+"";
                }
            }
        }
        DefaultTableModel model = ger.pesquisar(condicoes);
        tableVisita.setModel(model);
    }//GEN-LAST:event_btn_PesqActionPerformed

    private void ck_ValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ck_ValorActionPerformed
        if (ck_Valor.isSelected()){
            txt_min.setEnabled(true);
            txt_max.setEnabled(true);
        }
        else{
            txt_min.setEnabled(false);
            txt_max.setEnabled(false);
        }

    }//GEN-LAST:event_ck_ValorActionPerformed

    private void ck_EndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ck_EndActionPerformed
        if (ck_End.isSelected())
        txt_End.setEnabled(true);
        else
        txt_End.setEditable(false);
    }//GEN-LAST:event_ck_EndActionPerformed

    private void ck_TipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ck_TipoActionPerformed
        if (ck_Tipo.isSelected())
        cbTipo2.setEnabled(true);
        else
        cbTipo2.setEnabled(false);
    }//GEN-LAST:event_ck_TipoActionPerformed

    private void ck_GenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ck_GenActionPerformed
        if (ck_Gen.isSelected())
        cbGenero2.setEnabled(true);
        else
        cbGenero2.setEnabled(false);
    }//GEN-LAST:event_ck_GenActionPerformed

    private void tableVisitaMouseDoubleClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableVisitaMouseDoubleClicked
        int linha = tableVisita.rowAtPoint(evt.getPoint());
        if(evt.getClickCount() == 1){            
            txt_EndVisita.setText(tableVisita.getModel().getValueAt(linha, 0).toString());            
        
            idmoradia = mar.codMoradia(tableVisita.getModel().getValueAt(linha, 0).toString());
            visita.setIdMoradia(idmoradia);
            visita = mar.visita(idmoradia, idlocatario);
            String dataaa = visita.getData();
            try{
                if (dataaa == null){
                    txt_Ano.setText("");
                    txt_Desc.setText("");
                    btn_Salvar.setEnabled(true);
                    btn_Alterar.setEnabled(false);
                    btn_Excluir.setEnabled(false);
                }
                else{
                    txt_Desc.setText(visita.getDescricao());
                    String data = visita.getData();
                    txt_Ano.setText(data.substring(0, 4));
                    cb_dia.setSelectedIndex(Integer.parseInt(data.substring(8, 10)) - 1);
                    cb_Mes.setSelectedIndex(Integer.parseInt(data.substring(5, 7)) - 1);
                    cb_Hora.setSelectedIndex(combohora());
                    btn_Salvar.setEnabled(false);
                    btn_Alterar.setEnabled(true);
                    btn_Excluir.setEnabled(true);  
                }
                tabMarcarVisita.setSelectedIndex(1);
            }
            catch(Exception er){
                JOptionPane.showMessageDialog(null, er,"Pesquisa", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_tableVisitaMouseDoubleClicked

    private int combohora(){
        int index = 0;
            switch (visita.getHora().substring(0, 5)){
                case "07:00":
                        index = 0;
                break;
                case "07:30":
                        index = 1;
                break;
                case "08:00":
                        index = 2;
                break;
                case "08:30":
                        index = 3;
                break;
                case "09:00":
                        index = 4;
                break;
                case "09:30":
                        index = 5;
                break;
                case "10:00":
                        index = 6;
                break;
                case "10:30":
                        index = 7;
                break;
                case "11:00":
                        index = 8;
                break;
                case "11:30":
                        index = 9;
                break;
                case "12:00":
                        index = 10;
                break;
                case "12:30":
                        index = 11;
                break;    
                case "13:00":
                        index = 12;
                break;
                case "13:30":
                        index = 13;
                break;
                case "14:00":
                        index = 14;
                break;
                case "14:30":
                        index = 15;
                break;
                case "15:00":
                        index = 16;
                break;
                case "15:30":
                        index = 17;
                break;
                case "16:00":
                        index = 18;
                break;
                case "16:30":
                        index = 19;
                break;
                case "17:00":
                        index = 20;
                break;
                case "17:30":
                        index = 21;
                break;
                case "18:00":
                        index = 22;
                break;
                case "18:30":
                        index = 23;
                break;
                case "19:00":
                        index = 24;
                break;
                case "20:00":
                        index = 25;
                break;
            }
            return index;
    }
    
    private void btn_AlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AlterarActionPerformed
        visita.setVisita(idlocatario, idmoradia, (int)(cb_dia.getSelectedIndex() + 1) +"-"+ (int)(cb_Mes.getSelectedIndex() + 1) +"-"+ txt_Ano.getText(), cb_Hora.getSelectedItem().toString(), txt_Desc.getText(), "Indefinido");
        mar.alterar(visita);
        limpar();
        tabMarcarVisita.setSelectedIndex(0);
    }//GEN-LAST:event_btn_AlterarActionPerformed

    private void btn_ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ExcluirActionPerformed
        mar.excluir(idmoradia, idlocatario);
        limpar();
        tabMarcarVisita.setSelectedIndex(0);
    }//GEN-LAST:event_btn_ExcluirActionPerformed

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
            java.util.logging.Logger.getLogger(MarcarVisitaUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MarcarVisitaUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MarcarVisitaUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MarcarVisitaUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Alterar;
    private javax.swing.JButton btn_Excluir;
    private javax.swing.JToggleButton btn_Pesq;
    private javax.swing.JButton btn_Salvar;
    private javax.swing.JComboBox cbGenero2;
    private javax.swing.JComboBox cbTipo2;
    private javax.swing.JComboBox cb_Hora;
    private javax.swing.JComboBox cb_Mes;
    private javax.swing.JComboBox cb_dia;
    private javax.swing.JCheckBox ck_End;
    private javax.swing.JCheckBox ck_Gen;
    private javax.swing.JCheckBox ck_Tipo;
    private javax.swing.JCheckBox ck_Valor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane tabMarcarVisita;
    private javax.swing.JTable tableVisita;
    private javax.swing.JTextField txt_Ano;
    private javax.swing.JTextArea txt_Desc;
    private javax.swing.JTextField txt_End;
    private javax.swing.JTextField txt_EndVisita;
    private javax.swing.JTextField txt_max;
    private javax.swing.JTextField txt_min;
    // End of variables declaration//GEN-END:variables
}
