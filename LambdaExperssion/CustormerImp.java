package LambdaExperssion;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CustormerImp {
	public static void main(String[] args) {
	       ArrayList<Customer> al = new ArrayList<>(); 
	       al.add(new Customer(1, "Aryan", 27000));
	       al.add(new Customer(2, "Bina", 37000));
	       al.add(new Customer(3, "karan", 47000));
	       al.add(new Customer(4, "Deepak", 57000));
	       
	       List<Customer> collect = al.stream().filter((cust)->cust.custBill()>30000).collect(Collectors.toList());
	       System.out.println(collect);
	}

}
