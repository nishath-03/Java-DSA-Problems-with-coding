import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            String s[] = new String[n];
            for(int i = 0; i < n; i++){
                s[i] = in.next();
            }
            for(String c : s){
                if(c.length()<=10)System.out.println(c);
                else{
                    System.out.println(""+c.charAt(0)+(c.length()-2)+c.charAt(c.length()-1));
                }

            }
    }
}
