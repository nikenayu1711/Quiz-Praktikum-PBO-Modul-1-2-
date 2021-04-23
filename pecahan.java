package quiz.no03;


import java.util.*;

class Pecahan {
    int pembilang, penyebut;
     
}

class Main {

    public static void main(String[] args) {
        int x = 0,y=0;
        
        Pecahan pecahan = new Pecahan();
        pecahan.pembilang=x;
        pecahan.penyebut=y;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan Angka");
        System.out.println("---------------------");
        System.out.print("pembilang : ");
        x=input.nextInt();
        System.out.print("penyebut  : ");
        y=input.nextInt();
        System.out.println("---------------------");
        if (x==1){
            System.out.println("Hasil ");
            System.out.println("---------------------");
            System.out.println("Pecahan awal                    : "+x +"/"+y);
            System.out.println("Pecahan paling sederhana        : "+x +"/"+y);
        }
        else if (x%2==0 && y%2!=0){
            System.out.println("Hasil ");
            System.out.println("---------------------");
            System.out.println("Pecahan awal                    : "+x +"/"+y);
            System.out.println("Pecahan paling sederhana        : "+x +"/"+y);
        }
        else if(y%x==0){
            System.out.println("Hasil ");
            System.out.println("---------------------");
            System.out.println("Pecahan awal                    : "+x +"/"+y);
            System.out.println("Pecahan paling sederhana        : "+x/x +"/"+y/y);
        }
        else if (x%2!=0){
            if(y%2!=0){
                System.out.println("Hasil ");
                System.out.println("---------------------");
                System.out.println("Pecahan awal                    : "+x +"/"+y);
                System.out.println("Pecahan paling sederhana        : "+x +"/"+y);
            }
            else{
                System.out.println("Hasil ");
                System.out.println("---------------------");
                System.out.println("Pecahan awal                    : "+x +"/"+y);
                System.out.println("Pecahan paling sederhana        : "+x +"/"+y);
            }
        }
        else if (x>y){
            System.out.println("Hasil ");
            System.out.println("---------------------");
            System.out.println("Pecahan awal                    : "+x +"/"+y);
            System.out.println("Pecahan paling sederhana        : "+x/y);
        }
        
    }
    
}  

