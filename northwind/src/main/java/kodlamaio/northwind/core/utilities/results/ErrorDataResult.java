package kodlamaio.northwind.core.utilities.results;

public class ErrorDataResult<T> extends DataResult<T>{
//	burada data olarak temel boş bir şablonda döndğrebiliriz.
//	frontend cinin uygulaması patlamasın diye
	
	public ErrorDataResult(T data, String message) {
		//base e bizim true yani success bilgisini göndermemiz gerekiyor.
		super(data,false, message);
		
	}
	
//	sadece data döndürmek isteyebiliriz.
	public ErrorDataResult(T data){
		super(data, false);
	}
	
//  sadece mesaj göndermek isteyebiliriz.
	public ErrorDataResult(String message) {
		super(null, false, message);
	}
	
//	hiçbir şey göndermek istemeyebiliriz.
	public ErrorDataResult() {
		super(null, false);
	}

}

