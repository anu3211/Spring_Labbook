package org.cap.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.cap.entities.Trainee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TraineeDaoImpl implements ITraineeDao{

	private EntityManager entityManager;
	
	public EntityManager getEntityManager() {
		return entityManager;
	}
	@PersistenceContext
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	public void addTrainee(Trainee trainee) {
		entityManager.persist(trainee);
	}

	@Override
	public void deleteTrainee(Trainee trainee) {
		entityManager.remove(entityManager.find(Trainee.class, trainee.getTraineeId()));
		
	}

	@Override
	public void updateTrainee(Trainee trainee) {
		entityManager.merge(trainee);
		
	}

	@Override
	public Trainee retrieveTrainee(int id) {
		Trainee trainee = entityManager.find(Trainee.class, id);
		return trainee;
	}

	@Override
	public List<Trainee> retrieveAll() {
		  String jql = "from Trainee";
	      TypedQuery<Trainee> query = entityManager.createQuery(jql, Trainee.class);
	      List<Trainee> list = query.getResultList();
	      return list;
	}
	
	public boolean loginVerify(String username,String password) {
		
		if(username.equals("anubhav@3211") || password.equals("anubhav")) {
			return true;
		}
	
		return false;
	}
	
}
