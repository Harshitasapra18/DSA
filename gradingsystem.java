import java.util.*;
public class gradingsystem {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter marks of student");
        int marks=sc.nextInt();
        marks=marks/10;
        switch(marks){
            case 10,9:

            System.out.println("grade A");
            break;
            case  8,7:
            System.out.println("grade B");
            break;
            case  6,5:
            System.out.println("grade c");
            break;
            case 4,3,2,1:
            System.out.println("fail");
            break;
            default:
            System.out.println("invaiid marks");


        }

        
    }
}
