class GfG
{
    
      public static int maxDiff(Node root, int k)
       {
           int min = Integer.MAX_VALUE;
           int val = 0;
           if(root == null)
            return 0;
            while(root!=null){
                if(root.data>k){
                    if(root.data-k<min){
                        min = root.data-k;
                        val = root.data;
                    }
                    root = root.left;
                }
                else if(root.data<k){
                    if(k-root.data<min){
                        min = k-root.data;
                        val = root.data;
                    }
                    root = root.right;
                }
                else
                    return k;
            }
            
            return val;
       }
}
