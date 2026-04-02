package records.praise_sets;

public class Input_praise0 
{
// classes.

// registers.
	private static float _input_valueA;
	private static float _input_valueB;
	
// constructor.
	public Input_praise0()
	{
		System.out.printf("entered CLASS Input_praise0()%n");
		stat_REG_create_input_valueA();
		stat_REG_create_input_valueB();
		System.out.printf("exiting CLASS Input_praise0()%n");
	}
	
// public.
	// dynamic.
		// get.
	public float dyn_REG_get_input_valueA()
	{
		return stat_REG_get_input_valueA();
	}
	public float dyn_REG_get_input_valueB()
	{
		return stat_REG_get_input_valueB();
	}
		// set.
	public void dyn_REG_set_input_valueA(float newFloat)
	{
		stat_REG_set_input_valueA(newFloat);
	}
	public void dyn_REG_set_input_valueB(float newFloat)
	{
		stat_REG_set_input_valueB(newFloat);
	}
	// static.
		// get.
		// set.

// private.
	// dynamic.
		// classes.
			// create.
			// get.
			// set.
		// registers.
			// create.
			// get.
			// set.
	// static.
		// classes.
			// create.
			// get.
			// set.
		// registers.
			// create.
	private static void stat_REG_create_input_valueA()
	{
		_input_valueA = (float) 0.0;
	}
	private static void stat_REG_create_input_valueB()
	{
		_input_valueB = (float) 0.0;
	}
			// get.
	private static float stat_REG_get_input_valueA()
	{
		return _input_valueA;
	}
	private static float stat_REG_get_input_valueB()
	{
		return _input_valueB;
	}
			// set.
	private static void stat_REG_set_input_valueA(float newFloat)
	{
		_input_valueA = newFloat;
	}
	private static void stat_REG_set_input_valueB(float newFloat)
	{
		_input_valueB = newFloat;
	}
}
