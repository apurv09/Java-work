
public class Sample {
	int num;
	static {
		System.out.println("In the static block");
	}
	{
		System.out.println("In the non-static block");
	}
	Sample(){
		num=100;
		System.out.println("In the constructor");
	}
	public void showNum() {
		System.out.println("num="+num);
	}
}
