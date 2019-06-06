package ProjectPackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;


// 과 제
// 이름 : 조 현 중
// 제출일 : 2019.06.06
// 제출기한 : 2019.06.06
// 제출내용 : collection framework를 활용한 출력,추가,갱신,삭제 구현 
// hashmap,iterator를 활용하였으며, scanner를 사용 함.


public class TestProject {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); 							//scanner
		HashMap<String, String> hm = new HashMap<String, String>();			//hashmap
		
		hm.put("이름", "cho");
		hm.put("나이", "28");
		hm.put("거주지", "성남시");
		hm.put("근무지역", "판교");
		
		
		while(true) {
			
			
			int selectNum;
			String optionKey;
			String optionValue;
			String optionKey_1;
			String optionValue_1;
			
			System.out.println("---------------------------------------");
			System.out.println("1. 본인정보 2. 추가항목 3. 갱신사항 4. 삭제항목");
			System.out.println("---------------------------------------");
			System.out.println("번호를 선택하세요 : ");
			
			selectNum = scanner.nextInt();
			
			if (selectNum == 1) { // 본인정보 출력 
				
				Iterator<String> keys = hm.keySet().iterator();
				
				while(keys.hasNext()) {
					String key = keys.next();
					System.out.println(key + ":" + hm.get(key));
				}
				
			} else if (selectNum == 2) { // 추가항목 
				System.out.println("추가항목 선택");
				System.out.println("항목 : ");
				optionKey = scanner.next();
				System.out.println("값 : ");
				optionValue = scanner.next();
				
				hm.put(optionKey, optionValue);
				System.out.println(optionKey + ":" + optionValue + " \n 추 가 ");
							
			} else if (selectNum == 3) { // 갱신사항 
				
				System.out.println("갱신사항 선택");
				System.out.print("항목 : ");
				optionKey = scanner.next();
				System.out.print("갱신항목 : ");
				optionKey_1 = scanner.next();
				System.out.print("값 : ");
				optionValue = scanner.next();
				System.out.print("갱신 예정값 : ");
				optionValue_1= scanner.next();
						
				if(hm.containsKey(optionKey)) {
					hm.remove(optionKey, optionValue);	//삭제 후 
					
					hm.put(optionKey_1, optionValue_1); //새로운 부분 완성.
					System.out.println(optionKey + ":" + optionValue + " 에서 "
							 + optionKey_1 + ":" + optionValue_1 + "으로 \n 갱 신 완 료 ");
				
				} else if (!hm.containsKey(optionValue)) {
					System.out.println("키 값이 존재하지 않습니다. ");
				} else {
					System.out.println("항목이 존재하지 않습니다. ");
				}
				
			} else if (selectNum == 4) { // 삭제항목 
				System.out.println("삭제항목 선택 ");
				System.out.println("삭제항목 :  ");
				optionKey = scanner.next();
				System.out.println("삭제값 : ");
				optionValue = scanner.next();
				
				if(hm.containsKey(optionKey)) {
					System.out.println(optionKey + ":" + optionValue + "\n 삭 제 완 료");
					hm.remove(optionKey, optionValue);
				} else {
					System.out.println("삭제 할 항목이 존재하지 않습니다.");
				}
				
			}
			
		}
		
	}

}
