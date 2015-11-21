/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analizadorlexico;

/**
 *
 * @author CARLOS OSORIO
 */
class analizador
{
	public static void main(String carls[])
	{	
		Character in[];
		lexema prueba=new lexema();
		prueba.instrucciones();
		in=prueba.leer();
		prueba.esIdentificador(in);
		prueba.esToken(in);
		prueba.esDigito(in);
	
	}
}
