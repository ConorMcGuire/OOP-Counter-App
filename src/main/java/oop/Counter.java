package oop;

// Counter is a simulation of a "click-counter" device that
// is used to count people passing through an entrance etc.
// Each click will add one to the counter's count

public class Counter {
    private int count;  // current count , initially 0
    private int limit;

    // Constructor
    public Counter(int limit) {
        this.limit = limit; // 'this.' distinguishes field from parameter
        System.out.println("Counter constructor called, limit set to " + limit);
    }

    public Counter() {   // no-argument (default) constructor
        limit = 10;
    }

    public int getCount() {
        return this.count;
    }

    /**
     * click() increments the value of this counter by 1.
     */
    public void click() {
        if (count < limit) {
            count = count + 1;
        } else {
            System.out.println("Limit Reached");
        }
        System.out.println("Counter clicked! count = " + count);
    }

    public void reset()
    {
        this.count = 0;
        System.out.println("Counter is reset to 0");
    }

    public void undo()
    {
        if (count > 0) {
            count -= 1;
            System.out.println("Undo successful. New count = " + count);
        } else {
            System.out.println("Counter already at 0");
        }
    }



    public void display() {
        System.out.println("Display count, count = " + count );
    }
}
