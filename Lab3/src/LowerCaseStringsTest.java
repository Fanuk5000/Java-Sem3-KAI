import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LowerCaseStringsTest {

    @Test
    void sort() {
        LowerCaseStrings lower = new LowerCaseStrings("abcXYZ");
        String result = lower.sort();
        // перетворюється в "abcxyz" → сортування за спаданням → zyxcba
        assertEquals("zyxcba", result);
    }

    @Test
    void sortMixedCase() {
        LowerCaseStrings lower = new LowerCaseStrings("ZzAa");
        // "ZzAa" -> "zzaa" -> сортування за спаданням → zzaa
        assertEquals("zzaa", lower.sort());
    }

    @Test
    void sortEmptyString() {
        LowerCaseStrings lower = new LowerCaseStrings("");
        assertEquals("", lower.sort());
    }
}
