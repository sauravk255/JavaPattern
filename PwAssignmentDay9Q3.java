//Question 3: 
public class PwAssignmentDay9Q3 {
    public static void main(String[] args) {
        int n=12;
        for(int i=0;i<n;i++) {
            //For A
            for(int j=0; j<n;j++) {
                if (i==0||j==0&&i<=(n+n+n-2)/4||i==(n+n+n-2)/4||j==n-1&&i<=(n+n+n-2)/4||i+j<=(n-1)/2||j-i>=(n-1)/2) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
