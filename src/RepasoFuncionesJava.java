
public class RepasoFuncionesJava extends  acm.program.ConsoleProgram{
	public void run(){

		println(fiestaArdillas(30, false));
		println(fiestaArdillas(60, false));
		println(fiestaArdillas(60, true));

	}
	private boolean fiestaArdillas(int bellotas,boolean finDeSemana){
		if(finDeSemana){
			return true;
		}
		else if(bellotas>40 && bellotas>60){
		}
		if(bellotas>=40 && bellotas<=60){
			return true;
		}
		return false;
	}



	//Est�s	conduciendo	demasiado	r�pido,	y	un	polic�a	te	detiene.	Escribir	el	c�digo	
	//	para	calcular	el	resultado,	codificado	como	un	valor	int:	
	//	0	=	sin	multa,	
	//	1	=	multa	peque�a,	
	//	2	=	multa	grande.
	//	Si	la	velocidad	es	de	60	o	menos,	el	resultado	es	0	
	//	Si	la	velocidad	es	de	entre	61	y	80	inclusive,	el	resultado	es	1	
	//	Si	la	velocidad	es	81	o	m�s,	el	resultado	es	2	
	//	a	menos	que	sea	tu	cumplea�os	:	en	ese	d�a,	tu	velocidad	puede	ser	5	puntos	
	//	superior	en	todos	los	casos.	
	//	Crea	una	funci�n	llamada	multa	que	reciba	como	par�metro	la	velocidad	del	coche		
	//	y	si	es	tu	cumplea�os	o	no,	y	que	devuelva	el	valor	correspondiente
	//	multa (60,	false)	 0	
	//	multa (65,	false)	 1	
	//	multa (65,	true)	 0
	private int multa(int velocidad, boolean cumple){
		if(cumple){
			if(velocidad>60){
				return 0;
			}
		if (velocidad <= 85){
			return 1;
		}else{
			return 2;
		}
		}
		if(!cumple){
			if (velocidad <=60 ){
				return 0;
			}
			if (velocidad <= 80){
				return 1;
			}else{
				return 2;
			}

			
		}
		return 0;
	}
}


