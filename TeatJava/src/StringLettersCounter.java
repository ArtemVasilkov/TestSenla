import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class StringLettersCounter {
	public static void main(String[] args) {

		char[] vowels = { 'a', 'e', 'i', 'o', 'u', 'y' };
		Scanner in = new Scanner(System.in);
		System.out.println("Enter string");
		String insertedSring = in.nextLine();
		in.close();

		String[] words = insertedSring.split(" ");

		Word[] wordsWithNumbers = new Word[words.length];

		for (int i = 0; i < words.length; i++) {
			wordsWithNumbers[i] = new Word();
			wordsWithNumbers[i].word = words[i];
			wordsWithNumbers[i].numberOfVowels = 0;

			char[] chars = words[i].toCharArray();

			for (int j = 0; j < chars.length; j++) {
				for (int k = 0; k < vowels.length; k++) {
					if (vowels[k] == chars[j]) {
						wordsWithNumbers[i].numberOfVowels++;
					}
				}
			}
		}

		Arrays.sort(wordsWithNumbers, new Comparator<Word>() {
			@Override
			public int compare(Word first, Word second) {
				return second.numberOfVowels - first.numberOfVowels;
			}
		});

		System.out.println(Arrays.asList(wordsWithNumbers));
	}
}

class Word {
	String word;
	int numberOfVowels;

	Word() {
	}

	public String toString() {
		return (this.word + " = " + this.numberOfVowels);
	}
}
