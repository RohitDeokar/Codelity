****Linked list array solution ********
public class MyClass {
    int len=0,i=0;
    public int list(int A[])
    {
        while(A[i]!=-1)
        {
            len++;
         
            System.out.println("A[i]="+A[i]);
               i=A[i];
        }
        return (len+1);
    }
    public static void main(String args[]) {
        int A[]={1,-1,2,3,4};
        MyClass m=new MyClass();
        System.out.println(m.list(A));
    }
}
