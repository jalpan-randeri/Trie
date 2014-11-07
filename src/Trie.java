/**
 *
 * Trie
 *   - root
 *
 * Created by jalpanranderi on 11/7/14.
 */
public class Trie {
    private Node root = new Node();

    public void insert(String word){
        Node next = root;
        for(int i = 0; i < word.length(); i++){
            char c = word.charAt(i);
            // check if character is present inside the children
            //  false than add it inside the list
            if(!next.children.containsKey(c)){
                next.children.put(c, new Node(c));
            }
            next = next.children.get(c);
        }
        next.isWord = true;
    }


    public boolean isPresent(String word){
        Node next = root;
        for(int i = 0; i < word.length(); i++){
            char c = word.charAt(i);
            if(!next.children.containsKey(c)){
                return false;
            }
            next = next.children.get(c);
        }

        return next.isWord;
    }

    public Node getRoot(){
        return root;
    }
}