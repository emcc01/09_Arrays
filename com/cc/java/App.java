package com.cc.java;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {

      	// Deklaration: int
		int [] intArr = new int [4];  // 4 Elemente enthalten von Typ int, Arrays sind objekte
		output("Länge Array: " + intArr.length);	
		
		// Index
		output("3. Element " + intArr[2]); // ist erstmal 0 gesetzt weil noch nichts eingegeben wurde
		
		intArr[0] = 10;
		output("1. Element " + intArr[0]);  // Elemente ändern und ausgeben
		intArr[intArr.length - 1] = 11; // letztes Element ändern
		
		output("------------------ ");

		for (int i = 0; i < intArr.length; i++) { // mit Zähler (Inkrement) ganzen Array ausgeben lassen
			output("Element: " + i + " : "+ intArr[i]);
		}
			
		// Deklaration: String
		// String [] strArr = new String [2];  // Objektschreibweise, Inhalt muss danach noch eingegeben werden, s.o.
		String [] strArr = {"Hallo","Nikola"};  // Literalschreibweise
		
		for (int i = 0; i < strArr.length; i++) { // iterieren
			output("Element: " + strArr[i]);
		}
		
		
		// Mehrdimensionale Arrays
		// String [][] strMdArr = new String [2][2];
		
		String [][] strMdArr = {{"Max","Mustermann"},{"Maxine","Musterfrau"}}; // Literalschreibweise
		
		// {{0,2,1},{1,0,0}}  x|y|z
		
		output(strMdArr[0][0]); // einzelne Elemente ausgeben lassen
		output(strMdArr[1][1]);
		
		// // nested loops
		for (int i = 0; i < strMdArr.length; i++) { // ganze Arrays ausgeben lassen
			for (int j = 0; j < strMdArr.length; j++) {
				output("Indizes i/j: " + "i:" +  i + " j:"+ j + " " + strMdArr[i][j]);
			}
		}
		
		// Deklaration | Chars
		char [] letters = {'d','c','a','A','b'}; //char ist primitive, wird in einzelnen Anführungszeichen
	
			output("");  //nur für Zeilenumbruch
			output("---- vor Sortierung: "); //Ausgabe
			for (int i = 0; i < letters.length; i++) {
				output(letters[i]);	//überladene Methode, siehe ganz unten
			}

		// // Sortierfkt. --> sortiertes Array
		Arrays.sort(letters);  // Statische Klasse | statische Methode wird aufgerufen

		output("");
		output("---- nach Sortierung: ");
		for (int i = 0; i < letters.length; i++) { // Ausgabe sortiert
			output(letters[i]);	
		}

			output("");
			output("---- Suche: erfolgreich ----");
			// ... danach Suche (1)
			int searchIndex = Arrays.binarySearch(letters,'a'); // Suchalgorythmus
			output("");
			output("---- Binäre Suche: ");
			output("searchIndex: " + searchIndex); // kleines a wird an Index 1 gefunden
		
			// output("---- Suche: erfolglos ----");
			// ... danach Suche (2)
			searchIndex = Arrays.binarySearch(letters,'e');
			output("searchIndex: " + searchIndex);  // -(length+1) wird ausgegeben wenn nix gefunden
			// .... isInArray()
			
			output("---- fill() ----"); // füllen
			//.. Array füllen
			Arrays.fill(letters, '0');
			for (int i = 0; i < letters.length; i++) {
				output((letters[i]));
			}

    }

    private static void output(String outStr) {
        System.out.println(outStr);
    }

	// überladene Methode
	private static void output(char outChar) {
		System.out.print(outChar); //kein println, das heisst Elemente sind in einer Reihe
    }


}
