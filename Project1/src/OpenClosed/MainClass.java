package OpenClosed;

interface A{
	void add();
	void sub();
}
class B implements A{
	@Override
	public void add() {
		System.out.println("add method in B");
	}
	@Override
	public void sub() {
		System.out.println("sub method in B");
	}
}
class C implements A{
	@Override
	public void add() {
		System.out.println("add method in C");
	}
	@Override
	public void sub() {
		System.out.println("sub method in C");
	}
}
public class MainClass {
	public static void main(String[] args) {
		A a1=new B();
		A a2=new C();
		a1.add();
		a2.add();
		a1.sub();
		a2.sub();
	}
}
