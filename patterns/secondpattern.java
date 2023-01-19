package patterns;

public class secondpattern {
    public static void main(String[] args) {
        for(int i =1 ;i<=8;i++){
            for(int j =0 ;j<8-i+1;j++){
             System.out.print("* ");
            }
            System.out.println();
        }
    }
}

// * * * * * * * * 
// * * * * * * *
// * * * * * *
// * * * * *
// * * * *
// * * *
// * *
// *