import java.util.Random;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
 
public class OwOfy {
    public static void main(String[] args) {
        String[] uwuFaces = { "(uwu)", ";;w;;", "owo", "UwU", ">w<", "^w^" };
        String input = "";
        for(String i : args) input += i+" ";
        input = input.replaceAll("\\s+$", "");
        input = input.replaceAll("[rl]", "w");
        input = input.replaceAll("[RL]", "W");
        input = input.replaceAll("n([aeiou])", "ny$1");
        input = input.replaceAll("N([aeiou])", "Ny$1");
        input = input.replaceAll("N([AEIOU])", "NY$1");
        input = input.replaceAll("ove", "uv");
        input += "! "+uwuFaces[new Random().nextInt(uwuFaces.length)];
        StringSelection selection = new StringSelection(input);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(selection, selection);
        System.out.println("copied to clipboard");
    }
}
