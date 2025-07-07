package maveninheritance;

public class MultilevelChild extends MultilevelParent {
	public void child()
	{
		System.out.println("This is child");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultilevelChild obj = new MultilevelChild();
		obj.child();
		obj.display();
		obj.print();

	}

}
