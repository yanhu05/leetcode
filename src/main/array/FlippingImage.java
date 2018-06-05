package main.array;

//https://leetcode.com/problems/flipping-an-image/description/

public class FlippingImage {

    public int[][] flipAndInvertImage(int[][] image) {
        if (image == null) {
            return image;
        }

        int rowNum = image.length;
        int colNum = image[0].length;

        for (int i = 0; i < rowNum; i++) {
            int hi = colNum - 1;
            for (int j = 0; j < colNum; j++) {
                if (j < hi) {
                    int tmp = image[i][j];
                    image[i][j] = image[i][hi];
                    image[i][hi] = tmp;
                    hi--;
                }
                image[i][j] ^= 1;
            }

        }
        return image;
    }
}
