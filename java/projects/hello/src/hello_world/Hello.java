package hello_world;

public class Hello {
	
	public Hello() {

	}

	public static void main(String[] args) {
		Hello h = new Hello();
		System.out.println("this is a test");
		String x = h.working();
		System.out.println(x);
	}
	
	public String working() {
		return "xyz";
	}

}
