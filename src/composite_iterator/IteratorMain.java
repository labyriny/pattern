package composite_iterator;

/**
 * Created by user on 2017-01-13.
 */
public class IteratorMain {
    public static void main(String[] args) {
        // 가맹점관리 데이터 셋팅
        MenuComponent merchantManagement = new Directory("0002", "가맹점관리", true);
        MenuComponent merchantView = new Link("0003", "가맹점조회", "/merchant", true);
        MenuComponent merchantStatusView = new Link("0004", "가맹점상태조회", "/merchant/status", true);

        merchantManagement.add(merchantView);
        merchantManagement.add(merchantStatusView);

        // 개발자도구 데이터 셋팅
        MenuComponent developerManagement = new Directory("005", "개발자도구", false);
        MenuComponent articleManagement = new Directory("006", "게시글관리", false);
        MenuComponent notice = new Link("007", "공지사항", "/developer/article/notice", false);
        MenuComponent qna = new Link("008", "Q&A", "/developer/article/qna", false);

        articleManagement.add(notice);
        articleManagement.add(qna);
        developerManagement.add(articleManagement);

        // root 적용
        MenuComponent root = new Directory("0001", "LPA", true);
        root.add(merchantManagement);
        root.add(developerManagement);

        // 메뉴 호출
        IteratorUser iteratorUser = new IteratorUser(root);
        System.out.println("=========all menu with iterator(외부반복)=========");
        iteratorUser.printMenu();

        //
        System.out.println("=========is private with iterator(외부반복)=========");
        iteratorUser.printPrivateMenu();
    }
}
