package pl.cg.exercise;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {

    public static void main(String[] args) {
        Session session = DatabaseHelper.getSessionFactory().openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            User tasks = new User("Tasks");
            User user1 = new User("User1");
            User user2 = new User("User2");
            User user3 = new User("User3");

        } catch (HibernateException he) {
            transaction.rollback();
            he.printStackTrace();
        } finally {
            session.close();
        }
    }
}
