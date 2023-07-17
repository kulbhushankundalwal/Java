// Asked in Google & Microsoft

public class Rec12_RemoveDupChar {

    public static void removeDup(String str, int idx, StringBuilder newStr, boolean map[]){
        if(idx==str.length()){
            System.out.println(newStr);
            return;
        }

        char curChar = str.charAt(idx);
        if(map[curChar-'a']){
            removeDup(str, idx+1, newStr, map);
        }
        else{
            map[curChar-'a']=true;
            removeDup(str, idx+1, newStr.append(curChar), map);
        }
    }
    public static void main(String[] args) {
        String str = "wwaaakkkkaaaabbbbccckadl";
        removeDup(str, 0, new StringBuilder(""), new boolean [26]);
    }
}
