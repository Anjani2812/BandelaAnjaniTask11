package Epam.Task11;
	import java.util.Arrays;
	import java.util.IntSummaryStatistics;
	import java.util.List;

	public class Average{

		public static void main(String[] args) {
			List<Integer> number = Arrays.asList(20, 30, 45, 57, 101, 130, 107, 219, 223, 229); 
			IntSummaryStatistics stats = number.stream().mapToInt((x) -> x).summaryStatistics();
			System.out.println("Average of all numbers : " + stats.getAverage());
		}
	}


