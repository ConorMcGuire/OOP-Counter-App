package oop;

/**
 * 'Click' Counter
 *  Starter code for demonstrating a simple class.
 */
public class App 
{
    public static void main( String[] args )
    {
        App app = new App();
        app.start();
    }

    public void start() {
        System.out.println("\n*** Counter App ***");

        Counter myCounter = new Counter(10);
        myCounter.display();
        myCounter.click();
        myCounter.click();
        myCounter.click();


        myCounter.reset();

        myCounter.click();
        myCounter.click();

        myCounter.undo();

        //TODO
        // Add a JUnit test method to test undo()

        // Create a second Counter object, then
        // click() it once, undo() twice, click(), then display()
        // What count do you expect? Expected result = 1
        Counter counterTwo = new Counter(10);
        counterTwo.click();
        counterTwo.undo();
        counterTwo.undo();
        counterTwo.click();
        counterTwo.display();
    }

}
