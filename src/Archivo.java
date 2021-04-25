
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.Scanner;

public class Archivo {
	private String nombre;

	public Archivo(String nombre) {
		super();
		this.nombre = nombre;
	}

	public LinkedList<String> leerArchivo() throws FileNotFoundException {
		Scanner leerArch = new Scanner(new FileReader("in/" + nombre + ".in"));
		LinkedList<String> codigo = new LinkedList<String>();
		
		while(leerArch.hasNext())
			codigo.add(leerArch.nextLine());

		leerArch.close();
		return codigo;
	}

}
