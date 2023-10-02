package com.pavitrabk.intermediate_java_programs;

public class VowelConsonant {

	public static void main(String[] args) {
		
		char ch = 'a';
		
		switch(ch)
		{
		case 'a' :
		case 'e' :
		case 'i' :
		case 'o' :
		case 'u' :
			System.out.println("ch is Vowel : " + ch);
			break;
		default:
			System.out.println("ch is Consonant : " + ch);
		}

	}

}
