package linguagemProgramacao.model.comparadores;

import java.util.Comparator;

import linguagemProgramacao.model.LinguagemFavorita;

public class ComparatorAnoNome implements Comparator<LinguagemFavorita> {

	@Override
	public int compare(LinguagemFavorita o1, LinguagemFavorita o2) {
		int comparacao = Integer.compare(o1.getAnoCriacao(), o2.getAnoCriacao());
		if(comparacao != 0) return comparacao;
		
		return o1.getNome().compareTo(o2.getNome());
		
	}

}
