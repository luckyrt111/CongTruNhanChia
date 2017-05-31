package congtrunhanchia;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by DELL on 05/31/17.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        CongTruNhanChia congTruNhanChia = (CongTruNhanChia) context.getBean("congtrunhanchia");
        System.out.println("Cong: "+congTruNhanChia.cong());
        System.out.println("Tru: "+congTruNhanChia.tru());
        System.out.println("Nhan: "+congTruNhanChia.nhan());
        System.out.println("Chia: "+congTruNhanChia.chia());
    }
}
