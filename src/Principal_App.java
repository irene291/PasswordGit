
public class Principal_App {
	
	public static void main(String[] args) {
		
		Password1 pasword1 = new Password1(8);
		
		pasword1.generarPassword();
		System.out.println(pasword1);
		

		

		
	if(pasword1.passwordValid(pasword1)==true) {
		System.out.println("Contraseña valdia");
	}else {
		System.out.println("NO VALIDA");
	}
	
	}


	
}
