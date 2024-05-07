package ex_240426;

public class BookTest {
	
	public static void inputBook(Book[]bookList, Book book1, Book book2, Book book3) {
		bookList[0] = book1;
		bookList[1] = book2;
		bookList[2] = book3;
	}

	public static void main(String[] args) {
		// Book 인스턴스 3개 만들어주세요.
		// 웹 구조, 
		// 책등록, 관리자, 책 제목, 저자, 가격, 출판사 등. 
		// 화면에서 입력을 받음. DTO 데이터 전달하는 클래스 담아서 전달. 
		// 백엔드 DTO 클래스 하나, 책 한권의 정보랑 동일. 
		// DTO 담은 정보를 , -> DB 넣기. 
		
		//정의 생성자의 매개변수 순서로 작성.
		// Book(String bookName, String bookAuthor, int bookPrice) {
		Book book1 = new Book("Le Petit Prince", "Antonie de Saint-Exupéry", 8821);
		Book book2 = new Book("Le Petit Prince2", "Antonie de Saint-Exupéry2", 8822);
		Book book3 = new Book("Le Petit Prince3", "Antonie de Saint-Exupéry3", 8823);
		
		
		// Book 3개를 받는 배열도 만들어주세요.
		Book[] bookArray = new Book[3];
		
		// 배열에 담아서, 반복문으로 출력해주세요.
		// 추가로, 반복문으로 넣는 방법 모색.
		// 1) new 를 이용해서 
		
//		bookArray[0] = book1;
//		bookArray[1] = book2;
//		bookArray[2] = book3;
				
		//반복문으로 Book 타입의 데이터를 여러개 넣어 보기. 
//		for (int i = 0; i < bookArray.length; i++) {
//			bookArray[i] = new Book("북for입력"+(i+1),"for입력"+(i+1),(i+1)*1000);			
//		}
		
		// 2) 메서드를 만들어서 이용해볼까. 
		inputBook(bookArray,book1,book2,book3);
		
		// 결론, 데이터를 여러개를 한번에 넣는 경우, 테스트용, 더미 데이터 넣을 때, 
		// 실제로 , 책 한권에 한 객체씩 만 들어가는게 원칙. 
		// 게시글, 하나의 게시글이 한 객체 라서, 하나씩 들어 갑니다. 
		// 배열이라서 조금 불편한데, 뒤에 컬렉셔, List 관련을 배우면, 
		// 더 편하게 데이터 추가 및 수정 및 삭제 가능. 해요. 
				
		for (int i = 0; i < bookArray.length; i++) {
			Book receiveBook;
			receiveBook = bookArray[i];
			String resultString = receiveBook.toString();
			System.out.println(resultString);
		}
		
	}

}
