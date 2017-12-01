package model;

public class Artistas {
	
	// Atributos 
	
	private String nomeDoCantor;

	// metodo que transforma um artista na representacao dele em linha  para salvar em um arquivo 

	public String toLinha(){
		return getNomeDoCantor();
	}

	//Metodo toString
	public String toString(){
		return "Nome do cantor: " + this.nomeDoCantor;
	}
	
	
// metodos construtor
	public Artistas(String nomeDoCantor) {
		super();
		this.nomeDoCantor = nomeDoCantor;
			}
	
	// metodos get e set 
	public String getNomeDoCantor() {
		return nomeDoCantor;
	}
	public void setNomeDoCantor(String nomeDoCantor) {
		this.nomeDoCantor = nomeDoCantor;
	}
	
	

}
