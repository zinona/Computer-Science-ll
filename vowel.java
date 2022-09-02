import java.util.Scanner;

public class vowel {
    public static void main(String[] args) {
        int a=0, e=0, u=0, o=0,i=0;
        int other=0;
        int len=0;
        String temp;
        Scanner scanner = new Scanner(System.in);

        ///////////////////////////////////////

        System.out.println("Enter the string please : ");
        temp = scanner.nextLine();

        len = temp.length();

        for(int m = 0; m <len; m++){
            char x = temp.charAt(m);

            if(x == 'a'){ a++; }
            else if(x == 'e'){ e++; }
            else if(x == 'u'){ u++; }
            else if(x == 'o'){ o++; }
            else if(x == 'i'){ i++; }

            }
        other = len - (a+e+u+o+i);

        System.out.println("a = " + a);
        System.out.println("e = " + e);
        System.out.println("u = " + u);
        System.out.println("o = " + o);
        System.out.println("i = " + i);
        System.out.println("other = " + other);

        }
    }

