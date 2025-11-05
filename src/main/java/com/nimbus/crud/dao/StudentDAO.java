package com.nimbus.crud.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.nimbus.crud.config.HibernateUtil;
import com.nimbus.crud.entity.Student;

public class StudentDAO {
    public void create(Student student) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.save(student);
        tx.commit();
        session.close();
    }
    // Add read, update, delete similarly
}
