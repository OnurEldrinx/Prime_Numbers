public class Main {
    public static void main(String[] args)
    {

        int counter,divider;

        System.out.print("Prime Numbers In [1,100] Range: ");

        for (int i=1;i<100;i++){

            counter=0;
            divider=1;

            while(divider <= i){

                if (i % divider == 0){

                    counter++;

                }

                divider++;

            }

            if (counter == 2){

                System.out.print(i);
                if (i!=97){

                    System.out.print(",");

                }

            }

        }

    }
}
