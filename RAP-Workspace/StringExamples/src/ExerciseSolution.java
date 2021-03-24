
public class ExerciseSolution {
	public static void main(String[] args) {
		String word = "supercalifragilisticexpialidocious"; 
		System.out.println("Number of vowels is: "+countVowels(word));
	}
	
	private static int countVowels(String phrase) {
		int count = 0;
		for(char character: phrase.toLowerCase().toCharArray()) {
			if("aeiou".indexOf(character) != -1) {
				count++;
			}
		}
		return count; 
	}
}
