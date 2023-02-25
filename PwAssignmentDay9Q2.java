//Question 2:  Write a program to print triangle using star pattern programming logi;
public class PwAssignmentDay9Q2 {
    public static void main(String[] args) {
        int n=12;
        for(int i=0;i<n;i++) {
            //For A
            for(int j=0; j<n;j++) {
                if (j==0||i==n-1||i==j) {
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
