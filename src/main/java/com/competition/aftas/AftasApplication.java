package com.competition.aftas;
import com.competition.aftas.domain.Fish;
import com.competition.aftas.domain.Level;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

@SpringBootApplication

public class AftasApplication {

	public static void main(String[] args) {
		SpringApplication.run(AftasApplication.class, args);
	}

//	@Bean
//	public CommandLineRunner loadData(EntityManagerFactory emf) {
//		return args -> {
//			EntityManager em = emf.createEntityManager();
//
//			try {
//				loadSampleData(em);
//			} finally {
//				em.close();
//			}
//		};
//	}
//
//	public static void loadSampleData(EntityManager entityManager) {
//		entityManager.getTransaction().begin();
//
//		try {
//			// Sample Levels
//			Level level1 = Level.builder().code(1).description("Beginner").points(100).build();
//			Level level2 = Level.builder().code(2).description("Intermediate").points(200).build();
//			Level level3 = Level.builder().code(3).description("Advanced").points(300).build();
//
//			entityManager.persist(level1);
//			entityManager.persist(level2);
//			entityManager.persist(level3);
//
//			// Sample Fish
//			Fish fish1 = Fish.builder().name("Trout").averageWeight(2.5).level(level1).build();
//			Fish fish2 = Fish.builder().name("Bass").averageWeight(3.0).level(level2).build();
//			Fish fish3 = Fish.builder().name("Salmon").averageWeight(4.5).level(level3).build();
//			Fish fish4 = Fish.builder().name("Catfish").averageWeight(2.0).level(level1).build();
//			Fish fish5 = Fish.builder().name("Perch").averageWeight(1.8).level(level2).build();
//			Fish fish6 = Fish.builder().name("Pike").averageWeight(5.2).level(level3).build();
//			Fish fish7 = Fish.builder().name("Carp").averageWeight(3.8).level(level1).build();
//			Fish fish8 = Fish.builder().name("Grouper").averageWeight(7.0).level(level3).build();
//
//			entityManager.persist(fish1);
//			entityManager.persist(fish2);
//			entityManager.persist(fish3);
//			entityManager.persist(fish4);
//			entityManager.persist(fish5);
//			entityManager.persist(fish6);
//			entityManager.persist(fish7);
//			entityManager.persist(fish8);
//
//			entityManager.getTransaction().commit();
//		} catch (Exception e) {
//			entityManager.getTransaction().rollback();
//			e.printStackTrace();
//		}
//	}
}
