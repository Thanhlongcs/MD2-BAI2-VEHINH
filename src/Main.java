import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice = -1;
        int i = 1;
        int j = 1;
        while(choice !=4){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Menu: ");
            System.out.println("1. Print the rectangle: ");
            System.out.println("2. Print the square triangle  ");
            System.out.println("3. Print isosceles triangle: ");
            System.out.println("4. Exit: ");
            choice = scanner.nextInt();
            int width;
            int height;
            int longs;
            switch (choice){
                case 1:
                    System.out.println("1. Print the rectangle: ");
                    System.out.println("input longs");
                    longs= scanner.nextInt();
                    System.out.println("input width");
                    width= scanner.nextInt();
                    for (i = 1; i <longs; i++){
                        for(j = 1; j < width; j++){
                            System.out.print("* ");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 2:

                    //System.out.println("2. Print a square triangle: ");
                    System.out.println("where is square: top-right; top-left; bottom-right;bottom-left");
                    String type = scanner.next();
                    if(type.equals("top-left")){
                        // TH2: In ra hinh tam giac vuong co goc vuong top-left
                        for(i = 1; i <=7; i++) {
                            for(j = 7; j>i; j--) {
                                System.out.print("*");
                            }
                            System.out.print("\n");
                        }

                    }
                    // TH1: In ra hinh tam giac vuong co goc vuong bottom-left
                    if(type.equals("bottom-left")) {
                        for (i = 1; i < 7; i++) {
                            for (j = 1; j < i; j++) {
                                System.out.print("* ");
                            }
                            System.out.print("\n");
                        }
                    }
//                     TH3: In ra hinh tam giac vuong co goc vuong bottom-right
                    if(type.equals("bottom-right")) {
                        for (i = 1; i < 7; ++i) {
                            for (int space = 1; space <= 7 - i; space++) {
                                System.out.print("  ");
                            }
                            for (j = 1; j <= i; j++) {
                                System.out.print(" *");
                            }
                            System.out.print("\n");
                        }
                    }
                    // TH4: In ra hinh tam giac vuong co goc vuong top-right
                    if(type.equals("top-right")) {
                        for (i = 1; i < 7; i++) {
                            for (j = 1; j < 7; j++) {
                                if (j < i) {
                                    System.out.print(" ");
                                } else {
                                    System.out.print("*");
                                }
                            }
                            System.out.print("\n");
                        }
                    }
                    break;
                case 3:
                    System.out.println("3. Print a isosceles triangle: ");
                    System.out.println("input height");
                    height= scanner.nextInt();
                    for(i = 1; i <= height; ++i) {
                        for (int space = 1; space <= height - i; space++) {
                            System.out.print(" ");
                        }
                        for (j = 1; j <= 2*i-1; j++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    break;
//                    int star=1;
//                    for (i=1;i<4;i++){
//                        for(int k = 4-i;k>0;k--){
//                            System.out.print(" ");
//                        }
//                        for(j=0;j<star;j++){
//                            System.out.print("*");
//                        }
//                        star+=2;
//                        System.out.println("");
//                    }
                case 4:
                    // System.exit() la mot void method (phuong thuc khong co gia tri tra ve) nhan 1 tham so status code kieu int de thuc thi.
                    // Status code co the la bat cu so int nao, nhung thong thuong status code se la 0
                    System.exit(0);
                default:
                    System.out.println("No choice");
            }
        }
    }
}