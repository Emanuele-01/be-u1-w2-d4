package Main;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
	private static Logger logger = (Logger) LoggerFactory.getLogger(Main.class);

	public static void main(String[] args) {
		
		// prodotti
		
		ArrayList<product> prodotti = new ArrayList<product>();
		
		product prodotto1 = new product(123456, "MacBook Pro", "Elettronica",1299.00);
		
		product prodotto2 = new product(789012, "Nike Air Max", "Abbigliamento", 150.00);
		
		product prodotto3 = new product(345678, "Samsung Galaxy S21", "Elettronica", 799.00);
		
		product prodotto4 = new product(901234, "Sony WH-1000XM4", "Elettronica", 349.00);
		
		product prodotto5 = new product(567890, "Canon EOS R5", "Fotografia", 3899.00);
		
		product prodotto6 = new product(234567, "Adidas Ultraboost", "Abbigliamento", 180.00);
		
		product prodotto7 = new product(890123, "Apple Watch Series 6", "Elettronica", 399.00);
		
		product prodotto8 = new product(456789, "Google Pixel 5", "Elettronica", 699.00);
		
		product prodotto9 = new product(246810 , "Sapiens: A Brief History of Humankind", "Books", 144.99);
		
		product prodotto10 = new product(135791 , "Becoming", "Books", 188.99);
		
		prodotti.add(prodotto1);
		prodotti.add(prodotto2);
		prodotti.add(prodotto3);
		prodotti.add(prodotto4);
		prodotti.add(prodotto5);
		prodotti.add(prodotto6);
		prodotti.add(prodotto7);
		prodotti.add(prodotto8);
		prodotti.add(prodotto9);
		prodotti.add(prodotto10);
		
		List<String> ricercaBooks = prodotti.stream().filter(book -> book.getNameCategory().equals("Books")).filter(price -> price.getPrice() > 100.00).map(product::getNameProduct).toList();
		System.out.println("i libri che costano più di 100 euro sono: " + ricercaBooks);
		
		
		// persone
		
		custumer person = new custumer(987654, "Alice", 3245);
		
		custumer person2 = new custumer(234567, "Bob", 4687);
		
		custumer person3 = new custumer(876543, "Charlie", 7098);
		
		custumer person4 = new custumer(345678, "Dave", 1567);
		
		custumer person5 = new custumer(765432, "Emily", 8312);
		
		//ordini
		
				order ordine1 = new order(543210, "ok", "22.01.2010", "29.01.2010", prodotto1, person);
				order ordine2 = new order(987654, "error", "08.09.2012", "--", prodotto1, person);
				order ordine3 = new order(246810, "ok", "14.04.2016", "21.04.2016", prodotto1, person);
				order ordine4 = new order(135790, "ok", "03.11.2019", "10.11.2019", prodotto1, person);
				order ordine5 = new order(666999, "error", "28.02.2022", "--", prodotto1, person);
		
	}

}
