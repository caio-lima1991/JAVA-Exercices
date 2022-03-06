import java.util.Scanner;

public class SCConditions2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a Year number");
    
        int year = scan.nextInt();

        scan.close();
    
        if(year%100==4){
            if(year%100==0){
                if(year%400==0){
                    System.out.println("It's a Leap Year");
                }else{System.out.println("Not a Leap Year");}            
            }else{System.out.println("It's a Leap Year");}  
        }else{System.out.println("Not a Leap Year");}
    }
}
