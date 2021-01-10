package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteOutrosWrapper {

	public static void main(String[] args) {
		
		Integer idadeRef = Integer.valueOf(29); // Autoboxing
		System.out.println(idadeRef.doubleValue()); // Unboxing
		
		Double doubleRef = Double.valueOf(3.2); // Autoboxing
		System.out.println(doubleRef.doubleValue()); // Unboxing
		
		Boolean boolRef = Boolean.FALSE; // Autoboxing
		System.out.println(boolRef.booleanValue()); // Unboxing
		
		Number numberRef = Float.valueOf(29.9f);
		
		List<Number> lista = new ArrayList<>();
		lista.add(10);
		lista.add(29.9);
		lista.add(10.0f);
		
		System.out.println(lista);
	}
}
