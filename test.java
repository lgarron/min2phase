
import java.io.*;

public class test {

      private static Search search = new Search();

      public static void test(String cubeString, int maxDepth) {
            String result = search.solution(cubeString, maxDepth, 1000000, 0, 0);
            System.out.println(result);
      }

	public static void main(String[] args) {

            System.out.println("[Starting]");

            System.out.println("[Initialized]");
            
            System.out.println("[The first 3 test cases should be fast.]");
            test("LURBUBDDBUUBDRFFFDRLLDFRRBDFDRBDRDULULBFLFFRUULFUBLBRL", 20);
            test("BRRBULFUBUFURRLFURDFLFFDFBDLURBDLDLBDDLRLDLRUFFRBBUUDB", 20);
            test("DBUBUFBRRDDFLRRLLLLBFRFDULFBFUFDUBBULLDRLDRURRDFFBUBUD", 20);
            
            System.out.println("[4th test case should take slightly longer the second time.]");
            test("LBRUUUUFRDLUFRDUULFRFFFDLDRFBBRDBRUBBFLLLLDBDFLURBDDRB", 25);
            test("LBRUUUUFRDLUFRDUULFRFFFDLDRFBBRDBRUBBFLLLLDBDFLURBDDRB", 20);

            System.out.println("[5th test case should take significantly longer the second time.]");
            test("FDDRURLURUFFBRBRUFBRBFFLBUDLBBFDLUDRRDULLDLUDLBDRBFULF", 25);
            test("FDDRURLURUFFBRBRUFBRBFFLBUDLBBFDLUDRRDULLDLUDLBDRBFULF", 20);

            System.out.println("[Done]");
	}
}
