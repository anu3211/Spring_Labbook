package org.cap.dao;

import java.util.List;

import org.cap.entities.Trainee;

public interface ITraineeDao {
	void addTrainee(Trainee trainee);
	void deleteTrainee(Trainee trainee);
	void updateTrainee(Trainee trainee);
	Trainee retrieveTrainee(int id);
	List<Trainee> retrieveAll();
	public boolean loginVerify(String username,String password);
}
