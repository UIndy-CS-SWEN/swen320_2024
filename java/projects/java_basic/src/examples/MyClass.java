package examples;

public class MyClass {
	int count = 0;
	
	MyClass() {
	    this(10); // delegate to other constructor
	}

	MyClass(int value) {
	    this.count = value;
	}
}
