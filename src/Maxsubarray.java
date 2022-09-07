public class Maxsubarray {
    public static int max(int [] arr){
        int maxsum=0;
        int currsum=0;
        for(int i=0;i<arr.length;i++){
            currsum += arr[i];
            if(currsum>maxsum){
                maxsum=currsum;
            }
            if(currsum<0){
                currsum=0;
            }

        }
        return maxsum;
    }

    public static void main(String[] args) {
        int [] arr={1,2,-3,-5,1,9};
         int res=max(arr);
        System.out.println(res);
    }
}
