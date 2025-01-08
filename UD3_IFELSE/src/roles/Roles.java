package roles;

public class Roles {
	
	//Ejecutar una consulta SQL
	public static void main (String [] args) {
		
		String rol = "admin";
		
	if (rol.equals("admin")) {
		System.out.println("Acceso total");
	}else if(rol.equals("editor")) {
		System.out.println("Acceso de edición");
	}else if(rol.equals("usuario")) {
		System.out.println("Acceso limitado");
	}else {
		System.out.println("Acceso denegado");
	}
}
}
