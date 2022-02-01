package aopdemo_dao;

import org.springframework.stereotype.Component;

@Component
public class AccountDAO {


    AccountDAO accountDAO(){
        return new AccountDAO();
    }

    public void addAccount(){
        System.out.println( getClass() + " : DOING MY DB WORK: ADDING AN ACCOUNT" );
    }

}
