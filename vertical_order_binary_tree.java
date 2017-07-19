/*
Please note that it's Function problem i.e.
you need to write your solution in the form Function(s) only.
Driver Code to call/invoke your function would be added by GfG's Online Judge.*/


// FUNCTION CODE
/* A Binary Tree node
class Node
{
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
} */
/* Should print vertical order such that each vertical line
    is separated by $ */
class GfG
{
    void verticalOrder(Node node) 
    {
        if(node==null)
            return;
        Pair newPair = new Pair(0,node);
        Queue<Pair> q = new LinkedList();
        q.add(newPair);
        TreeMap<Integer,ArrayList<Integer>> map = new TreeMap();
        while(!q.isEmpty()){
            Pair pair = q.poll();
            Node tmp = pair.node;
            int val = tmp.data;
            int dist = pair.dist;
            if(map.get(dist)==null){
                ArrayList<Integer> list = new ArrayList();
                list.add(val);
                map.put(dist,list);
            }
            else{
                ArrayList list = map.get(dist);
                list.add(val);
                map.put(dist,list);
            }
            if(tmp.left!=null){
                q.add(new Pair(dist-1,tmp.left));
            }
            if(tmp.right!=null){
                q.add(new Pair(dist+1,tmp.right));
            }
        }
        
        for(int key: map.keySet()){
            ArrayList list = map.get(key);
            //Collections.sort(list);
            for(int i=0;i<list.size();i++)
                System.out.print(list.get(i) + " ");
            System.out.print("$");
        }
    }
}

class Pair{
    int dist;
    Node node;
    Pair(int dist,Node node){
        this.dist = dist;
        this.node = node;
    }
}