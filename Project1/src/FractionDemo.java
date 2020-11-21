import javax.swing.JOptionPane;

public class FractionDemo {
	public static void main(String args[]) {
		Fraction f1=new Fraction();
		Fraction f2=new Fraction(2,5);
		Fraction f3=new Fraction();
		//Fraction f4=new Fraction();
		int choice;
		float fl1,fl2;
		JOptionPane.showMessageDialog(null, "Enter 1st Fraction");
		f1.inputFraction();
		JOptionPane.showMessageDialog(null, "Enter 2nd Fraction");
		f2.inputFraction();
		do {
			String ch=JOptionPane.showInputDialog("1. Add Fraction"
					+ "\n2. Subtract Fraction"
					+ "\n3. Multiply Fraction"
					+ "\n4. Divide Fraction"
					+ "\n5. Compare Fraction"
					+ "\n6. Convert to Decimal"
					+ "\n7. Exit"
					+ "\nEnter Choice: ");
			choice=Integer.parseInt(ch);
			switch(choice) {
			case 1:
				f3=f1.additionFraction(f2);
				JOptionPane.showMessageDialog(null,f1.displayFraction()+"  +  "+f2.displayFraction()
				+"  =  "+f3.displayFraction(),"Addition",JOptionPane.WARNING_MESSAGE);
				break;
			case 2:
				f3=f1.subtractFraction(f2);
				JOptionPane.showMessageDialog(null,f1.displayFraction()+"  -  "+f2.displayFraction()
				+"  =  "+f3.displayFraction(),"Subtraction",JOptionPane.WARNING_MESSAGE);
				break;
			case 3:
				f3=f1.multiplyFraction(f2);
				JOptionPane.showMessageDialog(null,f1.displayFraction()+"  *  "+f2.displayFraction()
				+"  =  "+f3.displayFraction(),"Multiplication",JOptionPane.WARNING_MESSAGE);
				break;
			case 4:
				f3=f1.divideFraction(f2);
				JOptionPane.showMessageDialog(null,f1.displayFraction()+"  /  "+f2.displayFraction()
				+"  =  "+f3.displayFraction(),"Division",JOptionPane.WARNING_MESSAGE);
				break;
			case 5:
				JOptionPane.showMessageDialog(null,"Is "+f1.displayFraction()+"  =  "+f2.displayFraction()
				+"  :  "+f1.compareFraction(f2),"Addition",JOptionPane.WARNING_MESSAGE);
				break;
			case 6:
				fl1=f1.convertFraction();
				fl2=f2.convertFraction();
				JOptionPane.showMessageDialog(null,f1.displayFraction()+"  =  "+fl1
				+"\n"+f2.displayFraction()+"  =  "+fl2,"Decimal Conversion",JOptionPane.WARNING_MESSAGE);
				break;
			case 7:
				int result = JOptionPane.showConfirmDialog(null,
				        "Are you sure you want to quit?",
				        "Confirm Quit", JOptionPane.YES_NO_CANCEL_OPTION);
				if (result == JOptionPane.YES_OPTION) 
					System.exit(0);
				break;
				default:
					JOptionPane.showMessageDialog(null, "Wrong Choice...","Error",JOptionPane.WARNING_MESSAGE);
			}
		}while(choice<=7);
	}

}
