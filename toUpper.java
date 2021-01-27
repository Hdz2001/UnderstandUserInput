import java.util.*;
import java.io.*;
import java.util.Scanner;

//this program will put first letter of a string or a word after a space upper case and delete num from the string

public class toUpper
    {
        public static void main( String args[] )
        {
            String str;
            Scanner line;
            //BufferedReader in;

            // read the document 1 line at a time
            try
            {
                line = new Scanner( System.in);
                System.out.println("Enter the name wanted: ");
                str = line.nextLine();
                String newStr = "";
                char x = ' ';
                // process each line in turn
                while (line != null) {
                    for (int i = 0; i < str.length(); i++) {
                        if (i == 0) {
                            x = Character.toUpperCase(str.charAt(i));
                        }
                        else {
                            if (str.charAt(i - 1) == ' ') {
                                x = Character.toUpperCase(str.charAt(i));
                            } else {
                                x = str.charAt(i);
                            }
                        }
                        if (!Character.isDigit(x)) {
                            newStr += x;
                            //delete the num
                        }
                    }
                    System.out.println("Output: " + newStr.trim());
                    //delete all white space at beginning and the end of the string
                    System.out.println("Do you mean: " + newStr.replaceAll("\\s+",""));
                    //put all the word together
                    str = line.nextLine();
                    //get the next word to process
                    newStr = "";
                }
                line.close();
            }

            catch( Exception e )
            {
                System.out.println( "I/O error: " + e.getMessage() );
            }
        }
    }

