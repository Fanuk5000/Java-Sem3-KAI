import java.util.Arrays;
import java.util.Collections;

public class LowerCaseStrings extends Strings {

    public LowerCaseStrings(String text) {
        super(text);
    }

    @Override
    public String sort() {
        String lower = getText().toLowerCase();
        Character[] chars = new Character[lower.length()];

        for (int i = 0; i < lower.length(); i++) {
            chars[i] = lower.charAt(i);
        }

        Arrays.sort(chars, Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();
        for (Character c : chars) {
            sb.append(c);
        }

        return sb.toString();
    }
}
