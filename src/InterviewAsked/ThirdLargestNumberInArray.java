package InterviewAsked;

public class ThirdLargestNumberInArray
{
    public static void main(String[] args) {
        int[] value = {1,13,85,56,10,48,63};
        System.out.println("Third Largest: "+getThirdLargestNumber(value,7));
    }
    public static int getThirdLargestNumber(int[] a,int t){
        int temp;
        for(int i = 0; i < t; i++){
            for(int j = i+1; j<t; j++) {
                if(a[i] > a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a[t-3];
    }
}
