package br.com.algaworks.wrappersboxingarrays;

public class Boxing {
	public static void main(String[] args) {
		Integer i = 10; // boxing >> conversão interna dos tipos primitivos vs objeto
		Integer ii = new Integer(10); // abpxomg >> o invero
		
		int x = ii;
		
		Integer i1 = 127;
		Integer i2 = 127;
		
		Integer i3 = 128;
		Integer i4 = 128;
		
		System.out.println(i1.equals(i2));
		System.out.println(i3.equals(i4));
	}
}