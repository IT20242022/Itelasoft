package BasicJavaConcepts;

//Parent class
public class Animal {

	// Method in the parent class
	public void sound() {
		System.out.println("Animal makes a sound");
	}
}

// Subclass
class Dog extends Animal {
	// Overriding the sound() method in the subclass
	@Override
	public void sound() {
		System.out.println("Dog barks");
	}
}
