package sward2offer;

/**
 * Created by eccolala on 16-12-12.
 *
 *
 * 在一个二维数组中，每一行都按照从左到右递增
 * 的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组
 * 和一个整数，判断数组中是否函数该整数。
 *
 * 形如
 * 1，2，8，9
 * 2，4，9，12
 * 4，7，10，13
 * 6，8，11，15
 *
 * 可以从左下角开始，判断如果目标数小于当前数，向上查找，
 * 否则向右查找，数组边界即循环边界
 */

public class SearchInArray01 {
    public static void main(String args[]) {
        int[][] fields = { { 1, 2, 8, 9 },
            { 2, 4, 9, 12 }, { 4, 7, 10, 13 }, { 6, 8, 11, 15 } };
        int goal = 13;

        int border = fields.length;
        int i = border - 1, j = 0;

        while (i >= 0 && j <= border - 1) {
            if (fields[i][j] < goal) {
                j++;
            } else if (fields[i][j] > goal) {
                i--;
            } else {
                System.out.println("Got it ! " + fields[i][j]);
                break;
            }
        }
    }
}
