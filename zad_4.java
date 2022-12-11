// На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга.

public class zad_4 {

    public static void main(String[] args) {
        String[][] boards = new String[8][8];
        boards[3][0] = "Q";
        boards[5][1] = "Q";
        boards[7][2] = "Q";
        boards[1][3] = "Q";
        boards[6][4] = "Q";
        boards[0][5] = "Q";
        boards[2][6] = "Q";
        boards[4][7] = "Q";

        for (int i = 0; i < boards.length; i++) {
			for (int j = 0; j < boards[i].length; j++) {
                if (boards[i][j] == null) {
                    boards[i][j] = "X";
                }
				System.out.print(boards[i][j] + "\t");
			}
			System.out.println();
		}
    }
}
