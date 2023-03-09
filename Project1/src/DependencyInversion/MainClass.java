package DependencyInversion;

interface Transaction{
	void deposite(int amt);
	void withdraw(int amt);
}
class Web implements Transaction{
	int bal=5000;
	@Override
	public void deposite(int amt) {
		bal=bal+amt;
	}
	@Override
	public void withdraw(int amt) {
		bal=bal-amt;
	}
}
class ATM implements Transaction{
	int bal=5000;
	@Override
	public void deposite(int amt) {
		bal=bal+amt;
	}
	@Override
	public void withdraw(int amt) {
		bal=bal-amt;
	}
}
class Service{
	Transaction t;
	
	public Transaction createObject(int pin) {
		if(pin==1234) {
			t=new ATM();
			return t;
		}
		else {
			t=new Web();
			return t;
		}
	}
}
public class MainClass {
	public static void main(String[] args) {
		Service service=new Service();
		Transaction t2=service.createObject(1234);
		t2.deposite(200);
		t2.withdraw(100);
	}
}
