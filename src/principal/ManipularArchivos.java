package principal;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

public class ManipularArchivos {

	private String rutaArchivo = "Archivos/sumo.in";
	private String rutaDestino = "Archivos/sumo.out";
	
	public void GuardarContrincantes(Sumo[] lista) {
		FileWriter file = null;
		PrintWriter printerWriter = null;

		try {
			file = new FileWriter(rutaDestino); // Destruye el archivo si existe.

			printerWriter = new PrintWriter(file);

			for (int i = 0; i < lista.length; i++) {
				printerWriter.println(lista[i].getDomina());
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (file != null) {
				try {
					file.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public Sumo[] leerListaSumos() {
		Scanner scanner = null;
		Sumo[] listaSumos = null;

		try {
			File file = new File(rutaArchivo);

			if (file.exists()) {
				scanner = new Scanner(file);
				// Especifica la configuración regional que se va a utilizar
				scanner.useLocale(Locale.ENGLISH);
				// Para la configuración regional de Argentina, utilizar:
				// arch.useLocale(new Locale("es_AR"));

				if (scanner.hasNextInt()) {
					int cantidadDeSumos = scanner.nextInt();

					listaSumos = new Sumo[cantidadDeSumos];
					int i = 0;

					scanner.nextLine();

					while (scanner.hasNextLine()) {
						String lineaLeida = scanner.nextLine();
						listaSumos[i] = new Sumo(lineaLeida);
						i++;
					}

				}

			} else
				System.out.println("No se encontrol el archivo:" + this.rutaArchivo);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// Cerrar el archivo, eso es mucho muy importante
			if (scanner != null)
				scanner.close();
		}

		return listaSumos;

	}
}
