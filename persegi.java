package quiz.praktikum;

import java.util.*;

public class persegi extends bangundatar {
    int a,b;  
    
    Scanner input = new Scanner (System.in);
     void display(){
        System.out.println("Menghitung Keliling dan Luas Persegi");
        System.out.print("Sisi Pertama          : ");
        a=input.nextInt() ;
        System.out.print("Sisi Kedua            : ");
        b=input.nextInt() ;
        luas=(a*b);
        keliling= (4*a);
     }
     void persegi (){
        System.out.println("Hasil Keliiling dan Luas Persegi");
        System.out.println("");
        System.out.println("luas persegi       : "+this.luas);
        System.out.println("keliling persegi   : "+this.keliling);
    }
}
