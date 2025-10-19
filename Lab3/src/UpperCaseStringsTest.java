import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UpperCaseStringsTest {

    @Test
    void sort() {
        UpperCaseStrings upper = new UpperCaseStrings("helloWorld");
        String result = upper.sort();
        assertEquals("DEHLLLOORW", result, "Сортування за зростанням у верхньому регістрі має бути правильним");
    }

    @Test
    void sortWithSymbols() {
        UpperCaseStrings upper = new UpperCaseStrings("A!Zb");
        assertEquals("!ABZ", upper.sort());
    }

    @Test
    void sortEmptyString() {
        UpperCaseStrings upper = new UpperCaseStrings("");
        assertEquals("", upper.sort());
    }
}
