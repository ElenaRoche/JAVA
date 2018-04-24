
public class ManejaSegmento {
	public static void main(String[]args){
		punto a,b,c,d;
		Segmento ab;
		SegmentoColoreado cd;
		a=new punto(2,3,'A');
		b=new punto(3,1,'B');
		ab=new Segmento(a,b);
		c=new punto(1,1,'C');
		d=new punto(2,2,'D');
		cd=new SegmentoColoreado(a,b,"Amarillo");
		Sistem.out.println("El segmento tiene una longitud de "+ab.getDistance());
	}
}
