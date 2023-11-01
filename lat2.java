import java.util.Scanner;
public class lat2{

public static int jumlahh(int input1 , int input2){
    int jumlah = input1 + input2;
    return jumlah;
    }


public static String huruf(int input1, int input2){
int jumlah = (jumlahh(input1,input2));
int angka1 = (jumlah /100);
int angka2 = (jumlah %100)/10;
int angka3 = (jumlah %10);
switch(angka1){
    case 2 :
   System.out.print("Dua ratus ");
   break;
    case 3 :
    System.out.print("Tiga ratus ");
    break;
    case 4 :
    System.out.print("Empat ratus ");
    break;
    
    case 5 :
    System.out.print("Lima ratus ");
    break;
    
    case 6 :
    System.out.print("Enam ratus ");
    break;
    
    case 7 :
    System.out.print("Tujuh ratus ");
    break;
    
    case 8 :
   System.out.print("Delapan ratus ");
   break;
    
    case 9 :
    System.out.print("Sembilan ratus ");
    break;

}
switch(angka2){
    case 2 :
   System.out.print("Dua puluh ");
   break;
    case 3 :
    System.out.print("Tiga puluh ");
    break;

    case 4 :
    System.out.print("Empat puluh ");
    break;
    
    case 5 :
   System.out.print("Lima puluh ");
   break;
    
    case 6 :
    System.out.print("Enam puluh ");
    break;
    
    case 7 :
    System.out.print("Tujuh puluh ");
    break;
    
    case 8 :
    System.out.print("Delapan puluh ");
    break;
    
    case 9 :
    System.out.print("Sembilan puluh ");
    break;
}
 
switch(angka3){
    case 2 :
    System.out.print("Dua");
    break;
    case 3 :
    System.out.print("Tiga");
    break;
    case 4 :
    System.out.print("Empat");
    break;
    
    case 5 :
    System.out.print("Lima");
    break;
    
    case 6 :
    System.out.print("Enam");
    break;
    
    case 7 :
    System.out.print("Tujuh");
    break;
    
    case 8 :
    System.out.print("Delapan");
    break;
    
    case 9 :
    System.out.print("Sembilan");
    break;
}
return angka1 + "" + angka2 + "" + angka3; 
}


public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int angka1 = input.nextInt();
    int angka2 = input.nextInt();

    huruf(angka1, angka2);
    
}
}