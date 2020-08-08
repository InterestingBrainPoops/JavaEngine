package hello;
//import org.joda.time.LocalTime;
import com.aparapi.Kernel;
public class Engine {
	public static void main(String[] args) {
		final int size = 2048;

		final float[] a = new float[size];
		final float[] b = new float[size];
  
		for (int i = 0; i < size; i++) {
		   a[i] = (float) (Math.random() * 100);
		   b[i] = (float) (Math.random() * 100);
		}
  
		final float[] sum = new float[size];
  
		Kernel kernel = new Kernel(){
		   @Override public void run() {
			  int gid = getGlobalId();
			  sum[gid] = a[gid] + b[gid];
		   }
		};
  
		kernel.execute(size);
  
		for (int i = 0; i < size; i++) {
		   System.out.printf("%6.2f + %6.2f = %8.2f\n", a[i], b[i], sum[i]);
		}
  
		kernel.dispose();
	 
	}
  
}
