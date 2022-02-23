/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package launchpad;


import java.util.Scanner;

public class factorial {
    static int factorial(int n)
    {
       if(n==0)
           return 1;
       else
           return (n*factorial(n-1));

    }
    public static void main(String[] args) {
        int n;
        System.out.print("Enter the positive number:");
        Scanner input=new Scanner(System.in);
        n= input.nextInt();
        int fact=factorial(n);
        System.out.print("factorial:"+fact);


    }
}





