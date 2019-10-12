
public class NoPerecedero extends Productos{

	public String tipo;
	
	public NoPerecedero(String tipo ,String nombre, int precio) {
		super(nombre, precio);
		this.tipo=tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "NoPerecedero [tipo=" + tipo + ", getNombre()=" + getNombre() + ", getPrecio()=" + getPrecio() + "]";
	}
	
    public int calcular(int productos) {
    	int resultado;
		resultado=getPrecio()*productos;
		return resultado;
	}

}
