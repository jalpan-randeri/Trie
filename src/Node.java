import java.util.HashMap;

/**
 * Node is internal node inside the trie data structure
 *
 * Node
 *  - char c
 *  - boolean isTerminal
 *  - HashMap<Character, Node> children
 *
 *
 * Created by jalpan randeri on 11/7/14.
 */
public class Node {
    private char c;
    boolean isWord = false;
    HashMap<Character, Node> children = new HashMap<Character, Node>();

    public Node(){

    }

    public Node(char c) {
        this.c = c;
    }


}