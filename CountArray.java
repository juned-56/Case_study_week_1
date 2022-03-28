public class CountArray {
  /** Main method */
  public static void main(String[] args) {
    // Declare and create an array
    char[] chars = createArray();

    // Display the array
    System.out.println("The lowercase letters are:");
    displayArray(chars);

    // Count the occurrences of each letter
    int[] counts = countLetters(chars);

    // Display counts
    System.out.println();
    System.out.println("The occurrences of each letter are:");
    displayCounts(counts);
  }
 

	    public static char getRandomCharacter(char ch1, char ch2) {

	        return (char) (ch1 + Math.random() * (ch2 - ch1 + 1));
	    }

	    //Generate a random lowercase letter

	    public static char getRandomLowerCaseLetter() {

	        return getRandomCharacter('a', 'z');

	    }

  
  

  /** Create an array of characters */
  public static char[] createArray() {
    // Declare an array of characters and create it
    char[] chars = new char[100];

    // Create lowercase letters randomly and assign
    // them to the array
    for (int i = 0; i < chars.length; i++)
      chars[i] = getRandomLowerCaseLetter();

    // Return the array
    return chars;
  }

  /** Display the array of characters */
  public static void displayArray(char[] chars) {
    // Display the characters in the array 20 on each line
    for (int i = 0; i < chars.length; i++) {
      if ((i + 1) % 20 == 0)
        System.out.println(chars[i]);
      else
        System.out.print(chars[i] + " ");
    }
  }

  /** Count the occurrences of each letter */
  public static int[] countLetters(char[] chars) {
    // Declare and create an array of 26 int
    int[] counts = new int[26];

    // For each lowercase letter in the array, count it
    for (int i = 0; i < chars.length; i++)
      counts[chars[i] - 'a']++;

    return counts;
  }

  /** Display counts */
  public static void displayCounts(int[] counts) {
    for (int i = 0; i < counts.length; i++) {
      if ((i + 1) % 10 == 0)
        System.out.println(counts[i] + " " + (char)(i + 'a'));
      else
        System.out.print(counts[i] + " " + (char)(i + 'a') + " ");
    }
  }
}



=============================================Output=============================================
The lowercase letters are:
k k g i l p l p p l n u l r e b w u z w
h y s k u m d r p j t h z m q v d e d e
t n x m p r s l p i s b z n n x e d t r
y o e x f t m f v j g u p x x q q x x r
w x x q h y g y b l l j q y s r p d e e

The occurrences of each letter are:    
0 a 3 b 0 c 5 d 7 e 2 f 3 g 3 h 2 i 3 j
3 k 7 l 4 m 4 n 1 o 8 p 5 q 6 r 4 s 4 t
4 u 2 v 3 w 9 x 5 y 3 z
