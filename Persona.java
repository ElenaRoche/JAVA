
public class Persona {
	//Atributos
	int edad;
	String nombre;
	String apellidos;
	char colorPelo;
	String deporte;
	//Constructor
	Persona(int edad,String nombre,String apellidos,char colorPelo){
		this.edad=edad;
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.colorPelo=colorPelo;
		this.deporte=deporte;
	}
	//Métodos
	  //Cambiaría la edad
	void setEdad(int nuevaEdad){
		edad=nuevaEdad;
	}
	  //Cambiar el nombre
	void setNombre(String nuevoNombre){
		nombre=nuevoNombre;
	}
	void setColorPelo(char nuevoColorPelo){
		colorPelo=nuevoColorPelo;
	}
	String getNombre(){
		return nombre;
		
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getDeporte() {
		return deporte;
	}
	public void setDeporte(String deporte) {
		this.deporte = deporte;
	}
	public int getEdad() {
		return edad;
	}
	public char getColorPelo() {
		return colorPelo;
	}
	

}




