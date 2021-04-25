import java.util.LinkedList;

public class Analisis {
	private LinkedList<String> codigo;

	public Analisis(LinkedList<String> codigo) {
		super();
		this.codigo = codigo;
	}

	public int getCantLineasTotales() {
		return codigo.size();
	}

	public int getCantLineasCodigo() {
		int cantLineasCodigo = 0;

		for (String linea : codigo)
			if (linea.equalsIgnoreCase(""))
				cantLineasCodigo++;

		return cantLineasCodigo;
	}

	public int getCantLineasComentadas() {
		int cantLineasComentadas = 0;

		for (String linea : codigo)
			if (linea.contains("//"))
				cantLineasComentadas++;

		return cantLineasComentadas;
	}

	public int getCantLineasEnBlanco() {
		int cantLineasEnBlanco = 0;
		for (String linea : codigo)
			if (linea.isEmpty())
				cantLineasEnBlanco++;

		return cantLineasEnBlanco;
	}

	public int getComplejidadCiclomatica() {
		int complejidadCiclomatica = 1;

		for (String linea : codigo) {
			char[] lineaCarac = linea.toCharArray();
			int i = 0;
			while (i < lineaCarac.length - 1) {

				switch (lineaCarac[i]) {
				case '>':
				case '<':
				case '!':
					complejidadCiclomatica++;
					if (lineaCarac[i + 1] == '=') {
						complejidadCiclomatica++;
						i++;
					}
					break;
				case '=':
					if (lineaCarac[i + 1] == '=') {
						complejidadCiclomatica++;
						i++;
					}
					break;
				}

				++i;
			}
		}

		return complejidadCiclomatica;
	}

	public int getHalsteadLongitud() {
		
		
		return 0;
	}
	
	public float getHalsteadVolumen() {
		
		return 0f;
	}
}
