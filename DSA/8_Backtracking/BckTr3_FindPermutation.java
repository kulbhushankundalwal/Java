//Time Complexity is O(n*n!)

public class BckTr3_FindPermutation {

    public static void findPerm(String str, String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }

        for(int i=0; i<str.length(); i++){
            char curChar = str.charAt(i);
            String Newstr = str.substring(0, i) + str.substring(i+1);
            findPerm(Newstr, ans+curChar);
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        findPerm(str, "");
    }
}
