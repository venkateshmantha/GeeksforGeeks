class GfG
{
    void connect(Node root)
    {
        if(root==null)
            return;
        Queue<Node> q = new LinkedList();
        root.nextRight=null;
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            Node prev = null;
            for(int i=1;i<=size;i++){
                Node curr = q.poll();
                if(curr.left!=null)
                    q.add(curr.left);
                if(curr.right!=null)
                    q.add(curr.right);
                if(prev!=null){
                    prev.nextRight = curr;
                    prev = curr;
                }
                else
                    prev = curr;
                if(i==size)
                    curr.nextRight = null;
            }
        }
    }
}