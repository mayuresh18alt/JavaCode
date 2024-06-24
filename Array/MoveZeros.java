public class MoveZeros {
        public static void Printmoveszero(int a[],int n)
        {

            for(int i=0;i<n;i++){   
                if(a[i]==0){
                    for(int j=i+1;j<n;j++){
                        if(a[j]!=0){
                            int temp=a[i];
                            a[i]=a[j];
                            a[j]=temp;
                            break;
                        }
                    }
                }
            }
            System.out.println("After moving zeros");   
            for(int i=0;i<n;i++){
                System.out.print(a[i]+" ");
            }
            System.out.println();
        }
    public static void main(String[] args) {
        
        int a[]={1 ,0 ,2 ,3 ,0 ,4 ,0 ,1};
        int n=a.length;

        System.out.println("Before moving zeros");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();

        Printmoveszero(a, n);
    }
}
