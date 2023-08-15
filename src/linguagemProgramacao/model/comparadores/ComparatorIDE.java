package linguagemProgramacao.model.comparadores;

import java.util.Comparator;

import linguagemProgramacao.model.LinguagemFavorita;

public class ComparatorIDE implements Comparator<LinguagemFavorita>{

	@Override
	public int compare(LinguagemFavorita o1, LinguagemFavorita o2) {
		return o1.getIde().compareTo(o2.getIde());
	}
	
}
