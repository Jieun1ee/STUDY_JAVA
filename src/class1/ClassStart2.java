package class1;

public class ClassStart2 {
    public static void main(String[] args) {
        //배열로 깔끔하게 해결
        String[] studentNames = {"학생1", "학생2"};
        int[] studentAges = {15, 16};
        int[] studentGrades = {90, 80};

        // 한계 : 데이터를 변경할 때 조심해야 한다. -> 정확하게 제거하는 데에 어려움, 3개의 배열 모두 각각 변경
        // 사람이 관리하기에는 좋은 방법이 아님
        for (int i = 0; i < studentNames.length; i++) {
            System.out.println("이름 : " + studentNames[i] + " 나이 : " + studentAges[i] + " 성적 : " + studentGrades[i]);
        }
    }
}
