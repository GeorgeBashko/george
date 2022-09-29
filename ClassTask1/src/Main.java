import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task15ForListArray();
    }
    public static int[][] readFile(File file) throws FileNotFoundException, NoSuchElementException, InputMismatchException,IllegalArgumentException
    {
        //File file1 = new File("C:\\Users\\Георгий\\IdeaProjects\\Matrix.txt");
        Scanner s = new Scanner(file);
        int RowsCount = s.nextInt();
        int ColumnsCount = s.nextInt();
        int[][] Matrix = new int[RowsCount][ColumnsCount];
        if(RowsCount <= 0)
        {
            throw new IllegalArgumentException("Fuck you");
        }
        for(int i = 0;i < RowsCount;i ++)
            for(int j = 0;j < ColumnsCount;j++)
                Matrix[i][j] = s.nextInt();
        if(s.hasNext())
        {
            throw new IllegalArgumentException("Fuck you");
        }
        return Matrix;
    }
    public static int task15ForListArray() {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        ArrayList<ArrayList<Integer>> treangle = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> arr = new ArrayList<>();
            arr.add(1);
            for (int j = 1; j < i; j++) {
                arr.add(treangle.get(i - 1).get(j - 1) + treangle.get(i - 1).get(j));
            }
            if (i != 0) arr.add(1);
            treangle.add(arr);
        }
        for (ArrayList<Integer> arr1 : treangle) {
            for (int element : arr1) {
                System.out.printf("%4d", element);
            }
            System.out.println();
        }
        return 0;
    }
}