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
public class TrieNode {
    TrieNode[] arr;
    boolean isRoot, isEnd;
    
    public TrieNode()
    {
        this.arr = new TrieNode[26];
    }
    
    public boolean isRoot()
    {
        return isRoot;
    }
    public boolean isWordEnd()
    {
        return isEnd;
    }
    public int count()
    {
        return 0;
    }
    public void next()
    {
        
    }
}
