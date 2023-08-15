// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Intro with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        // Press Mayús+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 100; i++) {
            String outPut = "";
            if(i%3 == 0){
                outPut = "Fizz      " + i;

                if(i%3 == 0 && i%5 == 0){
                    outPut = ("fizz-buzz " + i);
                }

            }else{
                if(i%5 == 0){
                    outPut = ("buzz      " + i);
                }
            }

            System.out.println(outPut);
        }
    }
}