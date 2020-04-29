package org.cap.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.cap.dao.ITraineeDao;
import org.cap.dao.TraineeDaoImpl;
import org.cap.entities.Trainee;
import org.cap.exceptions.InvalidId;
import org.cap.exceptions.TraineeDoesnotExist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class TraineeServiceImpl implements ITraineeService{

	private ITraineeDao traineeDao;
	
	public ITraineeDao getTraineeDao() {
		return traineeDao;
	}
	
	@Autowired
	public void setTraineeDao(ITraineeDao traineeDao) {
		this.traineeDao = traineeDao;
	}

	@Override
	public void addTrainee(Trainee trainee) {
		if(traineeDao.retrieveTrainee(trainee.getTraineeId())==null) {
		traineeDao.addTrainee(trainee);
		}
		else {
			throw new InvalidId("Invalid Id");
		}
	}

	@Override
	public void deleteTrainee(Trainee trainee) {
		traineeDao.deleteTrainee(trainee);
	}

	@Override
	public void updateTrainee(Trainee trainee) {
		traineeDao.updateTrainee(trainee);
		
	}

	@Override
	public Trainee retrieveTrainee(int id) {
		Trainee trainee = traineeDao.retrieveTrainee(id);
		if(trainee==null) {
			throw new TraineeDoesnotExist("TraineeDoesnotExist");
		}
		return trainee;
	}

	@Override
	public List<Trainee> retrieveAll() {
		List<Trainee> list = traineeDao.retrieveAll();
		return list;
	}
	@Override
	public boolean loginVerify(String username,String password) {
		boolean login = traineeDao.loginVerify(username,password);
		return login;
	}


}
