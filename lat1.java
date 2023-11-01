import java.util.Scanner;

public class lat1{

    private static String kalimat(int angka1){
        int ribuan = ((angka1 / 1000)+5 )%10 ;
        int ratusan = (((angka1 % 1000)/100 )+5) % 10;
        int puluhan = ((((angka1%1000)%100) /10) +5) %10;
        int satuan = ((angka1 % 10)+5)%10;

        return ribuan + "" + satuan + "" + puluhan + "" + ratusan;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int input1 = input.nextInt();
        int input2 = input.nextInt();
        int input3 = input.nextInt();

        System.out.println(kalimat(input1));
           System.out.println(kalimat(input2));
              System.out.println(kalimat(input3));
        
    }
}