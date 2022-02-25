package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entites.Department;
import model.entites.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("--- Test 1: Seller findById ---");
	
		Seller seller = sellerDao.findById(3);
		
		System.out.println(seller);
		
		System.out.println("\n--- Test 2: Seller findByDepartment ---");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for(Seller obj : list) {
			System.out.println(obj);
		}
		System.out.println("\n--- Test 3: Seller findByDepartment ---");
		list = sellerDao.findAll();
		for(Seller obj : list) {
			System.out.println(obj);
		}
	}
	

}
