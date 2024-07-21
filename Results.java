import java.util.Scanner;
public class Results{
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        
        System.out.println("Enter learners marks:");
        int marks=scanner.nextInt();
        
        if(marks>=80){
            System.out.println("Outstanding achivement");}
        else if(marks>=70){
           System.out.println("Meritorious achievement");}
        else if(marks>=60){
           System.out.println("Substantial achievement");}
        else if(marks>=50){
           System.out.println("Adequate achievement");}
        else if(marks>=40){
           System.out.println("Moderate achievement");}
        else if(marks>=30){
           System.out.println("Elementary achievement");}
        else{
            System.out.println("Not achieved");
        }
    }
}