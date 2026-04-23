package engine;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
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
    public static int dyn_REG_get_numberOfCores()
    {
        return stat_REG_get_numberOfCores();
    }
    public static int dyn_REG_get_numberOfPraises()
    {
        return stat_REG_get_numberOfPraises();
    }
    public static byte[] stat_CONVERT_LsbBoolean_To_MsbByteArray(boolean bool)
    {
        byte[] bytes = new byte[1];
        for (int i = 0; i < 1; i++)
        {
            byte b = 0;
            // Process 8 booleans for each byte
            for (int bit = 0; bit < 8; bit++)
            {
                int boolIdx = 8 + bit;
                if (boolIdx < 1 && bool)
                {
                    // Set the bit corresponding to LSB ordering
                    // (e.g., bool[0] is 1<<0, bool[1] is 1<<1)
                    b |= (1 << bit);
                }
            }
            // Pack into result byte array (MSB structure: bytes[0] is first byte)
            bytes[i] = b;
        }
        return bytes;
    }
    public static boolean stat_CONVERT_MsbByteArray_To_LsbBoolean(byte[] bytesBool)
    {
        boolean bit = false;
        //For each byte, extract bits 0 through 7
        for (int j = 0; j < 8; j++) {
            // MSB bit order: (1 << (7 - j))
            // LSB bit order: (1 << j)
            bit = (bytesBool[0] != 0);
        }
        return bit;
    }
    public static double stat_CONVERT_MsbByteArray_To_LsbDouble(byte[] byteArray)
    {
        if (byteArray.length != 8) {
            throw new IllegalArgumentException("Byte array must have a length of 8");
        }
        return ByteBuffer.wrap(byteArray).order(ByteOrder.LITTLE_ENDIAN).getDouble();
    }
    public static float stat_CONVERT_MsbByteArray_To_LsbFloat(byte[] byteArray)
    {
        if (byteArray.length != 4) {
            throw new IllegalArgumentException("Byte array must have exactly 4 bytes.%n");
        }
        return ByteBuffer.wrap(byteArray).order(ByteOrder.LITTLE_ENDIAN).getFloat();
    }
    public static int stat_CONVERT_MsbByteArray_To_LsbInt(byte[] byteArray)
    {
        if (byteArray.length != 4) {
            throw new IllegalArgumentException("Byte array must have exactly 4 bytes.%n");
        }
        return ByteBuffer.wrap(byteArray).order(ByteOrder.LITTLE_ENDIAN).getInt();
    }
    public static int stat_CONVERT_MsbByteArray_To_LsbUnsignedInt(byte[] byteArray)
    {
        if (byteArray.length != 1) {
            throw new IllegalArgumentException("Byte array must have exactly 4 bytes.%n");
        }
        return Byte.toUnsignedInt(ByteBuffer.wrap(byteArray).order(ByteOrder.LITTLE_ENDIAN).get());
    }
    public static byte[] stat_CONVERT_LsbInt_To_MsbByteArray(int value)
    {
        return ByteBuffer.allocate(8).order(ByteOrder.BIG_ENDIAN).putDouble(value).array();
    }
    public static byte[] stat_CONVERT_LsbFloat_To_MsbByteArray(float value)
    {
        return ByteBuffer.allocate(4).order(ByteOrder.BIG_ENDIAN).putFloat(value).array();
    }
    public static byte[] stat_CONVERT_LsbDouble_To_MsbByteArray(double value)
    {
        return ByteBuffer.allocate(8).order(ByteOrder.BIG_ENDIAN).putDouble(value).array();
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
        _stat_REG_numberOfCores = 1;
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