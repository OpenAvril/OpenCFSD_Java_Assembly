package engine;

public class Execute_Control
{
    private static boolean _stat_REG_ptr_Flag_isSystemInitialised;
    private static boolean[] _stat_REG_ptr_Flag_array_ThreadInitialised;
// public.
    public Execute_Control()
    {
        stat_CLASS_boot0_DECLAIRE_Execute_Control();
        stat_CLASS_boot1_DEFINE_Execute_Control();
        stat_CLASS_boot3_INITIALISE_Execute_Control();
        stat_REG_boot0_DECLAIRE_Execute_Control();
    }
    void dyn_REG_boot1_DEFINE_Execute_Control(Framework obj)
    {

    }
    void dyn_REG_boot2_SUBSTANTIATE_Execute_Control(Framework obj)
    {
        stat_REG_boot2_SUBSTANTIATE_Flag_isSystemInitialised();
        stat_REG_boot2_SUBSTANTIATE_Flag_array_ThreadInitialised(obj);
    }
    void dyn_REG_boot3_INITIALISE_Execute_Control(Framework obj)
    {
        stat_REG_boot3_INITIALISE_Flag_isSystemInitialised();
        stat_REG_boot3_INITIALISE_Flag_array_ThreadInitialised();
    }
    void dyn_REG_boot4_INSTANTIATE_Execute_Control(Framework obj)
    {

    }
    boolean dyn_REG_get_Flag_is_SystemInitialised()
    {

    }
    boolean dyn_REG_get_Item_On_List_Of_Flag_ThreadInitialised(int threadID)
    {

    }
    void stat_CLASS_boot0_DECLAIRE_Execute_Control()
    {

    }
    void stat_CLASS_boot1_DEFINE_Execute_Control()
    {

    }
    void stat_CLASS_boot3_INITIALISE_Execute_Control()
    {

    }
    void stat_REG_boot0_DECLAIRE_Execute_Control()
    {

    }
// private.
    private static void stat_REG_boot2_SUBSTANTIATE_Flag_isSystemInitialised()
    {
        _stat_REG_ptr_Flag_isSystemInitialised = true;
    }
    private static void stat_REG_boot2_SUBSTANTIATE_Flag_array_ThreadInitialised(Framework obj)
    {
        _stat_REG_ptr_Flag_array_ThreadInitialised = new boolean[obj.dyn_CLASS_get_App().dyn_CLASS_get_Global().dyn_REG_get_numberOfCores()];
        for(int index = 0; index < _stat_REG_ptr_Flag_array_ThreadInitialised.length; index++)
        {
            _stat_REG_ptr_Flag_array_ThreadInitialised[index] = true;
        }
    }
    private static void stat_REG_boot3_INITIALISE_Flag_isSystemInitialised()
    {
        _stat_REG_ptr_Flag_isSystemInitialised = true;
    }
    private static void stat_REG_boot3_INITIALISE_Flag_array_ThreadInitialised()
    {
        for(int index = 0; index < _stat_REG_ptr_Flag_array_ThreadInitialised.length; index++)
        {
            _stat_REG_ptr_Flag_array_ThreadInitialised[index] = true;
        }
    }
    private static boolean stat_REG_get_ptr_Flag_is_SystemInitialised()
    {
        return _stat_REG_ptr_Flag_isSystemInitialised;
    }
    private static boolean[] stat_get_ptr_list_Of_flag_ThreadInitialised()
    {
        return _stat_REG_ptr_Flag_array_ThreadInitialised;
    }
    private static void stat_REG_set_Flag_is_SystemInitialised(boolean newFlag)
    {

    }
}
