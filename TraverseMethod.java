//import java.util.Scanner;

class L_Array{
/*public static void traverse_print(int la[],int size){
    System.out.println("Traversing array to show its values");
        for (int i=0;i<=size;i++)
        System.out.println(la[i]);
}
}*/

public static int insert (int la[], int n, int k, int value){
    System.out.println("inserting new value at index "+k+"\n");
    for (int i=n; i>=k; i--)
        la[i+1]=la[i];

        la[k]=value;
        n=n+1;
        return n;
}
}


/*public static void main (String[] args){
    Scanner scn= new Scanner (System.in);
    int[] la = new int[10];
    la[0]=7;
    la[1]=15;
    la[2]=3;

    int n=2;


    traverse print(la,n);


    System.out.print("what value do you want to insert:");
    int value = scn.nextInt();
    System.out.print("at which position do you want to insert new value (0 to"+n+"):");
    int K = scn.nextInt();

    n=insert(la,n,K,value);

    traverse_print(la,n);
}
}*/
