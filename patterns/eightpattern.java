package patterns;

public class eightpattern {
    public static void main(String[] args) {
        int n =5;
        int num = 1;
        for(int i=0;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(n);

                n=n+1;
            }
            System.out.println();
        }
    }
}