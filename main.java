
import com.sun.security.auth.module.JndiLoginModule;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Main {
    public static void main(String[] args) {


//        JFrame window = new JFrame("Exemplo Swing");
//        window.setSize(400,200);
//
//        JButton botao = new JButton("Clique-me");
//        botao.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("O botão foi clicado");
//            }
//        });
//
//        window.add(botao);
//        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        window.setVisible(true);


        JFrame frame = new JFrame("Exemplo JTextField");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,150);

        JPanel panel = new JPanel();
        frame.add(panel);

        JLabel label = new JLabel("Digite seu nome:");
        panel.add(label);

        JTextField textField = new JTextField(20);
        panel.add(textField);


        JButton button = new JButton("Saudação");
        panel.add(button);

        JLabel saudacaoLabel = new JLabel();
        panel.add(saudacaoLabel);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = textField.getText();

                if(!nome.isEmpty()){
                    saudacaoLabel.setText("Olá " + nome + "!");
                } else{
                    saudacaoLabel.setText("Por favor digite seu nome");
                }
            }
        });

        frame.setVisible(true);
    }
}
