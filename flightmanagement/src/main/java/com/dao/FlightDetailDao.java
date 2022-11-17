package com.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entity.Flightdetail;
import com.utill.HibernateUtil;


public class FlightDetailDao {
    public void saveInstructorDetail( Flightdetail  flightdetail) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // save the student object
            session.save(flightdetail);
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

 

    public void updateInstructorDetail(Flightdetail flightdetail) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // save the student object
            session.update(flightdetail);
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

 

    public Flightdetail getFlightdetail(int id) {

 

        Transaction transaction = null;
        Flightdetail flight = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // get an Flight object
            flight = session.get(Flightdetail.class, id);
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return flight;
    }
}