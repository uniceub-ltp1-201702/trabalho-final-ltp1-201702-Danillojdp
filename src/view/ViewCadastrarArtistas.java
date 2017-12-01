package view;

import javax.swing.JOptionPane;

public class ViewCadastrarArtistas {
	
	// Atributos 
	
	private String nomeDoCantor;
	
	// metodo para obter dados do artista a ser setado
	
	public void  obterDadosArtistas(){
		
		// obtendo os dados do artistas
			this.setNome(JOptionPane.showInputDialog("Informe o nome do artista: "));
 	    
	}
	
	
	public String getNomeDoCantor() {
		return nomeDoCantor;
	}
	public void setNome(String nome) {
		this.nomeDoCantor = nome;
	}


}
