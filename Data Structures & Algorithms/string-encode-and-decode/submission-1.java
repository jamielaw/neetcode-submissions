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
        int i = 0; //currentStringIndex
        while(i < str.length()) {
            // get the prefix
            StringBuilder sb = new StringBuilder();
            while(str.charAt(i) != '#') {
                sb.append(str.charAt(i));
                i++;
            }
            i++; // move ptr past the #
            int length = Integer.parseInt(sb.toString());

            if(length == 0) {
                decodedStrs.add("");
            } else {
                decodedStrs.add(str.substring(i, i+length));
            }
            i += length; // needed to skip the strings actual value and prefix
        }
        return decodedStrs;
    }
}
