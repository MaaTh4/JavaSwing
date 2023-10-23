
import com.sun.security.auth.module.JndiLoginModule;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Main {
    public static void main(String[] args) {


//JFrame
        
        JFrame window = new JFrame("Exemplo Swing");
        window.setSize(400,200);

        JButton botao = new JButton("Clique-me");
        botao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("O botão foi clicado");
           }
        });

        window.add(botao);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        window.setVisible(true);


//JTextField
        
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

//COMBOBOX
        
                JFrame frame = new JFrame("Exemplo JComboBox");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,150);

        JPanel panel = new JPanel();
        frame.add(panel);

        JLabel label = new JLabel("Selecione um mês");
        panel.add(label);

        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

        JComboBox<String> comboBox = new JComboBox<>(meses);
        panel.add(comboBox);

        JButton button = new JButton("Exibir Mês Selecionado");
        panel.add(button);

        JTextField textField = new JTextField(15);
        panel.add(textField);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String mesSelecionado = (String) comboBox.getSelectedItem();

                textField.setText("Mês Selecionado " + mesSelecionado);
            }
        });

        frame.setVisible(true);


        //RadioButton

        JFrame frame = new JFrame("Exemplo JComboBox");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300,150);

            frame.setLocationRelativeTo(null);

            JPanel panel = new JPanel();
            frame.add(panel);

            JLabel label = new JLabel("Você gosta de programação Java?");
            panel.add(label);

            JRadioButton simRadioButton = new JRadioButton("Sim");
            JRadioButton naoRadioButton = new JRadioButton("Não");

            ButtonGroup grupoOpcoes = new ButtonGroup();
            grupoOpcoes.add(simRadioButton);
            grupoOpcoes.add(naoRadioButton);

            panel.add(simRadioButton);
            panel.add(naoRadioButton);

            JButton button = new JButton("Exibir Opção Selecionada");
            panel.add(button);

            JTextField textField = new JTextField(15);
            panel.add(textField);

            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String opcaoSelecionada = "";

                    if(simRadioButton.isSelected()){
                        opcaoSelecionada = "Sim";
                    } else if (naoRadioButton.isSelected()) {
                        opcaoSelecionada = "Não";
                    }

                    textField.setText("Opção Selecionada: " + opcaoSelecionada);
                }
            });

            frame.setVisible(true);

        //JList

        JFrame frame = new JFrame("Exemplo JList");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JPanel panel = new JPanel();
        frame.add(panel);

        JLabel label = new JLabel("Selecione uma fruta");
        panel.add(label);

        String[] frutas = {"Maçã", "Banana", "Morango", "Uva", "Pera"};

        JList<String> listaFrutas = new JList<>(frutas);
        listaFrutas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        panel.add(new JScrollPane(listaFrutas));

        JButton button = new JButton("Exibir Fruta Selecionada");
        panel.add(button);

        JTextField textField = new JTextField(15);
        panel.add(textField);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String frutaSelecionada = listaFrutas.getSelectedValue();

                if(frutaSelecionada != null){
                    textField.setText("Fruta Selecionada: " + frutaSelecionada);
                } else {
                    textField.setText("Selecione uma Fruta");
                }
            }
        });

        frame.setVisible(true);
    
//JComboBox

            JFrame frame = new JFrame("Exemplo JComboBox");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300,150);

            frame.setLocationRelativeTo(null);

            JPanel panel = new JPanel();
            frame.add(panel);

            JLabel label = new JLabel("Selecione uma cor:");
            panel.add(label);

            String [] cores = {"Vermelho", "Azul", "Verde"};

            JComboBox<String> comboBox = new JComboBox<>(cores);
            panel.add(comboBox);

            JButton button = new JButton("Alterar Cor de Fundo");
            panel.add(button);

            frame.setLayout(new FlowLayout());
            final JPanel contentPanel = (JPanel)frame.getContentPane();

            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String corSelecionada = (String) comboBox.getSelectedItem();

                    switch (corSelecionada){
                        case "Vermelho":
                            contentPanel.setBackground(Color.RED);
                            break;
                        case "Azul":
                            contentPanel.setBackground(Color.BLUE);
                            break;
                        case "Verde":
                            contentPanel.setBackground(Color.GREEN);
                    }


                }
            });


            frame.setVisible(true);


    
    }
}
