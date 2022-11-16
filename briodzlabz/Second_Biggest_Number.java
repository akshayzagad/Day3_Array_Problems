package com.briodzlabz;

public class Second_Biggest_Number {
        public static void main(String[] args) {
            int[] mylist = {10, 12, 58, 45, 32};
            int Second_Big_NUmber=secondBiggestNumber(mylist);
            if ( Second_Big_NUmber==0){
                System.out.println("NO second largest Number");
            }
            else {
                System.out.println("Number = "+ Second_Big_NUmber);
            }
        }

        static int secondBiggestNumber(int[] mylist) {
            int First_Number = 0;
            int Second_Number = 0;
            for (int i = 0; i < mylist.length; i++)//0,1,2,3,4,
            {
                if (mylist[i] > First_Number) {
                    Second_Number =First_Number;//0,10,12
                    First_Number = mylist[i];//10,12,58,
                }
                else if (mylist[i]>Second_Number & mylist[i]!=First_Number){
                    Second_Number=mylist[i];//45
                }
            }  return Second_Number;
        }
}
