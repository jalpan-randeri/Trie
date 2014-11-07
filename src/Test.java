/**
 * Created by jalpanranderi on 11/7/14.
 */
public class Test {
    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("jalpan");
        trie.insert("japan");
        trie.insert("jal");

        System.out.println(trie.isPresent("jalpan"));
        System.out.println(trie.isPresent("j"));
        System.out.println(trie.isPresent("jal"));
        System.out.println(trie.isPresent("jalpanaa"));
        System.out.println(trie.isPresent("japan"));

        System.out.println(trie.getRoot().children);

    }


}
