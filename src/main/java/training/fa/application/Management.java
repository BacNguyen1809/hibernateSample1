/*
	* @author bacng
	* @ Date Jul 17, 2022
*/
package training.fa.application;

import java.util.Set;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import training.fa.model.Employee;

import training.fa.utils.HibernateConnectUtils;

public class Management {
	public static void main(String[] args) {
		createFadb();
	}

	private static void createFadb() {
		SessionFactory sessionFactory = HibernateConnectUtils.getSessionFactory();
		try {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
		Validator validator = validatorFactory.getValidator();
		
		Employee fa = new Employee("Nguyen","");
		Set<ConstraintViolation<Employee>> violations = validator.validate(fa);
		if(violations.size() > 0 ) {
			for (ConstraintViolation<Employee> constraintViolation : violations) {
				System.out.println(constraintViolation.getMessage());
			}
		}else {
			System.out.println("valid");
		}
		session.save(fa);
		session.getTransaction().commit();
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		
	}

}
