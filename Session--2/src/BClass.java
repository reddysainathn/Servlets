public class BClass extends AClass {
	int b;

	public BClass() {
		// TODO Auto-generated constructor stub
		// super(3);
		System.out.println("Default Constructor of  BClass is called");
	}

	public BClass(int b) {
		super(3);
		this.b = b;
		System.out.println("Parameterized Constructor of  AClass is called");
	}
	
	public int sub(){
		
		int x=10-b;
		
		return x;
	}

}
