import java.util.Stack;

/**
 * Created by Leart Doko on 10/23/2015.
 */
public class SurroundedRegions {
    public void solve(char[][] board) {
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                if(board[i][j] == 'O' && onEdge(i,j, board.length, board[i].length)){
                    findRegion(board, i,j);
                }
            }
        }

        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                if(board[i][j] == 'O'){
                    board[i][j] = 'X';
                }
                else if(board[i][j] == 'c'){
                    board[i][j] = 'O';
                }
            }
        }
    }

    public boolean onEdge(int i, int j, int length, int height){
        if(i == 0 || i == length-1){
            return true;
        }

        if(j == 0 || j == height-1){
            return true;
        }

        return false;
    }

    public void findRegion(char[][] board, int x, int y){
        //mark the edge
        Stack<Point> region = new Stack<Point>();
        region.add(new Point(x, y));

        while(!region.isEmpty()){
            Point temp = region.pop();
            board[temp.x][temp.y] = 'c';
            if(temp.x-1 >= 0){
                if(board[temp.x-1][temp.y] == 'O'){
                    region.push(new Point(temp.x-1, temp.y));
                }
            }
            if(temp.x+1 < board.length){
                if(board[temp.x+1][temp.y] == 'O'){
                    region.push(new Point(temp.x+1, temp.y));
                }
            }
            if(temp.y-1 >= 0){
                if(board[temp.x][temp.y-1] == 'O'){
                    region.push(new Point(temp.x, temp.y-1));
                }
            }
            if(temp.y+1 < board[temp.x].length){
                if(board[temp.x][temp.y+1] == 'O'){
                    region.push(new Point(temp.x, temp.y+1));
                }
            }
        }
    }

    class Point{
        public int x,y;
        public Point(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
}
