package org.add;

public class GreensTech {
	//order
	public void greensOmr(String name, int num) {
		System.out.println("Institute name "+name);
		System.out.println("Number of institute in Chennai "+num);
		}
	public void greensOmr(int h, int j) {
		System.out.println("Number of trainers "+h);
		System.out.println("Number of batches "+j);
	}
	//type
	public void greensOmr(long l) {
		System.out.println("Phone number of the institue "+l);
	}
	public void greensOmr(int i) {
		System.out.println("Number of students being trained "+i);
	}
	//number
	public void greensOmr(String branch) {
		System.out.println("Training  Branch "+branch);
}
	public void greensOmr(float f, int k) {
		System.out.println("Companies with packages starts from "+f);
		System.out.println("Number of students placed "+k);
	}
	public static void main(String[] args) {
		GreensTech g = new GreensTech();
		g.greensOmr(500);
		g.greensOmr(9876543215l);
		g.greensOmr("OMR");
		g.greensOmr(10.5f, 10000);
		g.greensOmr("Greens Technology", 8);
		g.greensOmr(10, 15);
		}
	}
