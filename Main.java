package ComputerGetter;

public class Main {

	public static void main(String[] args) {
		
		
		Computer asus = new Computer();
		System.out.println("");
		System.out.println("_________________________________________");
		System.out.println("Computer's Brand            : " + asus.getBrand());
		System.out.println("Computer's Operating System : " + asus.getOperateSystem());
		System.out.println("Processor of Computer       : " + asus.getProcessor());
		System.out.println("Resolution of Computer      : " + asus.getResolution());
		System.out.println("Size of Computer            : " + asus.getSize());
		System.out.println("Weight of Computer          : " + asus.getWeight());
		System.out.println("_________________________________________");
		
		System.out.println("_________________________________________");
		Computer lenovo = new Computer("Lenovo", "Windows 10", "i7", "2160x1350", 13, 0.9);
		System.out.println("Computer's Brand            : " + lenovo.getBrand());
		System.out.println("Computer's Operating System : " + lenovo.getOperateSystem());
		System.out.println("Processor of Computer       : " + lenovo.getProcessor());
		System.out.println("Resolution of Computer      : " + lenovo.getResolution());
		System.out.println("Size of Computer (inches)   : " + lenovo.getSize());
		System.out.println("Weight of Computer (kg)     : " + lenovo.getWeight());
		System.out.println("_________________________________________");
		System.out.println("");
		
	}
}
