package spring.mybatis;

import java.io.IOException;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {

	public static void main(String[] args) throws IOException {
		
		ApplicationContext factory = new ClassPathXmlApplicationContext("spring/mybatis/spring-mybatis.xml");
		
		/*String names[] = factory.getBeanDefinitionNames();
		System.out.println("=============================");
		for(String n: names) {
			System.out.println(n);
		}
		
		System.out.println("=============================");
		*/
				
		MemberService service = (MemberService)factory.getBean("service");
		
		//test1 - 리스트 조회 
		List<MemberDTO> list = service.memberlist();
		for(MemberDTO m:list) {
			System.out.println(m.getId() + ":"+m.getPw()+":"+m.getName());
			
		}
		
		//test2 - 조회 int
		//System.out.println("전체 회원 수 : "+ service.membercount());
		
		//test3 - 조회(입력파라미터 존재, 결과 MemberDTO)
		//MemberDTO m = service.onemember("mem1");
		//System.out.println(m.getId() + ":"+m.getPw()+":"+m.getName());
		
		
		//test4 - 페이징처리 리스트 조회
		/*int limit[] = {0,3};
		List<MemberDTO> list = service.paginglist(limit);
		for(MemberDTO m:list) {
			System.out.println(m.getId() + ":"+m.getPw()+":"+m.getName());
			
		}*/
		
		//test5
		/*MemberDTO insertdto = new MemberDTO();
		insertdto.setId("mybatis");
		insertdto.setPw("mybatis");
		insertdto.setName("박대한");
		insertdto.setPhone("01012345678");
		insertdto.setEmail("A@b.com");
		insertdto.setAddress("용산시 용산구");
		service.insertmember(insertdto);
	*/
		
		//test6
		//.id=mybatis, name="박한국" phone=01087654321 email=mybatis@b.com 수정
		//updatemember sql 실행
		/*MemberDTO updatedto = new MemberDTO();
		updatedto.setId("mybatis");
		updatedto.setName("박한국");
		updatedto.setPhone("01087654321");
		updatedto.setEmail("mybatis@b.com");
		service.updatemember(updatedto);
		*/
		
		//test7
		//id mybatis 삭제
		//int row = service.deletemember("mybatis");
		/*
		 * 1.id회원이 작성 글이 있는지 검사
		 * 2.글이 있으면 사용자 탈퇴전에 글도 삭제하시겠습니까? y
		 * 3-1.사용자 탈퇴처리 
		 * 3-2.시용자탈퇴 취소
		 *
		 */
		
		//test8 - map 
		/*HashMap<String, String> map = new HashMap();
		map.put("colname", "id");
		map.put("colvalue","mem1");
		//select * from member where name like '%길동%'
		List<MemberDTO> searchlist = service.searchmember(map);
		for(MemberDTO m: searchlist) {
			System.out.println(m.getId() + ":"+m.getPw()+":"+m.getName() + ":" + m.getEmail() + ":" + m.getPhone());
		}*/
		
		//test9
		/*ArrayList<String> addresslist = new ArrayList();
		addresslist.add("서울시 용산구");
		addresslist.add("제주시 용산구");
		addresslist.add("서울시 중구");
		List<MemberDTO> resultlist = service.addresssearch(addresslist);
		
		for(MemberDTO m: resultlist) {
			System.out.println(m.getId() + ":"+m.getPw()+":"+m.getName() + ":" + m.getEmail() + ":" + m.getPhone() + ":" + m.getAddress());
		}*/
		
		//test10 - 조합+동적조건절 
		/*MemberDTO dto = new MemberDTO();
		dto.setName("박한국");
		dto.setEmail("mybatis@b.com");
		List<MemberDTO> resultlist = service.combination(dto);

		
		for(MemberDTO m: resultlist) {
			System.out.println(m.getId() + ":"+m.getPw()+":"+m.getName() + ":" + m.getEmail() + ":" + m.getPhone() + ":" + m.getAddress());
		}*/
		
		//test11 - join시 resultmap
		/*List<HashMap<String,String>> list = service.memberboard("mem1");
		for(HashMap map: list) {
			Set<String> keys = map.keySet();
			for(String s: keys) {
				System.out.println(s + " : " + map.get(s));
			}
			
		}*/
		
	}

}
