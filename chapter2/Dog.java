package Chapter2;

public class Dog {
	String name; 
	public static void main(String[] args){
		//make a Dog object and access it
		Dog dog1 = new Dog();
		dog1.name = "Bart";
		dog1.bark();
		dog1.eat();
		dog1.chaseCat();
		//now make a Dog array
		Dog[] mydog = new Dog[3];
		//and put some dogs in it 
		mydog[0]=new Dog();
		mydog[1]=new Dog();
		mydog[2]= dog1;
		//now access the Dogs using the array
		// references
		mydog[0].name = "Fero";
		mydog[1].chaseCat();
		//what is mydog[2] name?
		System.out.println("last dog's name is " + mydog[2].name);
		//now loop through the array
		//and tell all dogs to bark
		int x=0;
		while(x<mydog.length){
		mydog[x].bark();
		x ++;
		}
	}
	public void eat(){
		
	}
	public void bark(){
		System.out.println(name + " says Ruffffff");
	}
	public void chaseCat(){
		
	}
	
}
