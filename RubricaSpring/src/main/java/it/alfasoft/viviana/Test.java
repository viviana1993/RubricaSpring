package it.alfasoft.viviana;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		
		
		ApplicationContext cont=new ClassPathXmlApplicationContext("spring.xml");
		Rubrica r=(Rubrica) cont.getBean("rubrica");
		Voce v=r.getVoceConNome("aaa");
		
		System.out.println("Voglio prendere la voce con nome 'aaa'\n"+v.getNome()+" "+v.getTelefono());
		
		System.out.println("Voglio stampare l'intera lista\n"+v.getNome()+" "+v.getTelefono());
		List <Voce> listaVoci=r.getVoci();
		
		for(Voce vx:listaVoci){
			System.out.println(vx.getNome()+" "+vx.getTelefono());
		}
		
		
	}

}
