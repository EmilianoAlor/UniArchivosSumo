package principal;

public class Sumo {//implements Comparable<Sumo>{
	private int peso;
	private int altura;
	private int domina=0;
	
	public Sumo(int peso, int altura) {
		this.peso = peso;
		this.altura = altura;
	}
	
	public Sumo(String dato) {
		String[] texto = dato.split(" ");
		
		this.peso = Integer.parseInt(texto[0]);
		this.altura = Integer.parseInt(texto[1]);
	}
	
	
	public int getDomina() {
		return domina;
	}

	@Override
	public String toString() {
		return "Sumo [peso=" + peso + ", altura=" + altura + ", domina=" + domina + "]";
	}

	public void compararSumo(Sumo o)
	{
		if(this.peso>o.peso && this.altura>o.altura || this.peso==o.peso && this.altura>o.altura || this.peso>o.peso && this.altura==o.altura)
			this.domina++;
	}
	
//	@Override
//	public int compareTo(Sumo o) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
	
	
	
}
