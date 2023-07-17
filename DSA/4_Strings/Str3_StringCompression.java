public class Str3_StringCompression {

    public static String compress(String str){
        StringBuilder compStr = new StringBuilder("");
        for(int i=0; i<str.length(); i++){
            Integer count = 1;
            compStr.append(str.charAt(i));
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            
            if(count > 1){
                compStr.append(count);
            }
        }
        return compStr.toString();
    }
    public static void main(String[] args) {
        String str = "aaadddkjjjjeef";
        System.out.println(compress(str));

    }
}
