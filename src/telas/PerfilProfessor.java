/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import classes.Aula;
import classes.Professor;
import classes.Reserva;
import classes.UsuarioLogado;
import enums.Status;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static telas.TelaInicial.listaAulas;

/**
 *
 * @author rafae
 */
public class PerfilProfessor extends javax.swing.JFrame {
      private final Professor professorLogado;
    
    public PerfilProfessor() {
        System.out.println(UsuarioLogado.getUsuarioLogado());
        initComponents();
        this.professorLogado = (Professor) UsuarioLogado.getUsuarioLogado();
        estadoInicial();
    }

    // função para atualizar a tabela de informações de reserva
    private void carregarTabela() {
        DefaultTableModel modelo = new DefaultTableModel(new Object[]{"Aula", "Capacidade", "Data", "Hora"}, 0);
        
        // checando se o usuário tem reservas
        if (professorLogado.getAulas().isEmpty()) {
            System.out.print("O professor não tem aulas");
        }
        
        // iterando sobre cada reserva para listar elas
        for (int i = 0; i < professorLogado.getAulas().size(); i++) {
            
            // formatando TimeStamp para dd/mm
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM");
            String dataFormatada = dateFormat.format(professorLogado.getAulas().get(i).getData());
            // formatando TimeStamp para horas '20h15'
            SimpleDateFormat timeFormat = new SimpleDateFormat("HH'h'mm");
            String horaFormatada = timeFormat.format(professorLogado.getAulas().get(i).getData());
            
            Object linha[] = new Object[]{
                professorLogado.getAulas().get(i).getNome(),
                String.format("%s de %s", professorLogado.getAulas().get(i).getReservas().size(), professorLogado.getAulas().get(i).getCapacidade()),
                dataFormatada,
                horaFormatada,
            };
            modelo.addRow(linha);
        }

        tabela.setModel(modelo);
    }
    
