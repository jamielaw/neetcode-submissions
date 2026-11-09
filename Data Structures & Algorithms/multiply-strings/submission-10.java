class Solution {
    public String multiply(String num1, String num2) {
        if(num1.equals("0")|| num2.equals("0")) return "0";
        int[] result = new int[num1.length() + num2.length()];

        num1 = new StringBuilder(num1).reverse().toString();
        num2 = new StringBuilder(num2).reverse().toString();
        for(int i = 0; i < num1.length(); i++) {
            for(int j = 0; j < num2.length(); j++) {
                int digit = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                result[i + j] += digit;
                result[i + j + 1] += result[i + j] / 10;
                result[i + j] %= 10;
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int x = result.length-1; x >= 0; x--) {
            sb.append(result[x]);
        }

        return sb.toString().replaceFirst("^0+", "");
    }
}
