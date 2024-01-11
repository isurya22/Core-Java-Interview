package InterviewAsked;

public class SortDscInteger {
    public static void main(String[] args) {
        int a[] = {12,5,56,32,2,78,26};
        int temp;
        for (int i = 0; i < a.length;i++){
            for (int j = i+1; j<a.length;j++){
                if(a[i]<a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for(int i = 0; i <= a.length-1;i++){
            System.out.println(a[i]);
        }
    }
}
