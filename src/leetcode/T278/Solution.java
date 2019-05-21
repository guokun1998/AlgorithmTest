package leetcode.T278;

/**
 * @author guokun
 * @create 2019-05-21-18:50
 * boolean isBadVersion(int version)
 */
public class Solution {
    public int firstBadVersion(int n) {
        int l = 1;
        int r = n;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (isBadVersion(mid) && !isBadVersion(mid - 1)) {
                return mid;
            } else if (!isBadVersion(mid)) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return r;
    }
    boolean isBadVersion(int version) {
        return true;
    }
}
