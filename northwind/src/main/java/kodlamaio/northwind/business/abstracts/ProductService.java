package kodlamaio.northwind.business.abstracts;

import java.util.List;


import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.entities.concretes.Product;
// burada işlem başarılımı değilmi bilmiyoruz.
// belkide listeyi döndürmeyecez bir doğrulama hatası vardır ve o datayı döndürücez
// dolayısıyla burada list of product(List<Product> getAll();) yerine başıan dataResult koyarız.
import kodlamaio.northwind.entities.dtos.productWithCategoryDto;

public interface ProductService {
	
	DataResult<List<Product>>  getAll();
	
//	sayfalama için(71 ile 79 arası)
	DataResult<List<Product>>  getAll(int pageNo, int pageSize);
	
//	sıralama yapmak için
	DataResult<List<Product>>  getAllSorted();
	
	Result add(Product product);
	
	DataResult<Product> getByProductName(String productName);
	
	DataResult<Product> getByProductNameAndCategory(String productName, int categoryId);//	and koşulu olan bir ver koşulu verir.
	
	DataResult<List<Product>> getByProductNameOrCategory(String productName, int categoryId);
	
	DataResult<List<Product>> getByCategoryIn(List<Integer> categories);
	
	DataResult<List<Product>> getByProductNameContains(String productName);
	
	DataResult<List<Product>> getByProductNameStartsWith(String productName);
	
	DataResult<List<Product>> getByNameAndCategory(String productName, int categoryId);
	
	DataResult<List<productWithCategoryDto>> getProductWithCategoryDetails();
	
}
