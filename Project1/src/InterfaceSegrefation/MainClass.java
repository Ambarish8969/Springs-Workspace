package InterfaceSegrefation;

interface Machine1 {
	void scan();
}

interface Machine2 {
	void print1();
}

interface Machine3 {
	void fax();
}

class Canon implements Machine1 {

	@Override
	public void scan() {
		System.out.println("Canon can scan");
	}

}
class Epson implements Machine1,Machine2{
	
	@Override
	public void scan() {
		System.out.println("Epson can scan");
	}
	@Override
	public void print1() {
		System.out.println("Epson can print");
	}
	
}
class Nikon implements Machine1,Machine2,Machine3{
	
	@Override
	public void scan() {
		System.out.println("Nikon can scan");
	}
	@Override
	public void print1() {
		System.out.println("Nikon can print");
	}
	@Override
	public void fax() {
		System.out.println("Nikon can fax");
	}
	
}

public class MainClass {
	public static void main(String[] args) {
		
	}
}
