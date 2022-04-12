import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int countOfNumber = getCountOfNumber(in);
        ArrayList<String> unparsedNumbers = new ArrayList<String>();
        setNumbers(countOfNumber,in,unparsedNumbers);
        sortByLength(unparsedNumbers);

        for(String value : unparsedNumbers){
            System.out.println(value);
        }
    }

    public static int getCountOfNumber(Scanner in){
        String unparsedCountOfNumber = in.nextLine();

        while (!tryParse(unparsedCountOfNumber)){
            System.out.println("Enter a number please.");
            unparsedCountOfNumber = in.nextLine();
        }

        int countOfNumber = Integer.parseInt(unparsedCountOfNumber);

        return countOfNumber;
    }

    public static void setNumbers(int countOfNumber, Scanner in, ArrayList<String> unparsedNumbers){
        for (;countOfNumber>0;countOfNumber--){
            String unparsedNumber = in.nextLine();
            unparsedNumbers.add(unparsedNumber);
        }
    }

    public static boolean tryParse(String value){
        try{
            Integer.parseInt(value);
            return true;
        }
        catch (NumberFormatException e){
            return false;
        }
    }

    public static void sortByLength(ArrayList<String> unparsedNumbers){
        boolean isSorted = false;
        String boof;

        while(!isSorted){
            isSorted = true;

            for(int i = 0; i < unparsedNumbers.size()-1; i++){

                if(unparsedNumbers.get(i).length() > unparsedNumbers.get(i+1).length()){
                    isSorted = false;
                    boof = unparsedNumbers.get(i);
                    unparsedNumbers.set(i, unparsedNumbers.get(i+1));
                    unparsedNumbers.set(i+1, boof);
                }
            }
        }
    }
}
