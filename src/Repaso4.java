/*
 * La clase repaso4 tiene que dibujar un rectangulo
 * en el centro de la pantalla
 */
import acm.graphics.*;

public class Repaso4 extends acm.program.GraphicsProgram{
	//declaro una variable de instancia para almacenar el rectangulo
	//como es de instancia, se ve desde el init y desde el run 
GRect rectangulo;
//declaro otra variable de instancia que guardara el punto X de la
//pantalla en que empezara a pintarse el rectangulo
double distanciaX;
//declaro otra variable de instancia que guardara el punto X de la
//pantalla en que empezara a pintarse el rectangulo
double distanciaY;

public void init(){
	//cambio el tama�o de la pantalla
	setSize(800, 600);
	//creo el rectangulo de 120 de ancho por 80 de alto
	rectangulo=new GRect(120, 80);
	add(rectangulo);
	}
public void run(){
	//divido el ancho de la pantalla en 2 para saber donde esta
	//la mitad exacta de la pantalla
	distanciaX=getWidth()/2-rectangulo.getWidth()/2;
	
	//divido el alto de la pantalla en 2 para saber donde esta
	//la mitad exacta de la pantalla
	distanciaY=getHeight()/2-rectangulo.getHeight()/2;
	rectangulo.setLocation(distanciaX,distanciaY);
	}
}
