public class summary3_1 {
    public static void main(String[] args) {
        int number1 = 5; // declaring and initializing number1
        number1 = 4; // assigning a new value to number1
        int number2 = 10; // declaring and initializing number2
        number2 = 2; // assigning a new value to number2

        String firstName = "Pelin"; // declaring and initializing firstName
        String lastName = "Sallakci"; // declaring and initializing lasttName

        double calculateAverage = ((double) number1 + number2) / 2; // calculating the average

        String fullName = firstName + " " + lastName; // finding the full name by adding lastName and firstName

        if (calculateAverage >= 70) { // if average is more than 70 then the student is true.
            boolean bool = true;
        } else {
            boolean bool = false; // else, then the student is true.
        }
        // the if statement here identifies if a student is true or not.
        System.out.println("Average of " + fullName + " : " + calculateAverage); // prints the average of the student
        System.out.println("The student: " + fullName + " has the " + bool + "grades"); // prints the identification of
                                                                                        // the student (true, or not)
        // burda "the student has true grades" yazdirmaya calistim ama bool da hata
        // verdi (cannot resolved to a variable)
        // neden calismadi tam anlamadim.

    }
}
