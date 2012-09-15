
import java.io.*;

public class test {

      private static Search search = new Search();

      public static void test(String cubeString, int maxDepth) {

            int timeOut = 1000000;
            int timeMin = 0;
            int verbose = 0;

            String result = search.solution(cubeString, maxDepth, timeOut, timeMin, verbose);

            System.out.println(result);

      }

	public static void main(String[] args) {

            System.out.println("[Initializing]");
            Tools.init();

            System.out.println("[Testing random states with maxDepth 25]");
            for (int i = 0; i < 10; i++){
                  test(Tools.randomCube(), 25);
            }

            System.out.println("[Testing random states with maxDepth 20]");
            for (int i = 0; i < 10; i++){
                  test(Tools.randomCube(), 20);
            }

            System.out.println("[Done]");
	}
}
