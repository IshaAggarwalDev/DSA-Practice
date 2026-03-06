public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        
        int left = 1;
        int right = n;
        
        while (left < right) {
            int mid = left + (right - left) / 2;  // prevent overflow
            
            if (isBadVersion(mid)) {
                right = mid;   // first bad is at mid or before
            } else {
                left = mid + 1;  // first bad is after mid
            }
        }
        
        return right;  // left == right (first bad version)
    }
}
