package it.alfasoft.viviana;

import java.util.List;

public class Rubrica {
	private String nome;
	private List<Voce> voci;
	
	public Rubrica() {
		
	
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Voce> getVoci() {
		return voci;
	}

	public void setVoci(List<Voce> voci) {
		this.voci = voci;
	}
	
	
	
	//metodo per prendere tt le voci
	
	public Voce getVoceConNome(String nome){
		Voce vt=null;
		for(Voce v:voci){
			if(v.getNome().equals(nome)){
				vt=v;
			}	
		}
		return vt;
	}
	
}
