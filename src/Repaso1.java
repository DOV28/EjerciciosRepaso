/*
 * Repaso1 pinta un rectangulo en la esquina superior izquierda 
 */
//importamos la libreria acm para los objetos graficos
import acm.graphics.*;

public class Repaso1 extends acm.program.GraphicsProgram {
//declaro una variable de instancia para guardar el rectangulo
	//declaro una variable de instancia para guardar el rectangulo
	GRect rectangulo;
	//recuerda que el init se ejecuta siempre antes que el run
	public void init(){
		setSize(800, 600);
		//el primer parametro del rectangulo es el ancho
		//y el segundo el alto
		rectangulo=new GRect(120,80);
		
}
	public void run(){
		//a�ado el objetoGRect al lienzo para que se muestre
		//si no especifico la posicion, aparece en (0,0)
		add(rectangulo);
	}
}
