class Solution {
    public boolean hasAlternatingBits(int n) {
        String s = Integer.toBinaryString(n);
        char[] arr = s.toCharArray();
        int count = 0;
        for(int i = 1;i<arr.length;i++){
            if(arr[i-1] != arr[i]){
                count ++;
            }
        }
        if(count == arr.length-1) return true;
        return false;
    }
}
