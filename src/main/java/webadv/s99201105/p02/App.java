package webadv.s99201105.p02;

import org.apache.commons.codec.digest.DigestUtils;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String account = "17204213";
        String password = "12345";
        String lockpw = sha256hex(password);
        System.out.println("账号：");
        Scanner in = new Scanner(System.in);
        String myAccount =  in.next();
        System.out.println("密码：");
        String myPassword =  in.next();
        String lockMyPw = sha256hex(myPassword);
        if(account.equals(myAccount)&&lockpw.equals(lockMyPw)){
            System.out.println("登录成功");
        }else {
            System.out.println("登录失败");
        }

        if (args.length < 1) {
            System.err.println("Please provide an input!");
            System.exit(0);
        }
        System.out.println(sha256hex(args[0]));
    }
    public static String sha256hex(String input) {
        return DigestUtils.sha256Hex(input);
    }
}

