import java.util.Scanner;
public class lat3{

public static void gender(String gender,double berat , double tinggiCm){
double tinggi = tinggiCm /100;
double rumus = berat/(tinggi*tinggi);
String kategori = "";
switch(gender){
case "Pria" :
if(rumus < 20.50){
    kategori = "Kurus";
}
else if(rumus >= 20.50 && rumus <= 26.99){
    kategori = "Ideal";
}
else{
    kategori = "Gemuk"; 
}
 break;

case "Wanita" :

if(rumus < 18.50){
    kategori = "Kurus";
}
else if(rumus >= 18.50 && rumus <= 24.99){
    kategori = "Ideal";
}
else{
    kategori = "Gemuk";
}

}
System.out.printf("%.2f", rumus);
System.out.println(", "+ kategori);

}



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String gender = input.nextLine();
        double berat = input.nextDouble();
        double tinggi = input.nextDouble();
        
        gender(gender, berat, tinggi);
        
        
    }
}