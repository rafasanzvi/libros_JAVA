package com.curso;

public class Libros {

	private int isbn;
	private String titulo; 
	private String autor;
	private int numPaginas;
	
	
	//CONSTRUCTOR
	public Libros(int isbn, String titulo, String autor, int numPaginas) {
		super();
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.numPaginas = numPaginas;
	}


	//GETTER 
	public int getNumPaginas() {
		return numPaginas;
	}
	
	
	
	public String getTitulo() {
		return titulo;
	}


	//MÉTODOS
	@Override
	public String toString() {
		return "El libro con isbn " + isbn + " escrito por " + autor + " tiene " + numPaginas + " páginas. "; 
	}
	
	
	
}
