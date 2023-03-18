//Time Complexity is O(n*2^n)
//Space Complexity is O(n)

public class BckTr2_FindSubsets {

    public static void subst(String str, String ans, int i) {
        if (i == str.length()) {
            if (ans == "") {
                System.out.println("null");
            } else {
                System.out.println(ans);
            }
            return;
        }

        subst(str, ans + str.charAt(i), i + 1); // yes
        subst(str, ans, i + 1); // no
    }

    public static void main(String[] args) {
        String str = "abc";
        subst(str, "", 0);
    }
}
