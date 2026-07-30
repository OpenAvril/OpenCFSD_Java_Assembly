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
    public void app_Terminate_All_Threads(Framework obj)
    {
        for(byte threadId = 0; threadId < Global.dyn_REG_get_numberOfCores(); threadId++)
        {
            stat_REG_set_Item_On_List_Of_Flag_ThreadInitialised(threadId,false);
        }
        stat_REG_set_Flag_is_SystemInitialised(false);
        obj.dyn_CLASS_get_SIMULATION().Terminate_stat_REG_scanner();
    }
    public void dyn_REG_boot1_DEFINE_Execute_Control()
    {

    }
    public void dyn_REG_boot2_SUBSTANTIATE_Execute_Control()
    {
        stat_REG_boot2_SUBSTANTIATE_Flag_isSystemInitialised();
        stat_REG_boot2_SUBSTANTIATE_Flag_array_ThreadInitialised();
    }
    public void dyn_REG_boot3_INITIALISE_Execute_Control()
    {
        stat_REG_boot3_INITIALISE_Flag_isSystemInitialised();
        stat_REG_boot3_INITIALISE_Flag_array_ThreadInitialised();
    }
    public boolean dyn_REG_get_Flag_is_SystemInitialised()
    {
        return stat_REG_get_ptr_Flag_is_SystemInitialised();
    }
    public boolean dyn_REG_get_Item_On_List_Of_Flag_ThreadInitialised(byte threadId)
    {
        return stat_get_ptr_list_Of_flag_ThreadInitialised(threadId);
    }
    public void dyn_REG_set_Flag_is_SystemInitialised(boolean newFlag)
    {
        stat_REG_set_Flag_is_SystemInitialised(newFlag);
    }
    public void dyn_REG_set_Item_On_List_Of_Flag_ThreadInitialised(byte threadId, boolean newBoolValue)
    {
        stat_REG_set_Item_On_List_Of_Flag_ThreadInitialised(threadId, newBoolValue);
    }
    // private.
    private static void stat_CLASS_boot0_DECLAIRE_Execute_Control()
    {

    }
    private static void stat_CLASS_boot1_DEFINE_Execute_Control()
    {

    }
    private static void stat_CLASS_boot3_INITIALISE_Execute_Control()
    {

    }
    private static void stat_REG_boot0_DECLAIRE_Execute_Control()
    {

    }
    private static void stat_REG_boot2_SUBSTANTIATE_Flag_isSystemInitialised()
    {
        _stat_REG_ptr_Flag_isSystemInitialised = true;
    }
    private static void stat_REG_boot2_SUBSTANTIATE_Flag_array_ThreadInitialised()
    {
        _stat_REG_ptr_Flag_array_ThreadInitialised = new boolean[3];
        for(byte threadId = 0; threadId < Global.dyn_REG_get_numberOfCores(); threadId++) {
            _stat_REG_ptr_Flag_array_ThreadInitialised[threadId] = true;
        }
    }
    private static void stat_REG_boot3_INITIALISE_Flag_isSystemInitialised()
    {
        _stat_REG_ptr_Flag_isSystemInitialised = false;
    }
    private static void stat_REG_boot3_INITIALISE_Flag_array_ThreadInitialised()
    {
        for(byte threadId = 0; threadId < Global.dyn_REG_get_numberOfCores(); threadId++) {
            _stat_REG_ptr_Flag_array_ThreadInitialised[threadId] = false;
        }
    }
    private static boolean stat_REG_get_ptr_Flag_is_SystemInitialised()
    {
        return _stat_REG_ptr_Flag_isSystemInitialised;
    }
    private static boolean stat_get_ptr_list_Of_flag_ThreadInitialised(byte threadId)
    {
        return _stat_REG_ptr_Flag_array_ThreadInitialised[threadId];
    }
    private static void stat_REG_set_Flag_is_SystemInitialised(boolean newFlag)
    {
        _stat_REG_ptr_Flag_isSystemInitialised = newFlag;
    }
    private static void stat_REG_set_Item_On_List_Of_Flag_ThreadInitialised(byte threadId, boolean newFlag)
    {
        _stat_REG_ptr_Flag_array_ThreadInitialised[threadId] = newFlag;
    }
}
