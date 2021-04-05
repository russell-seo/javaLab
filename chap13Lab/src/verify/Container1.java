package verify;

public class Container1<T, M>{
			private T name;
			private M job;
			
			public T getKey() {
				return this.name;
			}
			
			public M getValue() {
				return this.job;
			}
			
			public void SetKey(T name) {
				this.name = name;
				
			}
			
			public void setValue(M job) {
				this.job = job;
			}
}
