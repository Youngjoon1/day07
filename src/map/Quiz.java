package map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;

public class Quiz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		LinkedHashMap<String,Integer> map = new LinkedHashMap<>();
		
		map.put("김밥", 1500);
		map.put("라면", 1000);
		map.put("떡볶이", 2000);
		map.put("순대", 1500);
		Set<String> set = map.keySet();
		boolean bool = true;
		boolean bool2 = true;
		while(bool) {
		System.out.println("1. 메뉴 등록");
		System.out.println("2. 메뉴별 가격 보기");
		System.out.println("3. 종료");
		System.out.print(">>>");
		int me = sc.nextInt();
		
		
		switch(me) {
		case 1 : 
			
			while(true) {
			System.out.println("메뉴 등록 : ");
			String Menu = sc.next();
				if(map.containsKey(Menu)) {
				System.out.println("존재하는 메뉴 입니다.");
				
				}else {
					map.put(Menu, 0);
					break;
				}
			}
		
		
		continue;
		
		case 2 :
			Iterator<String> it = set.iterator();
			while(it.hasNext()) {
				String key = it.next();
				System.out.println(key + " : " + map.get(key));
			}
			
			while(bool2) {
				System.out.print("1.수정 2.삭제 3.나가기");
				int su = sc.nextInt();
				switch(su) {
				case 1 :
					System.out.println("수정할 메뉴를 정해주세요 : ");
					String MENU = sc.next();
					if(map.containsKey(MENU)) {
						System.out.println("수정가능!!!");
						System.out.println("가격을 입력해주세요 : ");
						int price = sc.nextInt();
						map.put(MENU, price);
					}
					continue;
				case 2 : 
					System.out.println("삭제할 메뉴를 정해주세요 : ");
					String MENu = sc.next();
					if(map.containsKey(MENu)) {
						map.remove(MENu);
						
					}else {
						
					}
				case 3 :
					bool2 = false;
					
				}
		continue;		
			}
		case 3 :
			bool = false;
		}
		}
		
	}

}
