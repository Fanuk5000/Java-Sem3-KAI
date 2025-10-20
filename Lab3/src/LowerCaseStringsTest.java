import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LowerCaseStringsTest {

    @Test
    void sort() {
        LowerCaseStrings lower = new LowerCaseStrings("abcXYZ");
        String result = lower.sort();
        assertEquals("zyxcba", result);
    }

    @Test
    void sortMixedCase() {
        LowerCaseStrings lower = new LowerCaseStrings("ZAza");
        assertEquals("zzaa", lower.sort());
    }

    @Test
    void sortEmptyString() {
        LowerCaseStrings lower = new LowerCaseStrings("");
        assertEquals("", lower.sort());
    }
}
