package main;
public class Demo  extends AbstractDemo{
	public void show()
	{
		System.out.println("AbstractMethod");
	}
	public static void main(String[] args) {
		AbstractDemo obj= new AbstracttDemo();
		obj.show();
}
}
