/*
 * This application does the following operations: 
 * Takes in a message string of one or more space-separated substrings 
 * Creates a LinkedList data structure with each word as a Node
 * Recreates a sentence string with each word separated by a single space character
 * Capitalises the first letter of each word.
 * 
 */
package demo1.app;

import static demo1.app.MessageUtils.getMessage;
import static demo1.utilities.StringUtils.join;
import static demo1.utilities.StringUtils.split;

import org.apache.commons.text.WordUtils;

import demo1.list.LinkedList;

public class App {
    public static void main(String[] args) {
        LinkedList tokens;
        tokens = split(getMessage());
        String result = join(tokens);
        System.out.println(WordUtils.capitalize(result));
    }
}
