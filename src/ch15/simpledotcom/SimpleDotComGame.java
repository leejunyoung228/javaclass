package ch15.simpledotcom;

public class SimpleDotComGame {
    public static void main(String[] args) {
//        1. SimpleDotCom 클래스의 인스턴스 만들기
        SimpleDotCom simpleDotCom = new SimpleDotCom();
//        2. 위치 대입하기
        int[] location = {2, 3, 4};
        simpleDotCom.setLocation(location);
//        3. 사용자가 추측한 위치를 나타내는 String 변수 선언
        GameHelper gameHelper = new GameHelper();
        String guess = gameHelper.getUserInput("input data : ");
//        4. 3단계에서 만든 변수 전달 : checkYourself()
        String result = simpleDotCom.checkYourself(guess);
//        5. 결과 출력 (hit / miss / kill)
        System.out.println(result);
    }
}
