package patterns;

public class sevenpattern {
    public static void main(String[] args) {
        int n=4;
        for(int i=0;i<n;i++){
            for(int j=1;i<=1;j++){
                System.out.print(j);
            }
            for(int j=1;i<=2*n-1;j++){
                System.out.print(" ");
            } 
            for(int j=1;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
            
        }
    }
}
