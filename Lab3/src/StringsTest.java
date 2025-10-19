import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringsTest {

    @Test
    void getLength() {
        Strings s = new Strings("JavaOOP");
        assertEquals(7, s.getLength(), "Довжина рядка повинна бути 7");
    }

    @Test
    void getText() {
        Strings s = new Strings("Hello");
        assertEquals("Hello", s.getText());
    }

    @Test
    void setText() {
        Strings s = new Strings("Test");
        s.setText("Changed");
        assertEquals("Changed", s.getText());
    }

    @Test
    void sort() {
        Strings s = new Strings("cba");
        assertEquals("abc", s.sort());
    }

    @Test
    void testSetTextWithNullShouldThrowException() {
        Strings s = new Strings("abc");
        Exception e = assertThrows(IllegalArgumentException.class, () -> s.setText(null));
        assertEquals("The command can`t be Null", e.getMessage());
    }
}
