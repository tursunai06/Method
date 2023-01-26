import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        if(name == "on"){
            System.out.println("Samsung Smart TV");
        }else {
            System.out.println("Error");
        }
    }

    public static void myMethod(){
        Scanner scanner = new Scanner(System.in);
        int canal = scanner.nextInt();
        switch (canal ){
            case 1:
                System.out.println("КТРК - Ала-Тоо24");
                break;
            case 2:
                System.out.println("КТРК - Спорт");
                break;
            case 3:
                System.out.println("КТРК - Mузыка");
              break;
            case 4:
                System.out.println("КТРК - Баластан ");
                break;
            case 5:
                System.out.println("ЭЛТР");
                break;
            case 6:
                System.out.println("5канал");
                break;
            case 7:
                System.out.println("НТС");
                break;
            case 8:
                System.out.println("Маданият-Тарых-Тил");
                break;
            case 9:
                System.out.println("7канал");
                break;
            case 10:
                System.out.println("НТВ");
                break;
            default:
                System.out.println("tamam");
                
        }
        }

    }





//        myFirstVoidMethod();
//        Scanner scanner = new Scanner(System.in);
//        int number = scanner.nextInt();
//        if (number == 1) {
//            hello();
//
//        } else if (number == 2) {
//            bye();
//
//        } else
//            System.out.println("error");
//    }
//
//    public static void hello() {
//        System.out.println("Hello");
//    }
//


//    public static void bye() {
//        System.out.println("");
//
//    }

//    public static void myFirstVoidMethod() {
//        System.out.println("Бул менин биринчи методум");




    }




