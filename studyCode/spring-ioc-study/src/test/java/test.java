import com.boshen.dao.UserDaoImpl;
import com.boshen.service.UserService;
import com.boshen.service.UserServiceIMPL;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args) {
//        UserService service = new UserServiceIMPL();
//        ((UserServiceIMPL) service).setDao(new UserDaoImpl());
//        service.getUser();

        /*第二课spring改进*/
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserServiceIMPL service =(UserServiceIMPL) context.getBean("service");
        service.getUser();
    }
}
