//Question 4: Write a program to print PW SKILLS using pattern programming logic;

public class PwAssignmentDay9Q4 {
    public static void main(String[] args) {
        int n=10;
        for(int i=0;i<n;i++) {
            //For A
            for(int j=0; j<n;j++) {
                if (i==0&&j<=(n-1)/2||j==0||i==(n-1)/2&&j<=(n-1)/2||j==(n-1)/2&&i<=(n-1)/2) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
                System.out.print(" ");
                for(int j=0; j<n;j++) {
                    if (j==0&&i<(n-2)/2||i+j==(n-1)/2||j-i==(n)/2||j==n-1&&i<=(n-1)/2) {
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
                System.out.print("  \t");
                for(int j=0; j<n;j++) {
                    if (j==(n-1)/2&&i>0&&i<n-1||
                    i==0&&j>(n-1)/2&&j<n-1||
                    j==n-1&&i<(n-1)/2&&i>0||
                    j==0&&i>(n-1)/2&&i<n-1||
                    i==n-1&&j>0&&j<(n-1)/2) {
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
                System.out.print("  \t");
                for(int j=0; j<n;j++) {
                    if (j==0||i+j==(n-1)/2||i-j==(n-1)/2) {
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
                System.out.print("");
                for(int j=0; j<n;j++) {
                    if (j==(n-1)/2||i==0&&j>2&&j<n-3||i==n-1&&j>2&&j<n-3) {
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
                System.out.print(" \t");
                for(int j=0; j<n;j++) {
                    if (j==0||i==n-1&&j<n/2) {
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
                System.out.print(" \t");
                for(int j=0; j<n;j++) {
                    if (j==0||i==n-1&&j<n/2) {
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
                System.out.print(" ");
                for(int j=0; j<n;j++) {
                    if (j==(n-1)/2&&i>0&&i<n-1||
                    i==0&&j>(n-1)/2&&j<n-1||
                    j==n-1&&i<(n-1)/2&&i>0||
                    j==0&&i>(n-1)/2&&i<n-1||
                    i==n-1&&j>0&&j<(n-1)/2) {
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
