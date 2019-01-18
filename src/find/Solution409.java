package find;

import org.junit.Test;

/**
 *
 给定一个包含大写字母和小写字母的字符串，找到通过这些字母构造成的最长的回文串。

 在构造过程中，请注意区分大小写。比如 "Aa" 不能当做一个回文字符串。

 注意:
 假设字符串的长度不会超过 1010。

 示例 1:

 输入:
 "abccccdd"

 输出:
 7

 解释:
 我们可以构造的最长的回文串是"dccaccd", 它的长度是 7。
 *
 */
public class Solution409 {
    public int longestPalindrome(String s) {
        int n = s.length();
        if (s==null||n==0){
            return 0;
        }
        int[] freq=new  int[128];
        char[] chars = s.toCharArray();
        for (char c:chars){
            freq[c]++;
        }
        int odd=0;
        int even=0;
        for (int i = 0; i < 128; i++) {
            if (freq[i]%2==1){
                odd+=freq[i]-1;
            }else {
                even+=freq[i];
            }
        }
        return Math.min(even+odd+1,n);
    }
    @Test
    public void test(){
        String s="civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth";
        String s1="abccccdd";
        int i = longestPalindrome(s1);
        System.out.println(i);

    }
}
