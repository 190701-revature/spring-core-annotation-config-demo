package com.revature;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

import com.revature.beans.Store;
import com.revature.inheritence.Animal;
import com.revature.inheritence.Bird;

/*
 * @Component annotation is used to define that Spring should be able to manager
 * this class as a bean.  @Component is considered one of springs 'stereotype' 
 * annotations, as it defines the entire class definition as a bean definition.
 * 
 * @Autowired - Expresses that values can be autowired using spring to 
 * get any required beans that the @Component requires.
 */
@Configuration
public class Application {
	public static void main(String[] args) {
		ApplicationContext applicationContext =
				new AnnotationConfigApplicationContext("com.revature");
		
//		
//		Store store = applicationContext.getBean(Store.class);
//		System.out.println(store);
//		
//		System.out.println(store.getProduct().getSupplier().getTrucks().getRoads().getTaxes().getStore());
		
//		A a = applicationContext.getBean(A.class);
		
		Bird bird = applicationContext.getBean(Bird.class);
		System.out.println(bird);
		
		Animal animal = applicationContext.getBean(Animal.class);
		System.out.println(animal);
	}
}
