package com.peralta.financenow;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.peralta.financenow.entities.Account;
import com.peralta.financenow.entities.Transaction;
import com.peralta.financenow.entities.User;
import com.peralta.financenow.repositories.AccountRepository;
import com.peralta.financenow.repositories.TransactionRepository;
import com.peralta.financenow.repositories.UserRepository;

@SpringBootApplication
public class FinancenowApplication implements CommandLineRunner{
	
	@Autowired
	UserRepository Urepository;
	
	@Autowired
	AccountRepository Arepository;
	
	@Autowired
	TransactionRepository Trepository;
	
	public static void main(String[] args) {
		SpringApplication.run(FinancenowApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		User user1 = new User("Vinicius Peralta", "vinicius@gmail.com", "123456");
		User user2 = new User("Anna Uchoa", "anna@gmail.com", "654321");
		
		Urepository.save(user1);
		Urepository.save(user2);
		
		Account account1 = new Account(100000.00, "Conta Poupança", "NuBank", user2);
		Account account2 = new Account(50000.00, "Conta Corrente", "Itau", user1);
		
		Arepository.save(account1);
		Arepository.save(account2);
		
		Transaction transaction1 = new Transaction(Date.valueOf("2022-04-01"), "Casa", "Roupa de Cama", 200.00, account1, 800.00);
		Transaction transaction2 = new Transaction(Date.valueOf("2022-04-01"), "Comida", "Lanche Mac", 100.00, account2, 300.00);
		
		Trepository.save(transaction1);
		Trepository.save(transaction2);
	}
}
