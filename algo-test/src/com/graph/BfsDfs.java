package com.graph;

import com.sun.tools.javac.util.GraphUtils;

import javax.xml.soap.Node;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by vojhapa on 8/2/15.
 */
public class BfsDfs {

   /* public void bfs()
    {
        // BFS uses Queue data structure
        Queue queue = new LinkedList();
        queue.add(this.rootNode);
        printNode(this.rootNode);
        rootNode.visited = true;
        while(!queue.isEmpty()) {
            GraphUtils.Node node = (Node)queue.remove();
            Node child=null;
            while((child=getUnvisitedChildNode(node))!=null) {
                child.visited=true;
                printNode(child);
                queue.add(child);
            }
        }
        // Clear visited property of nodes
        clearNodes();
    }

    public void dfs() {
        // DFS uses Stack data structure
        Stack stack = new Stack();
        stack.push(this.rootNode);
        rootNode.visited=true;
        printNode(rootNode);
        while(!stack.isEmpty()) {
            Node node = (Node)s.peek();
            Node child = getUnvisitedChildNode(n);
            if(child != null) {
                child.visited = true;
                printNode(child);
                s.push(child);
            }
            else {
                s.pop();
            }
        }
        // Clear visited property of nodes
        clearNodes();
    }*/
}
