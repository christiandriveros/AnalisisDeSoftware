import java.io.FileNotFoundException;
import java.util.LinkedList;

public class App {

	public static void main(String[] args) throws FileNotFoundException {
		Archivo arch = new Archivo("codigo1");

		LinkedList<String> lista = arch.leerArchivo();
		
		for (String linea : lista) {
			System.out.println(linea);
		}
		
		
		
//		System.out.println("hola ke ase".contains("la ke"));
	}	
		
}
