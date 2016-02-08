package zadaci_08_02_2016;

import java.math.BigDecimal;

public class Zadatak5 {
	
	public static void main(String[] args) {

        int count = 0; // counter for 10 nums
        // big decimal format for numbers larger than long.max_value
        BigDecimal num = new BigDecimal(Long.MAX_VALUE).add(BigDecimal.ONE);
        while (count < 10) {
        	// if remainder of dividing by 5 or 6 is 0 print number
            if (num.remainder(new BigDecimal(5)).equals(BigDecimal.ZERO) ||
                num.remainder(new BigDecimal(6)).equals(BigDecimal.ZERO)) {
                count++;
                System.out.println(count+ ".  " +num);
            }
            num = num.add(BigDecimal.ONE);
        }
    }

}
