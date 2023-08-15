package app;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import linguagemProgramacao.model.LinguagemFavorita;
import linguagemProgramacao.model.comparadores.ComparatorAnoNome;
import linguagemProgramacao.model.comparadores.ComparatorIDE;
import linguagemProgramacao.model.comparadores.ComparatorNomeAnoIDE;

public class Principal {
	public static void main(String[] args) {
		Set<LinguagemFavorita> linguagens = new LinkedHashSet<>();
		
		linguagens.add(new LinguagemFavorita("JAVA", 1991, "Eclipse IDE"));
		linguagens.add(new LinguagemFavorita("C++", 1983, "Dev C++"));
		linguagens.add(new LinguagemFavorita("VBA", 1991, "Microsoft Visual Basic For Application"));
		
		System.out.println("Linguagens em ordem de inserção:");
		for(LinguagemFavorita linguagem : linguagens) System.out.println(linguagem);
		
		
		Set<LinguagemFavorita> linguagensNome = new TreeSet<>(linguagens);
		
		System.out.println("\nLinguagens em ordem natural (nome):");
		for(LinguagemFavorita linguagem : linguagensNome) System.out.println(linguagem);
		
		
		Set<LinguagemFavorita> linguagensIDE = new TreeSet<>(new ComparatorIDE());
		linguagensIDE.addAll(linguagens);
		
		System.out.println("\nLinguagens ordenadas por IDE:");
		for(LinguagemFavorita linguagem : linguagensIDE) System.out.println(linguagem);
		
		
		Set<LinguagemFavorita> linguagensAnoNome = new TreeSet<>(new ComparatorAnoNome());
		linguagensAnoNome.addAll(linguagens);
		
		System.out.println("\nLinguagens ordenadas por ano de criação e nome:");
		for(LinguagemFavorita linguagem : linguagensAnoNome) System.out.println(linguagem);
		
		
		Set<LinguagemFavorita> linguagensNomeAnoIDE = new TreeSet<>(new ComparatorNomeAnoIDE());
		linguagensNomeAnoIDE.addAll(linguagens);
		
		System.out.println("\nLinguagens ordenadas por nome, ano de criação e IDE:");
		for(LinguagemFavorita linguagem : linguagensNomeAnoIDE) System.out.println(linguagem); 	
	}
}
