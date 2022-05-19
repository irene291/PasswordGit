import java.util.*;
public class Principal_App {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int longitud=0;
		
		System.out.println("Introduce la longitud que quieres que tenga las contraseñas: ");
		longitud = sc.nextInt(); 
		
		Password1 pasword1 = new Password1(longitud);
		
			pasword1.generarPassword();
			System.out.println("Primera contraseña: " +  pasword1);
			
			if(pasword1.passwordValid(pasword1)==true) {
				System.out.println("Valdia, la contraseña es fuerte");
			}else {
				System.out.println("NO VALIDA. La contraseña no es fuerte");
			}
			

			Password2 pasword2 = new Password2(longitud);
			
			pasword2.generarPassword();
			System.out.println("Segunda contraseña: " +  pasword2);
			
			if(pasword2.passwordValid(pasword2)==true) {
				System.out.println("Valdia, la contraseña es fuerte");
			}else {
				System.out.println("NO VALIDA. La contraseña no es fuerte");
			}
		
	}
}
