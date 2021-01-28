import java.io.*;
import java.util.*;
public class validTokens{
    public static void main(String args[])throws IOException{
        Scanner file1_key = new Scanner(new FileInputStream("keywords"));
        Scanner sc = new Scanner(System.in);
        Scanner file = new Scanner(new FileInputStream("prog.c"));
        HashSet<String> dataType = new HashSet<>();
        dataType.add("int");
        dataType.add("float");
        dataType.add("long");
        dataType.add("double");

        HashSet<String> keywords = new HashSet<>();
        while(file1_key.hasNext()){
            keywords.add(file1_key.next());
        }
        String special = "!@#$%^&*()+{}:<>?/[];',.'1234567890";
        String permissible = "1234567890_qwertyuiopasdfghjklzxcvbnm";
        HashSet<Character> perset = new HashSet<>();
        
        HashSet<Character> set = new HashSet<>();
        for(int i=0;i<special.length();i++){
            set.add(special.charAt(i));
        }
        for(int i=0;i<permissible.length();i++){
            perset.add(permissible.charAt(i));
        }
        while(file.hasNext()){
            String var1 = file.next();
            if(dataType.contains(var1)){
                String varName = file.next();
                boolean isValid=true;
                if(keywords.contains(varName)){
                    System.out.println("Identifier Invalid "+varName+" Of Type "+var1);
                    continue;
                }
                char[] var2 = varName.toCharArray();
                if(!set.contains(var2[0])){
                    for(int j=1;j<var2.length;j++){
                        if(!perset.contains(var2[j])){
                            isValid = false;
                            System.out.println("Identifier Invalid "+varName+" Of Type "+var1);
                            break;
                        }
                    }
                }
                else{
                    isValid = false;
                    System.out.println("Identifier Invalid "+varName+" Of Type "+var1);
                }
                if(isValid){
                    System.out.println("Identifier VALID "+varName+" Of Type "+var1);
                }
    
            }
        }
    }
}