/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analizadorlexico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author CARLOS OSORIO
 */
class lexema
{
	
	private Character tokens[]=  
		{
		'=','(',')','+','-','*','/',';','<','>'
		};
	
	private	Character au='x'; //aux digito identificador

	public void instrucciones()
	{	
		System.out.println("**********************************************************");
		System.out.print("Comience a digitar el codigo                               *\n");
		System.out.print("Cuando Termine Pulse Barra Espaciadora y Enter             *\n");
		System.out.println("**********************************************************");
		System.out.println();
	}

	public Character[] leer()
	{
		String res="";
		int longitud=0;
		Character ch[];
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		try{
			System.out.print("Introduce la Expresion: ");
			do{
			res+=in.readLine();
			}while(!res.endsWith(" "));
		}catch(IOException ioe)
		{
			System.out.println("Ocurrio la Sig. Excepcion " +ioe);
		}
		longitud=res.length();
		ch=new Character[longitud];
		for(int i=0;i<longitud;i++)
		{
			ch[i]=res.charAt(i);
		}
	return ch;
	}


	public void esDigito(Character ch[])
	{
		int cont=0;
		String cualesSon="";
		for(int i=0;i<ch.length;i++)
		{
			if(au.isDigit(ch[i]))
			{
				cont++;
				cualesSon+=ch[i].toString() + " ";
			}
		}
	tipos out=new tipos(cont,"Digitos",cualesSon);
	out.verTipos();
	}


	public void esToken(Character ch[])
	{
		int ope=0;
		String cualesSon="";
		for(int i=0;i<ch.length;i++)
		{
			for(int j=0;j<tokens.length;j++)
			{
				if(ch[i].equals(tokens[j]))
				{
					ope++;
					cualesSon+=ch[i].toString() + " ";	
				}			
			}
		}
	tipos out=new tipos(ope,"Tokens",cualesSon);
	out.verTipos();
	}


	public void esIdentificador(Character ch[])
	{
		int Id=0;
		String cualesSon="";
		for(int i=0;i<ch.length;i++)
		{
			if(au.isJavaIdentifierStart(ch[i]))
			{
				Id++;
				cualesSon+=ch[i].toString() + " ";
			}
		}
	tipos out=new tipos(Id,"Identificadores",cualesSon);
	out.verTipos();	
	}
	
}