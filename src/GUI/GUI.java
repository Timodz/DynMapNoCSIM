package GUI;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class GUI  extends JPanel implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//pop.generateFile();
	}
InterfaceArchitecture pop;
GUI(){
	this.setLayout(new BorderLayout());
	pop=new InterfaceArchitecture(/*8, 8*/);
	this.add(pop,BorderLayout.CENTER);
	JPanel ok=new JPanel();
	ok.setLayout(new FlowLayout());
	JButton me=new JButton("Generer");
	me.addActionListener(this);
	ok.add(me);
	this.add(ok,BorderLayout.SOUTH);
	
	
}
public static void main (String args[]){
	JFrame me=new JFrame();
	me.setContentPane(new GUI());
	me.setVisible(true);
	me.setSize(400,400);
	
	
}
	
}
