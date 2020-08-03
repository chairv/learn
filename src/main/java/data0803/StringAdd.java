package data0803;

/**
 * American
 * @author tancw
 * @date 2020-08-03
 * 给定两个字符串形式的非负整数 num1和num2
 * 计算它们的和
 * 注意
 * 1. num1和num2的长度都小于5100
 * 2. num1和num2都只包含数据0-9
 * 3. num1和num2都不包含任何前导零
 * 4. 你不用使用任何内建BigInteger库,
 * 也不能直接将输入的字符串转换为整数形式
 *
 *
 * 总结:
 *  1. char转数据 - '0' , 数字转char + '0'
 *  2. 进位用模判断是否除尽
 */
public class StringAdd {
    public static void main(String[] args) {
        String num1 = "5698";
        String num2 = "2366";
        String result = addString(num1, num2);
        System.out.println(result);
    }

    private static String addString(String num1, String num2) {
        int i = num1.length() - 1, j = num2.length() - 1, add = 0;
        StringBuilder ans = new StringBuilder();
        while (i >= 0 || j >= 0 || add != 0) {
            int x = i >= 0 ? num1.charAt(i) - '0' : 0;
            int y = j >= 0 ? num2.charAt(j) - '0' : 0;
            int result = x + y + add;
            ans.append(result % 10);
            add = result / 10;
            i--;
            j--;
        }
        ans.reverse();
        return ans.toString();
    }

}
