public class AClass {

	int a;

	public AClass() {
		// TODO Auto-generated constructor stub
		System.out.println("Default Constructor of  AClass is called");
	}

	public AClass(int a) {
		super();
		this.a = a;

		System.out.println("Parameterized Constructor of  AClass is called");
	}

	public int add(){
		
		int x=3+a;
		
		return x;
	}
}
