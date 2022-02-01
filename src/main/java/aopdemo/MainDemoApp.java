package aopdemo;

import aopdemo_dao.AccountDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainDemoApp {

    public static void main(String[] args) {

        // read the spring config java class
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);

        // get the bean from the spring container
        AccountDAO theAccountdao = context.getBean("addAccount", AccountDAO.class);

        // call the business method
        theAccountdao.addAccount();

        // close the context
        context.close();

    }
}
