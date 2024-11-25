import javax.swing.JOptionPane;

public class Pedido {

    public static void main(String[] args) {
        double qtd, total = 0, subtotal;
        int codigo = -1;
        String valorDigitado;

        while (codigo != 0) {
            String menu = " -----Menu----- \n";
            menu += " 1 - Cachorro quente \n ";
            menu += " 2 - Hamburguer \n ";
            menu += " 3 - Cheeseburger \n ";
            menu += " 4 - Eggcheeseburger  \n ";
            menu += " 5 - Refrigerante \n ";
            menu += " 0 - Sair \n ";
            menu += " Digite sua Opção: ";
            valorDigitado = JOptionPane.showInputDialog(menu);

            if (valorDigitado == null || valorDigitado.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Opção Inválida");
            } else {
                try {
                    codigo = Integer.parseInt(valorDigitado);
                    if (codigo != 0) {
                        valorDigitado = JOptionPane.showInputDialog("Informe a quantidade");
                        if (valorDigitado == null || valorDigitado.isEmpty()) {
                            JOptionPane.showMessageDialog(null, "Quantidade Inválida");
                            continue; // Volta para o início do loop
                        }
                        qtd = Double.parseDouble(valorDigitado);
                        switch (codigo) {
                            case 1:
                                subtotal = qtd * 1.5;
                                break;
                            case 2:
                                subtotal = qtd * 2.0;
                                break;
                            case 3:
                                subtotal = qtd * 2.5;
                                break;
                            case 4:
                                subtotal = qtd * 3.0;
                                break;
                            case 5:
                                subtotal = qtd * 1.5;
                                break;
                            default:
                                subtotal = 0;
                                break;
                        }
                        total += subtotal;
                        String texto = "Subtotal: " + subtotal + "\nTotal do Pedido: " + total;
                        JOptionPane.showMessageDialog(null, texto);
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Por favor, insira um número válido.");
                }
            }
        }

        // Mensagem de saída
        JOptionPane.showMessageDialog(null, "Total final do pedido: " + total + "\nObrigado por usar o sistema!");
    }
}