class Main {
	public static void main (String[] args) {
		int[] arr = { 5, 4, 1, 2, 3 };
		int i;

		int sum = 0;
		for (i = 0; i < arr.length; i += 1) sum += arr[i];
		System.out.println(sum);

		i = 0;
		int sum1 = 0;
		while (i++ < arr.length) sum1 += arr[i - 1];
		System.out.println(sum1);

		i = 0;
		int sum2 = 0;
		do sum2 += arr[i]; while (++i < arr.length);
		System.out.println(sum2);
	}
}