package Chapter2;

public class ArrayAsigning1 {
	public static void main(String[] args){
	Dog[] fido = new Dog[5];	
		fido[0]= new Dog();		
		fido[0].name = "Fido";
		fido[0].eat();
		fido[0].bark();
		fido[0].chaseCat();
}
}