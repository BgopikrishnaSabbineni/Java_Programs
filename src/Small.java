public class Small {
    public static int small(int[] arr){
        int l;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if (arr[i] > arr[j]) {
                    l = arr[i];
                    arr[i] = arr[j];
                    arr[j] = l;
                }
            }
        }

        return arr[0];
    }


    public static void main(String[] args) {
        int[] a={34,15,88,2};
        System.out.println(small(a));
      /*  int l;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    l=a[i];
                    a[i]=a[j];
                    a[j]=l;

                }
            }
        }System.out.println(a[0]); */





    }
}
