package com.patternhub.codingproblems.easy.patternquestions;

public class AdvancedPatterns {
    public static void main(String[] args) {
//        butterfly();
//        samplePattern();
//        rightSidedTriangle();
//        rightSidedTriangle2();
//        hillPattern();
//        reverseHillPattern();
//        diamondPattern();
//        printPyramid();
//        printReversePyramid();
//        printSandGlass();
//        printLeftPascalTriangle();
        printDoubleHill();
//        printButterfly();
    }


    static void samplePattern() {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= i + 1; j++) {
                System.out.print(" ");
            }

            System.out.println();

        }
    }

    static void butterfly() {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println("");

        }

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println("");

        }
    }

    static void rightSidedTriangle() {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    static void rightSidedTriangle2() {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }

            for (int j = i; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    static void hillPattern() {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    static void reverseHillPattern() {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j < n - i; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= n - i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

    }

    static void diamondPattern() {
        int n = 5;
        for (int i = 1; i < n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j <= n; j++) {
                System.out.print("* ");
            }
            for (int j = i; j <= n - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    static void printPyramid() {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = i; j <= n; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void printReversePyramid() {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <= n; j++) {
                System.out.print("* ");
            }
            for (int j = i; j <= n; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void printSandGlass() {
        int n = 5;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <= n; j++) {
                System.out.print("* ");
            }
            for (int j = i; j <= n; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }

        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void printLeftPascalTriangle() {
        int n = 5;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    static void printDoubleHill() {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
//            for (int j = 1; j<= i; j++){
//                System.out.print("* ");
//            }
            System.out.println("");
        }
    }

    static void printButterfly() {
        int n = 5;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = i; j < n; j++) {
                System.out.print(" ");

            }
            for (int j = i; j < n; j++) {
                System.out.print(" ");

            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print("*");
            }
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
