import javax.swing.JOptionPane;

public class CalculadoraDialogs {

    public static void main(String[] args) {
        double num1 = 0;
        double num2 = 0;
        boolean entradaValida = false;

        while (!entradaValida) {
            try {
                String input1 = JOptionPane.showInputDialog("Digite o primeiro número");
                if (input1 == null) return; 
                num1 = Double.parseDouble(input1);
                
                String input2 = JOptionPane.showInputDialog("Digite o segundo número");
                if (input2 == null) return;
                num2 = Double.parseDouble(input2);
                
                entradaValida = true; 
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida. Digite apenas números.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }

        String[] opcoes = {"+", "-", "x", "/"};
        int operacaoIndex = JOptionPane.showOptionDialog(
            null, 
            "Escolha a operação", 
            "Operação", 
            JOptionPane.DEFAULT_OPTION, 
            JOptionPane.QUESTION_MESSAGE, 
            null, 
            opcoes, 
            opcoes[0]
        );
        
        if (operacaoIndex == -1) return;

        double resultado = 0;
        boolean erroDivisaoPorZero = false;
        String operador = opcoes[operacaoIndex];

        switch (operador) {
            case "+":
                resultado = num1 + num2;
                break;
            case "-":
                resultado = num1 - num2;
                break;
            case "x":
                resultado = num1 * num2;
                break;
            case "/":
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    erroDivisaoPorZero = true;
                    JOptionPane.showMessageDialog(null, "Erro: Divisão por zero não permitida.", "Erro", JOptionPane.ERROR_MESSAGE);
                }
                break;
        }

        if (!erroDivisaoPorZero) {
            String mensagem = String.format("%.2f %s %.2f = %.2f", num1, operador, num2, resultado);
            JOptionPane.showMessageDialog(null, "Resultado:\n" + mensagem, "Resultado do Cálculo", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
