 /**
  * 
  * @author irene
  *
  */
public class Password2 {

	private int longitud;
	private String [] caracteres= {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J",
			   "K", "L", "M","N","O","P","Q","R","S","T","U","V","W", "X","Y","Z","a","b", "c", "d", "e", "f", "g", "h", "i", "j",
			   "k", "l", "m","n","o","p","q","r","s","t","u","v","w", "x","y","z",".","_","*","ñ","Ñ"};
	
	private String [] minaux={"a","b", "c", "d", "e", "f", "g", "h", "i", "j",
		   "k", "l", "m","n","o","p","q","r","s","t","u","v","w", "x","y","z"};
	
	private String[] maaux= {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J",
			   "K", "L", "M","N","O","P","Q","R","S","T","U","V","W", "X","Y","Z"};
	
	private String [] caresp= {".","_","*","ñ","Ñ"};
	
    private String contraseniaFinal;
	

	public Password2(int longitud) {
		this.longitud = longitud;
		
	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getContraseniaFinal() {
		return contraseniaFinal;
	}
	
	public void setContrasenia1(String contrasenia1) {
		this.contraseniaFinal = contrasenia1;
	}
	
	/**
	 * Generar la contraseña con caracteres aleatorios
	 */
	public void generarPassword() {
		String contrasenia = "";
		
		for(int i=0; i<longitud; i++) {
			int aleatorio=(int)(0+Math.random()*caracteres.length);
			
				contrasenia=contrasenia+caracteres[aleatorio];
			
		}
		
		contraseniaFinal=contrasenia;
		
	}

	
	
	/**
	 * Clase de comprobación de carcacteres
	 * @param contraseniaF Contraseña generada aleatoriamente
	 * @return boolean indicando si es valida o no
	 */
	public boolean passwordValid(Password2 contraseniaF) {
		boolean valida = false;
		int mayuscula=0;
		int minuscula=0;
		int caracter=0;
		
		

			for(int i=0; i<contraseniaF.getLongitud(); i++) {
					
				String cara=String.valueOf(contraseniaF.getContraseniaFinal().charAt(i));
				
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
				
				for(int m=0; m<caresp.length; m++) {
					if(cara.equals(caresp[m])) {
						caracter++;
					}
				}
			
		}//Fin bucle anidado
		
		if(mayuscula>=1 && minuscula>2 && caracter>=1 ) {
			valida=true;
		}
		
		return valida;
	
	}

	@Override
	public String toString() {
		return "Password [contrasenia=" + contraseniaFinal + "]";
	}
	//prueba
	
	
}
