package contracts;

public abstract class Base implements Runnable {

	  protected int param;

	  public Base(final int param) {
	      System.out.println("Base constructor");
	      this.param = param;
	      // I'm using this param here
	      new Thread(this).start();
	      System.out.println("Derivative thread created with param " + param);
	  }

	  @Override
	  abstract public void run();
	}
