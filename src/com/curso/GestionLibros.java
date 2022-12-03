package com.curso;

public class GestionLibros {

	public static void main(String[] args) {
		
		Libros libro1 = new Libros(1234, "Pepito, la historia de una vida", "Pepito", 343);
		
		Libros libro2 = new Libros(1678, "El invierno", "Vera", 456);
		
		System.out.println(libro1);
		System.out.println(libro1.toString()); //Lo podemos poner así, pero lo lógico es hacerlo como arriba, porque el toString es un método implícito en el object
		System.out.println(libro2);
		System.out.println(libro2.toString());
		
		if(libro1.getNumPaginas() > libro2.getNumPaginas()){
			System.out.println("El libro " + libro1.getTitulo() + " tiene más páginas");
			// int paginas = libro1.getNumPaginas();
		} else if(libro1.getNumPaginas() < libro2.getNumPaginas()) {
			System.out.println("El libro " + libro2.getTitulo() +" tiene mayor número de páginas");
			// int paginas = libro2.getNumPaginas();
		} else {
			System.out.println("Los dos libros tienen el mismo número de páginas");
		}
		

	}

}
