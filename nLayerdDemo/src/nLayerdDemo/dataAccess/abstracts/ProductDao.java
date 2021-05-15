package nLayerdDemo.dataAccess.abstracts;

import java.util.List;

import nLayerdDemo.entities.concretes.Product;



public interface ProductDao {
		void add(Product product);
		void update(Product product);
		void delete(Product product);
		Product get(int id);
		List<Product> getAll(); // sonradan yeni bir�ey eklememizi sa�lar 
}
