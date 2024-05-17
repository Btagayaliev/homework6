package org.example;


import java.util.ArrayList;
import java.util.List;

public class Homework6_1 {
    public static class Node {
        public int val;
        public List<Node> children = new ArrayList<>();

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    public int maxDepth(Node root) {
        if(root == null)
            return 0;
        List<Node> list = root.children;
        int maxHeight = 0;
        for(int i=0; i<list.size(); i++)
        {
            maxHeight= Math.max(maxHeight,maxDepth(list.get(i)));
        }
        return maxHeight+1;
    }
}