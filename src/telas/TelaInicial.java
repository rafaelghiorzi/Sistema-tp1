/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import classes.Aluno;
import classes.Aula;
import classes.Professor;
import classes.Reserva;
import enums.Especialidade;
import enums.Unidade;
import java.util.ArrayList;

/**
 *
 * @author rafae
 */
public class TelaInicial extends javax.swing.JFrame {
    // criando listas e elementos placeholder
    public static ArrayList<Aluno> listaAlunos = new ArrayList<>();
    public static ArrayList<Professor> listaProfessores = new ArrayList<>();
    public static ArrayList<Aula> listaAulas = new ArrayList<>();
    public static ArrayList<Reserva> listaReservas = new ArrayList<>();

    public TelaInicial() {
        initComponents();
        // admin adicionado com construtor específico
        listaProfessores.add(new Professor("Admin", "admin@codefit.com", "admin", true));
        listaProfessores.add(new Professor("Maria Oliveira", "123", 'F', "maria@gmail.com", "11988888888", "123", Unidade.Noroeste, Especialidade.Funcional, 3200.0f, false));        
        listaAlunos.add(new Aluno("Ana Costa", "19943781742", 'F', "ana@gmail.com", "11966666666", "senha123", Unidade.Sul, 200.0f));
        listaAlunos.add(new Aluno("Bruno Rocha", "56789012345", 'M', "bruno@gmail.com", "11955555555", "senha456", Unidade.Noroeste, 250.0f));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painel = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        painelBotao = new javax.swing.JPanel();
        botaoProfessor = new javax.swing.JButton();
        botaoAluno = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        painel.setBackground(new java.awt.Color(255, 255, 255));

        titulo.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Bem-vindo à CodeFit!");

        painelBotao.setBackground(new java.awt.Color(255, 255, 255));

        botaoProfessor.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        botaoProfessor.setText("Sou professor");
        botaoProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoProfessorActionPerformed(evt);
            }
        });

        botaoAluno.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        botaoAluno.setText("Sou aluno");
        botaoAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAlunoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelBotaoLayout = new javax.swing.GroupLayout(painelBotao);
        painelBotao.setLayout(painelBotaoLayout);
        painelBotaoLayout.setHorizontalGroup(
            painelBotaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelBotaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botaoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 204, Short.MAX_VALUE)
                .addComponent(botaoProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        painelBotaoLayout.setVerticalGroup(
            painelBotaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBotaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelBotaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Design sem nome.png"))); // NOI18N

        javax.swing.GroupLayout painelLayout = new javax.swing.GroupLayout(painel);
        painel.setLayout(painelLayout);
        painelLayout.setHorizontalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelBotao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(233, 233, 233))
        );
        painelLayout.setVerticalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(titulo)
                .addGap(31, 31, 31)
                .addComponent(painelBotao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAlunoActionPerformed
        LoginAluno login = new LoginAluno();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoAlunoActionPerformed

    private void botaoProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoProfessorActionPerformed
        LoginProfessor login = new LoginProfessor();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoProfessorActionPerformed

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
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAluno;
    private javax.swing.JButton botaoProfessor;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel painel;
    private javax.swing.JPanel painelBotao;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
