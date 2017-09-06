import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdStats;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.WeightedQuickUnionUF;

// 0 = blocked
// 1 = open
// 2 = full

public class Percolation {
	private int[][] multi;
	
	public Percolation(int n) {
		if (n<0) throw new IllegalArgumentException();
		multi = new int[n-1][n-1];
	}

	public    void open(int row, int col) {
		if (row<=0) throw new IllegalArgumentException();
		if (col<=0) throw new IllegalArgumentException();
		multi[row-1][col-1] = 1;

    }    // open site (row, col) if it is not open already
   
   public boolean isOpen(int row, int col) {
   		if (row<=0) throw new IllegalArgumentException();
		if (col<=0) throw new IllegalArgumentException();
   	return (multi[row-1][col-1]!=0);

   }  // is site (row, com) open?

   public boolean isFull(int row, int col) {
	return true;
   } // is site (row, col) full?
   
   public     int numberOfOpenSites()   {
   	int l = multi[0].length;
   	int num = 0;
   	for (int i=0;i<l;i++){
   		for (int j=0;j<l;j++){
   			num = num + multi[i][j];
   		}
   	}

    return num;}    // number of open sites
   public boolean percolates()          {
   return true;}    // does the system percolate?
   public static void main(String[] args) {
   	      // Prints "Hello, World" in the terminal window.
		System.out.println("Hello, World");
		Percolation p = new Percolation(5);
		System.out.println("Size of p is "+(p.multi[0].length+1));
		System.out.println("at 3,2 ="+Integer.toString(p.multi[2][1]));
		p.open(3,2);
		System.out.println("After open at 3,2 ="+Integer.toString(p.multi[2][1]));
		System.out.println("is 2,2 open? "+p.isOpen(2,2));
		System.out.println("is 3,2 open? "+p.isOpen(3,2));
		System.out.println("Number of Open = "+p.numberOfOpenSites());
   	}
   }