    // inicia ou reinicia a tela em estado inicial 
    private void estadoInicial(){
    carregarTabela();
    nameLabel.setText(String.format("Olá, %s.", professorLogado.getNome()));
    // lógica do texto do salário aqui, antes e depois
    salarioInput.setText(String.format("R$ %.2f + %.2f de comissão", professorLogado.getSalario(), professorLogado.gerarSalarioTotal() - professorLogado.getSalario()));
    unidadeInput.setText(professorLogado.getUnidade().name());
    especialidadeInput.setText(professorLogado.getEspecialidade().toString());
    emailInput.setText(professorLogado.getEmail());
    celularInput.setText(professorLogado.getCelular());
    nomeInput.setText(professorLogado.getNome());
    senhaInput.setText("");
    botaoEditarInfo.setEnabled(false);
    botaoCancelarAula.setEnabled(false);
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
        nameLabel = new javax.swing.JLabel();
        painelInfo = new javax.swing.JPanel();
        infoLabel = new javax.swing.JLabel();
        salarioLabel = new javax.swing.JLabel();
        especialidadeLabel = new javax.swing.JLabel();
        unidadeLabel = new javax.swing.JLabel();
        salarioInput = new javax.swing.JLabel();
        especialidadeInput = new javax.swing.JLabel();
        unidadeInput = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        selfInfoLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        celularLabel = new javax.swing.JLabel();
        nomeLabel = new javax.swing.JLabel();
        senhaLabel = new javax.swing.JLabel();
        senhaInput = new javax.swing.JPasswordField();
        emailInput = new javax.swing.JTextField();
        celularInput = new javax.swing.JTextField();
        nomeInput = new javax.swing.JTextField();
        botaoEditarInfo = new javax.swing.JButton();
        aulaLabel = new javax.swing.JLabel();
        aulasPanel = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        botaoCriarAula = new javax.swing.JButton();
        botaoCancelarAula = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        logout = new javax.swing.JMenu();
        admin = new javax.swing.JMenu();
        cadastrarAluno = new javax.swing.JMenuItem();
        cadastrarProfessor = new javax.swing.JMenuItem();
        gerenciarUsuarios = new javax.swing.JMenuItem();
        criarAula = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        nameLabel.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        nameLabel.setText("Olá, [Professor]");

        painelInfo.setBackground(new java.awt.Color(250, 250, 250));
        painelInfo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        infoLabel.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        infoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infoLabel.setText("Suas informações:");

        salarioLabel.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        salarioLabel.setText("Salário:");

        especialidadeLabel.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        especialidadeLabel.setText("Especialidade:");

        unidadeLabel.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        unidadeLabel.setText("Sua unidade atual:");

        salarioInput.setText("[salário]");

        especialidadeInput.setText("[especialidade]");

        unidadeInput.setText("[unidade]");

        selfInfoLabel.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        selfInfoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        selfInfoLabel.setText("Informações pessoais:");

        emailLabel.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        emailLabel.setText("Email:");

        celularLabel.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        celularLabel.setText("Celular:");

        nomeLabel.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        nomeLabel.setText("Nome:");

        senhaLabel.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        senhaLabel.setText("Senha:");

        senhaInput.setText("jPasswordField1");
        senhaInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                senhaInputKeyTyped(evt);
            }
        });

        emailInput.setText("[email]");
        emailInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailInputActionPerformed(evt);
            }
        });

        celularInput.setText("[celular]");

        nomeInput.setText("[nome]");

        botaoEditarInfo.setText("Alterar informações");
        botaoEditarInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoEditarInfoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout painelInfoLayout = new javax.swing.GroupLayout(painelInfo);
        painelInfo.setLayout(painelInfoLayout);
        painelInfoLayout.setHorizontalGroup(
            painelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelInfoLayout.createSequentialGroup()
                .addComponent(selfInfoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(34, 34, 34))
            .addGroup(painelInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(infoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(painelInfoLayout.createSequentialGroup()
                .addGroup(painelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelInfoLayout.createSequentialGroup()
                        .addGroup(painelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelInfoLayout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelInfoLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(painelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(painelInfoLayout.createSequentialGroup()
                                        .addComponent(salarioLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(salarioInput, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(painelInfoLayout.createSequentialGroup()
                                        .addComponent(unidadeLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(unidadeInput))
                                    .addGroup(painelInfoLayout.createSequentialGroup()
                                        .addComponent(especialidadeLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(especialidadeInput)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(painelInfoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(painelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelInfoLayout.createSequentialGroup()
                                .addComponent(nomeLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nomeInput))
                            .addGroup(painelInfoLayout.createSequentialGroup()
                                .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(emailInput))
                            .addGroup(painelInfoLayout.createSequentialGroup()
                                .addGroup(painelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(celularLabel)
                                    .addComponent(senhaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(painelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(celularInput)
                                    .addComponent(senhaInput)
                                    .addGroup(painelInfoLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(botaoEditarInfo)
                                        .addGap(0, 0, Short.MAX_VALUE)))))))
                .addContainerGap())
        );
        painelInfoLayout.setVerticalGroup(
            painelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(infoLabel)
                .addGap(18, 18, 18)
                .addGroup(painelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salarioLabel)
                    .addComponent(salarioInput))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(especialidadeLabel)
                    .addComponent(especialidadeInput))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(unidadeLabel)
                    .addComponent(unidadeInput))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selfInfoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabel)
                    .addComponent(emailInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(painelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(celularLabel)
                    .addComponent(celularInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(painelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeLabel)
                    .addComponent(nomeInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(painelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(senhaLabel)
                    .addComponent(senhaInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(botaoEditarInfo)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        aulaLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        aulaLabel.setText("Veja suas próximas aulas!");

        aulasPanel.setBackground(new java.awt.Color(250, 250, 250));

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Aula", "Capacidade", "Data", "Hora"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMouseClicked(evt);
            }
        });
        aulasPanel.setViewportView(tabela);

        botaoCriarAula.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        botaoCriarAula.setText("Criar aula");
        botaoCriarAula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCriarAulaActionPerformed(evt);
            }
        });

        botaoCancelarAula.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        botaoCancelarAula.setText("Cancelar");
        botaoCancelarAula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarAulaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(botaoCriarAula, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoCancelarAula, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(aulasPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(painelInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameLabel)
                    .addComponent(aulaLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(nameLabel)
                        .addGap(18, 18, 18)
                        .addComponent(aulaLabel)
                        .addGap(18, 18, 18)
                        .addComponent(aulasPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botaoCriarAula, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoCancelarAula, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6))
                    .addComponent(painelInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        logout.setText("Logout");
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        jMenuBar1.add(logout);

        admin.setText("Admin");
        admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminActionPerformed(evt);
            }
        });

        cadastrarAluno.setText("Cadastrar Aluno");
        cadastrarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarAlunoActionPerformed(evt);
            }
        });
        admin.add(cadastrarAluno);

        cadastrarProfessor.setText("CadastrarProfessor");
        cadastrarProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarProfessorActionPerformed(evt);
            }
        });
        admin.add(cadastrarProfessor);

        gerenciarUsuarios.setText("Gerenciar usuários");
        gerenciarUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gerenciarUsuariosMouseClicked(evt);
            }
        });
        gerenciarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gerenciarUsuariosActionPerformed(evt);
            }
        });
        admin.add(gerenciarUsuarios);

        jMenuBar1.add(admin);

        criarAula.setText("Criar aula");
        criarAula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                criarAulaMouseClicked(evt);
            }
        });
        criarAula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                criarAulaActionPerformed(evt);
            }
        });
        jMenuBar1.add(criarAula);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void emailInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailInputActionPerformed

    private void senhaInputKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_senhaInputKeyTyped
        botaoEditarInfo.setEnabled(true);
    }//GEN-LAST:event_senhaInputKeyTyped

    private void botaoEditarInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoEditarInfoMouseClicked
        // recuperando os valores de cada input
        String senha = new String(senhaInput.getPassword());
        String email = emailInput.getText();
        String celular = celularInput.getText();
        String nome = nomeInput.getText();
        
        // checando formatação do celular e do email
        if (!celular.matches("\\d{11}") || !email.contains("@")){
            JOptionPane.showMessageDialog(this, "Insira celular e/ou email válidos!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        // validar senha para poder alterar as informações
        else if (professorLogado.validarSenha(senha)) {
            professorLogado.setNome(nome);
            professorLogado.setEmail(email);
            professorLogado.setCelular(celular);
            JOptionPane.showMessageDialog(this, "Informações editadas com sucesso", "Info", JOptionPane.INFORMATION_MESSAGE);
            estadoInicial();
        } else {
            JOptionPane.showMessageDialog(this, "Senha não confere!", "Erro", JOptionPane.ERROR_MESSAGE);
            estadoInicial();
        }
    }//GEN-LAST:event_botaoEditarInfoMouseClicked

    private void botaoCriarAulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCriarAulaActionPerformed
        CriarAula tela = new CriarAula();
        tela.setVisible(true);
    }//GEN-LAST:event_botaoCriarAulaActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        UsuarioLogado.limparSessao();
        TelaInicial tela = new TelaInicial();
        tela.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutActionPerformed

    private void criarAulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_criarAulaActionPerformed
        CriarAula tela = new CriarAula();
        tela.setVisible(true);
    }//GEN-LAST:event_criarAulaActionPerformed

    private void cadastrarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarAlunoActionPerformed
        if (!professorLogado.isAdmin()) {
            JOptionPane.showMessageDialog(this, "Você não tem acesso a essa página", "Info", JOptionPane.INFORMATION_MESSAGE);
        } else {
            CadastroAluno tela = new CadastroAluno();
            tela.setVisible(true);
        }
    }//GEN-LAST:event_cadastrarAlunoActionPerformed

    private void adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminActionPerformed
           PaginaAdmin tela = new PaginaAdmin();
           tela.setVisible(true);
    }//GEN-LAST:event_adminActionPerformed

    private void cadastrarProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarProfessorActionPerformed
        if (!professorLogado.isAdmin()) {
            JOptionPane.showMessageDialog(this, "Você não tem acesso a essa página", "Info", JOptionPane.INFORMATION_MESSAGE);
        } else {
            CadastroProfessor tela = new CadastroProfessor();
            tela.setVisible(true);
        }
    }//GEN-LAST:event_cadastrarProfessorActionPerformed

    private void gerenciarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerenciarUsuariosActionPerformed
           PaginaAdmin tela = new PaginaAdmin();
           tela.setVisible(true);
    }//GEN-LAST:event_gerenciarUsuariosActionPerformed

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        UsuarioLogado.limparSessao();
        TelaInicial tela = new TelaInicial();
        tela.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutMouseClicked

    private void criarAulaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_criarAulaMouseClicked
        CriarAula tela = new CriarAula();
        tela.setVisible(true);
    }//GEN-LAST:event_criarAulaMouseClicked

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        estadoInicial();
    }//GEN-LAST:event_formWindowGainedFocus

    private void botaoCancelarAulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarAulaActionPerformed
        int resposta = JOptionPane.showConfirmDialog(this, "Tem certeza de que deseja cancelar a aula?", "Confirmar Cancelamento", JOptionPane.YES_NO_OPTION);

        if (resposta == JOptionPane.YES_OPTION) {
            Aula aulaSelecionada = professorLogado.getAulas().get(tabela.getSelectedRow());
            for (Reserva reserva : aulaSelecionada.getReservas()) {
                reserva.setStatus(Status.Cancelada);
            }
            listaAulas.remove(aulaSelecionada);
            professorLogado.getAulas().remove(aulaSelecionada);
            JOptionPane.showMessageDialog(this, "Aula cancelada com sucesso.", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        }
        estadoInicial();
    }//GEN-LAST:event_botaoCancelarAulaActionPerformed

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
        botaoCancelarAula.setEnabled(true);
    }//GEN-LAST:event_tabelaMouseClicked

    private void gerenciarUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gerenciarUsuariosMouseClicked
           PaginaAdmin tela = new PaginaAdmin();
           tela.setVisible(true);
    }//GEN-LAST:event_gerenciarUsuariosMouseClicked

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
            java.util.logging.Logger.getLogger(PerfilProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PerfilProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PerfilProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PerfilProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PerfilProfessor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu admin;
    private javax.swing.JLabel aulaLabel;
    private javax.swing.JScrollPane aulasPanel;
    private javax.swing.JButton botaoCancelarAula;
    private javax.swing.JButton botaoCriarAula;
    private javax.swing.JButton botaoEditarInfo;
    private javax.swing.JMenuItem cadastrarAluno;
    private javax.swing.JMenuItem cadastrarProfessor;
    private javax.swing.JTextField celularInput;
    private javax.swing.JLabel celularLabel;
    private javax.swing.JMenu criarAula;
    private javax.swing.JTextField emailInput;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel especialidadeInput;
    private javax.swing.JLabel especialidadeLabel;
    private javax.swing.JMenuItem gerenciarUsuarios;
    private javax.swing.JLabel infoLabel;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JMenu logout;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nomeInput;
    private javax.swing.JLabel nomeLabel;
    private javax.swing.JPanel painelInfo;
    private javax.swing.JLabel salarioInput;
    private javax.swing.JLabel salarioLabel;
    private javax.swing.JLabel selfInfoLabel;
    private javax.swing.JPasswordField senhaInput;
    private javax.swing.JLabel senhaLabel;
    private javax.swing.JTable tabela;
    private javax.swing.JLabel unidadeInput;
    private javax.swing.JLabel unidadeLabel;
    // End of variables declaration//GEN-END:variables
}
