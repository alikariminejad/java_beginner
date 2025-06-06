public class Main {
    public static void main(String[] args){
        // switch = statement that allows a variable to be tested for quality against a list of values
        String day = "Friday";

        switch(day){
            case "Monday": System.out.println("It's Monday"); break;
            case "Tuesday": System.out.println("It's Tuesday"); break;
            case "Wednesday": System.out.println("It's Wednesday"); break;
            case "Thursday": System.out.println("It's Thursday"); break;
            case "Friday": System.out.println("It's Friday"); break;
            case "Saturday": System.out.println("It's Saturday"); break;
            case "Sunday": System.out.println("It's Sunday"); break;
            default: System.out.println("That is not a day"); break;
        }
    }
}
