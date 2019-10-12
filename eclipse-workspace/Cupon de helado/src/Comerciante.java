
public class Comerciante extends GestionEmpleados {

	private double comision;

	public double getComision() {
		return comision;
	}

	public void setComision(double comision) {
		this.comision = comision;
	}

	@Override
	public String toString() {
		return comision + "\n" + getNombre() + "\n" + getEdad() + "\n" + +getSalario() + "\n" + getPlus();
	}

	public Comerciante(double comision, String nombre, int edad, double salario) {
		super(nombre, edad, salario);
		this.comision = comision;
	}

	public boolean plus() {
		if (getEdad() >= 30 && getSalario() >= 200) {
			setSalario(getPlus());
			System.out.println("Obtienes el plus");
			return true;
		}
		System.out.println("No obtienes el plus");

		return false;
	}

}
