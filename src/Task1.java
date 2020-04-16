public class Task1 {


    public static int multy( int n,int m){
        if(m==1)
            return n ;
        else
            return n+ multy(n,m-1);
    }

    public static int power( int n,int pow){
        if(pow==1)
            return n ;
        else
            return n* power(n,pow-1);
    }
    public static void main(String[] args) {

        System.out.println(multy(2,5));
        System.out.println(power(2,6));

    }
}
