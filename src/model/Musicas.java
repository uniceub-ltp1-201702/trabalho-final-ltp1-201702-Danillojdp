package model;

public class Musicas {
	
	// Atributos 
	
	private String nome;
	private String genero;
	private String artista;
	
	
	// metodo que transforma uma musica na representacao dela em linha para salvar em um arquivo */

	public String toLinha(){
		return getNome() + ";" + getGenero() +  ";" + getArtista();
	}
	
	
// metodo toString
	public String toString(){
		return "Nome da musica: " + this.nome + "\n" +
				"Genero: " + this.genero + "\n" + "Artista: " + this.artista + "\n";
	}
	
// metodo construtor
	public Musicas(String nome, String genero, String artista) {
		super();
		this.nome = nome;
		this.genero = genero;
		this.artista = artista;
	}
	
	
	
	//metodo get e set
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	
	
	

}
