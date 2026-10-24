class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String str: strs) {
            sb.append(str.length() + "#" + str);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> decodedStrs = new ArrayList<>();
        int i = 0; // currentStringIndex
        while(i < str.length()) {
            int j = i;
            // get the prefix
            StringBuilder sb = new StringBuilder();
            while(str.charAt(j) != '#') {
                j++;
            }
            int length = Integer.parseInt(str.substring(i, j)); 
            i = j + 1; // move our index to after the prefix + #
            decodedStrs.add(str.substring(i, i+length));
            i += length; // needed to skip the strings actual value and prefix
        }
        return decodedStrs;
    }
}
