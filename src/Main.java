//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(metodo(5));
    }
    public static int metodo(int x){
        return x > 5 ? metodo(x-1):5;
    }
}