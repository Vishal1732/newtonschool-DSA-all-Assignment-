import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

    // don't change the name of this class

    // you can add inner classes if needed

class Main {
    public static void main (String[] args) {
    int N, X, M;
    Scanner vishal = new Scanner(System.in);
    N = vishal.nextInt();
    X = vishal.nextInt();
    int arr[] = new int[N];
    for (int i = 0; i < N; i++) {
    arr[i] = vishal.nextInt();
    }
    M = vishal.nextInt();
    int marr [][] = new int[M][2];
    for (int i = 0; i < M; i++) {
    for (int j = 0; j < marr[i].length; j++) {
    marr[i][j] = vishal.nextInt();
    }
    }
    // logic
    for (int i=0;i< M ;i++) {
    int L = marr[i][0] - 1; // 0
    int R = marr[i][1] - 1; // 2
    int last = arr[R]; // 3
    for(int j=R;j>L;j--) {
    arr[j] = arr[j-1];
    }
    arr[L] = last;
    }
    System.out.println(arr[X-1]);
    }
}
