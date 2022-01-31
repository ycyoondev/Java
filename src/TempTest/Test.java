package TempTest;

class People{

    public void printInfo() {
        System.out.println("나는 사람입니다.");
    }
}


class Man extends People{
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("그리고 나는 남자입니다.");
    }

    public void enlist() {
        System.out.println("내일 군대를 갑니다.");
        System.out.println("충성!");
    }

}
class Woman extends People{
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("그리고 나는 여자입니다.");
    }

    public void makeUp() {
        System.out.println("예뻐질 거랍니다.");
        System.out.println("톡톡 촵촵!");
    }
}

public class Test {
    public static void main(String[] args) {
        People people=new Man();
        people.printInfo();
        ((Man)people).enlist();

        System.out.println("---");

        people=new Woman();
        people.printInfo();
        ((Woman)people).makeUp();

    }
}
