package principal;

public class Principal {
	
	
	public static void main(String[] args) {
		ManipularArchivos ma = new ManipularArchivos();
		
		Sumo[] listaLeida= ma.leerListaSumos();
		
		
		
		for (int i = 0; i < listaLeida.length; i++) {
			for (int j = 0; j < listaLeida.length; j++) {
				listaLeida[i].compararSumo(listaLeida[j]);
			}
		}
		
		for (int i = 0; i < listaLeida.length; i++) {
			System.out.println(listaLeida[i]);
		}
		
		ma.GuardarContrincantes(listaLeida);
		
		System.out.println("Programa Terminado.");
	}
	
}
