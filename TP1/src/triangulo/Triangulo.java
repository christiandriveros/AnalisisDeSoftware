package triangulo;

public class Triangulo {
	private int ladoA;
	private int ladoB;
	private int ladoC;

	public Triangulo(String _ladoA, String _ladoB, String _ladoC) throws TriangleException, NumberFormatException {
		ladoA = Integer.parseInt(_ladoA);
		ladoB = Integer.parseInt(_ladoB);
	  	ladoC = Integer.parseInt(_ladoC);
	  	
	  	verificarLados(ladoA,ladoB,ladoC);
	}
	
	public Triangulo(int _ladoA, int _ladoB, int _ladoC) throws TriangleException {
		verificarLados(_ladoA,_ladoB,_ladoC);
		
		ladoA = _ladoA;
		ladoB = _ladoB;
		ladoC = _ladoC;
	}

	private void verificarLados(int _ladoA, int _ladoB, int _ladoC) throws TriangleException
	{
		if (_ladoA <= 0 || _ladoB <= 0 || _ladoC <= 0)
			throw new TriangleException("Los lados deben ser mayores a cero");
		if ((_ladoA + _ladoB) <= _ladoC || (_ladoB + _ladoC) <= _ladoA || (_ladoA + _ladoC) <= _ladoB)
			throw new TriangleException("La suma de dos de los lados debe ser menor al tercero.");
	}
	
	public String getTipo() {
		if (ladoA == ladoB && ladoB == ladoC)
			return "Equilatero";
		if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC)
			return "Isoceles";
		return "Escaleno";
	}
}
