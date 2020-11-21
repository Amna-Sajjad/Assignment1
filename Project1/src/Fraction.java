import javax.swing.JOptionPane;

public class Fraction {
	int num;
	int deno;
	Fraction(){
		num=1;
		deno=1;
	}
	Fraction(int n,int d){
		num=n;
		deno=d;
	}
	void inputFraction() {
		int dm,nm;
		String s1=JOptionPane.showInputDialog("Enter Numenator: ");
		nm=Integer.parseInt(s1);
		do{
			String s2=JOptionPane.showInputDialog("Enter Denumenator: ");
			dm=Integer.parseInt(s2);
			if(dm==0)
				JOptionPane.showMessageDialog(null, "Denumenator cannot be Zero","Error",JOptionPane.WARNING_MESSAGE);
		}while(dm==0);
			
		num=nm;
		deno=dm;
	}
	String displayFraction() {
		String s=num+" / "+deno;
		return s;
	}
	Fraction additionFraction(Fraction f) {
		Fraction temp=new Fraction((num*f.deno)+(f.num*deno),deno*f.deno);
		temp.reduceFraction();
		return temp;
	}
	Fraction subtractFraction(Fraction f) {
		Fraction temp=new Fraction((num*f.deno)-(f.num*deno),deno*f.deno);
		temp.reduceFraction();
		return temp;
	}
	void reduceFraction() {
		int min=0,flag=0;
		if(num<deno)
			min=num;
		else
			min=deno;
		for(int i=min;i>=1&&flag==0;i--) {
			if(num%i==0 && deno%i==0) {
				num=num/i;
				deno=deno/i;
				flag=1;
			}
		}
	}
	Fraction multiplyFraction(Fraction f) {
		Fraction r=new Fraction(num*f.num,deno*f.deno);
		r.reduceFraction();
		return r;
	}
	Fraction divideFraction(Fraction f) {
		Fraction r=new Fraction(num*f.deno,deno*f.num);
		r.reduceFraction();
		return r;
	}
	Boolean compareFraction(Fraction f) {
		reduceFraction();
		f.reduceFraction();
		if(num==f.num&&deno==f.deno)
			return true;
		else
			return false;
	}
	float convertFraction() {
		return (float)num/deno;
	}
}
