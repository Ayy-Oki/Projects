package AssigmentVI;

import java.util.Scanner;

public class DatePrint {

    public static void main(String[] args) {
        boolean validInput = false;



        ///Scanner Method for User Input
        Scanner scnr = new Scanner(System.in);

        ///Welcome Message Cause it cute
        System.out.println("Welcome! I'm the Date Convertor");
        System.out.println("I'll convert your numerical date format into regular print!");
        /////////////////////////////////////////////////////////////



        while (!validInput) {
            try {
                System.out.println("Input the that Date in MM/DD/YYYY format:");

                String Dateinput = scnr.nextLine();

                String[] DateBits = Dateinput.split("/");

                if (DateBits.length != 3) {

                    ///throws for ArrayIndexOutOfBoundsException
                    throw new ArrayIndexOutOfBoundsException("Date Must be in MM/DD/YYYY format");
                }

                ///seperates the string into seperate integer elements
                int month = Integer.parseInt(DateBits[0]);
                int day = Integer.parseInt(DateBits[1]);
                int year = Integer.parseInt(DateBits[2]);


                ///Validates Month by throwing the custom month exception

                if (month < 1 || month > 12) {

                    throw new MonthException("Invalid Month! Must be between 1 - 12");
                }

                ///Validate Day Using DayException

                if (!isValidDay(day, month, year)) {
                    throw new DayException("Invalid Day! Must be valid for the given month and year.");
                }


                /////Validate Year Using YearException
                if (year < 1000 || year > 3000) {

                    throw new YearException("Invalid Year! Must be between 1 - 3000");
                }

                ////if all goes well, then it prints the formatted date
                String FormattedDate = formater(month, day, year);
                System.out.println("Formatted date:" + FormattedDate);
                validInput = true;


            } catch (NumberFormatException e) {
                System.out.println("Invalid input.Please only enter numbers.");
            } catch (MonthException | DayException | YearException | ArrayIndexOutOfBoundsException e) {

                System.out.print(e.getMessage());

            }
        }
            scnr.close();

        }

        //////Method to validate if it's a valid day
        private static boolean isValidDay(int day,int month, int year){
            if (day <1 )return false;

            if (month ==2){
                return day <= (isLeapYear(year) ? 29 : 28);
            }else{

                return day <= (month ==4 || month ==6|| month ==9||month == 11 ? 30:31 );
            }
        }


         ////Check if it's a leap year
        private static boolean isLeapYear (int year) {
            
           return (year % 4 ==0 && year % 100!=0)||(year % 400==0);
        }


        private static String formater(int month,int day,int year){

            String MonthName;

            switch (month){

                case 1: MonthName = "January"; break;
                case 2: MonthName = "February"; break;
                case 3: MonthName = "March"; break;
                case 4: MonthName = "April"; break;
                case 5: MonthName = "May"; break;
                case 6: MonthName = "June"; break;
                case 7: MonthName = "July"; break;
                case 8: MonthName = "August"; break;
                case 9: MonthName = "September"; break;
                case 10: MonthName = "October"; break;
                case 11: MonthName = "November"; break;
                case 12: MonthName = "December"; break;
                default:MonthName ="";

            }

            return MonthName + " " + day +"," + year;
        }

    }
