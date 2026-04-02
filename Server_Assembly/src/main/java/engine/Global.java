package engine;

import java.nio.ByteBuffer;

public class Global
{
    private static char _stat_REG_numberOfCores;
    private static char _stat_REG_numberOfPraises;
// public.
    public Global() 
    {
            System.out.printf("entering Global()%n");
            stat_CLASS_boot0_DECLAIRE_Global();
            stat_CLASS_boot1_DEFINE_Global();
            stat_CLASS_boot3_INITIALISE_Global();
            stat_REG_boot0_DECLAIRE_Global();
            System.out.printf("exiting Global()%n");
    }
    public void dyn_REG_boot1_DEFINE_Global(Framework obj)
    {
        System.out.printf("entered dyn_REG_boot1_DEFINE_Global().%n");

        System.out.printf("exiting dyn_REG_boot1_DEFINE_Global().%n");
    }
    public void dyn_REG_boot2_SUBSTANTIATE_Global(Framework obj)
    {
        System.out.printf("entered dyn_REG_boot2_SUBSTANTIATE_Global().%n");

        System.out.printf("exiting dyn_REG_boot2_SUBSTANTIATE_Global().%n");
    }
    public void dyn_REG_boot3_INITIALISE_Global(Framework obj)
    {
        System.out.printf("entered dyn_REG_boot3_INITIALISE_Global().%n");

        System.out.printf("exiting dyn_REG_boot3_INITIALISE_Global().%n");
    }
    public void dyn_REG_boot4_INSTANTIATE_Global(Framework obj)
    {
        System.out.printf("entered dyn_REG_boot4_INSTANTIATE_Global().%n");

        System.out.printf("exiting dyn_REG_boot4_INSTANTIATE_Global().%n");
    }
    public static char dyn_REG_get_numberOfCores()
    {
        return stat_REG_get_numberOfCores();
    }
    public static char dyn_REG_get_numberOfPraises()
    {
        return stat_REG_get_numberOfPraises();
    }
    public static double stat_CONVERT_ByteArray_To_Double(byte[] byteArray) 
    {
        if (byteArray.length != 8) {
            throw new IllegalArgumentException("Byte array must have a length of 8");
        }
        ByteBuffer buffer = ByteBuffer.wrap(byteArray);
        return buffer.getDouble();
    }
    public static float stat_CONVERT_ByteArray_To_Float(byte[] byteArray) 
    {
        if (byteArray.length != 4) {
            throw new IllegalArgumentException("Byte array must have exactly 4 byteArray.");
        }
        ByteBuffer buffer = ByteBuffer.wrap(byteArray);
        return buffer.getFloat();
    }
    public static int stat_CONVERT_ByteArray_To_int(byte[] byteArray) 
    {
        if (byteArray.length != 4) {
            throw new IllegalArgumentException("Byte array must have exactly 1 byte.");
        }
        ByteBuffer buffer = ByteBuffer.wrap(byteArray);
        return buffer.getInt();
    }
    public static byte[] stat_CONVERT_int_To_ByteArray(int value)
    {
        ByteBuffer buffer = ByteBuffer.allocate(4);
        buffer.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        buffer.putInt(value);
        return buffer.array();
    }
    public static byte[] stat_CONVERT_Float_To_ByteArray(float value) 
    {
        ByteBuffer buffer = ByteBuffer.allocate(Float.BYTES);
        buffer.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        buffer.putFloat(value);
        return buffer.array();
    }
    public static byte[] stat_CONVERT_Double_To_ByteArray(double value) 
    {
        ByteBuffer buffer = ByteBuffer.allocate(Double.BYTES);
        buffer.putDouble(value);
        return buffer.array();
    }
	public static void stat_CLASS_boot0_DECLAIRE_Global()
	{
		System.out.printf("entered stat_CLASS_boot0_DECLAIRE_Global().%n");
		
		System.out.printf("exiting stat_CLASS_boot0_DECLAIRE_Global().%n");
	}
	private static void stat_CLASS_boot1_DEFINE_Global()
	{
		System.out.printf("entered stat_CLASS_boot1_DEFINE_Global().%n");
		
		System.out.printf("exiting stat_CLASS_boot1_DEFINE_Global().%n");
	}
	private static void stat_CLASS_boot3_INITIALISE_Global()
	{
		System.out.printf("entered stat_CLASS_boot3_INITIALISE_Global().%n");
		
		System.out.printf("exiting stat_CLASS_boot3_INITIALISE_Global().%n");
	}
	private static void stat_REG_boot0_DECLAIRE_Global()
	{
		System.out.printf("entered stat_REG_boot0_DECLAIRE_Global().%n");
		
		System.out.printf("exiting stat_REG_boot0_DECLAIRE_Global().%n");
	}
// private.
    public static char stat_REG_get_numberOfCores()
	{
		return _stat_REG_numberOfCores;
	}
    public static char stat_REG_get_numberOfPraises()
	{
		return _stat_REG_numberOfPraises;
	}
}