import java.util.ArrayList;
import java.util.List;

public class FindWordsContaining {

    public static void main(String[] args) {

    }

    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> l = new ArrayList<Integer>();
        for (int i = 0; i < words.length; i++) {
            if (words[i].indexOf(x) > 0) {
                l.add(i);
            }
        }
        return l;
    }
}
