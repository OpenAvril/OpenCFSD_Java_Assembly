package structs;
import engine.Framework;
import structs.praisesubsets.Output_praise0;
import structs.praisesubsets.Output_praise1;
import structs.praisesubsets.Output_praise2;
import structs.praisesubsets.Output_praise3;
public class Output
{
    private static Output_Control _stat_CLASS_Output_Control;
    private static int _stat_REG_Output_paiseId;
    private static Object _stat_REG_OutputSubset;
// public.
    public Output() 
    {
        System.out.printf("entered STRUCT_CLASS Output()%n");
        stat_CLASS_boot0_DECLAIRE_Output();
        stat_CLASS_boot1_DEFINE_Output();
        stat_CLASS_boot3_INITIALISE_Output();
        stat_REG_boot0_DECLAIRE_Output();
        System.out.printf("exiting STRUCT_CLASS Output()%n");
    }
    public Output_Control dyn_CLASS_get_Output_Control()
    {
        return stat_CLASS_get_Output_Control();
    }
    public void dyn_REG_boot1_DEFINE_Output()
    {
        System.out.printf("entered dyn_REG_boot1_DEFINE_Output().%n");
        stat_REG_boot1_DEFINE_Output_paiseId();
        System.out.printf("exiting dyn_REG_boot1_DEFINE_Output().%n");
    }
    public void dyn_REG_boot2_SUBSTANTIATE_Output()
    {
        System.out.printf("entered dyn_REG_boot2_SUBSTANTIATE_Output().%n");
        stat_REG_boot2_SUBSTANTIATE_Output_paiseId();
        stat_REG_boot2_SUBSTANTIATE_OutputSubset();
        System.out.printf("exiting dyn_REG_boot2_SUBSTANTIATE_Output().%n");
    }
    public void dyn_REG_boot3_INITIALISE_Output(Framework obj, User_Output objUserOutput)
    {
        System.out.printf("entered dyn_REG_boot3_INITIALISE_Output().%n");
        stat_REG_boot3_INITIALISE_Output_paiseId();
        stat_REG_boot3_INITIALISE_OutputSubset(objUserOutput);
        System.out.printf("exiting dyn_REG_boot3_INITIALISE_Output().%n");
    }
    public void dyn_REG_boot4_INSTANTIATE_Output()
    {
        System.out.printf("entered dyn_REG_boot4_INSTANTIATE_Output().%n");

        System.out.printf("exiting dyn_REG_boot4_INSTANTIATE_Output().%n");
    }
    public int dyn_REG_get_Output_praiseId()
    {
        return stat_REG_get_Output_praiseId();
    }
    public Object dyn_REG_get_OutputSubset()
    {
        return stat_REG_get_OutputSubset();
    }
    public void dyn_REG_set_OutputSubset(Output_praise0 objOutputPraise0)
    {
        stat_REG_set_OutputSubset((Object)objOutputPraise0);
    }
    public void dyn_REG_set_OutputSubset(Output_praise1 objOutputPraise1)
    {
        stat_REG_set_OutputSubset((Object)objOutputPraise1);
    }
    public void dyn_REG_set_OutputSubset(Output_praise2 objOutputPraise2)
    {
        stat_REG_set_OutputSubset((Object)objOutputPraise2);
    }
    public void dyn_REG_set_OutputSubset(Output_praise3 objOutputPraise3)
    {
        stat_REG_set_OutputSubset((Object)objOutputPraise3);
    }
// private.
    private static void stat_CLASS_boot0_DECLAIRE_Output()
    {
        System.out.printf("entered stat_CLASS_boot0_DECLAIRE_Output().%n");

        System.out.printf("exiting stat_CLASS_boot0_DECLAIRE_Output().%n");
    }
    private static void stat_CLASS_boot1_DEFINE_Output()
    {
        System.out.printf("entered stat_CLASS_boot1_DEFINE_Output().%n");
        stat_CLASS_boot1_DEFINE_Output_Control();
        System.out.printf("exiting stat_CLASS_boot1_DEFINE_Output().%n");
    }
    private static void stat_CLASS_boot1_DEFINE_Output_Control()
    {
        System.out.printf("entered stat_CLASS_boot1_DEFINE_Output_Control().%n");
        _stat_CLASS_Output_Control = null;
        System.out.printf("exiting stat_CLASS_boot1_DEFINE_Output_Control().%n");
    }
    private static void stat_CLASS_boot3_INITIALISE_Output()
    {
        System.out.printf("entered stat_CLASS_boot3_INITIALISE_Output().%n");
        stat_CLASS_boot3_INITIALISE_Output_Control();
        System.out.printf("exiting stat_CLASS_boot3_INITIALISE_Output().%n");
    }
    private static void stat_CLASS_boot3_INITIALISE_Output_Control()
    {
        System.out.printf("entered stat_CLASS_boot3_INITIALISE_Output_Control().%n");
        _stat_CLASS_Output_Control = new Output_Control();
        while(stat_CLASS_get_Output_Control() == null) { }
        System.out.printf("exiting stat_CLASS_boot3_INITIALISE_Output_Control().%n");
    }
    private static Output_Control stat_CLASS_get_Output_Control()
    {
        return _stat_CLASS_Output_Control;
    }
    private static void stat_REG_boot0_DECLAIRE_Output()
    {
        System.out.printf("entered stat_REG_boot0_DECLAIRE_Output().%n");

        System.out.printf("exiting stat_REG_boot0_DECLAIRE_Output().%n");
    }
    private static void stat_REG_boot1_DEFINE_Output_paiseId()
    {
        System.out.printf("entered stat_CLASS_boot1_DEFINE_Output_paiseId().%n");
        _stat_REG_OutputSubset = null;
        System.out.printf("exiting stat_CLASS_boot1_DEFINE_Output_paiseId().%n");
    }
    private static void stat_REG_boot2_SUBSTANTIATE_Output_paiseId()
    {
        System.out.printf("entered stat_REG_boot2_SUBSTANTIATE_Output_paiseId().%n");
        _stat_REG_Output_paiseId = Integer.MAX_VALUE;
        System.out.printf("exiting stat_REG_boot2_SUBSTANTIATE_Output_paiseId().%n");
    }
    private static void stat_REG_boot2_SUBSTANTIATE_OutputSubset()
    {
        System.out.printf("entered stat_REG_boot2_SUBSTANTIATE_OutputSubset().%n");
        _stat_REG_OutputSubset = new Object();
        while(stat_REG_get_OutputSubset() == null) { }
        System.out.printf("exiting stat_REG_boot2_SUBSTANTIATE_OutputSubset().%n");
    }
    private static void stat_REG_boot3_INITIALISE_Output_paiseId()
    {
        System.out.printf("entered stat_REG_boot3_INITIALISE_Output_paiseId().%n");
        _stat_REG_Output_paiseId = (int)(0);
        System.out.printf("exiting stat_REG_boot3_INITIALISE_Output_paiseId().%n");
    }
    private static void stat_REG_boot3_INITIALISE_OutputSubset(User_Output objUserOutput)
    {
        System.out.printf("entered stat_REG_boot3_INITIALISE_OutputSubset().%n");
        _stat_REG_OutputSubset = objUserOutput.dyn_REG_get_Item_On_List_Of_OutputSubsets(0);
        System.out.printf("exiting stat_REG_boot3_INITIALISE_OutputSubset().%n");
    }
    private static int stat_REG_get_Output_praiseId()
    {
        return _stat_REG_Output_paiseId;
    }
    private static Object stat_REG_get_OutputSubset()
    {
        return _stat_REG_OutputSubset;
    }
    private static void stat_REG_set_OutputSubset(Object objSubset)
    {
        _stat_REG_OutputSubset = objSubset;
    }
}