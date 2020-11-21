import javax.swing.JOptionPane;

public class ComplexNo {
	private int real;
	private int imag;
	
	ComplexNo(){
		real=0;
		imag=0;
	}
	ComplexNo(int r,int i){
		real=r;
		imag=i;
	}
	ComplexNo(String s){
		if(s.charAt(s.length()-1)=='i') {
			String op1=new String();
			if(s.startsWith("-")) {
				op1="-";
				s=s.substring(1);
				}	
		String op="",temp="";
			if(s.indexOf("+")!=-1) {
				op="+";
				temp="\\"+op;
			}
			else if(s.indexOf("-")!=-1){
				op="-";
				temp=op;
			}
			String s1[]=s.split(temp);
			
			setData(Integer.parseInt(op1+s1[0]),Integer.parseInt(op+s1[1].substring(0,s1[1].length()-1)));
		}
		else
			JOptionPane.showMessageDialog(null, "Wrong Input....","Error",JOptionPane.WARNING_MESSAGE);
		
	}
	String displayComplex() {
		String s1,s2,s3;
		s1=String.valueOf(real);
		s2=String.valueOf(imag);
		if(imag>0) {
			s3=s1+"+"+s2+"i";
		}
		else {
			s3=s1+s2+"i";
		}
		return s3;
	}
	void setData(int r,int i) {
		real=r;
		imag=i;
	}
	int getReal() {
		return real;
	}
	int getImag() {
		return imag;
	}
	ComplexNo addComplex(ComplexNo c) {
		ComplexNo c1=new ComplexNo(real+c.real,imag+c.imag);
		return c1;
	}
	ComplexNo subComplex(ComplexNo c) {
		ComplexNo c1=new ComplexNo(real-c.real,imag-c.imag);
		return c1;
	}
	ComplexNo multiplyComplex(ComplexNo c) {
		ComplexNo c1=new ComplexNo();
		c1.real=(real*c.real)-(imag*c.imag);
		c1.imag=(imag*c.real)+(real*c.imag);
		return c1;
	}
	ComplexNo squareComplex() {
		ComplexNo c1=new ComplexNo();
		c1.real=(real*real)-(imag*imag);
		c1.imag=2*real*imag;
		return c1;
	}
	Boolean compareComplex(ComplexNo c) {
		if(real==c.real && imag==c.imag)
			return true;
		else
			return false;
	}
}
