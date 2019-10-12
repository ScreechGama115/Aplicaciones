
public class Empleados {


	public static Repartidor repartidor = new Repartidor ("zona 3 \n","Villafaña \n", 24  , 200.00);
	public static Comerciante comerciante = new Comerciante (100.00 ," Ruben", 30 , 200.00);
	public static Repartidor repartidor2 = new Repartidor (" zona 4 "," DARIO ", 24 , 200.00 );
	public static Comerciante comerciante2 = new Comerciante (100.00 ," NO SE ", 29 , 200.00);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		repartidor.plus();
		comerciante.plus();
		repartidor2.plus();
		comerciante2.plus();
		
		System.out.println(repartidor);
		System.out.println(repartidor2);
		System.out.println(comerciante);
		System.out.println(comerciante2);
	}
   
}
