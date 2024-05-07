package ex_240423;

public class KoreanDrama {

	public static void main(String[] args) {
		Drama drama1=new Drama();
		drama1.setDramaName("7인의 탈출");
		drama1.setDramaTime("금/토 오후 10:00");
		drama1.setDramaChannel("SBS");
		
		drama1.showInfo();
		System.out.println(drama1.toString());
		
		System.out.println(Drama.COMMENT);
		String resultString=Drama.COMMENT;
		System.out.println("코멘트 : "+resultString);
		Drama.showComment();
		
		System.out.println("드라마 제목 : "+drama1.getDramaName()+", 방송 시간 : "+drama1.getDramaTime()+", 방송 채널 : "+drama1.getDramaChannel());
		drama1.Characters();
		
		Drama drama2=new Drama("7인의 탈출", "금/토 오후 10:00", "SBS");
		System.out.println("drama2 객체 출력 : "+drama2);
		
	}
	
}
