
public class Edificio {
	private String direction;
	private int codigoPostal;
	private float altura;
	private boolean calefaccionCentral;
	public Edificio(String direction, int codigoPostal, float altura,
			boolean calefaccionCentral) {
		super();
		this.direction = direction;
		this.codigoPostal = codigoPostal;
		this.altura = altura;
		this.calefaccionCentral = calefaccionCentral;
	}
	public String getDirection() {
		return direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}
	public int getCodigoPostal() {
		return codigoPostal;
	}
	public void setCodigoPostal(int codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public boolean isCalefaccionCentral() {
		return calefaccionCentral;
	}
	public void setCalefaccionCentral(boolean calefaccionCentral) {
		this.calefaccionCentral = calefaccionCentral;
	}
	

}
