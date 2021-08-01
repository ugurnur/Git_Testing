package com.mod;

import java.util.*;

public class Main {
    /*
    Write a function to check whether a string is panagram or
    not assuming that the string passed in does not have any punctuation.
    Pangrams are words or sentences containing every letter of the alphabet at least once.
    */

    private static boolean panagram(String str) {
        str = str.replace(" ",  "").toLowerCase();
        for (char i='a'; i<= 'z'; i++){
            if ( !str.contains( (i+""))) {
                return false;
            }
        }
        return true;
    }

    static boolean isPangram(String str){
        str = str.replace(" ", "").toUpperCase();
        ArrayList<Character> al = new ArrayList<>();
        for(int i = 0; i < str.length(); i++){
            char each = str.charAt(i);
            //if(!al.contains(each) && each >= 65 && each <= 90){
            //if(!al.contains(each) && each >= 'A' && each <= 'Z'){
            if(!al.contains(each) && Character.isLetter(each)){
                al.add(each);
            }
        }
        return al.size() == 26;
    }

    // hashset solution does not filter numbers and special characters
    static boolean isPangram2(String str){
        str = str.replace(" ", "").toUpperCase();
        String[] arr = str.split("");
        List<String> list = Arrays.asList(arr);
        HashSet<String> set = new HashSet<>(list);
        return set.size() == 26;
    }

    //2.Write a method where u ask a user to enter a number until the total is 100 or number of trials is equal to 3.

    private static void is100() {
        int win = 100;
        int comp=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your numbers");
        for (int i=0; i< 3; i++){
            int num = scan.nextInt();
            comp+=num;
            if (comp == 100){
                System.out.println("you win");
                break;
            }
        }
        if (comp != win)
            System.out.println("sorry you lost!");
    }

    static void sumGame(){
        Scanner scan = new Scanner(System.in);
        int sum, trials;
        sum = trials = 0;
        while(sum < 100 && trials < 3){
            System.out.println("Enter a number!");
            sum += scan.nextInt();
            trials++;
            if(trials == 3)
                break;
        }
        if(sum >= 100)
            System.out.println("You made it! Your sum is " + sum);
        else if(trials == 3)
            System.out.println("You ran out of trials!!");
    }


    //Write a method that reverses a number. Method accepts an integer and returns an int. EX: 123 --> 321

    public static int reverseInt(int n) {

        int r =0;

        for (int i=n; i>0; i=i/10 ) {
            r = r * 10 + (i%10) ;
        }
        return r;
    }

    static int reverseNumber(int num){
        String result = "";
        String str = String.valueOf(num);
        if(num < 0){
            str = str.substring(1);
            result += "-";
            //
        }
        result += new StringBuilder(str).reverse().toString();
        return Integer.parseInt(result);

//        String reversed = "";
//        if(num == 0)
//            reversed = "0";
//        if(num < 0) {
//            num *= -1;
//            reversed += "-";
//        }
//        while(num > 0){
//            reversed += num % 10;
//            num /= 10;
//        }
//        return Integer.parseInt(reversed);
    }

    //7.Write a method that gets any number from a string it gets and returns the total of those number.
    // EX :extractNum(“aa2aa3”) ==> 2+3 ==> 5.

    public static int getDigitsSum(String str) {
        int sum=0;
        for (int i=0; i< str.length(); i++){
            if (Character.isDigit(str.charAt(i))){
                sum +=Integer.parseInt(str.charAt(i)+"");
            }
        }
        return sum;
    }


    public static void main(String[] args) {
        //System.out.println(panagram("The quick brown fox jumps over the lazy dog"));
        //System.out.println(isPangram("The quick brown fox jumps over the lazy dog"));
        //System.out.println(isPangram2("The quick brown fox jumps over the lazy dog"));
        //is100();
        //sumGame();
        //System.out.println(reverseInt(321));
        System.out.println(getDigitsSum("aa2aa3rrr5"));

    }




}
