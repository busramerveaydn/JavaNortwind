package kodlamaio.northwind.core.utilities.results;

//işlemin başarılı olduğu noktadaki data result burada döndürülecek. 
//burada ne döndüreceğimiz belli değil yani ürün listetsi olabilir, ürün olabilir, kategory vb olabilir.
//bu yüzden generic <T>
public class SuccessDataResult<T> extends DataResult<T>{

	public SuccessDataResult(T data, String message) {
		
		super(data,true, message);//base e bizim true yani success bilgisini göndermemiz gerekiyor.
		
	}
	
//	sadece data döndürmek isteyebiliriz.
	public SuccessDataResult(T data){
		super(data, true);
	}
	
//  sadece mesaj göndermek isteyebiliriz.
	public SuccessDataResult(String message) {
		super(null, true, message);
	}
	
//	hiçbir şey göndermek istemeyebiliriz.
	public SuccessDataResult() {
		super(null, true);
	}

}
