import java.util.Arrays;

public class AllPathPrint {
    public static void main(String[] args) {
        boolean[][]  maze = {
            {true, true, true},
            {true, true, true},
            {true, true, true}
        };

        int[][] path = new int[maze.length][maze[0].length];

        allpathprint("", maze, 0, 0, path, 1);
    }

    static void allpathprint(String p, boolean maze[][], int r, int c, int[][] path, int step){
        if(r== maze.length - 1 && c== maze[0].length - 1){
            path[r][c] = step;
            for(int[] arr : path ){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }

        if(!maze[r][c]){
            return;
        }
        path[r][c] = step;

        // i'm considering this block in my path
        maze[r][c] = false;

        if(r < maze.length-1){
           allpathprint(p + 'D', maze, r+1, c, path, step+1);
        }

        if(c < maze[0].length-1){
            allpathprint(p + 'R', maze, r, c+1, path, step+1);
        }

        if(r>0){
            allpathprint(p + 'U', maze, r-1, c, path, step+1);
        }

        if(c>0){
            allpathprint(p + 'L', maze, r, c-1, path, step+1);
        }

        // this line is where the function will over
        // so before the function gets removed, also remove the changes that were made by that f(n)
        maze[r][c] = true;
        path[r][c] = 0;
    }
}
