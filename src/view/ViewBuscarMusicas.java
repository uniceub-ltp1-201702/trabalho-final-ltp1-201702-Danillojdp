package view;

import javax.swing.JOptionPane;

public class ViewBuscarMusicas {
	
	//Atributos
	private String nome;
	
	public ViewBuscarMusicas(){
		this.nome =
				JOptionPane.showInputDialog("Qual o nome da musica?");
	}
	
	
	
	public String getNome() {
		return nome;
	}

	
	

}
