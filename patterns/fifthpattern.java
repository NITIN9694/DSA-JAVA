
package patterns;
//EX-ROW=5 COLUM=9
//2*N-2*i+1 

public class fifthpattern {
    public static void main(String[] args) {
        int n=9;
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }   
            for(int j=0;j<2*n-(2*i+1);j++){
                System.out.print("*");
            }
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
//Output
// *****************
//  ***************
//   *************
//    ***********
//     *********
//      *******
//       *****
//        ***
//         *