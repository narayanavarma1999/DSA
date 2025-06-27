import java.util.ArrayDeque;
import java.util.Deque;

/**
 * LeetCode 901 · Online Stock Span
 *
 * Design a data structure that, given a stream of daily prices,
 * returns the span of each price — the number of consecutive days
 * (ending today) during which the price was <= today's price.
 *
 * Amortised time per call: O(1)
 * Auxiliary space:          O(n)  (worst-case, for n calls)
 */
public class StockSpanner {

    /** Helper pair (price, span) kept on the monotone stack. */
    private static class Pair {
        int price;
        int span;
        Pair(int price, int span) {
            this.price = price;
            this.span  = span;
        }
    }

    private final Deque<Pair> stack;

    /** Constructor – O(1). */
    public StockSpanner() {
        stack = new ArrayDeque<>();
    }

    /**
     * Push today's price and return its span.
     *
     * @param price today's stock price
     * @return span – #consecutive previous days with price <= today's
     */
    public int next(int price) {
        int span = 1;                          // today counts as 1
        // Pop every earlier price that is <= today's price
        while (!stack.isEmpty() && stack.peek().price <= price) {
            span += stack.pop().span;          // absorb its span
        }
        stack.push(new Pair(price, span));     // make today a candidate for future days
        return span;
    }

    /*────────────────────────────── Demo ──────────────────────────────*/

    public static void main(String[] args) {
        StockSpanner ss = new StockSpanner();
        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        System.out.print("prices = ");
        for (int p : prices) System.out.print(p + " ");
        System.out.print("\nspans  = ");
        for (int p : prices) System.out.print(ss.next(p) + " ");
        // Output: spans = 1 1 1 2 1 4 6
    }
}
