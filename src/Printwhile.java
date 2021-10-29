public class Printwhile {
    public static void main(String[] args) {
        //print only even numbers
        int i = 0;
        while (i <= 10) {

            if (i % 2 == 0) {
                System.out.println("only even numbers are" + i);
            }
            i++;


        }
        //sum 1 to 10
        int sum = 0;
        int j = 0;
        while (j <= 10) {
            System.out.println(sum = sum + j);
            j++;
        }
        //sum even numbers of 1-10
        int sum_even = 0;
        int k = 0;
        while (k <= 10) {
            if (k % 2 == 0) {
                sum_even = sum_even + k;
                System.out.println("even number sum" + sum_even);

            }
            k++;
        }
        //factorial
        int fact = 1;
        int l = 1;
        while (l < 5) {
            fact = fact * l;
            System.out.println("factorial" + fact);
            l++;
        }
        int facto = 1;
        for (int i1 = 1; i1 < 5; i1++) {
            facto = facto * i1;
            System.out.println("factorial using for" + facto);
        }
        //fibonacci series
        int n1=0,n2=1,n3,i2;
        System.out.print(n1+" "+n2);//printing 0 and 1

        for(i2=2;i2<10;++i2)
        {
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }

    }
}
