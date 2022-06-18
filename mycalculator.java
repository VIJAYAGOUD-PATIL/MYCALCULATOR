import java.util.*;
class mycalculator{
    public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("welcome");


System.out.println("PRESS NO:\n1.ADDITION\n2.SUBTRACTION\n3.MULTIPLICATION\n4.DIVISION\n");
System.out.println("ENTER THE CHOICE: ");
int a = sc.nextInt(); 
System.out.println("ENTER THE FIRST NUMBER :");
int b = sc.nextInt();
System.out.println("ENTER THE SECOND NUMBER :");
int c = sc.nextInt();


if(a==1){
    
    
    System.out.println("YOUR OPTION IS ADDITION");
    int sum;
    
    sum=b+c;
    System.out.println("ADDITION IS: "+sum); 
    }else if(a==2){
        System.out.println("YOUR OPTION IS SUBTRACTION");
        int sub;
        sub=b-c;
        System.out.println("SUBTRACTION IS: "+sub); }
        else if(a==3){
            System.out.println("YOUR OPTION IS MULTIPLICATION");
            int mul;
            mul=b*c;
            System.out.println("MULTIPLICATION IS: "+mul); }
            else if(a==4){
                System.out.println("YOUR OPTION IS DIVISION");
                int div;
                div=b%c;
                System.out.println("DIVISION IS: "+div); }
                else{
                    System.out.println("INVALIDE CHOICE");
                }
     
}

}

