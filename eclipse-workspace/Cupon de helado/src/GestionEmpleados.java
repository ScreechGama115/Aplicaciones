
public class GestionEmpleados {

	private String nombre;
	private int edad;
	private double salario;
	private double plus= 300;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public double getPlus() {
		return plus;
	}
	public void setPlus(double plus) {
		this.plus = plus;
	}
	public GestionEmpleados(String nombre, int edad, double salario) {
		this.nombre = nombre;
		this.edad = edad;
		this.salario = salario;
	}
	
	
}
