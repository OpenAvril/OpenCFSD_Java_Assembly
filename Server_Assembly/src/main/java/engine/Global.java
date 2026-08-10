package engine;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.BitSet;
public class Global
{
    private static long _stat_REG_numberOfCores;
    private static long _stat_REG_numberOfPraises;
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
    public static long dyn_REG_get_numberOfCores()
    {
        return stat_REG_get_numberOfCores();
    }
    public static long dyn_REG_get_numberOfPraises()
    {
        return stat_REG_get_numberOfPraises();
    }
    public static byte[] stat_CONVERT_MsbByteArray_To_LsbByteArray(byte[] buffer)
    {
        return ByteBuffer.wrap(buffer).order(ByteOrder.LITTLE_ENDIAN).array();
    }
    public static byte[] stat_CONVERT_LsbByteArray_To_MsbByteArray(byte[] buffer)
    {
        byte[] msbArray = new byte[buffer.length];
        for (int i = 0; i < buffer.length; i++) {
            msbArray[i] = buffer[buffer.length - 1 - i];
        }
        return msbArray;
    }
    public static byte[] stat_CONVERT_LsbBoolean_To_LsbByteArray(boolean bool)
    {
        byte[] byteArray = new byte[] { (byte) (bool ? 1 : 0) };
        return stat_CONVERT_LsbByteArray_To_MsbByteArray(byteArray);
    }
    public static boolean stat_CONVERT_LsbByteArray_To_LsbBoolean(byte[] bytesBool)
    {
        boolean temp;
        temp = false;
        if(bytesBool[0] != 0) {
            temp = true;
        }
        return temp;
    }
    public static double stat_CONVERT_LsbByteArray_To_LsbDouble(byte[] byteArray)
    {
        double temp = Double.MAX_VALUE;
        if (byteArray.length != 8) {
            throw new IllegalArgumentException("Byte array must have exactly 8 bytes.%n");
        } else {
            boolean[] bits = new boolean[64];
            boolean[] fraction = new boolean[11];
            boolean[] exponent = new boolean[52];
            boolean sign = true;
            int bitsId1 = 0;
            for (int byteId1 = 0; byteId1 < 8; byteId1++) {
                for (int bitId1 = 0; bitId1 < 8; bitId1++) {
                    bitsId1 = ((byteId1 * 8) + bitId1);
                    if (bitsId1 < 63) {
                        bits[bitsId1] = ((byteArray[byteId1] >> bitId1) & 1) == 1;
                    } else {
                        bits[bitsId1] = false;
                    }
                }
            }
            int exponentId2 = 0;
            int fractionId2 = 0;
            int bitsId2 = 0;
            for (int byteId2 = 0; byteId2 < 8; byteId2++) {
                for (int bitId2 = 0; bitId2 < 8; bitId2++) {
                    bitsId2 = ((byteId2*8) + bitId2);
                    if (bitsId2 < 51) {
                        exponent[exponentId2] = bits[63 - bitsId2];
                        exponentId2++;
                    } else if (bitsId2 > 51 && bitsId2 < 63) {
                        fraction[fractionId2] = bits[63 - bitsId2];
                        fractionId2++;
                    } else if (bitsId2 == 63) {
                        sign = false;
                    }
                }
            }
            int exponentId3 = 0;
            int fractionId3 = 0;
            int bitsId3 = 0;
            for (int byteId3 = 0; byteId3 < 8; byteId3++) {
                for (int bitId3 = 0; bitId3 < 8; bitId3++) {
                    bitsId3 = ((byteId3 * 8) + bitId3);
                    if (bitsId3 < 51) {
                        bits[bitsId3] = exponent[exponentId3];
                        exponentId3++;
                    } else if (bitsId3 > 51 && bitsId3 < 63) {
                        bits[bitsId3] = fraction[fractionId3];
                        fractionId3++;
                    } else if (bitsId3 == 63) {
                        bits[bitsId3] = sign;
                    }
                }
            }
            long tempLong = 0L;
            for (int i = 0; i < 64; i++) {
                if (bits[i]) {
                    tempLong |= (1L << i);
                }
            }
            temp = Double.longBitsToDouble(tempLong);
        }
        return temp;
    }
    public static long stat_CONVERT_LsbByteArray_To_LSBUnsignedLong(byte[] byteArray)
    {
        if (byteArray.length != 4) {
            throw new IllegalArgumentException("Byte array must have exactly 4 bytes.%n");
        }
        boolean[] bits = new boolean[64];
        for (int byteId1 = 0; byteId1 < 4; byteId1++) {
            for (int bitId1 = 0; bitId1 < 8; bitId1++) {
                bits[(byteId1*8) + bitId1] = ((byteArray[byteId1] >> bitId1) & 1) == 1;
            }
        }
        for (int byteId2 = 0; byteId2 < 4; byteId2++) {
            for (int bitId2 = 0; bitId2 < 8; bitId2++) {
                if(byteId2 == 3 && bitId2 ==7) {
                    bits[63] = false;
                } else {
                    bits[32 + (byteId2*8) + bitId2] = false;
                }
            }
        }
        long result = 0L;
        for (int i = 0; i < 64; i++) {
            if (bits[i]) {
                result |= (1L << i);
            }
        }
        return result;

    }
    public static byte[] stat_CONVERT_LSBUnsignedLong_To_LsbByteArray(long value)
    {
        boolean[] bits = new boolean[64];
        for (int bitId1 = 0; bitId1 < 64; bitId1++) {
            bits[bitId1] = ((value >> bitId1) & 1L) != 0;
        }
        byte[] bytes = new byte[8];
        for (int i = 0; i < 32; i++) {
            if (bits[i]) {
                int bitIndex = (i%8);
                bytes[(i/8)] |= (byte) (1 << bitIndex);
            }
        }
        return bytes;
    }
    public static byte[] stat_CONVERT_LsbDouble_To_LsbByteArray(double value)
    {
        return ByteBuffer.allocate(8).putDouble(value).array();
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
        _stat_REG_numberOfCores = 3;
    }
    private static void stat_REG_boot3_INITIALISE_numberOfPraises()
    {
        _stat_REG_numberOfPraises = 4;
    }
    private static long stat_REG_get_numberOfCores()
    {
        return _stat_REG_numberOfCores;
    }
    private static long stat_REG_get_numberOfPraises()
    {
        return _stat_REG_numberOfPraises;
    }
}