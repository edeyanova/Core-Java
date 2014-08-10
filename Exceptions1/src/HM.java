import java.util.HashMap;


public class HM<V,K> extends HashMap<K,V> {
	private boolean option;
	public HM(boolean flag){
		this.option=true;
	}
	public HM(){
		this.option=false;
	}
	
	public V put(K key, V value){
		if(this.option){
			return super.put(key, value);
		}
		else {
			if(key.equals(null)){
				throw new NullKeyException();
			}
			return super.put(key, value);
		}
	}
	public V get(Object key){
		if(this.option){
		return super.get(key);
		}
		else{
			if(key.equals(null)){
				throw new NullKeyException();
			}
			return super.get(key);
		}
		
	}
}
