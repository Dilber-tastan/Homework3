import com.sun.source.tree.BreakTree;

import javax.swing.plaf.IconUIResource;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class homewoek3 {
    public static void main(String[] args) {
//Main method icerisinde herhangi bir degisiklik yapilmayacaktir.
// Aksi halde odev puani 0' dir.
        double grade = 0;
        int[] array1 = {3, 11, 15, 13, 4, 5, 7, 8, 4, 5, 7, 8, 2, 3, 2, 3, 4, 5, 7, 8, 9, 11, 15, 13, 4, 5, 7, 8, 9, 11, 15, 13, 9, 11, 15, 13};
        int[] array2 = {6, 2, 3, 4, 5, 1};
        int[] array3 = {5, 7, 4, 1, 5, 7, 8};
        int[] array4 = {4, 5, 1, 8, 7};
        int[] array5 = {4, 5, 1, 8, 7};
        int[] array6 = {4, 5, 4, 8, 7, 4, 4, 1, 8, 7, 4, 4, 1, 8, 4};
        int[] array7 = {4, 9, 15, 12, 6, 8, 25};
        int[] array8 = {9, 11, 15, 13, 4, 5, 7, 8, 3, 6};
        int[] array9 = {1, 3, 2, 5};
        int[] array10 = {4, 5, 1, 3, 2};
        int[][] array11 = {{4, 1, 0, 5}, {5, 5, 1, 3}, {7, 5, 1, 0}, {1, 0, 9, 4}};
        double[][] array12 = {{1, 2, 2}, {5, -1, 1,}, {0, 1, 0}};
        double[][] array13 = {{6, 5, -6}, {7, 1, 6}, {0, 0, -1}, {1, 0, -3}};
        double[][] array14 = {{4, 1.5, 0}, {5, -6.5, 1}, {-7, 8.5, 1}, {1, 0, 9.5}};
        double[][] array15 = {{6, 2.5, -6}, {7, 1, 9}, {0, 0, -1}, {1, 0.5, -3}};
        double[][] array16 = {{4, 1.5, 0, -5}, {5, -6.5, 1, -3}, {-7, 8.5, 1, 0}, {1, 0, 9.5, 4}};
        double[][] array17 = {{6, 2.5, -6, 7.5}, {7, 1, 6, 9}, {0, 0, -1, 0.5}, {1, 0.5, -3, 1}};
        int[][] array18 = {{4, 1, 0}, {5, 5, 1}, {-7, 8, 1}, {1, 0, 9}};


        if (summationOfMaximumAndMinimumOfanArray(array1) == 17)
            grade += 5;
        if (numberOfDifferentElement(array1) == 10)
            grade += 5;
        int[] rewarr = reverseOfAnArray(array2);
        if (rewarr[0] == 1 && rewarr[1] == 5 && rewarr[2] == 4 && rewarr[3] == 3 && rewarr[4] == 2 && rewarr[5] == 6)
            grade += 5;
        if (indexOfTheSmallestElement(array3) == 3)
            grade += 5;
        if (isequal(array4, array5))
            grade += 5;
        if (theMostRepeatedElement(array6) == 4)
            grade += 5;
        int[] retinsert = insertAnElementIntoAnIndex(array7, 3, 5);
        if (retinsert[3] == 5 && retinsert.length == array7.length + 1)
            grade += 5;
        int[] retremove = removeAnElementFromAnIndex(array8, 2);
        if (retremove[2] == 13 && retremove.length == array8.length - 1)
            grade += 5;
        if (numberOfElementsInIntersectionOfTwoArray(array9, array10) == 4)
            grade += 10;
        if (numberOfElementsInUnionOfTwoArray(array9, array10) == 5)
            grade += 10;
        int[][] fmbi = multiplyAMatrixByAnInteger(array18, 5);
        if (fmbi[0][0] == 20 && fmbi[1][1] == 25 && fmbi[1][2] == 5 && fmbi[2][0] == -35 && fmbi[3][1] == 0 && fmbi[3][2] == 45)
            grade += 5;
        if (determinatOfaMatrix(array12) == 9.0)
            grade += 7.5;
        double[][] ftrans = transposeOfaMatrix(array13);
        if (ftrans[0][0] == 6 && ftrans[0][1] == 7 && ftrans[1][1] == 1 && ftrans[2][2] == -1 && ftrans[2][3] == -3)
            grade += 7.5;
        double[][] fsum = summationOfTwoMatrix(array14, array15);
        if (fsum[0][0] == 10 && fsum[0][2] == -6 && fsum[1][1] == -5.5 && fsum[1][2] == 10 && fsum[3][1] == 0.5 && fsum[3][2] == 6.5)
            grade += 10;
        double[][] fmult = multiplicationOfTwoMatrix(array16, array17);
        if (fmult[0][0] == 29.5 && fmult[0][3] == 38.5 && fmult[1][2] == -61 && fmult[1][3] == -23.50 && fmult[2][2] == 92 && fmult[3][0] == 10)
            grade += 10;
        System.out.print("Your grade is-> " + grade);

    }

    //SADECE METOTLARIN ICERISINI DOLDURUNUZ.

    public static int summationOfMaximumAndMinimumOfanArray(int[] myarray) {
        //myarray yontem parametresinin minimum ve maksimum öğelerinin toplamını döndürür.

       int min =myarray[0];
       int max=myarray[0];
       for (int i=1;i<myarray.length;i++){
           if (myarray[i]<min) {
               min=myarray[i];
           }
           if (myarray[i]>max){
               max=myarray[i];
           }
       }
       return max+min;
    }

    int benzersizeleman;
    public static int numberOfDifferentElement(int[] myarray) {
        //myarray yöntem parametresindeki farklı öğelerin sayısını döndür
        // if  myarray={2,3,2,4,2,3,2} then farklı element sayısı  3

        HashSet<Integer>benzersizeleman=new HashSet<>();
        for (int eleman:myarray) {
            benzersizeleman.add(eleman);
        }
        return benzersizeleman.size();

    }

    public static int[] reverseOfAnArray(int[] myarray) {

        //myarray yöntem parametresinin tersini bulun ve elde edilen diziyi döndürün
        // if  myarray={2,3,5,4} then {4,5,3,2} şeklinde diziyi döndürür.
        int[] terseleman = new int[myarray.length];
        for (int i = 0; i < myarray.length; i++) {
            terseleman[i] = myarray[myarray.length - 1 - i];
        }
        return terseleman;
    }

    public static int indexOfTheSmallestElement(int[] myarray) {
        //myarray yöntem parametresindeki en küçük öğenin indisini döndürür.
        // Let  myarray {3,5,7,2,4} olsun. En küçük element 2' dir ve bu 2 sayısının indisi 3' tür.
        int minlnd = 0;
        for (int i=1;i< myarray.length;i++){
            if (myarray[i]<myarray[minlnd]){
                minlnd=i;
            }
        }
        return minlnd;
    }




    public static boolean isequal(int[] array1, int[] array2) {
        //dizi1 ve dizi2 yöntem parametreleri kesinlikle eşitse true değerini döndürür, aksi takdirde false değerini döndürür
        // if array1={1,2,3,4} ve array2={1,2,3,4] then array1 ve array2 EŞİTTİR.
        // if array1={1,2,3,4} ve array2={1,2,4,3] then array1 ve array2 EŞİT DEĞİLDİR.
        if (Arrays.equals(array1, array2)) {
            return true;
        } else {
            return false;
        }
    }


    public static int theMostRepeatedElement(int[] myarray) {
        //myarray yöntem parametresinde en çok tekrarlanan öğeyi döndür
        // if myarray={1,2,2,3,2,4} then en çok tekrar eden öge: 2
        HashMap<Integer, Integer> elemansayısı = new HashMap<Integer, Integer>();
        int tekrarlananeleman = 0;
        int maxsayı = 0;
        for (int eleman : myarray) {
            int sayı = elemansayısı.getOrDefault(eleman, 0) + 1;
            elemansayısı.put(eleman, sayı);
            if (sayı > maxsayı) {
                maxsayı = sayı;
                tekrarlananeleman = eleman;
            }
        }
        return tekrarlananeleman;
        }



        public static int[] insertAnElementIntoAnIndex ( int[] myarray, int i, int k) {
            //k'yi myarray yöntem parametresinin i dizinine ekleyin ve elde edilen diziyi döndürün
            // if  myarray={2,3,5,1,4}, i=2 ve k=10 then dizinin son hali {2,3,10,5,1,4} olacaktır.
            int [] array=new int[myarray.length+1];
            for (int j=0;j<i;j++){
                array[j]=myarray[j];
            }
            array[i]=k;
            for (int j=i+1;j<array.length;j++){
                array[j]=myarray[j-1];
            }
            return array;
        }

        public static int[] removeAnElementFromAnIndex ( int[] myarray, int i){
            //myarray yöntem parametresinin i indisinteki bir öğeyi kaldırın
            // if  myarray={2,3,5,1,4} ve i=2 then dizinin son hali {2,3,1,4} olacaktır.
            if(i<0||i>= myarray.length){
                return myarray;
            }
           int [] array=new int[myarray.length-1];
            int arrayind=0;
            for (int a=0;a< myarray.length;a++){
                if (a!=i){
                    array[arrayind]=myarray[a];
                    arrayind++;
                }
            }

           return array;


        }

        public static int[][] multiplyAMatrixByAnInteger ( int[][] myarray, int i){
            //yöntem parametresi myarray'in 2 Boyutlu bir MxN matrisi olduğunu varsayalım
            //Myarray'in tüm öğelerini i tamsayısı ile çarpın ve elde edilen MxN dizisini döndürün
            // bir matrisin bir tamsayı ile çarpımı hakkında daha fazla bilgi için http://www.purplemath.com/modules/mtrxmult.htm
           int satır= myarray.length;
           int sütun= myarray[0].length;
           int [][]çarpım=new int[satır][sütun];
           for (int a=0; a<satır;a++){
               for (int j=0;j<sütun;j++ ){
                   çarpım[a][j]=myarray[a][j]*i;
               }
           }


            return  çarpım;
        }

        public static double determinatOfaMatrix ( double[][] myarray){
           // myarray yöntem parametresinin 2 Boyutlu 3x3'lük bir matris olduğunu varsayalım
            // myarray'in determinantını hesaplayın ve sonuç değerini döndürün
            int det=0;
            det+=myarray [0][0]*(myarray[1][1]*myarray[2][2]-myarray[1][2]*myarray[2][1]);

            det-=myarray[0][1]*(myarray[1][0]*myarray[2][2]-myarray[1][2]*myarray[2][0]);

            det += myarray[0][2] * (myarray[1][0] * myarray[2][1] - myarray[1][1] * myarray[2][0]);

            return det;
        }

        public static double[][] transposeOfaMatrix ( double[][] myarray) {
            // myarray yöntem parametresinin 2 Boyutlu bir MxN matrisi olduğunu varsayalım
            // myarray'in transpozunu bulun ve elde edilen 2 Boyutlu NxM dizisini döndürün
            // Transpose hesaplaması ile ilgili olarak adresi ziyaret edebilirsiniz: http://www.mathwords.com/t/transpose_of_a_matrix.htm
           int satır = myarray.length;
           int sütun = myarray[0].length;
           double[][] transpos = new double [sütun][satır];
            for (int i = 0; i < satır; i++) {
                for (int j = 0; j < sütun; j++) {
                    transpos[j][i] =   myarray[i][j];
                }
            }

            return transpos;
        }


        public static double[][] summationOfTwoMatrix ( double[][] myarray1, double[][] myarray2) {
            // myarray1 ve myarray2'nin 2 Boyutlu bir MxN matrisi olduğunu varsayalım
            // myarray1 ve myarray2'nin toplamını bulun ve elde edilen 2 Boyutlu MXN dizisini döndürün
            // matris toplamı ile ilgili olarak adresi ziyaret edebilirsiniz: http://www.mathportal.org/linear-algebra/matrices/matrix-operations.php
            int M=myarray1.length;
            int N=myarray1[0].length;
            double[][]sonuc=new double[M][N];
            for (int i=0;i<M;i++){
                for (int j=0;j<N;j++){
                    sonuc[i][j]=myarray1[i][j]+myarray2[i][j];
                }
            }
            return sonuc;

        }



        public static double[][] multiplicationOfTwoMatrix ( double[][] myarray1, double[][] myarray2){
            // myarray1 ve myarray2'nin 2 Boyutlu NxN matrisi olduğunu varsayalım
            // myarray1 ve myarray2 matrislerinin çarpımını bulun ve elde edilen NXN dizisini döndürün
            // matris çarpımı ile ilgili olarak adresi ziyaret edebilirsiniz:  http://www.mathportal.org/linear-algebra/matrices/matrix-operations.php
            double n=myarray1.length;
            double[][] sonuç=new double[(int) n][(int)n];
            for (int i=0;i<n;i++){
                for (int j=0;j<n;j++){
                    for (int a=0;a<n;a++){
                        sonuç[i][j]+=myarray1[i][a]*myarray2[a][j];
                    }
                }
            }
            return sonuç;

        }


        public static int numberOfElementsInIntersectionOfTwoArray ( int[] array1, int[] array2){
            // dizi1 ve dizi2 yöntem parametrelerinin kesişimindeki öğelerin sayısını bulun
            //if array1={1,3,2,5,9,6} ve array2={4,6,8,1,3,2} then kesişim {1,3,2,6}
            //dolayısıyla kesişimlerdeki eleman sayısı 4 adet olduğu için, return 4.
            //kesişimde hiçbir öğe yoksa 0 değerini döndürür, return 0.
            HashSet<Integer>kesişimset=new HashSet<>();
            for (int eleman:array1){
                kesişimset.add(eleman);
            }
            int kesişimsayısı=0;
            for (int eleman:array2){
                if (kesişimset.contains(eleman)){
                    kesişimsayısı++;

                }
            }

            return kesişimsayısı;
        }




        public static int numberOfElementsInUnionOfTwoArray ( int[] array1, int[] array2) {
            // yöntem parametresi dizi1 ve dizi2'nin birleşimindeki öğelerin sayısını bulun
            //if array1={1,3,2,5,9,6} ve array2={4,6,8,1,3,2} then birleşim {1,2,3,4,5,6,8,9}
            //olayısıyla birleşimlerindeki eleman sayısı 8 adet olduğu için, return 8.
            //birleşimde hiçbir öğe yoksa 0 değerini döndürür, return 0.
            Set<Integer>birleşim=new HashSet<>();
            for (int eleman:array1){
                birleşim.add(eleman);
            }
            for (int eleman:array2){
                birleşim.add(eleman);
            }
            return birleşim.size();

        }
    }

