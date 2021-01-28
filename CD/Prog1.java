import java.util.*;
public class Prog1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            //
            String st1 = sc.next();
            String st2 = sc.next();
            String st3 = sc.next();
            boolean valid = true;
            for(int j=0;j<st1.length();j++){
                if(st1.charAt(j)!='a'){
                    System.out.println("Invalid");
                    valid=false;
                    break;
                }
            }
            if(valid){
                System.out.println("Valid");
            }
            valid = true;
            int ia = st2.lastIndexOf('a');
            for(int j=0;j<ia;j++){
                if(st2.charAt(j)=='b'){
                    System.out.println("Invalid");
                    valid = false;
                    break;
                }
            }
            if(valid){
                System.out.println("Valid");
            }
            valid = true;
            if(st3.equals("abb")){
                System.out.println("Valid");
            }
            else{
                System.out.println("Invalid");
            }
        }
    }
}