package Liskew;

interface Animal{
	
}
abstract class Bird implements Animal{
	abstract void fly();
}
class Sparrow extends Bird{
	@Override
	public void fly() {
		System.out.println("Sparrow can fly.");
	}
}
class Parrot extends Bird{
	@Override
	public void fly() {
		System.out.println("Parrot can fly.");
	}
}
class Ostrich implements Animal{
	public void run() {
		System.out.println("Ostrich only fly.");
	}
}
public class Main {
	public static void main(String[] args) {
		Parrot p1=new Parrot();
		p1.fly();
	}
}
