/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import com.mycompany.churrascoes2.AuthenticationManager;
import com.mycompany.churrascoes2.UsuarioController;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author lhsan
 */
public class AutenticarView extends JDialog{ 
    
    private final UsuarioController usuarioController;

    private final JTextField nomeField;
    private final JPasswordField senhaField;
    private final JTextField emailField; 
    private final JButton autenticarButton;

    // Construtor da janela de autenticação
    public AutenticarView(UsuarioController usuarioController) {
        super((java.awt.Frame) null, "Autenticação de Administrador", true);
        this.usuarioController = usuarioController;

        // Configurações da janela
        setTitle("Autenticação de Administrador");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        // Inicializa os componentes da janela
        nomeField = new JTextField(20);
        emailField = new JTextField(20); 
        senhaField = new JPasswordField(20);
        autenticarButton = new JButton("Autenticar");

        // Define a ação do botão
        autenticarButton.addActionListener(evt -> autenticar());

        // Layout da janela
        JPanel panel = new JPanel();
        panel.add(new JLabel("Nome do Membro:"));
        panel.add(nomeField);
        panel.add(new JLabel("Email:")); 
        panel.add(emailField); 
        panel.add(new JLabel("Senha:"));
        panel.add(senhaField);
        panel.add(autenticarButton);

        add(panel);
    }

    // Método para autenticar o administrador
    private void autenticar() {
        String nome = nomeField.getText();
        String email = emailField.getText(); 
        String senha = new String(senhaField.getPassword());
        
        AuthenticationManager authManager = AuthenticationManager.getInstancia();

        // Tenta autenticar com as credenciais fornecidas
        if (authManager.autenticar(nome, email, senha)) {
            usuarioController.setUsuarioAtual(authManager.getUsuarioAtual());
            JOptionPane.showMessageDialog(this, "Autenticação bem-sucedida!");
            System.out.println("(authManager)nome usuarioAtual: "+authManager.getUsuarioAtual().getNome());
            dispose();  // Fecha a janela de autenticação
            // Agora, o administrador pode adicionar usuários
        } else {
            JOptionPane.showMessageDialog(this, "Falha na autenticação.");
        }
    }
}
