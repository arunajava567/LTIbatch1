package service;

import java.util.List;
import java.util.Map;

import dto.Product;

//LoginService   , validateUser    id ='capgemini" pwd="capgemini"

public interface ProductService {

	boolean validateAllProducts(Map<Integer,Product> pmap);

}