import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

//Q1--------------------------------------------------------------------
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(50);
        numbers.add(-20);
        numbers.add(0);
        numbers.add(30);
        numbers.add(40);
        numbers.add(60);
        numbers.add(10);

if (numbers.get(0)==numbers.get(numbers.size()-1)){
    System.out.println(numbers.get(0)+" equal "+numbers.get(numbers.size()-1));
} else {
    System.out.println(numbers.get(0) + " not equal " + numbers.get(numbers.size() - 1));
}

//Q2----------------------------------------------------------------------

        ArrayList<Integer> number = new ArrayList<Integer>();
        ArrayList<Integer> number1 = new ArrayList<Integer>();
        number.add(1);
        number.add(4);
        number.add(17);
        number.add(7);
        number.add(25);
        number.add(3);
        number.add(100);

        double sum=0;
        for ( int a : number){
            sum+=a;}
       double average= (int) (sum/number.size());
         for ( int a : number){
             if (a>average){
                 number1.add(a);
             }
         }

        System.out.println(" The average of the array is: "+average+" The numbers in the array that are greater than the average are : "+ number1);


//Q3-------------------------------------------------------------------------

        ArrayList<Integer> number2 = new ArrayList<Integer>();
        number2.add(20);
        number2.add(30);
        number2.add(40);

        if (number2.get(0) >= number2.get(number2.size()-1)){
            System.out.println(number2.get(0) + " equal " + number2.get(number2.size() - 1));}

       else if (number2.get(0)>number2.get(number2.size()-1)) {
            System.out.println("Larger value between first and last element: "+number2.get(0));

        }else { System.out.println(" Larger value between first and last element: "+number2.get(number2.size()-1));}

//Q4----------------------------------------------------------------------------

        ArrayList<Integer> number4 = new ArrayList<Integer>();
        ArrayList<Integer> number3 = new ArrayList<Integer>();
        number3.add(20);
        number3.add(30);
        number3.add(40);
        for (int i = 0; i < number3.size(); i++) {
            if (i == 0) {
                number4.add(number3.get(number3.size() - 1));
            } else if (i == number3.size() - 1) {
                number4.add(number3.get(0));
            } else {
                number4.add(number3.get(i));
            }
        }
        System.out.println("New array after swapping the first and last element: "+number4);

//Q5----------------------------------------------------------------------------
        ArrayList<Integer> number7 = new ArrayList<Integer>();
        ArrayList<Integer> number8 = new ArrayList<Integer>();
        number8.add(2);
        number8.add(3);
        number8.add(40);
        number8.add(1);
        number8.add(5);
        number8.add(9);
        number8.add(4);
        number8.add(10);
        number8.add(7);

        for (int i=0 ; i<number8.size();i++){
            if(number8.get(i)%2!=0){
                number7.add(number8.get(i));
            }}

        for (int j=0 ; j<number8.size();j++){
                if(number8.get(j)%2==0){
                    number7.add(number8.get(j));
                }}

        for (int a =0 ;a<number7.size();a++){
        number8.add(a,number7.get(a));}

        System.out.println(number7);

//Q6----------------------------------------------------------------------------
        ArrayList<Integer> number5 = new ArrayList<Integer>();
        ArrayList<Integer> number6 = new ArrayList<Integer>();
        number5.add(20);
        number5.add(30);
        number5.add(40);

        number6.add(20);
        number6.add(30);
        number6.add(40);

        int cont = 0;
        if (number5.size() == number6.size()) {
            for (int i = 0; i < number5.size(); i++) {
                if (number5.get(i) == number6.get(i)) {
                    cont++;}}
            } if (cont == number5.size()){
            System.out.println(" two array is equal");}
        else System.out.println(" two array is not equal");



        }
    }
