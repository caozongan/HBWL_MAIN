import com.hbwl.dbc.DB_Pos_170_DAO;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

/**
 * Created by cza 2021-01-13 22:06
 */
public class PgTest {
    @Test
    public void test2021010603(){
        Session session1 = DB_Pos_170_DAO.getSession();
        Transaction tx1 = session1.beginTransaction();
        String hql="SELECT * from public.z100002_promote_sp('2021-01-09','2021-01-11');";

        try {
            Query query = session1.createSQLQuery(hql);
            System.out.println(query.list().size());

        } catch (Exception e) {
            e.printStackTrace();
            // TODO: handle exception
        }
    }
}
