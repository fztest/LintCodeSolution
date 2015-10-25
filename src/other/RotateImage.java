package other;

public class RotateImage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public void rotate(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return;
        }
        
        int length = matrix.length;
        
        // important!!!!!!
        // i from 0 to length/2
        // j from 0 to (length+1)/2
        for(int i=0;i<length/2;i++){
            for(int j=0;j<(length+1)/2;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[length-1-j][i];
                matrix[length-j-1][i] = matrix[length-1-i][length-1-j];
                matrix[length-1-i][length-1-j] = matrix[j][length-1-i];
                matrix[j][length-1-i] = temp;
            }        
        }

    }
}
