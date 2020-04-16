

    class BinaryFind {
        private int[] arr;
        private int size;

        public BinaryFind(int size) {
            this.size = 0;
            this.arr = new int[size];
        }
//        public int binaryFind ( int search ) {
//
//        return recBinaryFind ( search , 0 , size - 1 );
//
//        }
        public boolean binaryFind(int search) {
              int mark=0;
              mark =recBinaryFind(search, 0, size - 1);
            if( mark!=0 )
                return true;
            else
                return false;
        }



        private int recBinaryFind (int searchKey, int low, int high) {
            int curIn;
            curIn = (low + high) / 2;
            if (arr[curIn] == searchKey){
                System.out.println("Найден элемент:"+searchKey+" в ячейке: " +curIn);
                return curIn;}
            else if (low > high)
                throw new RuntimeException( );

            else {
                if (arr[curIn] < searchKey)
                    return recBinaryFind(searchKey, curIn + 1, high);
                else
                    return recBinaryFind(searchKey, low, curIn - 1);
            }
        }

        public void insert(int value) {
            int i;
            for (i = 0; i < this.size; i++) {
                if (this.arr[i] > value)
                    break;
            }
            for (int j = this.size; j > i; j--) {
                this.arr[j] = this.arr[j - 1];
            }
            this.arr[i] = value;
            this.size++;
        }


        public static void main(String[] args) {
            BinaryFind arr = new BinaryFind(10);
            arr.insert(1);
            arr.insert(3);
            arr.insert(6);
            arr.insert(8);
            arr.insert(25);
            arr.insert(40);
            arr.insert(75);
            arr.insert(100);

            int search = 25;

            try {
               //  arr.binaryFind(search);

                System.out.println(arr.binaryFind(search));

            }
            catch (RuntimeException e){ 
               System.out.println("Элемент "+ search + " не найден!");
            }
            System.out.println("End ");
        }
    }
