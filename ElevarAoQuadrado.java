import javax.swing.JOptionPane;

public class ElevarAoQuadrado
{
   public static void main (String [] args)
   {
      int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero:"));
      
      double resultado = Math.pow(numero, 2);
            
      JOptionPane.showMessageDialog(null, "O numero elevado ao quadrado é: " + resultado);
   }
}