package com.sda.weather.backend;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class LocalizationRepositoryImpl implements LocalizationRepository {

    @Override
    public Localizations saveLocalization(Localizations localizations) {
        SessionFactory sessionFactory = HibernatesUtils.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.persist(localizations);

        transaction.commit();
        session.close();

        return localizations;
    }
}
