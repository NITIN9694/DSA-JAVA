package patterns;

public class thirdpattern {
    public static void main(String[] args) {
        int n = 5;
        for(int i =0;i<n;i++){
            for(int j =1;j< n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

// OutPut
// 12345
// 1234
// 123
// 12
// 1