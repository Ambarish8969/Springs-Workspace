package consturctorAmbiguity;

public class Sample {
	public Sample(double a,double b) {
		System.out.println("duble type args");
	}
	public Sample(int a,int b) {
		System.out.println("integer args");
	}
	public Sample(String s1,String s2) {
		System.out.println("string args");
	}
}
