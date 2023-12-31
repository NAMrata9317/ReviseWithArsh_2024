//2513. Minimize the Maximum of Two Arrays

//Solution1 -> but it'll not give correct answer for test cases like ->
//divisor1 = 9, divisor2 = 4, uniqueCnt1 = 8, uniqueCnt2 = 3
//Output 12, expected 11
class Solution {
    public int minimizeSet(int divisor1, int divisor2, int uniqueCnt1, int uniqueCnt2) {
        if(divisor1>divisor2){
            int temp = divisor1;
            divisor1 = divisor2;
            divisor2 = temp;
            
            temp = uniqueCnt1;
            uniqueCnt1 = uniqueCnt2;
            uniqueCnt2 = temp;
        }
        int maxn = 0;
        int[] arr1 = new int[uniqueCnt1];
        int a1=0;
        int[] arr2 = new int[uniqueCnt2];
        int a2=0;
        int n=1;
        while(uniqueCnt1 != 0 || uniqueCnt2 !=0){
            if(n%divisor1!=0 && a1<arr1.length){
                arr1[a1] = n;
                maxn = maxn > n? maxn : n;
                a1++;
                n++;
                uniqueCnt1--;
            }
            else if(n%divisor2!=0 && a2<arr2.length){
                arr2[a2] = n;
                maxn = maxn > n? maxn : n;
                a2++;
                n++;
                uniqueCnt2--;
            }
            else{
                n++;
            }
        }
        return maxn;
    }
}
