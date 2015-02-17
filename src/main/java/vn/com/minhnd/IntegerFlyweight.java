package vn.com.minhnd;

import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;

import org.junit.Test;

public class IntegerFlyweight {
	
	@Test
	public void sameIntegerInstances() {
		final Integer a = Integer.valueOf(56);
		final Integer b = Integer.valueOf(56);
		
		assertSame(a, b);
		final Integer c = Integer.valueOf(128);
		final Integer d = Integer.valueOf(128);
		
		 Integer e = Integer.valueOf(472);
		 Integer f = Integer.valueOf(472);
//		System.out.println(e.compareTo(f));
//		System.out.println(f.toString());
		
		//assertSame(c, d);
		
		//assertSame(e, f);
		Integer g = Integer.valueOf(1);
		Integer h = Integer.valueOf(1);
		Integer i = Integer.valueOf(1);
		Integer j = Integer.valueOf(1);
		//assertNotSame(g, h);
		assertSame(h, i);
		assertSame(i, j);
		
		Integer x = Integer.valueOf("300");
		Integer y = Integer.valueOf("300");
		assertSame(x, y);
		/**
		 * Returns an Integer instance representing the specified int value. If a new Integer instance is not required,
		 * this method should generally be used in preference to the constructor Integer(int),
		 * as this method is likely to yield significantly better space and time performance
		 * by caching frequently requested values.
		 * This method will always cache values in the range -128 to 127, inclusive,
		 * and may cache other values outside of this range.
			Parameters:
			i an int value.
			Returns:
			an Integer instance representing i.
		 * */
		
	}
	
	/**Tại sao lại không bằng nhỉ
	 * If we look at the source for valueOf, we can get a hint: Source of java.lang.Integer lines 638-643:
	 * nếu giá trị trong khoảng -128 đến 127, thì giá về giá trị đã lưu trong cache trước đó, nếu dòng 58
	 * ngoài khoảng, thì câu lệnh a = new Integer(128);
	 * b = new Ingeger(128);
	 * hai đối tượng a vs b là khác nhau khi so sánh đối tượng, nhưng có cùng một giá trị là 128.
	 * lý do hashCode() vs equal();
	 * */
	/*	public static Integer valueOf(int i) {
			assert IntegerCache.high >= 127;
			if (i >= IntegerCache.low && i <= IntegerCache.high)
				return IntegerCache.cache[i + (-IntegerCache.low)];
			return new Integer(i);
		}*/
	/**
	 * It looks like the Integer class maintains a cache of Integer objects for common values.
	 * Rather than make a new one every time somebody asks for valueOf, it just returns a reference to one that already exists.
	 * Therefore, if you call Integer.valueOf(1) multiple times,
	 * you'll end up getting the same object back every time (not just equivalent objects).
	 * */
}
