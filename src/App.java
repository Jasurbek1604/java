import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        // double x = 1.426;
        // double y = -1.22;
        // double z = 3.5;
        // y = Math.abs(Math.pow(x, y/x) - Math.pow(y/x, 1/3));
        // double f = ((y-x)*(y-(z/(y-x))))/(1+Math.pow(y-x, 2));
        // System.out.println("Javob = " + f);

        // Scanner userName = new Scanner(System.in);
        // System.out.println("Enter username:");

        // String name = userName.nextLine(); 
        // System.out.println("Username is: " + name); 

        //!day

        Scanner userInfo = new Scanner(System.in);
        System.out.println("Enter time: ");
        String t = userInfo.nextLine();
        if(Integer.parseInt(t) < 10){
            System.out.println("Xayrli tong!\n");
        } else if(Integer.parseInt(t) < 18){
            System.out.println("Xayrli kun!\n");
        } else {    
             System.out.println("Xayrli kech!\n");
        }

        //!check age

        Scanner age = new Scanner(System.in);
        System.out.println("Enter age: ");
        String a = age.nextLine();
        if(Integer.parseInt(a) >= 18){
            System.out.println("Sotsa bo'ladi!\n");
        } else {    
             System.out.println("Tamaki mahsulotlarini sotilmasin!\n");
        }

        //!cheking number

        Scanner b = new Scanner(System.in);
        System.out.println("Enter number:");
        String num = b.nextLine();
        if(Integer.parseInt(num) % 2 == 0){
            System.out.println(num + " juft son\n");
        }
        else if (Integer.parseInt(num) < 0) {
            System.out.println(num + " juft ham toq ham emas\n");
        }
        else {
            System.out.println(num + " toq son\n");
        }


        //!check ball

        String sum = "";

        for(int i = 1; i <= 5; i++){
            Scanner s = new Scanner(System.in);
            System.out.println("fan" + i + ": ");
            String ball = s.nextLine();    
            sum += ball;
        }

        char targetChar = '2';
        int count = 0;
        
        for (int i = 0; i < sum.length(); i++) {
            if (sum.charAt(i) == targetChar) {
                count++;
            }
        }

        if(count > 2) {
            System.out.println("Siz kursdan qoldirildingiz!");
        } else if (count == 0){
            System.out.println("Siz keyingi kursga o'ttingiz!");
        } else {
            System.out.println("Yozgi maktabda " + count + " ta fanni yopishingiz kerak!");
        }


    }
}
