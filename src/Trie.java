/**
 *
 * Trie
 *   - root
 *
 * Created by jalpanranderi on 11/7/14.
 */
public class Trie {
    private static Node root = new Node();

    public void insert(String word){
        Node next = root;
        for(int i = 0; i < word.length(); i++){
            char c = word.charAt(i);
            // check if character is present inside the children
            //  false than add it inside the list
            if(!root.children.containsKey(c)){
                root.children.put(c, new Node(c));
            }
            next = root.children.get(c);
        }
    }
}
