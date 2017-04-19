/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package termproject;
/**
 *
 * @author Jacob Liou
 */
public class Trie {
    private TrieNode root;
    
    public Trie() {
        root = new TrieNode();
    }
    public void addWord(String word)
    {
        TrieNode p = root;
        p.isRoot = true;
        for(int i=0; i<word.length(); i++){
            char c = word.charAt(i);
            int index = c-'a';
            if(p.arr[index]==null){
                TrieNode temp = new TrieNode();
                p.arr[index]=temp;
                System.out.print(word.charAt(i));
                p.freq++;
                p.children[index]=word.charAt(i);
                p = temp;
            }else{
                p=p.arr[index];
                p.arr[index].freq++;
            }
        }
        p.isEnd=true;
    }
    public int lookupWord(String word)
    {
        TrieNode p = root;
        p.isRoot = true;
        for(int i=0; i<word.length(); i++){
            char c = word.charAt(i);
            int index = c-'a';
            if(p.arr[index]==null)
                return 0;
            else{
                p=p.arr[index];
            }
            if(i == word.length()-1)
                return p.freq;
            
        }
        return 0;
    }
    
}
