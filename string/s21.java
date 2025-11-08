package string;

import java.util.LinkedHashSet;

public class s21 {
    public void straas(String str) {
        int count[] = new int[52];
        char ch[] = str.toCharArray();
        LinkedHashSet<Character> set1 = new LinkedHashSet<>();

        for (char ch1 : ch) {
            if (ch1 >= 'a' && ch1 <= 'z') {
                set1.add(ch1);
                count[ch1 - 'a']++;
            } else if (ch1 >= 'A' && ch1 <= 'Z') {
                set1.add(ch1);
                count[ch1 - 'A' + 26]++;

            }
        }
        StringBuilder sb = new StringBuilder();
        for (Character ch1 : set1) {
            if (Character.isLowerCase(ch1)) {
                sb.append(ch1);
                sb.append(count[ch1 - 'a']);
            } else {
                sb.append(ch1);
                sb.append(count[ch1 - 'A' + 26]);

            }
        }

        System.out.println(sb);

    }

}

class mainsww {
    public static void main(String[] args) {
        s21 jde = new s21();
        String s = "AabcabcdddcAAABBBBTTTTALLSSc";
        jde.straas(s);
    }
}