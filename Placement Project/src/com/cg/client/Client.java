package com.cg.client;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import com.cg.entities.Admin;
import com.cg.entities.Placement;
import com.cg.entities.User;
import com.cg.service.IPlacementService;
import com.cg.service.IPlacementServiceImpl;

public class Client {

	public static void main(String[] args)
	{
		/*IPlacementService ips= new IPlacementServiceImpl();
		Placement p=new Placement();
		p.setId(100);
		p.setName("Nishant");
		p.setCollege(null);
		p.setQualification("BCS");
		p.setYear(3);
		p.setDate(null);
		ips.addPlacement(p);*/
		
		
		
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		
		User u=new User();
		u.setId(1);
		u.setName("Rucha");
		u.setPassword("Hello123");
		u.setType("Permanent");
		
		Admin a=new Admin();
	    a.setId(100);
	    a.setName("Manager");
	    a.setPassword("New12");

		em.getTransaction().commit();
		em.close();
		factory.close();
		

		
		
		
		
		

	}

}
