package es.mdef.et.acing.agnex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AgnexApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(AgnexApplication.class, args);
		UsuarioDAO dao= ctx.getBean(UsuarioDAO.class);
		dao.findById(1);
		//dao.save(entity);
	}

}
