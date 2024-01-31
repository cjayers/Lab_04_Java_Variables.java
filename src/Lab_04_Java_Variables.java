public class Lab_04_Java_Variables
{
    public static void main(String[] args)
    {
      int intOperandA = 5; //Declaring variables
      int intOperandB = 15;
      int intSum = 52;
      int intProduct = 45;
      int intDifference = 103;
      int intQuotient = 75;
      int intModulo = 22;


      double doubleOperandA = 120.5;  //Declaring double variables
      double doubleOperandB = -3.2;
      double doubleSum = 88;
      double doubleProduct = 77;
      double doubleDifference = .55;
      double doubleQuotient = -10.25;
      double doubleModulo = 12;

      intSum = intOperandA + intOperandB; //assigning statements
      intProduct = intDifference * intModulo;;
      intModulo = intDifference % intOperandB;;
      intDifference = intSum - intModulo;
      intQuotient = intProduct / intOperandA;;


      doubleSum = doubleDifference + doubleOperandA;  // assigning statements for double numeric variables
      doubleProduct = doubleModulo * doubleOperandB;
      doubleQuotient = doubleSum / doubleDifference;
      doubleDifference = doubleQuotient - doubleOperandA;
      doubleModulo = doubleOperandA %  doubleSum;

        System.out.println("The sum using ints of " + intOperandA + " and " + intOperandB +" is " + intSum);  // print statements for assignment statements
      System.out.println("The product using ints of " + intDifference + " and " + intModulo +" is " + intProduct);
      System.out.println("The Modulo using ints of " + intDifference + " and " + intOperandB + " is " + intModulo);
      System.out.println("The difference using ints of " + intSum + " and " + intModulo + " is " + intDifference);
      System.out.println("The quotient using ints of " + intProduct + " and " + intOperandA + " is " + intQuotient);


      System.out.println("The sum using real numbers of " + doubleDifference + " and " + intOperandA + " is " + doubleSum); // print statements for double assignment statements
      System.out.println("The product using real numbers of " + doubleModulo + " and " + doubleOperandB + " is " + doubleProduct);
      System.out.println("The quotient using real numbers of " + doubleSum + " and " + doubleDifference + " is " + doubleQuotient);
      System.out.println("The difference using real numbers of " + doubleQuotient + " and " + doubleOperandA + " is " + doubleDifference);
      System.out.println("The modulo using real numbers of " + doubleOperandA + " and " + doubleSum + " is " + doubleModulo);






    }
}
