import javax.swing.JOptionPane;

public class DiasVividos
{
   public static void main (String [] args)
   {
      int dias = Integer.parseInt(JOptionPane.showInputDialog("Digite seu peso:"));
      
      int diasVividos = dias * 365;
      
      JOptionPane.showMessageDialog(null, "O seu numero aproximado de dias vividos é " + diasVividos + " dias vividos");
   }
}