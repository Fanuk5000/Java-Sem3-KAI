public class Strings {
    private String text;

    public Strings(String text) {
        this.text = text;
    }

    public int getLength() {
        return text.length();
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        if (text == null) {
            throw new IllegalArgumentException("The command can`t be Null");
        }
        this.text = text;
    }


    public String sort() {
        char[] chars = text.toCharArray();
        java.util.Arrays.sort(chars);
        return new String(chars);
    }
}