package com.devsuperior.desafioComponentes;

import com.devsuperior.desafioComponentes.entities.Order;
import com.devsuperior.desafioComponentes.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class DesafioComponentesApplication implements CommandLineRunner {

	@Autowired
	private OrderService orderService;

	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		SpringApplication.run(DesafioComponentesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {


		Order order = new Order(1034, 200.00, 20.0);
		System.out.printf("Pedido código %d%nValor Total: R$ %.2f%n", order.getCode(), orderService.total(order));

	}
}
