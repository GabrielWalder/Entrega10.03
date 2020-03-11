import javax.swing.JOptionPane;

public class SomaCaractere
{
   public static void main (String [] args)
   {
      String palavra1 = JOptionPane.showInputDialog("Digite a primeira palavra:");
      String palavra2 = JOptionPane.showInputDialog("Digite a segunda palavra:");
      String palavra3 = JOptionPane.showInputDialog("Digite a terceira palavra:");
      
      String total = palavra1 + palavra2 + palavra3;
            
      JOptionPane.showMessageDialog(null, "A soma de caracteres é: " + total.length());
   }
}
