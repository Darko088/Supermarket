import java.util.Scanner;
public class supermarket
{
    public static void main(String[] args){
     int orangeP=15 , appleP=10 ,cto , cta;
    Scanner mark = new Scanner(System.in);
    System.out.println("how many oranges?");
    cto=mark.nextInt();
    System.out.println("How many apples?");
    cta=mark.nextInt();
     System.out.println("Total orange:"+orangeP*cto);
    System.out.println("Total apple:"+appleP*cta);    
    }
}
