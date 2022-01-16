public class Transpoz {
    public static void main(String[] args) {
        
        int[][] matrix = new int[2][3];

        matrix[0][0] = 2;
        matrix[0][1] = 3;
        matrix[0][2] = 4;
        matrix[1][0] = 5;
        matrix[1][1] = 6;
        matrix[1][2] = 4;

        System.out.println(matrix[1][0]);

        int[][] transpoz = new int[3][2];

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 2; j++){
                transpoz[i][j] = matrix[j][i];
            }
        }

        System.out.println("========");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 2; j++){
                System.out.print(transpoz[i][j] + " ");
            }
            System.out.println();
        }

        

    }
    
}
