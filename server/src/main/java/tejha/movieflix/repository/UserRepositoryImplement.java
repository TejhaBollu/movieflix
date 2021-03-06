package tejha.movieflix.repository;

import java.util.List;


import javax.persistence.PersistenceContext;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import tejha.movieflix.entity.User;

@Repository 
public class UserRepositoryImplement implements UserRepository {
 
	@PersistenceContext
	private EntityManager em;
	
	@Override
	
	public List<User> showAllUsers(){
		 TypedQuery<User> query = em.createNamedQuery("User.findAll",User.class);
		 return query.getResultList();
		 
	}
	
	@Override
	public User showOneUser(String uid){
		return em.find(User.class, uid);		 
	
	}
	
	@Override

	public User createUser(User user){
		em.persist(user);
		return user;
	}

	@Override
	
	public User updateUser(User user){
		em.merge(user);
		return user;		
	}
	
	@Override
	public void deleteUser(User user){
		em.remove(user);
	}

}
