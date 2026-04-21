package engine;

import java.nio.ByteBuffer;
import java.util.BitSet;

public class Global
{
    private static int _stat_REG_numberOfCores;
    private static int _stat_REG_numberOfPraises;
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
    public void dyn_REG_boot1_DEFINE_Global()
    {
        System.out.printf("entered dyn_REG_boot1_DEFINE_Global().%n");

        System.out.printf("exiting dyn_REG_boot1_DEFINE_Global().%n");
    }
    public void dyn_REG_boot2_SUBSTANTIATE_Global()
    {
        System.out.printf("entered dyn_REG_boot2_SUBSTANTIATE_Global().%n");
        stat_REG_boot2_SUBSTANTIATE_numberOfCores();
        stat_REG_boot2_SUBSTANTIATE_numberOfPraises();
        System.out.printf("exiting dyn_REG_boot2_SUBSTANTIATE_Global().%n");
    }
    public void dyn_REG_boot3_INITIALISE_Global()
    {
        System.out.printf("entered dyn_REG_boot3_INITIALISE_Global().%n");
        stat_REG_boot3_INITIALISE_numberOfCores();
        stat_REG_boot3_INITIALISE_numberOfPraises();
        System.out.printf("exiting dyn_REG_boot3_INITIALISE_Global().%n");
    }
    public void dyn_REG_boot4_INSTANTIATE_Global()
    {
        System.out.printf("entered dyn_REG_boot4_INSTANTIATE_Global().%n");

        System.out.printf("exiting dyn_REG_boot4_INSTANTIATE_Global().%n");
    }
    public int dyn_REG_get_numberOfCores()
    {
        return stat_REG_get_numberOfCores();
    }
    public int dyn_REG_get_numberOfPraises()
    {
        return stat_REG_get_numberOfPraises();
    }
    public static byte[] stat_CONVERT_boolean_To_ByteArray(boolean value)
    {
        byte[] output = new byte[1];
        for (int i = 0; i < 1; i++) {
            output[i] = (byte) (value ? 1 : 0);
        }
        return output;
    }
    public static boolean stat_CONVERT_ByteArray_To_boolean(byte[] byteArray) 
    {
        if (byteArray.length != 1) {
            throw new IllegalArgumentException("Byte array must have a length of 1");
        }
        BitSet bitSet = BitSet.valueOf(byteArray);
        return bitSet.get(0);
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
            throw new IllegalArgumentException("Byte array must have exactly 4 bytes.%n");
        }
        ByteBuffer buffer = ByteBuffer.wrap(byteArray);
        return buffer.getFloat();
    }
    public static int stat_CONVERT_ByteArray_To_int(byte[] byteArray) 
    {
        if (byteArray.length != 4) {
            throw new IllegalArgumentException("Byte array must have exactly 4 bytes.%n");
        }
        ByteBuffer buffer = ByteBuffer.wrap(byteArray);
        return buffer.getInt();
    }
    public static int stat_CONVERT_ByteArray_To_UnsignedInt(byte[] byteArray) 
    {
        if (byteArray.length != 1) {
            throw new IllegalArgumentException("Byte array must have exactly 4 bytes.%n");
        }
         return Byte.toUnsignedInt(byteArray[0]);
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
    private static void stat_REG_boot2_SUBSTANTIATE_numberOfCores()
    {
        _stat_REG_numberOfCores = Integer.MAX_VALUE;
    }
    private static void stat_REG_boot2_SUBSTANTIATE_numberOfPraises()
    {
        _stat_REG_numberOfPraises = Integer.MAX_VALUE;
    }
    private static void stat_REG_boot3_INITIALISE_numberOfCores()
    {
        _stat_REG_numberOfCores = 4;
    }
    private static void stat_REG_boot3_INITIALISE_numberOfPraises()
    {
        _stat_REG_numberOfPraises = 4;
    }
    private static int stat_REG_get_numberOfCores()
	{
		return _stat_REG_numberOfCores;
	}
    private static int stat_REG_get_numberOfPraises()
	{
		return _stat_REG_numberOfPraises;
	}
}