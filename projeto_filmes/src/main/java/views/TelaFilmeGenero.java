/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package views;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.bean.Filme;
import model.bean.FilmeGenero;
import model.bean.Genero;
import model.dao.FilmeDAO;
import model.dao.FilmeGeneroDAO;
import model.dao.GeneroDAO;

// @author carol

public final class TelaFilmeGenero extends javax.swing.JInternalFrame {
FilmeGenero minhaAssociacao;
    /**
     * Creates new form TelaFilmeGenero
     */
    public TelaFilmeGenero() {
        initComponents();
        preencherTabela();
        preencherGeneros();
        preencherFilmes();
    }

    public void preencherTabela(){
            DefaultTableModel dtm = (DefaultTableModel) tblFilmeGenero.getModel();
            dtm.setRowCount(0);
            FilmeGeneroDAO dao = new FilmeGeneroDAO();
            
            for(FilmeGenero fg : dao.read()){
                dtm.addRow(new Object[] {
                    fg.getId_filme().getId_filme(),
                    fg.getId_filme().getTitulo(),
                    fg.getId_genero().getId_genero(),
                    fg.getId_genero().getDescricao()
                });
            }
    }
    
    public void preencherGeneros(){
        GeneroDAO dao = new GeneroDAO();
        for(Genero g : dao.read()){
            generoComboBox.addItem(g);
        }
    }
    
    public void preencherFilmes(){
        FilmeDAO dao = new FilmeDAO();
        for(Filme f : dao.read()){
            filmeComboBox.addItem(f);
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFilmeGenero = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        filmeComboBox = new javax.swing.JComboBox<>();
        generoComboBox = new javax.swing.JComboBox<>();
        btnAssociar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Adicionar Generos");
        setPreferredSize(new java.awt.Dimension(638, 587));
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        setVisible(true);

        tblFilmeGenero.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id Filme", "Titulo", "Id Genero", "Descrição"
            }
        ));
        tblFilmeGenero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblFilmeGeneroMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblFilmeGenero);

        jLabel1.setText("Filme");

        jLabel2.setText("Gênero");

        generoComboBox.setModel(new javax.swing.DefaultComboBoxModel<>());

        btnAssociar.setText("Adicionar");
        btnAssociar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssociarActionPerformed(evt);
            }
        });

        btnRemover.setText("Remover");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
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
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 597, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(filmeComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(generoComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRemover)
                .addGap(18, 18, 18)
                .addComponent(btnAssociar)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(filmeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(generoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAssociar)
                    .addComponent(btnRemover))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAssociarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssociarActionPerformed
            // TODO add your handling code here:
            FilmeGenero minhaAssociacao = new FilmeGenero();
            
            // Pegando o objeto selecionado da JComboBox
            minhaAssociacao.setId_filme((Filme) filmeComboBox.getSelectedItem());
            minhaAssociacao.setId_genero((Genero) generoComboBox.getSelectedItem());
            
             
             // Instanciando a DAO
             FilmeGeneroDAO dao = new FilmeGeneroDAO();
             
             //Criando...
             dao.create(minhaAssociacao);
           
            preencherTabela();
    }//GEN-LAST:event_btnAssociarActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        // TODO add your handling code here:
        int opcao = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir?");
        
        if(opcao == JOptionPane.YES_OPTION){
            FilmeGeneroDAO dao = new FilmeGeneroDAO();
            dao.destroy(minhaAssociacao);
        }
        
        preencherTabela();
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void tblFilmeGeneroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblFilmeGeneroMouseClicked
        // TODO add your handling code here:
        int linha = tblFilmeGenero.getSelectedRow();
        
        if(linha != -1){
            String idFilme = tblFilmeGenero.getValueAt(linha, 0).toString(); // toString = converte p uma string
            String idGenero = tblFilmeGenero.getValueAt(linha, 2).toString(); // toString = converte p uma string
            FilmeGeneroDAO dao = new FilmeGeneroDAO();
            
            //Construindo um objeto de FilmeGenero a partir do ID
            minhaAssociacao = dao.readByFilmeId(Integer.parseInt(idFilme), Integer.parseInt(idGenero)); // lendo filme e genero

            //Preencher o formulario com as informações do objeto
                    Genero generoDoFilme = minhaAssociacao.getId_genero(); // Objeto Genero que esta associado ao filmeGenero
                    Filme filmeAssociacao = minhaAssociacao.getId_filme(); // Objeto Filme que esta associado ao filmeGenero
                    
                    // Seleciona o gênero na JComboBox
                            for (int i = 0; i < generoComboBox.getItemCount(); i++) {
                            Genero genero = (Genero) generoComboBox.getItemAt(i); // Recupera cada item da JComboBox
                                    if (genero.getId_genero() == generoDoFilme.getId_genero()) {
                                    generoComboBox.setSelectedIndex(i); // Seleciona o índice correspondente
                                    break;
                                    }
                            }
                   // Seleciona o filme na JComboBox
                            for (int i = 0; i < filmeComboBox.getItemCount(); i++) {
                            Filme filme = (Filme) filmeComboBox.getItemAt(i);
                                    if (filme.getId_filme()== filmeAssociacao.getId_filme()) {
                                    filmeComboBox.setSelectedIndex(i); 
                                    break;
                                    }
                            }
     }
    }//GEN-LAST:event_tblFilmeGeneroMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssociar;
    private javax.swing.JButton btnRemover;
    private javax.swing.JComboBox<Filme> filmeComboBox;
    private javax.swing.JComboBox<Genero> generoComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblFilmeGenero;
    // End of variables declaration//GEN-END:variables
}
