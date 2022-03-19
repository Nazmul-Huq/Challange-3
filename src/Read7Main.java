public class Read7Main {

    /**
     * Make a read7() in java, that slices a given string by 7 character
     * @param input
     * @return
     */
    static String read7(String input){
        if (input.length() <= 7) {
            return "\"" + input + ", \"\"";
        } else {
            String result = "";
            String rest = input;
            while (rest.length() > 7){
                result = result + '"' + rest.substring(0, 7) + '"' + ", ";
                rest = rest.substring(7);

            }
            result = result + '"' + rest + "\", \"\"";
            return result;
        }
    }

    /**
     * First read n character from a given input
     * Then call the read7() method
     * Finally return the result
     * @param input
     * @param n
     * @return
     */
    static String readN(String input, int n){
            input = input.substring(0, n);
            return read7(input);

    }

    public static void main(String[] args) {

        String input = "Hello world";

        System.out.println("String to read: " + input);
        System.out.println("Read 11 characters: " + readN(input, 11));
        System.out.println("Read 9 characters: " +  readN(input, 9));
        System.out.println("Read 5 characters: " +  readN(input, 0));


    } // main() ends here
} // class ends here
