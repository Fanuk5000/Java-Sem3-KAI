public class UpperCaseStrings extends Strings {

    // Конструктор з параметром
    public UpperCaseStrings(String text) {
        super(text);
    }

    // Перевизначення методу сортування (за зростанням)
    @Override
    public String sort() {
        String upper = getText().toUpperCase();
        char[] chars = upper.toCharArray();
        java.util.Arrays.sort(chars);
        return new String(chars);
    }
}