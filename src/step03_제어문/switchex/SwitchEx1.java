package step03_제어문.switchex;

public class SwitchEx1 {
    public static void main(String[] args) {

        // if문 형태----------------
        char sw='g';

        if(sw=='E' || sw=='e'){
            System.out.println("excellent");
        }else if(sw=='G' || sw=='g'){
            System.out.println("good");
        }else {
            System.out.println("fail");
        }

        // switch-case 형태
        char sw2='G';

        switch(sw){
            case 'E':
            case 'e': System.out.println("excellent");
            case 'G':
            case 'g' : System.out.println("good"); break;
            default: System.out.println("fail");
        }

        //--------------------------------------
        int score=95;
        char g

    }
}
