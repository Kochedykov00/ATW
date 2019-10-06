package ru.kfpu.itis.group801.Kochedykov.basicClasses;

import java.util.Scanner;

public class Game {
	public static void main(String [] args) {
	
		Player p1 = new Player("Vasya",100);
		Player p2 = new Player("Petya",100);
		Scanner sc = new Scanner(System.in);
			while (p1.hp > 0 & p2.hp > 0) {
				System.out.print("Hit of Vasya : ");
				int power1 = sc.nextInt();
				double ch1 = sc.nextDouble();
				p1.hit(p2, power1, ch1);
				System.out.println();
				System.out.print("Hit of Petya : ");
				int power2 = sc.nextInt();
				double ch2 = sc.nextDouble();
				p2.hit(p, power1, ch1);
				System.out.println();
			}
			if (p1.hp > p2.hp) {
				System.out.println("Vasya is winner . You has " + " " + p1.getHp() + " health points");
			}
			else {
				System.out.println("Petya is winner . You has " + " " + p2.getHp() + " health points");
			}
	}
}
				
				
	