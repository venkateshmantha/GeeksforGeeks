class GfG
{
    int countLeaves(Node node) 
    {
        if(node==null)
            return 0;
        Queue<Node> q = new LinkedList();
        q.add(node);
        int cnt=0;
        while(!q.isEmpty()){
            Node tmp = q.poll();
            if(tmp.left!=null)
                q.add(tmp.left);
            if(tmp.right!=null)
                q.add(tmp.right);
            else if(tmp.left ==null && tmp.right==null)
                cnt++;
        }
        return cnt;
    }
}
