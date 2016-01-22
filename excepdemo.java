

		class ExceptDemo {
			public static void main(String args[]) {
			int a, b, res;
			try {
			a = Integer.parseInt(args[0]);
			b = Integer.parseInt(args[1]);
			res = a / b;
			System.out.println("Result is " + res);
			} catch (ArithmeticException ae) {
			System.out.println("No.can’t be devided by zero.pls enter a non zero value for b");
			} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Insufficient arguments.pls pass two integers");
			} catch (NumberFormatException e) {
			System.out.println("Not a number");
			} catch (Exception e) {
			System.out.println(e.getMessage());
			} finally {
			System.out.println("Cleaning process goes here");
			}
			}
			}
	

	


