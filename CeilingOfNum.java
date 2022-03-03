public class CeilingOfNum{
   public static void main(String args[]){
       int[] arr={-18,-12,-4,0,2,3,4,15,16,18,22,45,89};
       int target=23;
       int ans=ceiling(arr,target);
       System.out.println(ans);
   }
//ceiling of a num is smallest num greater than or equal to target
   static int ceiling(int[] arr,int target){
       int start=0;
       int end=arr.length-1;

       while(start<=end){
          int mid=start+(end-start)/2;
          if(arr[mid]<target){
             start=mid+1;
          }
          else if(arr[mid]>target){
             end=mid-1;
          }
          else{
             return mid;
           }
       }
       return start;
   }
}