import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
        // System.out.println(count(3, 3));    //for count

        // path("", 3, 3);                     // path in string

        // System.out.println(MazeList("", 3, 3));     // path in list form

        // System.out.println(MazeListDiag("", 3, 3));   //when we take diagonal step also

        boolean[][] maze = {
            {true, true, true},
            {true, false, true},
            {true, true, true}
        };

       mazeRest("", maze, 0, 0);        // with restriction like river or stone in center
    }

    static int count(int r, int c){
        if(r==1 || c == 1){
            return 1;
        }

        int left = count(r-1, c);
        int right = count(r, c-1);
        return left + right;
    }

    static void path(String p, int r, int c){
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }

        if(r>1){
           path(p+'D', r-1, c);
        }

        if(c>1){
            path(p + 'R', r, c-1);
        }
    }


    static ArrayList<String> MazeList(String p, int r, int c){
        if(r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();

        if(r>1){
           ans.addAll(MazeList(p+'D', r-1, c));
         }
 
         if(c>1){
            ans.addAll(MazeList(p + 'R', r, c-1));
         }

         return ans;
    }


    //for diagonal path 

    static ArrayList<String> MazeListDiag(String p, int r, int c){
        if(r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();

        if(r>1 && c>1){
            ans.addAll(MazeListDiag(p+'D', r-1, c-1));
        }

        if(r>1){
           ans.addAll(MazeListDiag(p+'H', r-1, c));
         }
 
         if(c>1){
            ans.addAll(MazeListDiag(p + 'V', r, c-1));
         }

         return ans;
    }


    // maze with restriction ------------

    static void mazeRest(String p, boolean maze[][], int r, int c){
        if(r== maze.length - 1 && c== maze[0].length - 1){
            System.out.println(p);
            return;
        }

        if(!maze[r][c]){
            return;
        }

        if(r < maze.length-1){
           mazeRest(p + 'D', maze, r+1, c);
        }

        if(c < maze[0].length-1){
            mazeRest(p + 'R', maze, r, c+1);
        }
    }

}
