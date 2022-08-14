import javax.swing.JOptionPane;

/**
 * PigLatin
 */
public class PigLatin {

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter any word to start play language game.");
        String word = input.trim();
        //String inputIndex = input.charAt(0);
        //String lowercase = inputIndex.toLowerCase();
        String now = word.substring(1);
        String lowercase = word.substring(0,1).toLowerCase();
        String newWord = now + lowercase + "ay";
        JOptionPane.showMessageDialog(null, newWord);
        System.exit(0);
    }
}
