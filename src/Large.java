public class Large {
    public static int large(int[] arr){
       int l; int[] ar={11,2,3,4,5};
       for(int i=0;i<arr.length;i++){
           for(int j=i+1;j<arr.length;j++){
               if(arr[i]>arr[j]){
                   l=arr[i];
                   arr[i]=arr[j];
                   arr[j]=l;
               }
           }
       }
        return arr[arr.length-1];

    }

    public static void main(String[] args) {
        int[] al={34,1,15,88,2,0};
        //System.out.println(large(al));
        int largest=al[0];
        for(int i=1;i<al.length;i++){
            if(largest>al[i]){
                largest=al[i];
            }
        } System.out.println(largest);

    }
}
