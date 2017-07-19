/*
Please note that it's Function problem i.e.
you need to write your solution in the form Function(s) only.
Driver Code to call/invoke your function would be added by GfG's Online Judge.*/


/* A Binary Tree node
class Node
{
    int data;
    Node left, right;
    Node(int item)
    {
        data = item;
        left = right = null;
    }
}*/
class GfG
{
    void leftView(Node root)
    {
        if(root==null)
            return;
        ArrayList<Integer> res = new ArrayList();
        Queue<Node> q = new LinkedList();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0;i<size;i++){
                Node tmp = q.poll();
                if(i==0)
                    res.add(tmp.data);
                if(tmp.left!=null)
                    q.add(tmp.left);
                if(tmp.right!=null)
                    q.add(tmp.right);
            }
            
        }
        for(int i=0;i<res.size();i++){
            System.out.print(res.get(i)+" ");
        }
    }
}