class Solution {
     public int minTime(int n, int[][] edges, List<Boolean> hasApple) {
        
        HashMap<Integer,List<Integer>> map = new HashMap<>() ; 
        


        for ( int i = 0 ; i < edges.length ; i++)
        {
            int temp[] = edges[i] ; 

            if( map.containsKey(temp[0]))
            {
                List<Integer> list = map.get(temp[0]); 
                list.add(temp[1]) ; 
            }
            else
            {
                List<Integer> list = new ArrayList<>() ;  
                list.add(temp[1]) ; 
                map.put(temp[0] , list ) ; 

            }

            if( map.containsKey(temp[1]))
            {
                List<Integer> list = map.get(temp[1]); 
                list.add(temp[0]) ; 
            }
            else
            {
                List<Integer> list = new ArrayList<>() ;  
                list.add(temp[0]) ; 
                map.put(temp[1] , list ) ; 

            }

            
        }

        boolean visited[] = new boolean[n] ; 

        return (min(0 , map , visited , hasApple)) ; 
    }

    public int min(int vertex, HashMap<Integer,List<Integer>> map , boolean visited[] ,  List<Boolean> hasApple) {
         
         if( visited[vertex] == true || map.size() == 0  ) 
         return 0 ; 

         visited[vertex] = true ; 
       
         List<Integer> connect = map.get(vertex) ; 

         int answer = 0 ; 

         

         for ( int i = 0 ; i < connect.size() ; i++)
         {
             if( visited[connect.get(i)] == true )
             continue ; 

             answer += min( connect.get(i) , map , visited , hasApple) ;
         }

         if( answer == 0 )
         {
             if( vertex == 0 )
             return 0 ; 
             if( hasApple.get(vertex) == true )
             return 1 ; 
             else
             return 0 ; 
         }
         else
         {
             if( vertex == 0 )
             return answer*2 ; 
             else
             return answer+1 ; 
         }
    }
}