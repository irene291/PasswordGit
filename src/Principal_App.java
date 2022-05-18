import java.util.*;
public class Principal_App {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int longitud=0;
		
		System.out.println("Introduce la longitud que quieres que tenga la contraseña: ");
		longitud = sc.nextInt(); 
		Password1 pasword1 = new Password1(longitud);
		
		pasword1.generarPassword();
		System.out.println(pasword1);
	
	if(pasword1.passwordValid(pasword1)==true) {
		System.out.println("Contraseña valdia");
	}else {
		System.out.println("NO VALIDA");
	}
	
	}
}
