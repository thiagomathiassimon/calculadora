package calculadora;

import javax.swing.*;

public class Principal {

    public static void main(String[] args) {

        String opcao = "";
        Calculadora calculadora = new Calculadora();
        while (!"9".equals(opcao)) {
            opcao = JOptionPane.showInputDialog("1 - Leitura \n2 - Soma \n3 - Subtração " + "\n4 - Produto \n5 - Divisão \n9 - Sair");
            switch (Integer.parseInt(opcao)) {
                case 1:
                    calculadora.setValorA(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor A")));
                    calculadora.setValorB(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor B")));
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Soma: " + calculadora.getAdicao());
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Subtração: " + calculadora.getSubtracao());
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Produto: " + calculadora.getProduto());
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Divisão: " + calculadora.getDivisao());
                    break;
                default:
                    break;
            }
        }
    }
}
