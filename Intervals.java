
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
//time n+logn   space-o(1)
public class Intervals {

	static class Interval {

		int start, end;

		public Interval(int strt, int end) {
			// TODO Auto-generated constructor stub
			this.start = strt;
			this.end = end;
		}
	}

	public static void main(String[] args) {

		List<Interval> input = new ArrayList<>();

		input.add(new Interval(1, 2));
		input.add(new Interval(3, 7));
		input.add(new Interval(4, 6));
		input.add(new Interval(11, 12));
		input.add(new Interval(12, 21));

	/*	Collections.sort(input, new Comparator<Interval>() {
			@Override
			public int compare(Interval o1, Interval o2) {
				return o1.start - o2.start;
			}

		});*/

		Collections.sort(input,(a,b)-> a.start-b.start);
		
		Interval itr = null;
		int starPointer=0,endPointer=0;
		Map<Integer,Integer> oMAp = new HashMap<>();
		for(int i=0;i<input.size();i++) {
			itr = input.get(i);
			if(i==0) {
				starPointer=itr.start;
				endPointer=itr.end;
			}else if(endPointer>=itr.start) {
				endPointer = itr.end<endPointer?endPointer:itr.end;
			
			}else {
				starPointer=itr.start;
				endPointer=itr.end;
			}
			
			oMAp.put(starPointer, endPointer);
		}
		System.out.println(oMAp);
		
		oMAp.entrySet().stream().forEach(m->System.out.println(m.getKey()+","+m.getValue()));
	}
}
