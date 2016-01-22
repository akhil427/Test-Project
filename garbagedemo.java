

		class GarbageDemo {
			public static void main(String args[]) {
			int i;
			long a;
			Runtime r = Runtime.getRuntime();
			Long values[] = new Long[200];
			System.out.println("Amount of free Memory" + r.freeMemory());
			r.gc();
			System.out.println("Amount of free memory after creating array is"+ r.freeMemory());
			for (a = 10000, i = 0; i < 200; a++, i++) {
			values[i] = new Long(a);
			}
			System.out.println("amount of free Memory after creating array is:"+ r.freeMemory());
			for (i = 0; i < 200; i++) {
			values[i] = null;
			}
			System.out.println("amount of free Memory after creating array is:"+ r.freeMemory());
			
	}

}
