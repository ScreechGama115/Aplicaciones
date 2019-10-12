
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Productos[] productos = new Productos[3];
		productos[0] = new Productos("Cereal", 60);
		productos[1] = new Perecedero( 12," leche",20);
		productos[2] = new NoPerecedero("Fresas","producto 4", 120);
		double total=0;
		for (int i =0;i<productos.length;i++) {
			total += productos[i].calcular(5);
		}
	System.out.println("Su total es " + total);
	Productos sabritas= new Perecedero(10,"Torciditos", 11);
	sabritas.calcular(10);
	System.out.println(sabritas.calcular(10));



	}

}
