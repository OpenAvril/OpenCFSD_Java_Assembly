package structs.praise_sets;
import engine.Framework;
public class Input_praiseMAX {
    private static boolean _input_praiseMAX_checkIsValid;
// public.
    public void dyn_REG_boot1_DEFINE_Input_praiseMAX(Framework obj) {
        System.out.printf("entered dyn_REG_boot1_DEFINE_Input_praiseMAX().%n");
        System.out.printf("exiting dyn_REG_boot1_DEFINE_Input_praiseMAX().%n");
    }
    public void dyn_REG_boot2_SUBSTANTIATE_Input_praiseMAX(Framework obj) {
        System.out.printf("entered dyn_REG_boot2_SUBSTANTIATE_Input_praiseMAX().%n");
        stat_REG_boot2_SUBSTANTIATE_Input_checkIsValid();
        System.out.printf("exiting dyn_REG_boot2_SUBSTANTIATE_Input_praiseMAX().%n");
    }
    public void dyn_REG_boot3_INITIALISE_Input_praiseMAX(Framework obj) {
        System.out.printf("entered dyn_REG_boot3_INITIALISE_Input_praiseMAX().%n");
        stat_REG_boot3_INITIALISE_Input_checkIsValid();
        System.out.printf("exiting dyn_REG_boot3_INITIALISE_Input_praiseMAX().%n");
    }
    public void dyn_REG_boot4_INSTANTIATE_Input_praiseMAX(Framework obj) {
        System.out.printf("entered dyn_REG_boot4_INSTANTIATE_Input_praiseMAX().%n");
        System.out.printf("exiting dyn_REG_boot4_INSTANTIATE_Input_praiseMAX().%n");
    }
    public boolean dyn_REG_get_input_praiseMAX_checkIsValid() {
        return stat_REG_get_input_praiseMAX_checkIsValid();
    }
    public void dyn_REG_set_input_praiseMAX_checkIsValid(boolean newBoolean) {
        stat_REG_set_input_praiseMAX_checkIsValid(newBoolean);
    }
    public static void stat_CLASS_boot0_DECLAIRE_Input_praiseMAX() {
        System.out.printf("entered stat_CLASS_boot0_DECLAIRE_Input_praiseMAX().%n");
        System.out.printf("exiting stat_CLASS_boot0_DECLAIRE_Input_praiseMAX().%n");
    }
    public static void stat_CLASS_boot1_DEFINE_Input_praiseMAX() {
        System.out.printf("entered stat_CLASS_boot1_DEFINE_Input_praiseMAX().%n");
        System.out.printf("exiting stat_CLASS_boot1_DEFINE_Input_praiseMAX().%n");
    }
    public static void stat_CLASS_boot3_INITIALISE_Input_praiseMAX() {
        System.out.printf("entered stat_CLASS_boot3_INITIALISE_Input_praiseMAX().%n");
        System.out.printf("exiting stat_CLASS_boot3_INITIALISE_Input_praiseMAX().%n");
    }
    public static void stat_REG_boot0_DECLAIRE_Input_praiseMAX() {
        System.out.printf("entered stat_REG_boot0_DECLAIRE_Input_praiseMAX().%n");
        System.out.printf("exiting stat_REG_boot0_DECLAIRE_Input_praiseMAX().%n");
    }
// private.
    private static void stat_REG_boot2_SUBSTANTIATE_Input_checkIsValid() {
        System.out.printf("entered stat_REG_boot2_SUBSTANTIATE_Input_valueA().%n");
        _input_praiseMAX_checkIsValid = true;
        System.out.printf("exiting stat_REG_boot2_SUBSTANTIATE_Input_valueA().%n");
    }
    private static void stat_REG_boot3_INITIALISE_Input_checkIsValid() {
        System.out.printf("entered stat_REG_boot3_INITIALISE_Input_valueA().%n");
        _input_praiseMAX_checkIsValid = false;
        System.out.printf("exiting stat_REG_boot3_INITIALISE_Input_valueA().%n");
    }
    private static boolean stat_REG_get_input_praiseMAX_checkIsValid() {
        return _input_praiseMAX_checkIsValid;
    }
    private static void stat_REG_set_input_praiseMAX_checkIsValid(boolean newBoolean) {
        _input_praiseMAX_checkIsValid = newBoolean;
    }
}
