import java.util.ArrayList;
class MyClass{
    public static void main(String[] args) {
        int N=25143;
        int key=3;
        String res="";
        ArrayList array1=new ArrayList();

        while(N!=0) {
            array1.add(N%10);
            N=N/10;
        }

        int[] array2=new int[array1.size()];
        int k=0;
        for(int i=array1.size()-1;i>=0;i--) {
            array2[k]=(int) array1.get(i);
            k=k+1;
        }

        for(int j=0;j<key-1;j++) {
            int temp=array2[array2.length-1];
            for(int i=array2.length-1;i>=1;i--)
                array2[i]=array2[i-1];
            array2[0]=temp;
        }

        for(int i:array2)
            System.out.print(i+res);
    }
}