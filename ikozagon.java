/*
* File: ikozagon.java
* Author: Szilágyi Nikolett Viola
* Copyright: 2022, Szilágyi Nikolett Viola
* Group: Szoft_I_N
* Date: 2022-02-22
* Github: https://github.com/nikolettszilagyii/
* Licenc: GNU GPL
*/

import java.util.Scanner;

class  Ikozagon {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Készítette: Szilágyi Nikolett Viola\nSzoft_I_N\n2022-02-22");
		System.out.println("Ikozagon területszámítás");
		System.out.print("Oldal hossza: ");
		double side = sc.nextDouble();
		
		double area1 = 5*Math.pow(side, 2);
		double area2 = (1 + Math.sqrt(5)+ Math.sqrt(5+2*Math.sqrt(5)));
		double vegso = area1 * area2;
		System.out.println("A húszszög területe: " + vegso);
		
		
		}
	}
