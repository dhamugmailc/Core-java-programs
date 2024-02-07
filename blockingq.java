package collection;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class blockingq {

	public static void main(String[] args) throws InterruptedException {
		BlockingQueue<String> bq= new ArrayBlockingQueue<>(3);
        bq.put("dhamu");
        bq.put("arun");
        bq.put("dhivan");
        System.out.println(bq.take());
        System.out.println(bq.take());
        System.out.println(bq.take());
	}

}
