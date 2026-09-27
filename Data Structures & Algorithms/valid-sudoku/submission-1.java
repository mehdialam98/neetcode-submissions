class Solution {
    public boolean isValidSudoku(char[][] board) {
        // Step1: Looping through each row
        //  nested Loop that checks all the element at that particular row
        //  if any space is empty we continue
        //  if any space is duplicated that we return false
        //  if passes the above 2 checks then we add it to a HashSet

        for(int row=0; row<9; row++) {
            Set<Character> seen = new HashSet<>();
            for(int i=0; i<9; i++) {
                if(board[row][i] == '.') continue;
                if(seen.contains(board[row][i])) return false;
                seen.add(board[row][i]);
            }
        }



        // Step2: Looping through each column
        //  nested Loop that checks all the element at that particular column
        //  if any space is empty we continue
        //  if any space is duplicated that we return false
        //  if passes the above 2 checks then we add it to a HashSet

        for(int col=0; col<9; col++) {
            Set<Character> seen = new HashSet<>();
            for(int i=0; i<9; i++) {
                if(board[i][col] == '.') continue;
                if(seen.contains(board[i][col])) return false;
                seen.add(board[i][col]);
            }
        }

        // Step3: Looping through each boxes(3x3 squares) (9 sqaures)
        //  2 nested Loop one inside another that checks all the cells of that particular square
        //  if any space is empty we continue
        //  if any space is duplicated that we return false
        //  if passes the above 2 checks then we add it to a HashSet

        for(int square=0; square<9; square++) {
            Set<Character> seen = new HashSet<>();
            for(int i=0; i<3; i++) {
                for(int j=0; j<3; j++) {
                    int row = (square / 3) * 3 + i;
                    int col = (square % 3) * 3 + j;
                    if(board[row][col] == '.') continue;
                    if(seen.contains(board[row][col])) return false;
                    seen.add(board[row][col]);
                }
            }
        }
        return true;
    }
}
