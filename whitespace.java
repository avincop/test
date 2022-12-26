import java.util.Scanner;
class White{
void whites(){
    System.out.println("enter a para:");
    Scanner sc= new Scanner(System.in);
    String str = sc.nextLine();  
    char[] strA = str.toCharArray();  
    StringBuffer stringBuffer = new StringBuffer();  
    for (int i = 0; i < strA.length; i++) {  
        if ((strA[i] != ' ') && (strA[i] != '\t')) {  
            stringBuffer.append(strA[i]);  
        }  
    }  
    String noSpaceStr2 = stringBuffer.toString();  
    System.out.println(noSpaceStr2);  
    sc.close();
}
}
public class whitespace {  
    public static void main(String[] args) {  
        White wh= new White();
        wh.whites();
    }  
}  