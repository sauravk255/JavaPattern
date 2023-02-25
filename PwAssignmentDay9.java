// Question 1: Write A Program To Print Alphabet A B C D E F G H Using Pattern Programming Losic 
public class PwAssignmentDay9 {
    public static void main(String[] args) {
        int n=12;
        for(int i=0;i<n;i++) {
            //For A
            for(int j=0; j<n;j++) {
                if (j==0&&i>0||i==0&&j>0&&j<(n-1)/2||j==(n-1)/2&&i>0||i==(n-1)/2&&j<(n-1)/2) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            //For B
            System.out.print(" ");
            for(int j=0; j<n;j++) {
                if (j==0&&i>0||
                i==0&&j<(n-1)/2||
                j==(n-1)/2&&i>0&&i<n-1&&i!=(n-1)/2||
                i==(n-1)/2&&j<(n-2)/2&&j!=(n-1)/2||
                i==(n-1)&&j<(n-1)/2&&j>0) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            //For C
            System.out.print(" ");
            for(int j=0; j<n;j++) {
                if (j==0&&i>0&&i<n-1||
                i==0&&j>0&&j<=(n-1)/2||
                i==n-1&&j>0&&j<=(n-1)/2) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            //For D
            System.out.print(" ");
            for(int j=0; j<n;j++) {
                if (j==0||
                i==0&& j<(n-1)/2||
                i==n-1&&j<(n-1)/2||
                j==(n-1)/2&&i>0&&i<n-1) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            //For E
            System.out.print(" ");
            for(int j=0; j<n;j++) {
                if (j==0||i==0&&j<=(n-1)/2||i==(n-1)/2&&j<=(n-1)/2||i==n-1&&j<=(n-1)/2) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            //For F
            System.out.print(" ");
            for(int j=0; j<n;j++) {
                if (j==0||i==0&&j<=(n-1)/2||i==(n-1)/2&&j<=(n-1)/2) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            //For G
            System.out.print(" ");
            for(int j=0; j<n;j++) {
                if (j==0&&i>0&&i<n-1||
                i==0&&j>0&&j<=(n-1)/2||
                i==n-1&&j>0&&j<=(n-1)/2&&j<=(n-1)/4||
                j==(n-1)/4&&i>=(n-1)/2 ||
                i==(n-1)/2&&j>=(n-1)/4&&j<=(n-1)/2||
                j==(n-1)/2&&i>=(n-1)/2) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            //For H
            System.out.print(" ");
            for(int j=0; j<n;j++) {
                if (j==0||j==(n-1)/2||i==(n-1)/2&&j<=(n-1)/2) {
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