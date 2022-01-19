
public class MethodOverrding {
	void eat()
	{
		System.out.println("eat() method of base class");
		System.out.println("eating.");
	}
}
class Dog extends Animal {
	void eat()
	{
		System.out.println("eat() method of derived class");
		System.out.println("Dog is eating.");
	}
}
class methodOverridingEx
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Dog d1 = new Dog();
Animal a1 = new Animal();
d1.eat();
a1.eat();
	}

}
