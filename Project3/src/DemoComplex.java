import javax.swing.JOptionPane;

public class DemoComplex {
	public static void main(String args[]) {
		int choice;
		String ch;
		String s1=JOptionPane.showInputDialog("Enter Complex No:"
				+ "\nSample \"a+bi\"");
		ComplexNo c1=new ComplexNo(s1.trim());
		String s2=JOptionPane.showInputDialog("Enter Complex No:"
				+ "\nSample \"a+bi\"");
		ComplexNo c2=new ComplexNo(s2);
		
		String s3=JOptionPane.showInputDialog("Enter Complex No:"
				+ "\nSample \"a+bi\"");
		ComplexNo c3=new ComplexNo(s3);
		
		ComplexNo c4=new ComplexNo();
		
		int choose;
		String cho;
		do {
			ch=JOptionPane.showInputDialog("1. Add Complex No"
					+ "\n2. Subtract Complex No"
					+ "\n3. Multiply Complex No"
					+ "\n4. Square Complex No"
					+ "\n5. Compare Complex No"
					+ "\n6. Exit"
					+ "\nEnter Choice: ");
			choice=Integer.parseInt(ch);
			switch(choice) {
			case 1:
				cho=JOptionPane.showInputDialog("Choose Equations:"
						+ "\n1. ( "+s1+" ) + ( "+s2+" )"
						+ "\n2. ( "+s2+" ) + ( "+s3+" )"
						+ "\n3. ( "+s3+" ) + ( "+s1+" )"
						+ "\nEnter Choice: ");
				choose=Integer.parseInt(cho);
				if(choose==1) 
					c4=c1.addComplex(c2);
				else if(choose==2)
					c4=c1.addComplex(c3);
				else if(choose==3)
					c4=c3.addComplex(c2);
				else {
					JOptionPane.showMessageDialog(null,"Wrong Choice...","Error",JOptionPane.WARNING_MESSAGE);
				}
				JOptionPane.showMessageDialog(null,"Add : "+c4.displayComplex(),"Addition",JOptionPane.WARNING_MESSAGE);
				break;
			case 2:
				cho=JOptionPane.showInputDialog("Choose Equations:"
						+ "\n1. ( "+s1+" ) - ( "+s2+" )"
						+ "\n2. ( "+s1+" ) - ( "+s3+" )"
						+ "\n3. ( "+s2+" ) - ( "+s1+" )"
						+ "\n4. ( "+s2+" ) - ( "+s3+" )"
						+ "\n5. ( "+s3+" ) - ( "+s1+" )"
						+ "\n6. ( "+s3+" ) - ( "+s2+" )"
						+ "\nEnter Choice: ");
				choose=Integer.parseInt(cho);
				if(choose==1) 
					c4=c1.subComplex(c2);
				else if(choose==2)
					c4=c1.subComplex(c3);
				else if(choose==3)
					c4=c2.subComplex(c1);
				else if(choose==4)
					c4=c2.subComplex(c3);
				else if(choose==5)
					c4=c3.subComplex(c1);
				else if(choose==6)
					c4=c3.subComplex(c2);
				else
					JOptionPane.showMessageDialog(null,"Wrong Choice...","Error",JOptionPane.WARNING_MESSAGE);
				JOptionPane.showMessageDialog(null,"Sub : "+c4.displayComplex(),"Subtraction",JOptionPane.WARNING_MESSAGE);
				break;
			case 3:
				cho=JOptionPane.showInputDialog("Choose Equations:"
						+ "\n1. ( "+s1+" ) * ( "+s2+" )"
						+ "\n2. ( "+s1+" ) * ( "+s3+" )"
						+ "\n3. ( "+s3+" ) * ( "+s2+" )"
						+ "\nEnter Choice: ");
				choose=Integer.parseInt(cho);
				if(choose==1) 
					c4=c1.multiplyComplex(c2);
				else if(choose==2)
					c4=c1.multiplyComplex(c3);
				else if(choose==3)
					c4=c3.multiplyComplex(c2);
				else 
					JOptionPane.showMessageDialog(null,"Wrong Choice...","Error",JOptionPane.WARNING_MESSAGE);
				JOptionPane.showMessageDialog(null,"Multiply : "+c4.displayComplex(),"Multiplication",JOptionPane.WARNING_MESSAGE);
				break;
			case 4:
				cho=JOptionPane.showInputDialog("Choose Complex No.:"
						+ "\n1. ( "+s1+" )"
						+ "\n2. ( "+s2+" )"
						+ "\n3. ( "+s3+" )"
						+ "\nEnter Choice: ");
				choose=Integer.parseInt(cho);
				if(choose==1) 
					c4=c1.squareComplex();
				else if(choose==2)
					c4=c1.squareComplex();
				else if(choose==3)
					c4=c3.squareComplex();
				else 
					JOptionPane.showMessageDialog(null,"Wrong Choice...","Error",JOptionPane.WARNING_MESSAGE);
				JOptionPane.showMessageDialog(null,"Square : "+c4.displayComplex(),"Square of Complex No",JOptionPane.WARNING_MESSAGE);
				break;
			case 5:
				cho=JOptionPane.showInputDialog("Choose Complex No.:"
						+ "\n1. ( "+s1+" ) & ( "+s2+" )"
						+ "\n2. ( "+s2+" ) & ( "+s3+" )"
						+ "\n3. ( "+s3+" ) & ( "+s1+" )"
						+ "\nEnter Choice: ");
				choose=Integer.parseInt(cho);
				if(choose==1) 
					JOptionPane.showMessageDialog(null,"Is Both are same : "+c1.compareComplex(c2),"Compare",JOptionPane.WARNING_MESSAGE);
				else if(choose==2)
					JOptionPane.showMessageDialog(null,"Is Both are same : "+c2.compareComplex(c3),"Compare",JOptionPane.WARNING_MESSAGE);
				else if(choose==3)
					JOptionPane.showMessageDialog(null,"Is Both are same : "+c3.compareComplex(c1),"Compare",JOptionPane.WARNING_MESSAGE);
				else 
					JOptionPane.showMessageDialog(null,"Wrong Choice...","Error",JOptionPane.WARNING_MESSAGE);
				break;
			case 6:
				int result = JOptionPane.showConfirmDialog(null,
				        "Are you sure you want to quit?",
				        "Confirm Quit", JOptionPane.YES_NO_CANCEL_OPTION);
				if (result == JOptionPane.YES_OPTION) 
					System.exit(0);
				break;
			default:
				JOptionPane.showMessageDialog(null,"Wrong Choice.....","Wrong",JOptionPane.WARNING_MESSAGE);
			}
		}while(choice<=6);
		
	}

}
