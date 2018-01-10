/*
 * adn.java
 * 
 * Copyright 2018 jribes <jribes@PC106-023-14>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */


public class adn {
	
	public static void main (String args[]) {
		char[] brin = creation(20);
		affiche(brin);
		affiche(duplique(brin));
	}
	public static char[] creation(int taille) {
		char[] brin = new char[taille];
		for (int i=0; i<taille; i++) {
			int nucleotide = (int)(Math.random()*4);
			switch(nucleotide){
				case 0:
					brin[i] = 'A';
					break;
				case 1:
					brin[i] = 'T';
					break;
				case 2:
					brin[i] = 'C';
					break;
				case 3:
					brin[i] = 'G';
					break;
				}
		}
		return brin;
	}
	public static void affiche(char[] brin){
		for (int i=0; i<brin.length; i++) {
			System.out.print(brin[i]);
		}
		System.out.println();
	}
	public static char[] duplique(char[] brin) {
		char [] duplique = new char[brin.length];
		for (int i=0; i<brin.length; i++) {
			switch(brin[i]) {
				case 'A':
					duplique[i] = 'T';
					break;
				case 'T':
					duplique[i] = 'A';
					break;
				case 'C':
					duplique[i] = 'G';
					break;
				case 'G':
					duplique[i] = 'C';
					break;
			}
		}
		return duplique; 
	}
}

