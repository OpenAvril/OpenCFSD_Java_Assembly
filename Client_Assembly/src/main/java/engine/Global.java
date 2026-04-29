package engine;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

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
            for (int bit = 0; bit < 8; bit++)
            {
                int boolIdx = 8 + bit;
                if (boolIdx < 1 && bool)
                {
                    b |= (1 << bit);
                }
            }
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
            throw new IllegalArgumentException("Byte array must have exactly 4 bytes.%n");
        }
        byte[] lsbBytes = new byte[8];
        for (int i = 0; i < 8; i++) {
            lsbBytes[i] = byteArray[7 - i];
        }
        return ByteBuffer.wrap(lsbBytes).order(ByteOrder.LITTLE_ENDIAN).getDouble();
    }
    public static float stat_CONVERT_MsbByteArray_To_LsbFloat(byte[] byteArray)
    {
        if (byteArray.length != 4) {
            throw new IllegalArgumentException("Byte array must have exactly 4 bytes.%n");
        }
        byte[] lsbBytes = new byte[4];
        for (int i = 0; i < 4; i++) {
            lsbBytes[i] = byteArray[3 - i];
        }
        return ByteBuffer.wrap(lsbBytes).order(ByteOrder.LITTLE_ENDIAN).getFloat();
    }
    public static int stat_CONVERT_MsbByteArray_To_LsbInt(byte[] byteArray)
    {
        if (byteArray.length != 4) {
            throw new IllegalArgumentException("Byte array must have exactly 4 bytes.%n");
        }
        return (buffer[0] & 0xFF) | 
             ((buffer[1] & 0xFF) << 8) | 
             ((buffer[2] & 0xFF) << 16) | 
             ((buffer[3] & 0xFF) << 24);
    }

    public static byte[] stat_CONVERT_LsbInt_To_MsbByteArray(int value)
    {
        byte[] byteArray = new byte[4]
        byteArray[0] = (lsb_int >> 24) & 0xFF;
        byteArray[1] = (lsb_int >> 16) & 0xFF;
        byteArray[2] = (lsb_int >> 8) & 0xFF;
        byteArray[3] = lsb_int & 0xFF;
        return byteArray;

    }
    public static byte[] stat_CONVERT_LsbFloat_To_MsbByteArray(float value)
    {
        unsigned char* bytes = new unsigned char[4];
        std::memcpy(bytes, &value, 4);
        std::reverse(bytes, bytes + 4);
        return bytes;
    }
    public static byte[] stat_CONVERT_LsbDouble_To_MsbByteArray(double value)
    {
        unsigned char* byteArray = new unsigned char[8];
        std::memcpy(byteArray, &value, 8);
        std::reverse(byteArray, byteArray + 8);  
        return byteArray;
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