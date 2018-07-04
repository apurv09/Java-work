
public class ValueAdder {

	int inum1,inum2,isum;
	float fnum1,fnum2,fsum;
	public void add(int inum1,int inum2) {
		this.inum1 = inum1;
		this.inum2 = inum2;
		
		this.isum=this.inum1+this.inum2;
		System.out.println("Integers sum"+isum);
	}
	public void add(float fnum1,float fnum2) {
		this.fnum1 = fnum1;
		this.fnum2 = fnum2;
		
		this.fsum=this.fnum1+this.fnum2;
		System.out.println("Floating values sum"+fsum);
	}
}
