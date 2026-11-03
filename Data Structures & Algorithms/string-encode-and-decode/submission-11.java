class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String str : strs) {
            sb.append(String.valueOf(str.length()));
            sb.append('#');
            sb.append(str);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        int ptr = 0;
        List<String> result = new ArrayList<>();
        while(ptr < str.length()) {
            int startStrPtr = ptr;
            while(ptr < str.length() && str.charAt(ptr) != '#') {
                ptr++;
            }
            int strLength = Integer.parseInt(str.substring(startStrPtr, ptr));
            result.add(str.substring(ptr+1, ptr+1+strLength));
            ptr += strLength + 1;
        }
        return result;
    }
}
