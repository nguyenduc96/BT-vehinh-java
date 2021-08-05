import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Chọn hình muôn vẽ");
        System.out.println("1. Hình chữ nhật");
        System.out.println("2. Hình tam giác vuông");
        System.out.println("3. Hình tam giác cân");
        System.out.println("4. Exit");

        while (true){
            int input = scanner.nextInt();
            switch (input){
                case 1:{
                    System.out.println("Hình chữ nhật");
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < 10; j++) {
                            System.out.print("* ");
                        }
                        System.out.print("\n");
                    }
                }
                case 2:{
                    System.out.println("Tam giác vuông góc dưới trái");
                    for (int i = 1; i <= 10; i++) {
                        for (int j = 1; j < i; j++) {
                            System.out.print("* ");
                        }
                        System.out.print("\n");
                    }
                    System.out.println("Tam giác vuông góc trên trái");
                    for (int i = 10; i >=1; i--) {
                        for (int j = 1; j <=i ; j++) {
                            System.out.print("* ");
                        }
                        System.out.print("\n");
                    }
                    System.out.println("Tam giác vuông góc dưới phải");
                    for (int i = 1; i <= 10; i++) {
                        for (int j = 1; j <= 10 ; j++) {
                            if (j <= 10-i){
                                System.out.print(" " + " ");
                            } else {
                                System.out.print("* ");
                            }
                        }
                        System.out.print("\n");
                    }
                    System.out.println("Tam giác vuông góc trên phải");
                    for (int i = 10; i >= 1 ; i--) {
                        for (int j = 1; j <= 10; j++) {
                            if (j <= 10-i){
                                System.out.print(" " + " ");
                            } else {
                                System.out.print("* ");
                            }
                        }
                        System.out.print("\n");
                    }
                    break;
                }
                case 3:{
                    System.out.println("Hình tam giác cân");
                    for(int i = 1; i <= 10; i++) {
                        for(int j = 1; j <= 10-i; j++) {
                            System.out.print("  ");
                        }
                        for(int k = 1; k <= 2*i-1; k++) {
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                    break;
                }
                case 4:{
                    System.exit(0);
                    break;
                }
                default:{
                    System.out.println("Vui long nhập số có trong danh sách trên");
                    break;
                }
            }
        }
    }
}
