package linguagemProgramacao.model;

import java.util.Comparator;
import java.util.Objects;

public class LinguagemFavorita implements Comparable<LinguagemFavorita> {
	private String nome;
	private int anoCriacao;
	private String ide;
	
	public LinguagemFavorita(String nome, int anoCriacao, String ide) {
		this.nome = nome;
		this.anoCriacao = anoCriacao;
		this.ide = ide;
	}

	public String getNome() {
		return nome;
	}

	public int getAnoCriacao() {
		return anoCriacao;
	}

	public String getIde() {
		return ide;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass()) return false;
		LinguagemFavorita linguagemFavorita = (LinguagemFavorita) obj;
		return nome.equals(linguagemFavorita.getNome()) && anoCriacao == linguagemFavorita.getAnoCriacao() && ide.equals(linguagemFavorita.getIde());
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(nome, anoCriacao, ide);
	}
	
	@Override
	public int compareTo(LinguagemFavorita o) {
		return nome.compareTo(o.getNome());
	}
	
	@Override
	public String toString() {
		return "[" + this.nome + ", " + this.anoCriacao + ", " + this.ide + "]";
	}
}



