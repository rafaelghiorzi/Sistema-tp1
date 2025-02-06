/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import classes.Professor;
import classes.UsuarioLogado;
import enums.Especialidade;
import enums.Unidade;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import static telas.TelaInicial.listaProfessores;

/**
 *
 * @author rafae
 */
public class CadastroProfessor extends javax.swing.JFrame {

    /**
     * Creates new form CadastroProfessor
     */
    public CadastroProfessor() {
        initComponents();
        popularComboBoxUnidade();
    }
    
    private void popularComboBoxUnidade() {
        for (Unidade unidade: Unidade.values()) {
            unidadeInput.addItem(unidade.toString());
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
        titulo = new javax.swing.JLabel();
        subtitulo = new javax.swing.JLabel();
        botaoSubmit = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        nome = new javax.swing.JLabel();
        nomeInput = new javax.swing.JTextField();
        cpf = new javax.swing.JLabel();
        cpfInput = new javax.swing.JTextField();
        emailInput = new javax.swing.JTextField();
        email = new javax.swing.JLabel();
        celularInput = new javax.swing.JTextField();
        celular = new javax.swing.JLabel();
        senhaInput = new javax.swing.JPasswordField();
        senha = new javax.swing.JLabel();
        sexoInput = new javax.swing.JComboBox<>();
        sexo = new javax.swing.JLabel();
        unidadeInput = new javax.swing.JComboBox<>();
        unidade = new javax.swing.JLabel();
        especialidadeInput = new javax.swing.JComboBox<>();
        especialidade = new javax.swing.JLabel();
        adminBool = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        logout = new javax.swing.JMenu();
        voltar = new javax.swing.JMenu();
        admin = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(123, 123, 132));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        titulo.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Cadastro de professor");

        subtitulo.setFont(new java.awt.Font("Serif", 2, 14)); // NOI18N
        subtitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subtitulo.setText("Faça o cadastro do professor por aqui");

        botaoSubmit.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        botaoSubmit.setText("Cadastrar");
        botaoSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSubmitActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        nome.setText("Nome:");

        cpf.setText("CPF:");

        cpfInput.setToolTipText("Apenas números, sem traços ou pontos");

        email.setText("Email:");

        celularInput.setToolTipText("Insira apenas números, sem espaços");

        celular.setText("Celular:");

        senha.setText("Senha:");

        sexoInput.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar", "Masculino", "Feminino", "Prefere não dizer" }));
        sexoInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sexoInputActionPerformed(evt);
            }
        });

        sexo.setText("Sexo:");

        unidadeInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unidadeInputActionPerformed(evt);
            }
        });

        unidade.setText("Unidade:");

        especialidadeInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                especialidadeInputActionPerformed(evt);
            }
        });

        especialidade.setText("Especialidade:");

        adminBool.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminBoolActionPerformed(evt);
            }
        });

        jLabel1.setText("Admin:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(unidade)
                        .addGap(5, 5, 5)
                        .addComponent(unidadeInput, 0, 553, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(especialidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(especialidadeInput, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(adminBool)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(senha)
                            .addComponent(sexo)
                            .addComponent(celular)
                            .addComponent(email)
                            .addComponent(cpf)
                            .addComponent(nome))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nomeInput)
                            .addComponent(emailInput)
                            .addComponent(celularInput)
                            .addComponent(sexoInput, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(senhaInput)
                            .addComponent(cpfInput, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nome)
                    .addComponent(nomeInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpf)
                    .addComponent(cpfInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email)
                    .addComponent(emailInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(celular)
                    .addComponent(celularInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(senha)
                    .addComponent(senhaInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sexo)
                    .addComponent(sexoInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(unidade)
                    .addComponent(unidadeInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(especialidadeInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(especialidade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(adminBool)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(subtitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 696, Short.MAX_VALUE)
                    .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(subtitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        logout.setText("Logout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        jMenuBar1.add(logout);

        voltar.setText("Voltar");
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });
        jMenuBar1.add(voltar);

        admin.setText("Admin");
        jMenuBar1.add(admin);

        setJMenuBar(jMenuBar1);

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
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void especialidadeInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_especialidadeInputActionPerformed
        if (unidadeInput.getSelectedIndex() == 0) {
            unidadeInput.removeItemAt(0);
        }
    }//GEN-LAST:event_especialidadeInputActionPerformed

    private void adminBoolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminBoolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adminBoolActionPerformed

    private void sexoInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sexoInputActionPerformed
        if (sexoInput.getSelectedIndex() == 0) {
            sexoInput.removeItemAt(0);
        }
    }//GEN-LAST:event_sexoInputActionPerformed

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_voltarActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        UsuarioLogado.limparSessao();
        this.dispose();
        TelaInicial tela = new TelaInicial();
        tela.setVisible(true);
    }//GEN-LAST:event_logoutActionPerformed

    private void botaoSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSubmitActionPerformed
        try {
        String nome = nomeInput.getText();
        String cpf = cpfInput.getText();
        String celular = celularInput.getText();
        String email = emailInput.getText();
        String senha = new String(senhaInput.getPassword());
        String sexo = sexoInput.getSelectedItem().toString();
        String unidade = unidadeInput.getSelectedItem().toString();
        String especialidade = especialidadeInput.getSelectedItem().toString();
        
        char sexoChar = 'P';
        switch (sexo) {
            case "Masculino":
                sexoChar = 'M';
                break;
            case "Feminino":
                sexoChar = 'F';
                break;
            case "Prefiro não dizer":
                sexoChar = 'N';
                break;
            default:
                break;
        }
        
        Unidade unidadeFinal = Unidade.Geral;
        switch (unidade) {
            case "Sul":
                unidadeFinal = Unidade.Sul;
                break;
            case "Sudoeste":
                unidadeFinal = Unidade.Sudoeste;
                break;
            case "Norte":
                unidadeFinal = Unidade.Norte;
                break;
            case "Noroeste":
                unidadeFinal = Unidade.Noroeste;
                break;
            case "Geral":
                unidadeFinal = Unidade.Geral;
            default:
                break;
        }
        
        Especialidade especialidadeFinal = Especialidade.Geral;
        switch (especialidade) {
            case "Calistenia":
                especialidadeFinal = Especialidade.Calistenia;
                break;
            case "Yoga":
                especialidadeFinal = Especialidade.Yoga;
                break;
            case "Funcional":
                especialidadeFinal = Especialidade.Funcional;
                break;
            case "Crossfit":
                especialidadeFinal = Especialidade.Crossfit;
                break;
            case "Musculacao":
                especialidadeFinal = Especialidade.Musculacao;
            default:
                break;
            case "Pilates":
                especialidadeFinal = Especialidade.Pilates;
                break;
            case "Luta":
                especialidadeFinal = Especialidade.Luta;
                break;
            case "Danca":
                especialidadeFinal = Especialidade.Danca;
                break;
        }
        
        for (Professor professor : listaProfessores) {
            if (professor.getCPF().equals(cpf)) {
                JOptionPane.showMessageDialog(this, "CPF inválido! Tente novamente.", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
        Professor professor = new Professor(nome, cpf, sexoChar, email, celular, senha, unidadeFinal, especialidade);
        
        if(professor.validarCPF(cpf)) {
            listaProfessores.add(professor);
            JOptionPane.showMessageDialog(this, "Professor criado com sucesso.", "Info", JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "CPF inválido! Tente novamente.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        } catch (HeadlessException error) {
            JOptionPane.showMessageDialog(this, "Não foi possível completar essa função!", "Erro", JOptionPane.ERROR_MESSAGE);
            System.out.println(error);
        }
    }//GEN-LAST:event_botaoSubmitActionPerformed

    private void unidadeInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unidadeInputActionPerformed
        if (unidadeInput.getSelectedIndex() == 0) {
            unidadeInput.removeItemAt(0);
        }
    }//GEN-LAST:event_unidadeInputActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CadastroProfessor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu admin;
    private javax.swing.JCheckBox adminBool;
    private javax.swing.JButton botaoSubmit;
    private javax.swing.JLabel celular;
    private javax.swing.JTextField celularInput;
    private javax.swing.JLabel cpf;
    private javax.swing.JTextField cpfInput;
    private javax.swing.JLabel email;
    private javax.swing.JTextField emailInput;
    private javax.swing.JLabel especialidade;
    private javax.swing.JComboBox<String> especialidadeInput;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JMenu logout;
    private javax.swing.JLabel nome;
    private javax.swing.JTextField nomeInput;
    private javax.swing.JLabel senha;
    private javax.swing.JPasswordField senhaInput;
    private javax.swing.JLabel sexo;
    private javax.swing.JComboBox<String> sexoInput;
    private javax.swing.JLabel subtitulo;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel unidade;
    private javax.swing.JComboBox<String> unidadeInput;
    private javax.swing.JMenu voltar;
    // End of variables declaration//GEN-END:variables
}
