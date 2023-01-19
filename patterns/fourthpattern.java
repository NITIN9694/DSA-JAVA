package patterns;

//space start space 
// formula space(n-i-1) start(2*i+1) space(n-i-1)

public class fourthpattern { 
    public static void main(String[] args) {
        int n =6;
        for(int i =0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

// OutPut

//     *     
//    ***
//   *****
//  *******
// *********