class MaxNum{
    public static void main(String[] args){
        int[] arr={12,2,3,22,445,2,44};
        int max=arr[0];
        for(int i=0; i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("The maximum element of array is : "+max);

    }

}