package leetcode.T136;

/**
 * 采用异或运算
 * 交换律：a ^ b ^ c <=> a ^ c ^ b
 *
 * 任何数于0异或为任何数 0 ^ n => n
 *
 * 相同的数异或为0: n ^ n => 0
 *
 * var a = [2,3,2,4,4]
 *
 * 2 ^ 3 ^ 2 ^ 4 ^ 4等价于 2 ^ 2 ^ 4 ^ 4 ^ 3 => 0 ^ 0 ^3 => 3
 */
public class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for(int i = 0 ; i < nums.length ; i++ ){
            result ^= nums[i];
        }
        return result;

    }
    public int singleNumber2(int[] nums) {



        int result = 0;
        for(int i = 0 ; i < nums.length ; i++ ){
            result ^= nums[i];
        }
        return result;

    }
}
