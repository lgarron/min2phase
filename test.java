
import java.io.*;

public class test {

      private static Search search = new Search();

      public static void test(String cubeString) {
            String result = search.solution(cubeString, 20, 1000000, 0, 0);
            System.out.println(result);
      }

	public static void main(String[] args) {

            System.out.println("[Starting]");

            System.out.println("[Initialized]");
            
            System.out.println("[The first 3 test cases should be fast.]");
            test("LURBUBDDBUUBDRFFFDRLLDFRRBDFDRBDRDULULBFLFFRUULFUBLBRL");
            test("BRRBULFUBUFURRLFURDFLFFDFBDLURBDLDLBDDLRLDLRUFFRBBUUDB");
            test("DBUBUFBRRDDFLRRLLLLBFRFDULFBFUFDUBBULLDRLDRURRDFFBUBUD");
            
            System.out.println("[4th test case should take slightly longer.]");
            test("LBRUUUUFRDLUFRDUULFRFFFDLDRFBBRDBRUBBFLLLLDBDFLURBDDRB");

            System.out.println("[5th test case should take significantly longer.]");
            test("FDDRURLURUFFBRBRUFBRBFFLBUDLBBFDLUDRRDULLDLUDLBDRBFULF");

            System.out.println("[Done]");
	}
}
