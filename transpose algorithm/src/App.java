public class App {
    public static void main(String[] args) throws Exception {
        int rows, cols;
        // matrik
        int ar[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 },
                { 17, 18, 19, 20 }
        };

        // menentukan baris dan kolom
        rows = ar.length; // baris diambil dari panjang array kebawah/tiap kurung kurawa
        cols = ar[0].length; // kolom diambil dari panjang data dalam kurung kurawa[0]

        int m[][] = new int[cols][rows];

        System.out.println("matrik : ");
        for (int i = 0; i < ar.length; i++) { // loop untuk menukar nilai i menjadi banyak baris
            for (int j = 0; j < ar[0].length; j++) { // loop untuk menukar nilai j menjadi data kolom
                System.out.print(ar[i][j] + " ");
            }
            System.out.println();
        }

        int t[][] = new int[cols][rows]; // t menjadi matrik transpose

        System.out.println("transpose matrik diatas adalah : ");
        for (int i = 0; i < cols; i++) { // loop untuk menukarkan i menjadi data kolom
            for (int j = 0; j < rows; j++) { // loop untuk menukarkan j menjadi banyak baris
                t[i][j] = ar[j][i]; // matrik t mengambil semua matrik ar
                System.out.print(t[i][j] + " ");
            }
            System.out.println();
        }
    }
}
