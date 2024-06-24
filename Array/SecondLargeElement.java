public class SecondLargeElement {

    public static void Printsecondlarge(int[] a,int n){ 

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]>a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }

        System.out.println("after sorting array");

        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }

        System.out.println();

        int large=a[0];
        int secondlarge=a[0];
        for(int i=0;i<n;i++){
            if(a[i]>large){
                secondlarge=large;
                large=a[i];
            }
            else if(a[i]>secondlarge && a[i]!=large){
                secondlarge=a[i];
            }
        }
        System.out.println("Second largest element is "+secondlarge);
        
    }
    public static void main(String[] args) {
        
        int a[]={2,3,1,5,4,6};
        int n=a.length;

        System.out.println("before sorting array");

        for(int i=0;i<n;i++){   
            System.out.print(a[i]+" ");
        }
        System.out.println();

        Printsecondlarge(a, n);
    }
}
