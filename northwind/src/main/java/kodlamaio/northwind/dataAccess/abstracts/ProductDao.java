package kodlamaio.northwind.dataAccess.abstracts;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.northwind.entities.concretes.Product;
import kodlamaio.northwind.entities.dtos.productWithCategoryDto;

public interface ProductDao extends JpaRepository<Product,Integer>{
	
	Product getByProductName(String productName);
//	getby ı gördüğü anda tablodaki ilgili alana göre ver koşulunu verir.
	
	Product getByProductNameAndCategory_CategoryId(String productName, int categoryId);
//	and koşulu olan bir ver koşulu verir.
	
	List<Product> getByProductNameOrCategory_CategoryId(String productName, int categoryId);
//	ikisindn birisinin olması yeterli or kullandığımız için
	
	List<Product> getByCategoryIn(List<Integer> categories);
//  integer türünden kategori id ler getir.
	
	List<Product> getByProductNameContains(String productName);
//	ürün ismine göre arama yapıp olanları getirir.
	
	List<Product> getByProductNameStartsWith(String productName);
//	verilen isimle başlayanları getir.
	
//	jpql ile yazdık(java için sql)
	
	@Query("From Product where productName=:productName and category.categoryId=:categoryId") 
	List<Product> getByNameAndCategory(String productName, int categoryId);
	
	@Query("Select new kodlamaio.northwind.entities.dtos.productWithCategoryDto(p.id, p.productName, c.categoryName) From Category c Inner Join c.products p")
	List<productWithCategoryDto> getProductWithCategoryDetails();
//	select * from Category c inner join Product p
//	on c.categoryId = p.categoryId nin jpql ini yazdık
}
