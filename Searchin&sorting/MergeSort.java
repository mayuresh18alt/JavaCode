import java.util.ArrayList;

public class MergeSort
{
    public static void mergeSortt(int arr1[],int arr2[])
    {   
        int mA[]=new int[arr1.length+arr2.length];
        int i=0;int j=0;int k=0;

        while (i<arr1.length && j<arr2.length) {

                if (arr1[i]<arr2[j]) {
                    mA[k++]=arr1[i++];
                }
                else{
                    mA[k++]=arr2[j++];
                }
        }

        while (j<arr2.length) {
            mA[k++]=arr2[j++];
        }

        while (i<arr1.length) {
            mA[k++]=arr1[i++];
        }

        System.out.println("after sorting array");
        for (int l=0;i<mA.length;l++)
        {
            System.out.print(mA[l]+"  ");
        }
    }
    public static void main(String[] args)
    {
        int arr1[]={10,20};
        int arr2[]={15,25,30,40};

        System.out.println("befor sorting array");
        for (int i=0;i<arr1.length;i++)
        {
            System.out.print(arr1[i]+"  ");
        }
        for (int j=0;j<arr2.length;j++)
            {
                ;
                System.out.print(arr2[j]+"  ");
            }
        System.out.println();

        mergeSortt(arr1, arr2);

    }
    
        
}
