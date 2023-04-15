package review4;
public class Repl68OriginalProblemAnswer {
    public static void main(String[] args) {
        int flag=0;
        for(int i = 1; i<=4; i++){
            int div=i/2;
            if(i==1){
                System.out.println("$$$$");

            }else {
                for(int k=2;k<=div; k++){
                    if(i%k==0){
                        System.out.println("$$$$");
                        flag=1;
                        break;
                    }
                }if(flag==0){
                    System.out.println("$  $");
                }
            }
            System.out.println();
        }
            }
        }
