
public class Perecedero extends Productos{

	private int caduca;

	public int getCaduca() {
		return caduca;
	}

	public void setCaduca(int caduca) {
		this.caduca = caduca;
	}

	public Perecedero(int caduca,String nombre,int precio) {
		super(nombre,precio);
		this.caduca = caduca;
	}

	@Override
	public String toString() {
		return "Perecedero [caduca=" + caduca + ", Nombre()=" + getNombre() + ", Precio()=" + getPrecio() + "]";
	}
	
	public int calcular(int productos) {
		int resultado;
		resultado=getPrecio()*productos;
		if(caduca == 3) {
			resultado/=2;
		}else if(caduca == 2) {
			resultado/=3;
		}else if(caduca == 1) {
			resultado/=4;
		}
		return resultado;
	}
	
	
	
}
