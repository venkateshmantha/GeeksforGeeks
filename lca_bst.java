class GfG
{   
    Node lca(Node node, int n1, int n2) 
    {
        if(node==null)
            return null;
        if(node.data<Math.min(n1,n2))
            return lca(node.right,n1,n2);
        if(node.data>Math.max(n1,n2))
            return lca(node.left,n1,n2);
        return node;
    }
    
}