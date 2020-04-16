import java.util.ArrayList;

public class Bag {
    static int size=5;

    static Item[] arr= new Item[size];

    public static void packBag (int newSize ){
        if ( newSize == 1)
            return;
        for ( int i = 0 ; i < newSize ; i ++){
            packBag( newSize - 1 );

            display (newSize);
            rotate ( newSize );
        }
    }
    public static void rotate ( int newSize ){
        int i;
        int pos = size - newSize;
        Item temp = arr [ pos ];
        for ( i = pos + 1 ; i < size ; i ++){
            arr [ i - 1 ] = arr [ i ];
        }
        arr [ i - 1 ] = temp;
    }
    public static void display (int s){
        int sum=0;
        for ( int i = 0 ; i < s ; i ++){
            sum+=arr[i].getWeight();
            }
          if (sum==12){
            System.out.println("Большая сумка на: "+ sum + " килограмм:");;
            for ( int i = 0 ; i < s ; i ++){
                      arr[i].print();
               }
            }
        }
    public static void main ( String [] args )  {

        arr [0]=new Item("Молоток",4);
        arr [1]=new Item("Гиря",10);
        arr [2]=new Item("Пулемет",6);
        arr [3]=new Item("Компьютер",2);
        arr [4]=new Item("Ковер",8);

        System.out.println("Список всех вещей:");
        for ( int i = 0 ; i < size ; i ++){
            arr [ i ].print();
        }
        packBag(size);
    }


    }
