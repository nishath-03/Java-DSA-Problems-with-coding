import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int arr[][]= new int[n][3];
            for(int i = 0; i < n; i++){
                for(int j = 0; j < 3; j++){
                    arr[i][j] = in.nextInt();
                }
            }
            int org=0;
            for(int i = 0; i < n; i++){
                int cnt=0;
                for(int j = 0; j < 3; j++){
                    if(arr[i][j]==1){cnt++;}
                }
                if(cnt>=2){
                    org++;
                }
            }
        System.out.println(org);
    }
}
