import java.util.Arrays;

public class Lab7 {
    public static void main(String[] args){

        //test arrays
        double [] someArr = {2.5,6.4,3.5,7.6,3.8,6.7};
        double [] sortedArrTest = {2.5,3.7,5.7,6.8,6.9,7.4};
        int [] testArr1 = {3,8,5,6,5,8,9,2};
        int [] testArr2 = {5,15,4,6,7,3,9,11,9,3,12,13,14,9,5,3,13};
        int [] testArr3 = new int[testArr1.length];
        //Part A

        //1
        
        System.out.println(median(someArr));

        //2
        System.out.println(isSorted(sortedArrTest));

        //3
        findCommon(testArr1, testArr2, testArr3);
        //end of main
    }


    //PART A
    //1
    public static double median(double [] array){
        double medianNum =0;
        //determine length
        if(array.length%2==0){
            medianNum = (array[array.length/2]+array[(array.length/2)-1])/2;
        }
        else{
            medianNum=array[(array.length-1)/2];

        }
        return medianNum;
        //enf of median
    }


    //2

    public static boolean isSorted(double [] array){
        int counter=0;
        boolean sorted = false;
        for(int i=0;i<array.length-1;i++){
            if(array[i]<array[i+1]){
                counter++;
            }
        }

        if(counter==array.length-1){
            sorted=true;
        }
        else{
            sorted=false;
        }
        return sorted;
        //end of isSorted
    }

    //3
    // int [] testArr1 = {3,8,5,6,5,8,9,2};
    // int [] testArr2 = {5,15,4,6,7,3,9,11,9,3,12,13,14,9,5,3,13};
    //3 5 6 9 0 0 0 0
    // [3, 0, 5, 6, 5, 0, 9, 0]
    public static void findCommon(int[] arr1, int[] arr2,int[] arr3){
        String temp="";
        if(arr1.length<arr2.length){
            for(int i=0;i<arr1.length;i++){
                for(int j=0;j<arr2.length;j++){
                    if(arr1[i]==arr2[j]){
                       arr3[i]=arr1[i];
                       temp+=arr1[i];
                        
                    }
               
                   
                }
                
            }
        }
        else{
            System.out.println("I was lazy to mirror the method so please enter first array shorter than second :) ");
        }
        System.out.println(Arrays.toString(arr3));
        System.out.println(temp + " TEMP");

//remove duplicates from array
        for(int i=arr3.length-1;i>=0;i--){
           for(int j=i-1;j>0;j--){
               if(arr3[i]==arr3[j]){
                   arr3[i]=0;
               }
               System.out.println("here is i "+ arr3[i]);
               System.out.println("here is j "+ arr3[j]);
               }
               System.out.println("===============");
           }

           for(int k=1;k<arr3.length;k++){

           }
        
        
        System.out.println(Arrays.toString(arr3));
        //end of findCommon
    }

    //end of class
}
// for(int i=0;i<arr1.length-1;i++){
//     if(arr1[i]==arr2[i]){
//         arr3[i]=arr1[i];
//         testingArr3+=arr3[i];
//     }
//     else{
//         arr3[i]=0;
//     }
// }