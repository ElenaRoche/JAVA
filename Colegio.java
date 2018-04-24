
public class Colegio extends Edificio{
	private int numeroAulas;
	private boolean pabellon;
	public Colegio(String direction, int codigoPostal, float altura,
			boolean calefaccionCentral,int numeroAulas) {
		super(direction, codigoPostal, altura, calefaccionCentral);
		this.numeroAulas=numeroAulas;
		// TODO Auto-generated constructor stub
	}
	public int getNumeroAulas() {
		return numeroAulas;
	}
	public void setNumeroAulas(int numeroAulas) {
		this.numeroAulas = numeroAulas;
	}
	public boolean isPabellon() {
		return pabellon;
	}
	public void setPabellon(boolean pabellon) {
		this.pabellon = pabellon;
	}
	public int getCapacidadColegio(){
		int CapacidadColegio;
		CapacidadColegio=numeroAulas*30;
		return(CapacidadColegio);
	}
}
