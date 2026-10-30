class Solution {
    HashMap<Node, Node> map = new HashMap<>(); 
    
    public Node copyRandomList(Node head) {
        if (head == null) return null; 
        
        // If we already processed/copied this node, return its copy
        if (map.containsKey(head)) return map.get(head);
        
        // Create a new node with the value of the old node
        Node copy = new Node(head.val);
        
        // Save it in the map BEFORE making recursive calls to avoid infinite loops
        map.put(head, copy); 
        
        // Recursively clone the next and random pointers
        copy.next = copyRandomList(head.next); 
        copy.random = copyRandomList(head.random); // FIX: Recursively copy the random node
        
        return copy;
    }
}
