public class App {
    public static void main(String[] args) throws Exception {
        int max = 5;
        int x = 1;
        while (x<=max){
            String num = Integer.toString(x);
            String line = "";
            for(int i=0;i<x;i++){
                line +=num;
            }
            System.out.println(line);
            x++;
        }
    }
}
