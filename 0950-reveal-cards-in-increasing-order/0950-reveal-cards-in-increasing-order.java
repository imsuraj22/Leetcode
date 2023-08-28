class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        int n=deck.length;
     Queue<Integer> q=new LinkedList<>();
        Arrays.sort(deck);

        for(int i=deck.length-1;i>=0;i--){
            if(q.size()>0) q.add(q.poll());
            q.add(deck[i]);
        }
        //int[] res = new int[n];
        for (int i = n - 1; i >= 0; --i) {
            deck[i] = q.poll();
        }
        return deck; 
    }
}