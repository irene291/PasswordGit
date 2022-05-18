import java.util.*;
public class Password1 {

	private int longitud;
	private String [] caracteres= {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J",
			   "K", "L", "M","N","O","P","Q","R","S","T","U","V","W", "X","Y","Z","a","b", "c", "d", "e", "f", "g", "h", "i", "j",
			   "k", "l", "m","n","o","p","q","r","s","t","u","v","w", "x","y","z","0","1","2","3","4","5","6","7","8","9"  };
	
	
	private String [] minaux={"a","b", "c", "d", "e", "f", "g", "h", "i", "j",
		   "k", "l", "m","n","o","p","q","r","s","t","u","v","w", "x","y","z"};
	
	private String[] maaux= {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J",
			   "K", "L", "M","N","O","P","Q","R","S","T","U","V","W", "X","Y","Z"};
	
	private String [] numaux= {"0","1","2","3","4","5","6","7","8","9"};
	

	

    private String contrasenia1;
	
   
	

	public Password1(int longitud) {
		super();
		this.longitud = longitud;
		
	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	


	public String getContrasenia1() {
		return contrasenia1;
	}
	public void setContrasenia1(String contrasenia1) {
		this.contrasenia1 = contrasenia1;
	}







	public void generarPassword() {
		String contrasenia = "";
		
		for(int i=0; i<longitud; i++) {
			int aleatorio=(int)(0+Math.random()*caracteres.length);
		
				
				contrasenia=contrasenia+caracteres[aleatorio];
			
		}
		
		contrasenia1=contrasenia;
		
	}

	
	

	public boolean passwordValid(Password1 contrasenia5) {
		boolean valida = false;
		int mayuscula=0;
		int minuscula=0;
		int numero=0;
		
		

			for(int i=0; i<contrasenia5.getLongitud(); i++) {
					
				String cara=String.valueOf(contrasenia5.getContrasenia1().charAt(i));
				
				for(int j=0; j<minaux.length; j++) {
					
					
					if(cara.equals(minaux[j])) {
						minuscula++;
					
					}
				}
				for(int l=0; l<maaux.length; l++) {
					if(cara.equals(caracteres[l])) {
						mayuscula++;
					}
					
				}
				
				for(int m=0; m<numaux.length; m++) {
					if(cara.equals(numaux[m])) {
						numero++;
					}
				}
			
		}//Fin bucle anidado
		
		if(mayuscula>=1 && minuscula>2 && numero>=1 ) {
			valida=true;
		}
		
		return valida;
	
	}

	@Override
	public String toString() {
		return "Password [contrasenia1=" + contrasenia1 + "]";
	}
	
	
}
