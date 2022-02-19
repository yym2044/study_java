package codingTest;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;
        int[] array = new int[100];
        int i = 0;
        int count = 0;            //변수들을 몇 번 넣었나

        do{

            num1 = input.nextInt();
            num2 = input.nextInt();

            if((num1 < 10 && num2 < 10) && (num1 > 0 && num2 > 0)){
                array[i++] = (num1 + num2);
                count++;        //변수를 몇 번 넣었나
            }
        }while(num1 != 0 && num2 != 0);

        for(int j = 0; j < count; j++){
            System.out.println(array[j]);
        }
    }
}