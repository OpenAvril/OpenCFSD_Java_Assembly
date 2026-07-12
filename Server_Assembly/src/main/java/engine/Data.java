package engine;

import structs.Input;

public class Data {
    private static Input _SIM_stat_REG_input_Sample;
    public Data() {
        stat_CLASS_boot0_DECLAIRE_Data();
        stat_CLASS_boot1_DEFINE_Data();
        stat_CLASS_boot3_INITIALISE_Data();
        stat_REG_boot0_DECLAIRE_Data();
    }
    public void dyn_REG_boot1_DEFINE_Data() {
        stat_REG_boot1_DEFINE_Data();
    }
    public void dyn_REG_boot2_SUBSTANTIATE_Data(Input sample) {
        stat_REG_boot2_SUBSTANTIATE_Data(sample);
    }
    public void dyn_REG_boot3_INITIALISE_Data(Input sample) {
        stat_REG_boot3_INITIALISE_Data(sample);
    }
// private.
    private static void stat_CLASS_boot0_DECLAIRE_Data()
    {
    
    }
    private static void stat_CLASS_boot1_DEFINE_Data()
    {

    }
    private static void stat_CLASS_boot3_INITIALISE_Data()
    {

    }
    private static void stat_REG_boot0_DECLAIRE_Data()
    {

    }
    public void stat_REG_boot1_DEFINE_Data() {
        stat_CLASS_boot1_DEFINE__Data__SIM_stat_REG_input_Sample();
    }
    private static void stat_CLASS_boot1_DEFINE__Data__SIM_stat_REG_input_Sample() {
        _SIM_stat_REG_input_Sample = null;
    }
    public void stat_REG_boot2_SUBSTANTIATE_Data(Input sample) {
        stat_REG_boot2_SUBSTANTIATE__Data__SIM_stat_REG_input_Sample(sample);
    }
    private static void stat_REG_boot2_SUBSTANTIATE__Data__SIM_stat_REG_input_Sample(Input sample) {
        sample.dyn_REG_boot2_SUBSTANTIATE_Input();
        _SIM_stat_REG_input_Sample = sample;
    }
    public void stat_REG_boot3_INITIALISE_Data(Input sample) {
        stat_REG_boot3_INITIALISE__Data__SIM_stat_REG_input_Sample(sample);
    }
    private static void stat_REG_boot3_INITIALISE__Data__SIM_stat_REG_input_Sample(Input sample) {
        _SIM_stat_REG_input_Sample = sample;
    }

}