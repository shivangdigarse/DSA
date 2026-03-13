package array;

public class Av_SpiralPrinting {
    //LC 54
    public static void main(String[] args) {
        int[][] m = {
                {1, 2, 3, 4, 5, 6, 7},
                {8, 9, 10, 11, 12, 13, 14},
                {15, 16, 17, 18, 19, 20, 21},
                {22, 23, 24, 25, 26, 27, 28},
                {29, 30, 31, 32, 33, 34, 35},
                {36, 37, 38, 39, 40, 41, 42},
                {43, 44, 45, 46, 47, 48, 49}
        };
        int rmin = 0;
        int rmax = m.length-1;
        int cmin = 0;
        int cmax = m[0].length-1;
        while(rmin <= rmax && cmin <= cmax){
            for(int i = cmin; i<=cmax; i++){
                System.out.print(m[rmin][i]+" ");
            }
            rmin++;
            for(int i = rmin; i<=rmax; i++){
                System.out.print(m[i][cmax]+" ");
            }
            cmax--;
            for(int i = cmax; i>=cmin; i--){
                System.out.print(m[rmax][i]+" ");
            }
            rmax--;
            for(int i = rmax; i>=rmin; i--){
                System.out.print(m[i][cmin]+" ");
            }
            cmin++;
        }
    }
}
