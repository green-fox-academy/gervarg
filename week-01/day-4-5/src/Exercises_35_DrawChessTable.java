public class Exercises_35_DrawChessTable {
    public static void main(String[] args){
        // Crate a program that draws a chess table like this
        //
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %
        //
        String chessPattern = "% % % %";
        for (int i = 0; i < 4; i++){
            System.out.println(chessPattern);
            System.out.println(" " + chessPattern);

        }

    }
}
