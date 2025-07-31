package homework;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Review9 {
    public static void main(String[] args)throws IOException {
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    System.out.println("名前を入力してください");
    String inputname = br.readLine();
    System.out.println("年齢を入力してください");
    int ago = Integer.parseInt(br.readLine());

    System.out.println(""+ago+"の"+inputname+"さん");
    }
}