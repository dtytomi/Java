import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByZeroWithExceptionHandling {

	// demostrates throwing an exception when a divide-by-zero occurs
	public static int quotient( int numerator, int denomenator )
		throws ArithmeticException {
			return numerator / denomenator; // possible division by zero
	} // end method quotient

	public static void main( String[] args ) {

		Scanner scanner = new Scanner( System.in ); // scanner for input
		boolean continueLoop = true; // deterines if more input is needed

		do
		{
			try // read two numbers and calculate quotient
			{
				System.out.print( "Please enter an integer numerator: " );
				int numerator = scanner.nextInt();
				System.out.print( "Please enter an integer denomenator: " );
				int denomenator = scanner.nextInt();

				int result = quotient( numerator, denomenator);
				System.out.printf("\nResult: %d / %d = %d\n", numerator,
				 denomenator, result );
				continueLoop = false; // input successful; end looping

			} // end try
			catch ( InputMismatchException inputMismatchException )
			{
				System.err.printf("\nException: %s\n",
					inputMismatchException );
				scanner.nextLine(); // discard input so user can try again
				System.out.println(
					"You must enter integers. please try again. \n" );

			} // end catch

			catch (ArithmeticException arithmeticException)
			{
				System.err.printf("\nException: %s\n", arithmeticException );
				System.err.println(
					"Zero is an invalid denomenator. Please try again.\n");
			} // end catch
		} while ( continueLoop ); // end do ehile
	} // end main
} // end class DivideByZeroWithExeptionHandling