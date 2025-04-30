import java.util.Scanner;
class Quiz1 {
public static void main(String[]args){
    Scanner input = new Scanner (System.in);

    System.out.print("Enter #: ");
    int num = input.nextInt();

    if (num %2==0){
        System.out.println(num + " = even-number");
    }
    else {
        System.out.println(num + " = odd-number");
    }
    if (num ==0) {
        System.out.println(num + " = zero");
    }
    else {
        System.out.println(num + " = non-zero");
    }
    if (num > 0){
        System.out.println(num + " = positive");
    }
    else if (num <0){
        System.out.println(num + " = negative");
    }
input.close();
    

}

    }