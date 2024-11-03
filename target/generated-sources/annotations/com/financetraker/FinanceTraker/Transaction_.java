package com.financetraker.FinanceTraker;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Transaction.class)
public abstract class Transaction_ {

	public static volatile SingularAttribute<Transaction, Double> amount;
	public static volatile SingularAttribute<Transaction, Long> id;
	public static volatile SingularAttribute<Transaction, String> type;
	public static volatile SingularAttribute<Transaction, String> category;

	public static final String AMOUNT = "amount";
	public static final String ID = "id";
	public static final String TYPE = "type";
	public static final String CATEGORY = "category";

}

