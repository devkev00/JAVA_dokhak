package Chapter7.array;

public class ObjectCopy {
    public static void main(String[] args) {

        Book[] bookArray1 = new Book[3];
        Book[] bookArray2 = new Book[3];

        bookArray1[0] = new Book("태백산맥1", "조정래");
        bookArray1[1] = new Book("태백산맥2", "조정래");
        bookArray1[2] = new Book("태백산맥3", "조정래");

        // 깊은 복사
        // 이제 1의 요소를 바꿔도 2는 독립임
        // 서로 다른 인스턴스를 참조하게 되었음
        bookArray2[0] = new Book();
        bookArray2[1] = new Book();
        bookArray2[2] = new Book();

        // 서로 다른 메모리 주소를 출력
        System.out.println(bookArray1);
        System.out.println(bookArray2);

//        System.arraycopy(bookArray1, 0, bookArray2, 0, 3);



        for (int i = 0; i < bookArray1.length; i++) { // 1의 내용을 2에 직접 복사 (할당)
            bookArray2[i].setAuthor(bookArray1[i].getAuthor());
            bookArray2[i].setBookName(bookArray1[i].getBookName());

        }

        // 얕은 복사
        bookArray1[0].setBookName("나목");
        bookArray1[0].setAuthor("박완서");

        for (int i = 0; i < bookArray1.length; i++) {
            bookArray1[i].showBookInfo();
        }

        System.out.println("=====================");
        for (int i = 0; i < bookArray2.length; i++) {
            // bookArray1을 바꿨는데 2도 바뀜
            // 현재 인스턴스는 3개 뿐
            // 두 배열 모두 동일한 인스턴스를 참조하고 있기 때문에, 1에서 객체를 변경하면 2에서도 변경 사항이 반영되는 것
            bookArray2[i].showBookInfo();
        }

        // enhanced for문
        // python, django for문 문법과 비슷하네!!!
        String[] strArr = {"Java", "Android", "C"};

        for (String s : strArr) {
            System.out.println(s);
        }


    }
}
