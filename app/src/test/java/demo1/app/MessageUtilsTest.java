/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package demo1.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MessageUtilsTest {
    @Test void testGetMessage() {
        assertEquals("hello      world!  goodbye    cruel world! hello         again!", MessageUtils.getMessage());
    }
}
