/*
* Repaso9:clic en el rectángulo lo desplaza arriba o abajo
* según en que mitad se haya producido
*/
import java.awt.event.MouseEvent;
import acm.graphics.*;
import acm.util.RandomGenerator;
public class Repaso9 extends acm.program.GraphicsProgram{
GRect rectangulo;
double distanciaX;
double distanciaY;
RandomGenerator random = new RandomGenerator();
public void init(){
setSize(800,600);
rectangulo = new GRect (120,80);
addMouseListeners();
}
public void run(){
distanciaX = this.getWidth()/2 - rectangulo.getWidth()/2;
distanciaY = this.getHeight()/2 - rectangulo.getHeight()/2;
add (rectangulo, distanciaX, distanciaY);
}
public void mouseClicked (MouseEvent evento){
if (getElementAt(evento.getX(),evento.getY()) == rectangulo){
//guardo el ancho del rectangulo
double altoRect = rectangulo.getHeight();
//calculo la distancia desde la esquina izquierda del rectangulo
//hasta el punto del clic
double distanciaDelOrigenDelRectanguloAlClic = (evento.getX() - rectangulo.getX());
//si la distancia es mayor es que el clic ha sido a la derecha
if (distanciaDelOrigenDelRectanguloAlClic > altoRect/2){
rectangulo.move(0, 5);
}
else {//el clic ha sido a la izquierda
rectangulo.move(0, -5);
}
}
}
}