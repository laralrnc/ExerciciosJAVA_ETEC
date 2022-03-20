import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class CalculadoraSimples extends JFrame implements ActionListener
{
  JLabel L1, L2, L3;
  JButton b1, b2, b3, b4, b5;
  JTextField t1, t2, t3;
  
  public static void main(String args[])
  {
    JFrame Janela = new CalculadoraSimples();
    Janela.show();
  }
  CalculadoraSimples()
  {
    // Configurando a Janela
    setTitle("Calculadora Simples");
    setSize(350, 90);
    setLocation(150, 150);
    getContentPane().setBackground(new Color(150, 150, 150));
    getContentPane().setLayout(new GridLayout(3,4)); 
    setResizable(false);
        
    // Configurando os Labels
    
    L1 = new JLabel("Num.1");
    L1.setForeground(Color.black);
    L1.setFont(new Font("", Font.BOLD,14));
    L2 = new JLabel("Num.2");
    L2.setForeground(Color.black);
    L2.setFont(new Font("", Font.BOLD,14));
    L3 = new JLabel("Total");
    L1.setForeground(Color.black);
    L1.setFont(new Font("", Font.BOLD,14));
    
    // Configurando os botões
   
    b1 = new JButton("+");
    b1.addActionListener(this);
    b2 = new JButton("-");
    b2.addActionListener(this);
    b3 = new JButton("x");
    b3.addActionListener(this);
    b4 = new JButton("/");
    b4.addActionListener(this);
    b5 = new JButton("Limpar");
    b5.addActionListener(this);
    b5.setBackground(Color.black);
    b5.setForeground(Color.white);
    
   // Configurando os Caixas de Textos
    
    t1 = new JTextField(); t2 = new JTextField(); t3 = new JTextField();
    t3.setEditable(false);
    
    getContentPane().add(L1); getContentPane().add(t1);
    getContentPane().add(b1); getContentPane().add(b2);
    getContentPane().add(L2); getContentPane().add(t2);
    getContentPane().add(b3); getContentPane().add(b4);
    getContentPane().add(L3); getContentPane().add(t3);
    getContentPane().add(b5); 
       
  }
  
  public void actionPerformed(ActionEvent e)
  {
    if (e.getSource() == b5)
    { 
      t1.setText("");
      t2.setText("");
      t3.setText("");
      return;
    }
    
    float n1=0 , n2=0, result = 0;
    try
    {
      n1 = Float.parseFloat(t1.getText());
      n2 = Float.parseFloat(t2.getText());
    }
    catch (NumberFormatException erro)
    {
     JOptionPane.showMessageDialog(null, "Digite apenas números", " Erro", JOptionPane.PLAIN_MESSAGE);
    }
     if (e.getSource() == b1)
     {
      result = n1 + n2;
      t3.setText("" + result);
     }
     if (e.getSource() == b2)
     {
      result = n1 - n2;
      t3.setText("" + result);
     }
     if (e.getSource() == b3)
     {
      result = n1 * n2;
      t3.setText("" + result);
     }
     if (e.getSource() == b4)
     {
      result = n1 / n2;
      t3.setText("" + result);
     }
  }
}