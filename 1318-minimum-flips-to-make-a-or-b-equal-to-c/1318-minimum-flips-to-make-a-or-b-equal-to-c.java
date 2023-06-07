class Solution {
    public int minFlips(int a, int b, int c) {
        int max=Math.max(a, Math.max(c, b));
         System.out.println(max);
        String maxi=Integer.toBinaryString(max);
        System.out.println(maxi);
        int len=maxi.length();
          System.out.println(len);
        String as = Integer.toBinaryString(a);
         as = String.format("%" + len + "s", as).replace(' ', '0');
        String bs=Integer.toBinaryString(b);
        bs = String.format("%" + len + "s", bs).replace(' ', '0');
        String cs=Integer.toBinaryString(c);
        cs = String.format("%" + len + "s", cs).replace(' ', '0');
        
        System.out.println(as);
        System.out.println(bs);
        System.out.println(cs);

        int count=0;
        int i=cs.length()-1;
        while(i>=0){
            if(cs.charAt(i)=='0'){
                if(as.charAt(i)=='1' && bs.charAt(i)=='1'){
                    count+=2;
                }else if(as.charAt(i)=='0' && bs.charAt(i)=='0'){
                    count+=0;
                }else{
                    count++;
                }

            }else if(cs.charAt(i)=='1'){

                if(as.charAt(i)=='0' && bs.charAt(i)=='0') count++;
            }

            i--;
        }

        return count;
    }
}