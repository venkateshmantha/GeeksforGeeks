class GfG
{
   /* Complete the function to get diameter of a binary tree */
    int diameter(Node node)
    {
        if(node==null)
            return 0;
        int dia_root = 1+height(node.left)+height(node.right);
        int dia_left = diameter(node.left);
        int dia_right = diameter(node.right);
        return Math.max(dia_root,Math.max(dia_left,dia_right));
    }
    
    int height(Node node){
        if(node==null)
            return 0;
        return 1+Math.max(height(node.left),height(node.right));
    }
}