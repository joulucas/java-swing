package com.poo.gui;
import java.awt.GridBagConstraints;
import java.awt.Dimension;

public class Sobre extends javax.swing.JDialog {

    public Sobre(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setResizable(false);
        initComponents();
    }

    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        lbIcone = new javax.swing.JLabel();
        taTexto = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sobre");
        getContentPane().setLayout(new java.awt.GridBagLayout());

        lbIcone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/poo/gui/img/about-icon.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 20);
        getContentPane().add(lbIcone, gridBagConstraints);
        taTexto.setColumns(20);
        taTexto.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        taTexto.setRows(5);
        taTexto.setText("Sistema de Cadastro Simpes de Cliente e Produto com Interação com banco de dados\n"
        		+ "Autores: Joubert Lucas e Thales Teixeira  \n\n"
        		+ "Aplicacao desenvolvida como base nas "
        		+ "aulas de POO ministrada pela \nProf LUCIENE CHAGAS DE OLIVEIRA");
        taTexto.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        taTexto.setOpaque(false);
        gridBagConstraints_1 = new java.awt.GridBagConstraints();
        gridBagConstraints_1.gridx = 1;
        gridBagConstraints_1.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints_1.weightx = 1.0;
        gridBagConstraints_1.weighty = 1.0;
        getContentPane().add(taTexto, gridBagConstraints_1);

        setSize(new Dimension(523, 209));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbIcone;
    private javax.swing.JTextArea taTexto;
    private GridBagConstraints gridBagConstraints_1;
    // End of variables declaration//GEN-END:variables
}
