import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
public class MenuEMP implements ActionListener,ItemListener {
		int sw=0;
        JFrame f;
        JMenu menu1,menu2;
        JMenuBar mb;
        JMenuItem mi11;
        JMenuItem mi21,mi22,mi23;
        Icon ic1,ic2,ic3,ic4;
    public MenuEMP() {
    	f = new JFrame("Menu");
    	mb = new JMenuBar();
    	Icon ic1 = new ImageIcon(getClass().getResource("icono10.png"));
    	Icon ic2 = new ImageIcon(getClass().getResource("icono11.png"));
    	Icon ic3 = new ImageIcon(getClass().getResource("icono12.png"));
    	Icon ic4 = new ImageIcon(getClass().getResource("icono13.png"));
    	menu1 = new JMenu("Catalogo"); 
    	menu2 = new JMenu("Procesos especiales"); 
    	mi11 = new JMenuItem(ic1);
    	mi21 = new JMenuItem(ic2);
    	mi22 = new JMenuItem(ic3);
    	mi23 = new JMenuItem(ic4);
    }
    public void usar(){
    	f.setLayout(new BoxLayout(f.getContentPane(),BoxLayout.Y_AXIS));
   		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    	mb.add(menu1);mb.add(menu2);
    	mi11.setText("Empleados");
    	mi21.setText("Respaldar");
    	mi22.setText("Restaura");
    	mi23.setText("Mostrar archivo");
    	menu1.addActionListener(this);
    	menu2.addActionListener(this);
    	mi11.addActionListener(this);
    	mi21.addActionListener(this);mi22.addActionListener(this);mi23.addActionListener(this);
    	menu1.add(mi11);
    	menu2.add(mi21);menu2.add(mi22);menu2.add(mi23);
    	f.setJMenuBar(mb);
    	f.setVisible(true);
    	f.setSize(300,300);
    	f.setLocation(500,300);  		
    }
    public void actionPerformed(ActionEvent e){
    
    if(e.getSource()==mi11){
    	f.setVisible(false);
    	log mylog = new log();
    	mylog.usar();
    }
    if(e.getSource()==mi21){
    	f.setVisible(false);
    	Forma1 myform1 = new Forma1();
    	myform1.usar1();
    }
    if(e.getSource()==mi22){
    	f.setVisible(false);
    	Forma2 myform2 = new Forma2();
    	myform2.usar1();
    }
    if(e.getSource()==mi23){
    	f.setVisible(false);
    	Forma3 myform3 = new Forma3();
    	myform3.usar1();
    }
    }
    public void itemStateChanged(ItemEvent ie){
    	String state = "deselected";
    	if(ie.getStateChange()==ItemEvent.SELECTED){
    		state = "selected";
    	}
    }
    public static void main(String[] args) {
    MenuEMP mymenu = new MenuEMP();
    mymenu.usar();
    }
}
