

class Sol
{
    int isPossible (String S)
    {
        HashMap<Character, Integer>  map = new HashMap<>();
        for (int i = 0; i<S.length(); i++){
            char ch = S.charAt(i);
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        int odd_count = 0;
        for (int i : map.values()){
            if (i%2 != 0){
                odd_count ++;
            }
        }
        
        if (odd_count <= 1){
            return 1;
        }
        return 0;
    }
}
