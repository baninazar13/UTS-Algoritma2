
package UtsAlgo;

import java.util.Scanner;

public class TransposeMatriks {
    
    public static void main(String[] args) {
        
        int i, j, m, n;
        int matriks[][] = new int[10][10];
        int transpose[][] = new int[10][10];
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan jumlah baris matriks: ");
        m = input.nextInt();
        System.out.println("Masukkan jumlah kolom matriks: ");
        n = input.nextInt();
        System.out.println("Masukkan elemen Matriks: ");
        for (i = 0; i < m; ++i) {
            for (j = 0; j < n; ++j) {
                matriks[i][j] = input.nextInt();
            }
        }
        System.out.println("Hasil Matriks: ");
        for (i = 0; i < m; ++i) {
            for (j = 0; j < n; ++j) {
                System.out.print(matriks[i][j] + "\t");
            }
            System.out.println();
        }
        
        for (i = 0; i<m; ++i){
            for (j= 0; j < n; ++j) {
                transpose[j][i] = matriks[i][j];
            }
        }
        
        System.out.println("Hasil transpose matriks: ");
        for (i = 0; i < m; ++i) {
            for (j = 0; j < n; ++j) {
                System.out.print(transpose[j][i] + "\t");
            }
            System.out.println();
        }
    }
}

