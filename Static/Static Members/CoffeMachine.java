package com.CoffeMachine;

public class CoffeMachine {
	private float coffeQty;
	private float waterQty;
	private float sugarQty;
	private float milkQty;
	static private int count = 0;
	static private CoffeMachine my = null;

	private CoffeMachine() { // Constructor create as private.. we can't call the object
		coffeQty = 1;
		waterQty = 1;
		sugarQty = 1;
		milkQty = 1;
	}
	   public void fillWater(float qty)
	    {
	        waterQty=qty;
	    }
	    public void fillSugar(float qty)
	    {
	        sugarQty=qty;
	    }
	    public void fillMilk(float qty)
	    {
	    	milkQty=qty;
	    }
	    public float getCoffee()
	    {
	        return 0.15f;
	    }

	static CoffeMachine getInstance() { // for creating an object...getInstance method will create an object. only If Its already not existing.
		if (my == null) { // getInstance method will create an object of CoffeMachine,only if it's not already existing.
			my = new CoffeMachine();
			return my; // return the reference
		}
		count ++;
		if (count <= 4)  // limits the object
			return my;
		else
			return null;
	}

	public static void main(String[] args) {
	    CoffeMachine m1 = CoffeMachine.getInstance();
        CoffeMachine m2 = CoffeMachine.getInstance();
        CoffeMachine m3 = CoffeMachine.getInstance();
        CoffeMachine m4 = CoffeMachine.getInstance(); 
       CoffeMachine m5 = CoffeMachine.getInstance();
       CoffeMachine m6 = CoffeMachine.getInstance();
       CoffeMachine m7 = CoffeMachine.getInstance();
       
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
        System.out.println(m4); 
        System.out.println(m5);
        System.out.println(m6);
        System.out.println(m7);
	}

}
