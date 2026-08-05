package oop_test7;

public class ArrayUitl {
    private ArrayUitl(){}
    public static String printArray(int arr []){
        String res = "[";
        for(int i=0;i<arr.length;i++){
            if(i==arr.length-1){
                res = res+arr[i]+"]";
            }else{
                res =res+arr[i]+", ";
            }
        }
        return res;
    }
    public static double gerAverage(int arr []){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        return sum*1.0/arr.length;
    }
}
