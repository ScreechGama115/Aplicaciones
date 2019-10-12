
public class Repartidor extends GestionEmpleados {
	
	private String zona ;

	
	public String getZona() {
		return zona;
	}


	public void setZona(String zona) {
		this.zona = zona;
	}





	@Override
	public String toString() {
		return  zona +  getNombre()  + getEdad()
				 + getSalario() +  + getPlus() ;
	}


	public Repartidor(String zona, String nombre, int edad, double salario) {
		super(nombre,edad,salario);
		this.zona = zona;
	}
	
	
	public boolean plus() {
		if(getEdad()<=25 && getZona()=="zona 3") {
			System.out.println("Obtienes la comisión");
			return true;
			
		}
		System.out.println("No obtienes la comisión");

		return false;
	}
	
}
