package commandPattern;

import java.util.Scanner;



public class ChalkStock {
	
	   private String name;
	   public void setName(String name) {
		   this.name=name;
	   }
		public static void makeChalks(String color) {
			System.out.println("Welcome to Chalk Factory.\nWe are making your color chalks with color:"+color);
			 try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 System.out.println("Your "+color+" chalks are ready.Please collect from delivery Section");
				 
		}
		public static void makeBoard(String color) {
			System.out.println("Welcome to Chalk Factory.\nWe are making your color board with color:"+color);
			 try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 System.out.println("Your "+color+" board is ready.Please collect from delivery Section");
				
		}
		public static void makeSideWalkBoard(String content) {
		System.out.println("Welcome to Chalk Factory.\nWe are making your sidewalk board with given content.\nContent:"+content);
			 try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 System.out.println("Your sidewalk board is ready.Please collect from delivery Section");
				
		}
		
		public void buy() {
			Scanner sc=new Scanner(System.in);
			System.out.println("Welcome to Chalk Enterprises");
				System.out.println("Select your service:\n"
						+ "1.Make Chalk\n"
						+ "2.Make Board\n"
						+ "3.Make Side Walk Board\n");
				int num=sc.nextInt();
				switch(num) {
				case 1:{
					System.out.println("Enter Chalk color");
					makeChalks(sc.next());
					break;
				}
				case 2:{
					System.out.println("Enter Board color");
					makeBoard(sc.next());
					break;
				}
				case 3:{
					sc.nextLine();
					System.out.println("Enter SideWalk Board content");
					
					String con=sc.nextLine();
					makeSideWalkBoard(con);
					break;
				}
					
				
				}
				
				
			
		}
		public void sell() {
			System.out.println("Chalk Factory is selling Chalks,Boards,SideWalkBoards.");
		}
		
	}