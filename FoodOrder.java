import java.awt.event.*;
import javax.swing.*;
public class FoodOrder extends JFrame implements ActionListener{


	JCheckBox cb1,cb2,cb3,cb4;
	JButton b1;
	FoodOrder(){
		cb1 = new JCheckBox("Pizza Rs 100");
		cb2 = new JCheckBox("Hamburger Rs 250");
		cb3 = new JCheckBox("Chicken Biryani Rs 500");
		cb4 = new JCheckBox("Mutton Biryani Rs 800");
		
		b1 = new JButton("Order");
		
		cb1.setBounds(80,70,160,20);
		cb2.setBounds(80,90,150,20);
		cb3.setBounds(80,110,170,20);
		cb4.setBounds(80,130,180,20);
		
		b1.setBounds(110,180,90,20);
		
		
		add(cb1);add(cb2);add(cb3);add(cb4);
		add(b1);
		
		b1.addActionListener(this);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setSize(500,500);
		setLayout(null);
		setVisible(true);
		
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String msg = "";
		float amt = 0.0f;
		if(cb1.isSelected()) {
			msg += "Pizza @ 100 \n";
			amt += 100;
		}
		if(cb2.isSelected()) {
			msg += "HamBurger @ 250 \n";
			amt += 250;
		}
		
		if(cb3.isSelected()) {
			msg += "Chicken Biryani @ 500\n";
			amt += 500;
		}
		if(cb4.isSelected()) {
			msg += "Mutton Biryani @ 800 \n";
			amt += 800;
		}
		msg += "--------------------------\n";
		JOptionPane.showMessageDialog(this, msg + "Total Rs "+amt);
		
	}

	public static void main(String args[]) {
		new FoodOrder();
	}
	
}
