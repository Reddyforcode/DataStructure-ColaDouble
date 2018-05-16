
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Operaciones op = new Operaciones();
		Cola cola = new Cola();
		cola = op.insertarN(cola);
		cola = op.mostrar(cola);
		
		System.out.println("\nMayor negativos");
		cola = op.mayorNegativos(cola);
		cola = op.mostrar(cola);
		
		System.out.println("\neliminar positivos");
		cola = op.eliminarPositivos(cola);
		cola = op.mostrar(cola);
		
		System.out.println("\ninsertar frente");
		cola = op.insertarFrente(cola);
		cola = op.mostrar(cola);
		
		System.out.println("\neliminar final");
		cola = op.eliminarFinal(cola);
		cola = op.mostrar(cola);
		
		
		
				
		

	}

}
