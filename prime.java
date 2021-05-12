//Prime numbers from 1 to 20

import java.util.Scanner;
public class Main {
    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i = 2; i < n; i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int start = 1;
        int destination = 20;
        for(int i = start; i < destination; i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }
}
