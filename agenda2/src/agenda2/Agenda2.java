/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package agenda2;

import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.*;

public class Agenda2 extends JFrame implements ActionListener {
JLabel l1,l2,l3;
JTextField t1,t2,t3;
JList lista;
JButton bcad,bconsul,blimp,balt;
DefaultListModel listModel,alterador;


Cadastrar cad = new Cadastrar();
Alterar alt = new Alterar();
Consultar consul = new Consultar();
Excluir exclu = new Excluir();

    public static void main(String[] args) {
   JFrame Janela = new Agenda2();
Janela.show();
WindowListener x = new WindowAdapter()
     
{
public void windowClosing(WindowEvent e)
{
System.exit(0);
}
};
Janela.addWindowListener(x);
}
Agenda2()
{
setLocation(600,300);
setTitle("Agenda");
setSize(600,300);
l1 = new JLabel("Seu Nome para criar conta");
l1.setForeground(Color.green);
t1 = new JTextField();
t1.addActionListener((ActionListener) (this));

l2 = new JLabel("depositar");
l2.setForeground(Color.blue);
t2 = new JTextField();
t2.addActionListener((ActionListener) (this));

l3 = new JLabel("Sacar");
l3.setForeground(Color.yellow);
t3 = new JTextField();
t3.addActionListener((ActionListener) (this));



bcad = new JButton("Registrar");
bcad.addActionListener((ActionListener) (this));

bconsul = new JButton("Consulta");
bconsul.addActionListener((ActionListener) (this));

blimp = new JButton("Excluir");
blimp.addActionListener((ActionListener) (this));

balt = new JButton("Alterar");
balt.addActionListener((ActionListener) (this));


getContentPane().setLayout(new GridLayout(6,2));
        
getContentPane().add(l1);
getContentPane().add(t1);
getContentPane().add(l2);
getContentPane().add(t2);
getContentPane().add(balt);
getContentPane().add(bcad);
getContentPane().add(bconsul);
getContentPane().add(blimp);
getContentPane().add(t3);
    }

public void actionPerformed(ActionEvent e){   
 
    if (e.getSource()== bcad){
       cad.cadastro(t1.getText(),t2.getText());
       }
    if (e.getSource()== balt){
       alt.alterar(t1.getText());
       }
    if (e.getSource()== bconsul){
       consul.consulta(t1.getText());    
       }
    if (e.getSource()== blimp){
       exclu.excluir(t1.getText());    
       }     
    t1.setText(null);
    t2.setText(null);
    t3.setText(null);
    t1.requestFocus();
}


}
